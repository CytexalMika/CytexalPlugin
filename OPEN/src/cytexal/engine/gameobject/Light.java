package cytexal.engine.gameobject;

import org.lwjgl.util.vector.Vector3f;

import cytexal.engine.manage.RenderManager;

public class Light extends GameObject{
	private Vector3f color;
	public Light(float x, float y, float z) {
		super(x, y, z);
		color=new Vector3f(1f,1f,1f);
		RenderManager.addLight(this);
	}
	public Vector3f getColor() {
		return color;
	}

}
