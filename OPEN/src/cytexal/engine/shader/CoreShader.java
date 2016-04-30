package cytexal.engine.shader;

import org.lwjgl.util.vector.Matrix4f;
import cytexal.engine.material.Material;

import cytexal.engine.gameobject.Light;

public class CoreShader extends ShaderProgram{
	private static final int MAX_LIGHTS = 8;

	public CoreShader(String id,Shader vsid, Shader fsid) {
		super(id,vsid, fsid);
	}

	private int transformUniform;
	private int projectUniform;
	private int viewUniform;
	private int lightPos[];
	private int lightColor[];
	private int lightAttenuation[];
	private int textured;
	private int color;

	@Override
	protected void getUniformLocations() {
		transformUniform=getUniformLocation("transformMatrix");
		projectUniform=getUniformLocation("projectionMatrix");
		viewUniform=getUniformLocation("viewMatrix");
		textured=getUniformLocation("textured");
		color=getUniformLocation("color");
		lightPos=new int[8];
		lightColor=new int[8];
		lightAttenuation=new int[8];
		for (int i = 0; i < MAX_LIGHTS; i++) {
			lightPos[i] = super.getUniformLocation("lightPos[" + i + "]");
			lightColor[i] = super.getUniformLocation("lightColor[" + i + "]");
		//	lightAttenuation[i] = super.getUniformLocation("lightAttenuation[" + i + "]");
		}
	}
	public void loadTransformation(Matrix4f trans){
		loadMatrix(transformUniform, trans);
	}
	public void loadProjection(Matrix4f trans){
		loadMatrix(projectUniform, trans);
	}
	public void loadView(Matrix4f trans){
		loadMatrix(viewUniform, trans);
	}
	public void loadMaterial(Material m){
		loadBoolean(textured, m.isTextured());
		loadVector(color, m.getColor());
	}
	public void loadLights(Light l[]){
		for (int i = 0; i < MAX_LIGHTS; i++) {
			if(l[i]==null)
				break;
			loadVector(lightColor[i], l[i].getColor());
			loadVector(lightPos[i], l[i].getPosition());
		}
	}
}
