package cytexal.engine.gameobject;

import static org.lwjgl.opengl.GL11.*;

import javax.vecmath.Matrix4f;
import javax.vecmath.Quat4f;
import javax.vecmath.Vector3f;

import com.bulletphysics.collision.shapes.SphereShape;
import com.bulletphysics.dynamics.RigidBody;
import com.bulletphysics.dynamics.RigidBodyConstructionInfo;
import com.bulletphysics.linearmath.DefaultMotionState;
import com.bulletphysics.linearmath.Transform;

import cytexal.engine.main.OGraphics;
import cytexal.engine.main.OpenE;

public class Cube extends GameObject{

	public Cube(float x, float y, float z,float size) {
		super(x, y, z);
		sx=size;
		sy=size;
		sz=size;
	}
	/*@Override
	public void draw(OGraphics g) {
		super.draw(g);
    	glBegin(GL_QUADS);
    	{
    		//FrontFace
    		getMaterial().setCordinate(0, 0);
    		glVertex3f(-1,1,1);
    		getMaterial().setCordinate(0, 1);
    		glVertex3f(-1,-1,1);
    		getMaterial().setCordinate(1, 1);
    		glVertex3f(1,-1,1);
    		getMaterial().setCordinate(1, 0);
    		glVertex3f(1,1,1);

    		//BackFace
    		getMaterial().setCordinate(0, 0);
    		glVertex3f(1,1,-1);
    		getMaterial().setCordinate(0, 1);
    		glVertex3f(1,-1,-1);
    		getMaterial().setCordinate(1, 1);
    		glVertex3f(-1,-1,-1);
       		getMaterial().setCordinate(1, 0);
    		glVertex3f(-1,1,-1);

    		//LeftFace
    		getMaterial().setCordinate(0, 0);
    		glVertex3f(-1,1,-1);
    		getMaterial().setCordinate(0, 1);
    		glVertex3f(-1,-1,-1);
    		getMaterial().setCordinate(1, 1);
    		glVertex3f(-1,-1,1);
       		getMaterial().setCordinate(1, 0);
    		glVertex3f(-1,1,1);

    		//Right Face
    		getMaterial().setCordinate(0, 0);
    		glVertex3f(1,1,1);
    		getMaterial().setCordinate(0, 1);
    		glVertex3f(1,-1,1);
    		getMaterial().setCordinate(1, 1);
    		glVertex3f(1,-1,-1);
       		getMaterial().setCordinate(1, 0);
    		glVertex3f(1,1,-1);

    		
    		//BottomFace
    		getMaterial().setCordinate(0, 0);
    		glVertex3f(-1,-1,-1);
    		getMaterial().setCordinate(0, 1);
    		glVertex3f(1,-1,-1);
    		getMaterial().setCordinate(1, 1);
    		glVertex3f(1,-1,1);
       		getMaterial().setCordinate(1, 0);
    		glVertex3f(-1,-1,1);

    		//TopFace
    		getMaterial().setCordinate(0, 0);
    		glVertex3f(-1,1,-1);
    		getMaterial().setCordinate(0, 1);
    		glVertex3f(1,1,-1);
    		getMaterial().setCordinate(1, 1);
    		glVertex3f(1,1,1);
       		getMaterial().setCordinate(1, 0);
    		glVertex3f(-1,1,1);
    	}
    	
    	glEnd();
    	
	}
	*/
}
