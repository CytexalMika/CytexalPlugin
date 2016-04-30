package cytexal.engine.manage;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import org.lwjgl.opengl.GL11;

import cytexal.engine.gameobject.Light;
import cytexal.engine.shader.CoreShader;
import cytexal.engine.shader.ShaderProgram;

public class RenderManager {
	static List<Light> lights=new ArrayList<Light>();
	public static void setBackgroundColor(float red, float green, float blue, float alpha){
	//	GL11.glMatrixMode(GL11.GL_MODELVIEW);
		GL11.glClearColor(red, green, blue, alpha);
	}
	public static void applyLightChange(){
		for(CoreShader cs:ShaderManeger.getCoreShaders()){
			Light[] l = new Light[8];
			lights.toArray(l);
			cs.loadLights(l);
		}
	}
	public static void addLight(Light l) {
		lights.add(l);
	}
}
