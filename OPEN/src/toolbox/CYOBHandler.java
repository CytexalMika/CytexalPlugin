package toolbox;

import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import cytexal.engine.gameobject.GameObject;
import cytexal.engine.manage.ModelManager;
import cytexal.engine.material.Material;
import cytexal.engine.model.RawModel;
import jdk.internal.org.xml.sax.XMLReader;

public class CYOBHandler {
	public static GameObject load(InputStream is){
		XMLInputFactory xmlif=XMLInputFactory.newFactory();
		try {
			XMLStreamReader xmlr = xmlif.createXMLStreamReader(is);
			xmlr.next();
			return load(xmlr);
		} catch (XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	private static GameObject load(XMLStreamReader xmlr){
		if(xmlr.getEventType()!=XMLStreamReader.START_ELEMENT||!xmlr.getName().toString().equals("GameObject"))
			return null;
		GameObject go = null;
		try {
			go = (GameObject) Class.forName(xmlr.getAttributeValue(null, "class")).getConstructor(float.class,float.class,float.class).newInstance(0f,0f,0f);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException | ClassNotFoundException e2) {
			e2.printStackTrace();
		}
		if(xmlr.getAttributeValue(null, "x")!=null)
			go.setX(Float.parseFloat(xmlr.getAttributeValue(null, "x")));
		if(xmlr.getAttributeValue(null, "y")!=null)
			go.setY(Float.parseFloat(xmlr.getAttributeValue(null, "y")));
		if(xmlr.getAttributeValue(null, "z")!=null)
			go.setZ(Float.parseFloat(xmlr.getAttributeValue(null, "z")));
		if(xmlr.getAttributeValue(null, "rx")!=null)
			go.setRX(Float.parseFloat(xmlr.getAttributeValue(null, "rx")));
		if(xmlr.getAttributeValue(null, "ry")!=null)
			go.setRY(Float.parseFloat(xmlr.getAttributeValue(null, "ry")));
		if(xmlr.getAttributeValue(null, "rz")!=null)
			go.setRZ(Float.parseFloat(xmlr.getAttributeValue(null, "rz")));
		if(xmlr.getAttributeValue(null, "sx")!=null)
			go.setSX(Float.parseFloat(xmlr.getAttributeValue(null, "sx")));
		if(xmlr.getAttributeValue(null, "sy")!=null)
			go.setSY(Float.parseFloat(xmlr.getAttributeValue(null, "sy")));
		if(xmlr.getAttributeValue(null, "sz")!=null)
			go.setSZ(Float.parseFloat(xmlr.getAttributeValue(null, "sz")));
		try {
			xmlr.next();
		} catch (XMLStreamException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		while(!(xmlr.getEventType()==XMLStreamReader.END_ELEMENT&&xmlr.getName().toString().equals("GameObject"))){
			if(xmlr.getEventType()== XMLStreamReader.START_ELEMENT){
				if(xmlr.getName().toString().equals("GameObject")){
					go.addChild(load(xmlr));
				}else if(xmlr.getName().toString().equals("Model")){
					go.setModel(loadModel(xmlr));
				}
			}
			try {
				xmlr.next();
			} catch (XMLStreamException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return go;
		
	}
	private static RawModel loadModel(XMLStreamReader xmlr){
		if(xmlr.getEventType()!=XMLStreamReader.START_ELEMENT||!xmlr.getName().toString().equals("Model"))
			return null;
		RawModel m=null;
		Material mat=null;
		if(xmlr.getName().toString().equals("Model")){
			try {
				while(!(xmlr.getEventType()==XMLStreamReader.END_ELEMENT&&xmlr.getName().toString().equals("Model"))){
					if(xmlr.getEventType()==XMLStreamReader.CHARACTERS&&!xmlr.isWhiteSpace())
						m=ModelManager.load(xmlr.getText().trim());
					if(xmlr.getEventType()== XMLStreamReader.START_ELEMENT){
						if(xmlr.getName().toString().equals("Material")){
							mat=loadMaterial(xmlr);
						}
					}
					xmlr.next();
				}
			} catch (XMLStreamException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(mat!=null)
			m.setMaterial(mat);
		return m;
	}
	private static Material loadMaterial(XMLStreamReader xmlr) {
		if(xmlr.getEventType()!=XMLStreamReader.START_ELEMENT||!xmlr.getName().toString().equals("Material"))
			return null;
		Material mat=new Material(0.7f, 0.7f, 0.7f);
		if(xmlr.getName().toString().equals("Material")){
			try {
				while(!(xmlr.getEventType()==XMLStreamReader.END_ELEMENT&&xmlr.getName().toString().equals("Material"))){
					if(xmlr.getEventType()== XMLStreamReader.START_ELEMENT){
						if(xmlr.getName().toString().equals("Color")){
							mat.setR(Float.parseFloat(xmlr.getAttributeValue(null, "r")));
							mat.setG(Float.parseFloat(xmlr.getAttributeValue(null, "g")));
							mat.setB(Float.parseFloat(xmlr.getAttributeValue(null, "b")));
							while(!(xmlr.getEventType()==XMLStreamReader.END_ELEMENT&&xmlr.getName().toString().equals("Color")))
								xmlr.next();
						}else if(xmlr.getName().toString().equals("Texture")){
							
						}
					}
					xmlr.next();
				}
			} catch (XMLStreamException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return mat;
	}

}