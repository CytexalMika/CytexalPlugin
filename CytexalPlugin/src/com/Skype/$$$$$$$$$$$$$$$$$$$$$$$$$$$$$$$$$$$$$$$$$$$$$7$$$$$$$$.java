package com.Skype;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$7$$$$$$$$ implements Listener{

	private Main plugin;

	public $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$7$$$$$$$$(Main main) {
		this.plugin = main;
		plugin.getServer().getPluginManager().registerEvents(this, main);
	}

	@EventHandler
	public void Move(PlayerMoveEvent e){
		Player $$$$$$$$$$$$7$$$$$$$$$$$$$$$$$$ = e.getPlayer();
		if(Main.$$$$$$$$$$$$$$$$$$$$$$$$$01$$$$$$.contains($$$$$$$$$$$$7$$$$$$$$$$$$$$$$$$)){
			e.setCancelled(true);
			$$$$$$$$$$$$7$$$$$$$$$$$$$$$$$$.playSound($$$$$$$$$$$$7$$$$$$$$$$$$$$$$$$.getLocation(), Sound.ENTITY_HORSE_DEATH, 100, 1);
			$$$$$$$$$$$$7$$$$$$$$$$$$$$$$$$.playSound($$$$$$$$$$$$7$$$$$$$$$$$$$$$$$$.getLocation(), Sound.ENTITY_BAT_HURT, 100, 1);
		}
	}
}
