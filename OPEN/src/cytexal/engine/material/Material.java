package cytexal.engine.material;

import java.util.ArrayList;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;
import org.newdawn.slick.opengl.Texture;

import cytexal.engine.gameobject.Camera;
import cytexal.engine.gameobject.Light;
import cytexal.engine.manage.RenderManager;
import cytexal.engine.manage.ShaderManeger;
import cytexal.engine.shader.CoreShader;
import cytexal.engine.shader.ShaderProgram;
import static org.lwjgl.opengl.GL11.*;
public class Material {
	public static final Material base=new Material(0.7f ,0.7f ,0.7f);
	float size;
	private TextureObject diffuse;
	Vector3f diffuseRGB;
	TextureMap texMap;
	ArrayList<ShaderProgram> shaders;
	CoreShader coreShader;
	public Material(float diffuseR,float diffuseG,float diffuseB) {
		diffuseRGB=new Vector3f(diffuseG,diffuseG,diffuseB);
		this.size=1;
		shaders=new ArrayList<ShaderProgram>();
		coreShader=ShaderManeger.loadCore("OPEN/Core");
	}
	public void apply(){
		coreShader.start();
		coreShader.loadMaterial(this);
		RenderManager.applyLightChange();
		for(ShaderProgram p:shaders)
			p.start();
		if(getDiffuse()!=null){
			glEnable(GL_TEXTURE_2D);
			GL13.glActiveTexture(GL13.GL_TEXTURE0);
			GL11.glBindTexture(GL11.GL_TEXTURE_2D, diffuse.getTexture().getTextureID());
		}
	}
	public void unApply(){
		coreShader.stop();
		for(ShaderProgram p:shaders)
			p.stop();
		glDisable(GL_TEXTURE_2D);
	}
	public void setCordinate(float x, float y){
		if(getDiffuse()!=null)
			glTexCoord2f(x, y);
	}
	public TextureObject getDiffuse() {
		return diffuse;
	}
	public void setDiffuse(TextureObject textureObject) {
		this.diffuse = textureObject;
	}
	public void setTextureMap(TextureMap m){
		texMap=m;
	}
	public void addShader(ShaderProgram shaderProgram) {
		shaders.add(shaderProgram);
	}
	public void applyMatrix(Matrix4f matrix) {
		coreShader.loadTransformation(matrix);
		coreShader.loadProjection(Camera.active.getProjectionMatrix());
		coreShader.loadView(Camera.active.getViewMatrix());
		
	}
	public boolean isTextured() {
		return diffuse!=null;
	}
	public Vector3f getColor() {
		return diffuseRGB;
	}
	public void setR(float r) {
		diffuseRGB.x=r;
	}
	public void setG(float r) {
		diffuseRGB.y=r;
	}
	public void setB(float r) {
		diffuseRGB.z=r;
	}
}
