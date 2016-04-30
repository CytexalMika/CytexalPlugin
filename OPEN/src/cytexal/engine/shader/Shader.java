package cytexal.engine.shader;

import cytexal.engine.manage.WorkshopObject;

public class Shader implements WorkshopObject{

	int glShaderID;
	private final String id;
	public Shader(String id,int glShaderID) {
		this.glShaderID=glShaderID;
		this.id=id;
	}
	@Override
	public String getID() {
		return id;
	}

}
