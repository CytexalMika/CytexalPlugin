package cytexal.engine.model;

import cytexal.engine.manage.WorkshopObject;
import cytexal.engine.material.Material;

public class RawModel implements WorkshopObject{
	private int vaoID;
	private int vertexCount;
	private final String id;
	private Material mat;
	public RawModel(String workshopid,int vid,int vertCount) {
		this.id=workshopid;
		setMaterial(Material.base);
		vaoID=vid;
		vertexCount=vertCount;
	}
	public int getVaoID() {
		return vaoID;
	}
	public int getVertexCount() {
		return vertexCount;
	}
	public Material getMaterial() {
		return mat;
	}
	public void setMaterial(Material mat) {
		this.mat = mat;
	}
	@Override
	public String getID() {
		return id;
	}
}
