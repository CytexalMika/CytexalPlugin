package cytexal.engine.shader;

import java.nio.FloatBuffer;
import java.util.Vector;

import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL20;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;

import cytexal.engine.manage.WorkshopObject;

public abstract class ShaderProgram implements WorkshopObject{
	private Shader vertexShader;
	private Shader fragmentShader;
	private int programId;
	private final String id;
	boolean on;
	private static FloatBuffer matrixBuffer =BufferUtils.createFloatBuffer(16);
	public ShaderProgram(String id,Shader vsid, Shader fsid) {
		this.id=id;
		fragmentShader=fsid;
		vertexShader=vsid;
		programId=GL20.glCreateProgram();
		on=false;
		GL20.glAttachShader(programId, vertexShader.glShaderID);
		GL20.glAttachShader(programId, fragmentShader.glShaderID);
		bindAttributes();
		GL20.glLinkProgram(programId);
		GL20.glValidateProgram(programId);
		getUniformLocations();
	}
	private final void bindAttributes(){
		bindAttribite(0, "position");
		bindAttribite(1, "textureCoords");
		bindAttribite(1, "normal");
	}
	private final void bindAttribite(int attribute, String variableName){
		GL20.glBindAttribLocation(programId, attribute, variableName);
	}
	protected abstract void getUniformLocations();
	protected void loadFloat(int uLoc,float f){
		GL20.glUniform1f(uLoc, f);
	}
	protected void loadVector(int uLoc,Vector3f v){
		GL20.glUniform3f(uLoc, v.x,v.y,v.z);
	}
	protected void loadInt(int uLoc,int i){
		GL20.glUniform1i(uLoc, i);
	}
	protected void loadBoolean(int uLoc,boolean b){
		GL20.glUniform1f(uLoc, b ? 1 : 0);
	}
	protected void loadMatrix(int uLoc, Matrix4f m){
		m.store(matrixBuffer);
		matrixBuffer.flip();
		GL20.glUniformMatrix4(uLoc, false, matrixBuffer);
	}
	protected int getUniformLocation(String uName){
		return GL20.glGetUniformLocation(programId, uName);
	}
	public final void start(){
		//System.out.println("call: "+programId+"("+vertexShader.glShaderID+"|"+fragmentShader.glShaderID+")");
		GL20.glUseProgram(programId);
	}
	@Override
	public String getID() {
		return id;
	}
	public void stop() {
		GL20.glUseProgram(0);
	}
}
