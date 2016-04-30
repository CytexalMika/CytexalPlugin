package cytexal.engine.main;

import java.io.Serializable;
import java.util.ArrayList;

import javax.vecmath.Vector3f;

import com.bulletphysics.collision.broadphase.BroadphaseInterface;
import com.bulletphysics.collision.broadphase.DbvtBroadphase;
import com.bulletphysics.collision.dispatch.CollisionConfiguration;
import com.bulletphysics.collision.dispatch.CollisionDispatcher;
import com.bulletphysics.collision.dispatch.DefaultCollisionConfiguration;
import com.bulletphysics.dynamics.DiscreteDynamicsWorld;
import com.bulletphysics.dynamics.DynamicsWorld;
import com.bulletphysics.dynamics.constraintsolver.ConstraintSolver;
import com.bulletphysics.dynamics.constraintsolver.SequentialImpulseConstraintSolver;
import com.sun.javafx.font.directwrite.DWGlyphLayout;

import cytexal.engine.gameobject.GameObject;
import cytexal.engine.manage.WorkshopObject;
import toolbox.Maths;

public class World extends GameObject implements WorkshopObject{
	
	private static DynamicsWorld dWorld;
	private final String id;
	public World(float x,float y,float z){
		this("");
	}
	public World(String id) {
		super(0, 0, 0);
		this.id=id;
		matrix=Maths.createTransformationMatrix(new org.lwjgl.util.vector.Vector3f(), 0, 0, 0, 1, 1, 1);
		BroadphaseInterface bi=new DbvtBroadphase();
		CollisionConfiguration cc=new DefaultCollisionConfiguration();
		CollisionDispatcher cd=new CollisionDispatcher(cc);
		ConstraintSolver cs=new SequentialImpulseConstraintSolver();
		dWorld=new DiscreteDynamicsWorld(cd, bi, cs, cc);
		getDynamicsWorld().setGravity(new Vector3f(0,-9.81f,0));
	}
	@Override
	public void update(double tslf) {
		getDynamicsWorld().stepSimulation((float) tslf);
		super.update(tslf);
	}
	public static DynamicsWorld getDynamicsWorld() {
		return dWorld;
	}
	@Override
	public String getID() {
		return id;
	}
	
}
