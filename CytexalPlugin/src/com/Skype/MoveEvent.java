package com.Skype;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class MoveEvent extends JavaPlugin implements Listener{

	private Main plugin;

	public MoveEvent(Main main) {
		this.plugin = main;
		plugin.getServer().getPluginManager().registerEvents(this, main);
	}

	@EventHandler
	public void Move(PlayerMoveEvent e){
		Player p = e.getPlayer();
		p.sendMessage("BEWEGUNG!");
	}
}
