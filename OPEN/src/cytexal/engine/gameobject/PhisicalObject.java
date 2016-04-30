package cytexal.engine.gameobject;

import javax.vecmath.Matrix4f;
import javax.vecmath.Quat4f;
import javax.vecmath.Vector3f;

import com.bulletphysics.collision.shapes.CollisionShape;
import com.bulletphysics.collision.shapes.PolyhedralConvexShape;
import com.bulletphysics.dynamics.RigidBody;
import com.bulletphysics.linearmath.DefaultMotionState;
import com.bulletphysics.linearmath.MotionState;
import com.bulletphysics.linearmath.Transform;

import cytexal.engine.main.World;

public class PhisicalObject extends GameObject{
	RigidBody body;
	CollisionShape shape;
	public PhisicalObject(float x, float y, float z,CollisionShape shape, float mass) {
		super(x, y, z);
        MotionState motion = new DefaultMotionState(new Transform(new Matrix4f(new Quat4f(0, 0, 0, 1), new Vector3f(x, y, z), 1.0f)));
        this.body = new RigidBody(mass, motion, shape);
        World.getDynamicsWorld().addCollisionObject(body);
	}
	@Override
	public void update(double tslf) {
		Vector3f t=body.getMotionState().getWorldTransform(new Transform()).origin;
		x=t.x;
		y=t.y;
		z=t.z;
		super.update(tslf);
		System.out.println(t.y);
	}

}
