package cytexal.engine.manage;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

import cytexal.engine.shader.CoreShader;
import cytexal.engine.shader.Shader;
import cytexal.engine.shader.ShaderProgram;

public class ShaderManeger extends WorkshopManager{
	private static List<CoreShader> coreShaders=new ArrayList<CoreShader>();
	public static Shader load(String id){
		Shader to= (Shader) WorkshopManager.load(id);
		if(to !=null)
			return to;
		int shaderID=loadShader(getInputStream(id, ".txt"));
		if(shaderID==-1){
			System.err.println(id);
			return null;
		}
		return new Shader(id, shaderID);
	}
	public static CoreShader loadCore(String id){
		CoreShader to= (CoreShader) WorkshopManager.load(id);
		if(to !=null)
			return to;
		to=new CoreShader(id, load(id+".vertex"),load(id+".fragment"));
		add(to);
		coreShaders.add(to);
		return to;
	}
	private static int loadShader(InputStream source){
		StringBuilder shaderSource =new StringBuilder();
		int type = 0;
		try{
			BufferedReader reader=new BufferedReader(new InputStreamReader(source));
			String line;
			if((line=reader.readLine())!=null){
				if(line.equalsIgnoreCase("#type Vertex"))
					type=GL20.GL_VERTEX_SHADER;
				else if(line.equalsIgnoreCase("#type Fragment"))
					type=GL20.GL_FRAGMENT_SHADER;
				else{
					System.err.print("undefined shader type! ID: ");
					return -1;
				}
			}
			while((line=reader.readLine())!=null){
				shaderSource.append(line).append('\n');
			}
		}catch(Exception e){
			e.printStackTrace();
			System.err.print("Could not read file: ");
			return -1;
		}
		int shaderID=GL20.glCreateShader(type);
		GL20.glShaderSource(shaderID, shaderSource);
		GL20.glCompileShader(shaderID);
		if(GL20.glGetShaderi(shaderID, GL20.GL_COMPILE_STATUS)==GL11.GL_FALSE){
			System.out.println(shaderSource);
			System.err.println(GL20.glGetShaderInfoLog(shaderID, 500));
			System.err.print("Could not compile Shader: ");
			return -1;
		}
		return shaderID;
	}
	public static Collection<CoreShader> getCoreShaders(){
		return coreShaders;
	}
}
