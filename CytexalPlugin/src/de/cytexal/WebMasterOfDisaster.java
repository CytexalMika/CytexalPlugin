package de.cytexal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.net.URL;

public class WebMasterOfDisaster {
	private static ServerSocket server;
	private static Thread thread;
	public static void start() throws IOException{
		server=new ServerSocket(14799);
		thread=new Thread(){
			@Override
			public void run() {
				while(true){
					try {
						Socket s=server.accept();
						BufferedReader br =new BufferedReader(new InputStreamReader(s.getInputStream()));
						BufferedReader bw =new BufferedReader(new InputStreamReader(s.getInputStream()));
					} catch (Exception e) {
						System.out.println(":(");
					}
				}
			}
		};
		thread.start();
	}
	public boolean download(String dat,File f){
		try {
			f.createNewFile();
			URL url=new URL("http://cytexal.com/dl/"+dat);
			BufferedReader reader=new BufferedReader(new InputStreamReader(url.openStream()));
			Writer w=new FileWriter(f);
			while(reader.ready())
				w.write(reader.read());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
