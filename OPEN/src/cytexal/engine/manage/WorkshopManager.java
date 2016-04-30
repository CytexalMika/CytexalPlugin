package cytexal.engine.manage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;


public abstract class WorkshopManager {
	final static String localPath="dl/";
	final static String onlineURL="http://cytexal.com/dl/";
	private static HashMap<String, WorkshopObject> objects;
	public static void init(){
		objects=new HashMap<String, WorkshopObject>();
	}
	public static WorkshopObject load(String id){
		if(isLoaded(id))
			return getLoaded(id);
		return null;
	}
	protected static InputStream getInputStream(String id,String ending){
		try{
			InputStream t;
			File f=new File(localPath+id+ending);
			if(f.exists())
				t= new FileInputStream(f);
			else
				t=new URL(onlineURL+id+ending).openStream();
			System.out.println("Lade "+id+" aus dem Cytexal.com Workshop...");
			return t;
		}catch(Exception e){
			System.out.println("Fehler beim Laden des Objects: "+id);
			e.printStackTrace();
			return null;
		}
	}
	public void save(String id,String ending){
		File f=new File(localPath+id+ending);
		try {
			FileOutputStream fos=new FileOutputStream(f);
			InputStream is=getInputStream(id, ending);
			while(is.available()>0)
				fos.write(is.read());
			is.close();
			fos.close();
		} catch (Exception e) {
			System.out.println("Fehler beim Speichern des Objects: "+id);
			e.printStackTrace();
		}
	}
	protected static final WorkshopObject getLoaded(String id){
		return objects.get(id);
	}
	public static final boolean isLoaded(String id){
		return objects.containsKey(id);
	}
	protected static void add(WorkshopObject wo){
		objects.put(wo.getID(),wo);
	}
}
