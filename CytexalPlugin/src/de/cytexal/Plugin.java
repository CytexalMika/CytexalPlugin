package de.cytexal;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginLoader;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin{
	List<CytexalPlugin> plugins;
	File folder=new File("plugins/Cytexal");
	@Override
	public void onEnable() {
		//WebMasterOfDisaster.
	}
	public void ping() throws IOException, InterruptedException{
		String servername = "gommehd.net";
		int port = 25565;
 
		Socket sock = new Socket();
		sock.setSoTimeout(3000);
		sock.setTcpNoDelay(true);
		sock.setTrafficClass(18);
		sock.connect(new InetSocketAddress(servername, port));
		DataInputStream sockIn = new DataInputStream(sock.getInputStream());
		DataOutputStream sockOut = new DataOutputStream(sock.getOutputStream());

		sockOut.writeByte(254);
		sockOut.writeByte(1);
		sockOut.writeByte(250);
		String s = "MC|PingHost";
		sockOut.writeShort(s.length());
		sockOut.writeChars(s);
		sockOut.writeShort(3 + 2 * servername.length() + 4);
		sockOut.writeByte(1);
		sockOut.writeShort(servername.length());
		sockOut.writeChars(servername);
		Thread.sleep(1000);
		sockIn.readByte();
		sockIn.readByte();
		sockIn.readByte();
		sockIn.readShort();
		while(sockIn.available()>0){
			
			System.out.print(sockIn.readLine().replaceAll("\\p{Cntrl}", ""));
		}
	}
}
