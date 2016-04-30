package cytexal.engine.manage;

import java.io.IOException;

import org.newdawn.slick.opengl.TextureLoader;

import cytexal.engine.material.TextureObject;

public class TextureManager extends WorkshopManager{
	public static TextureObject load(String id){
		TextureObject to= (TextureObject) WorkshopManager.load(id);
		if(to !=null)
			return to;
		try {
			return new TextureObject(id, TextureLoader.getTexture("PNG", getInputStream(id,".png")));
		} catch (IOException e) {
			return null;
		}
		
	}
}
