package cytexal.engine.gameobject;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.util.glu.GLU.*;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.util.vector.Matrix4f;

import toolbox.Maths;
public class Camera extends GameObject{
		
	private float fov;
	private float aspect;
	private float near;
	private float far;
	private Matrix4f proj;
	public static Camera active;
	public Camera(float x, float y, float z,float fov, float aspect, float near, float far)
	{
		super(x, y, z);

		this.fov = fov;
		this.aspect = aspect;
		this.near = near;
		this.far = far;
		float y_scale=(float) ((1f/Math.tan(Math.toRadians(fov/2f)))*aspect);
		float x_scale= y_scale/ aspect;
		float frustum=far-near;
		  proj = new Matrix4f();
		  proj.m00 = x_scale;
		  proj.m11 = y_scale;
	      proj.m22 = -((far + near) / frustum);
	      proj.m23 = -1;
	      proj.m32 = -((2 * far * near) / frustum);
	      proj.m33 = 0;
	}
	public void use(){
		active=this;
	}

	public void update(double tslu)
	{
		
		
    	boolean forward = Keyboard.isKeyDown(Keyboard.KEY_W);
    	boolean backward = Keyboard.isKeyDown(Keyboard.KEY_S);
    	boolean left = Keyboard.isKeyDown(Keyboard.KEY_A);
    	boolean right = Keyboard.isKeyDown(Keyboard.KEY_D);
    	

    	if(forward)
    		moveDir((float) (-3*tslu),90,90);
    	if(backward)
    		moveDir((float) (3*tslu),90,90);
    	if(left)
    		moveDir((float) (-3*tslu),90,0);//cam.rotateY(-0.1f);
    	if(right)
    		moveDir((float) (3*tslu),90,0);//cam.rotateY(0.1f);
    	rotateY((float)Mouse.getDX()/2);
    	rotateX(-(float)Mouse.getDY()/2);
    	if(rx>90)
    		rx=90;
    	else if(rx<-90)
    		rx=-90;
	}

	public Matrix4f getProjectionMatrix() {
		// TODO Auto-generated method stub
		return proj;
	}
	public Matrix4f getViewMatrix() {
		return Maths.createViewMatrix(this);
	}


}
