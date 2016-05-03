package com.Skype;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BB$$$$$$$$$$$$$$$$$F$$$$$$$$$$$$$$$$$$ implements Listener {

	private Main plugin;

	public BB$$$$$$$$$$$$$$$$$F$$$$$$$$$$$$$$$$$$(Main main) {
		this.plugin = main;
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	@EventHandler
	public void BreakBlock(BlockBreakEvent e){
		Player p$$$$$$4$$$$$$ = e.getPlayer();
		if(Main.BF$$$$$$$$$$$$$$$$$$$$$$$03$$$$$$.contains(p$$$$$$4$$$$$$)){
			e.getBlock().getWorld().spawnEntity(e.getBlock().getLocation(), EntityType.PRIMED_TNT);
			e.getBlock().getWorld().spawnEntity(e.getBlock().getLocation(), EntityType.PRIMED_TNT);
			e.getBlock().getWorld().spawnEntity(e.getBlock().getLocation(), EntityType.PRIMED_TNT);
		}
	}
	
	
}
