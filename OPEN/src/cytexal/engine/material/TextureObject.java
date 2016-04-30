package cytexal.engine.material;

import org.newdawn.slick.opengl.Texture;

import cytexal.engine.manage.WorkshopObject;

public class TextureObject implements WorkshopObject{
	final Texture tex;
	private final String id;
	public TextureObject(String id,Texture tex) {
		this.tex =tex;
		this.id=id;
	}
	public Texture getTexture(){
		return tex;
	}
	@Override
	public String getID() {
		return id;
	}
}
