package com.Skype;

import java.util.ArrayList;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{
	
	public static ArrayList<Player> $$$$$$$$$$$$$$$$$$$$$$$$$01$$$$$$ = new ArrayList<Player>();
	
	@Override
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(this, this);
		new $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$7$$$$$$$$(this);
		new C$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$2$$$$$$$$$$$$$$$$(this);
	}
	@Override
	public void onDisable() {
		
	}
	
	public static ArrayList<Player> getFreezed(){
		return $$$$$$$$$$$$$$$$$$$$$$$$$01$$$$$$;
	}
	
	
}