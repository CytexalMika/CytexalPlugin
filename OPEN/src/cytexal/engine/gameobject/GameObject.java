package cytexal.engine.gameobject;

import static org.lwjgl.opengl.GL11.*;

import java.io.Serializable;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collection;

import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;
import org.lwjgl.opengl.GL20;
import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector3f;
import org.newdawn.slick.opengl.Texture;

import javafx.print.Collation;
import toolbox.Maths;
import cytexal.engine.main.OGraphics;
import cytexal.engine.material.Material;
import cytexal.engine.model.RawModel;

public class GameObject implements Serializable{
	static FloatBuffer buf=BufferUtils.createFloatBuffer(16);
	long id;
	public float x;
	public float y;
	public float z;
	public float rx;
	public float ry;
	public float rz;
	public float sx;
	public float sy;
	public float sz;
	protected Matrix4f matrix;
	protected ArrayList<GameObject> childs;
	protected GameObject parent;
	RawModel model;
	public GameObject(float x, float y, float z){
		this.x=x;
		this.y=y;
		this.z=z;
		this.rx=0;
		this.ry=0;
		this.rz=0;
		this.sx=1;
		this.sy=1;
		this.sz=1;
		childs=new ArrayList<GameObject>();
	}
	public final void doDraw(OGraphics g){
		if(parent==null)
			matrix =Maths.createTransformationMatrix(new Vector3f(x,y,z), rx, ry, rz, sx, sy, sz);
		else 
			matrix =Maths.createTransformationMatrix(parent.matrix,new Vector3f(x,y,z), rx, ry, rz, sx, sy, sz);
		draw(g);
		if(model!=null)
			g.drawModel(model,matrix);
		for(GameObject go:childs)
			go.doDraw(g);
		GL20.glUseProgram(0);
	}
	public void draw(OGraphics g){
		
	}
	public float getX()
	{
		return x;
	}

	public float getY()
	{
		return y;
	}

	public float getZ()
	{
		return z;
	}

	public void setX(float x)
	{
		this.x = x;
	}

	public void setY(float y)
	{
		this.y = y;
	}

	public void setZ(float z)
	{
		this.z = z;
	}

	public float getRX()
	{
		return rx;
	}

	public float getRY()
	{
	return ry;
	}

	public float getRZ()
	{
	return rz;
	}

	public void setRX(float rx)
	{
	this.rx = rx;
	}

	public void setRY(float ry)
	{
	this.ry = ry;
	}

	public void setRZ(float rz)
	{
	this.rz = rz;
	}

	public void moveDir(float amt, float dirX, float dirY)
	{
	x += amt * Math.sin(Math.toRadians(rx + dirX)) * Math.cos(Math.toRadians(ry + dirY));
	z += amt * Math.sin(Math.toRadians(rx + dirX)) * Math.sin(Math.toRadians(ry + dirY));
	y -= amt * Math.cos(Math.toRadians(rx + dirX));
	}
	public void rotateY(float amt)
	{
	ry += amt;
	}
	public void rotateX(float amt)
	{
	rx += amt;
	}
	public final void doUpdate(double tslf){
		update(tslf);
		for(GameObject g:childs)
			g.doUpdate(tslf);
	}
	public void update(double tslf){
	}
	public void tick(){
		for(GameObject g:childs)
			g.tick();
		
	}
	public void addChild(GameObject g){
		if(g.parent!=null)
			g.parent.childs.remove(g);
		childs.add(g);
		g.parent=this;
	}
	public Collection<GameObject> getChilds() {
		// TODO Auto-generated method stub
		return childs;
	}

	public void setModel(RawModel model) {
		this.model=model;
		
	}
	public RawModel getModel() {
		return model;
	}
	public void setSX(float parseFloat) {
		this.sx=parseFloat;
	}
	public Vector3f getPosition(){
		return new Vector3f(x, y, z);
	}
	public void setSY(float sy) {
		this.sy=sy;
	}
	public void setSZ(float sz) {
		this.sz=sz;
	}
}
