package com.Skype;

import java.util.ArrayList;

import net.minecraft.server.v1_9_R1.CommandExecute;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{
	
	public static boolean c$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$;
	
	public static boolean moc$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ = false;
	public static ArrayList<Player> $$$$$$$$$$$$$$$$$$$$$$$$$01$$$$$$ = new ArrayList<Player>();
	public static ArrayList<Player> $$$$$$$$$$$$$$$$$$$$$$$$$03$$$$$$ = new ArrayList<Player>();
	public static ArrayList<Player> BF$$$$$$$$$$$$$$$$$$$$$$$03$$$$$$ = new ArrayList<Player>();
	public static ArrayList<Player> Bl$$$$$$$$$$$$$$$$$$$$$$$03$$$$$$ = new ArrayList<Player>();
	public static ArrayList<Player> PS$$$$$$$$$$$$$$$$$$$$$$$03$$$$$$ = new ArrayList<Player>();
	public static ArrayList<Player> Spri$$$$$$$$$$$$$$$$$$$$$$$03$$$$$$ = new ArrayList<Player>();

	@Override
	public void onEnable() {
		CopyOfCopyOfCopyOfz.loadConfig();
		this.getServer().getPluginManager().registerEvents(this, this);
		new $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$7$$$$$$$$(this);
		new C$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$2$$$$$$$$$$$$$$$$(this);
		new DMG$$$$$$$$$$$$$$$F$$$$$$$$$$$$$$$$$$$$(this);
		new BB$$$$$$$$$$$$$$$$$F$$$$$$$$$$$$$$$$$$(this);
		Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
			public void run() {
				for(Player p : Main.PS$$$$$$$$$$$$$$$$$$$$$$$03$$$$$$){
					p.sendMessage("§c§lCyCrash§7> Wir hoffen das dir das Plugin gefällt! §b§oBy Cytexal.com");
				}
			}
		}, 0, 20*60);
		new CO$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$7$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$(this);
	}
	@Override
	public void onDisable() {
		
	}
	
	public static ArrayList<Player> getFreezed(){
		return $$$$$$$$$$$$$$$$$$$$$$$$$01$$$$$$;
	}
	
}