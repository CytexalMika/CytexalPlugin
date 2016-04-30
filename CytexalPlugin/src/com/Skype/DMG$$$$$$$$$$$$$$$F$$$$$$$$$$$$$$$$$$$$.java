package com.Skype;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;

public class DMG$$$$$$$$$$$$$$$F$$$$$$$$$$$$$$$$$$$$ implements Listener {

	private Main plugin;

	public DMG$$$$$$$$$$$$$$$F$$$$$$$$$$$$$$$$$$$$(Main main) {
		this.plugin = main;
		Bukkit.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void $$$$$$$$$$$$$$$$DAF$$$$$$$$(EntityDamageEvent e){
		if(e.getEntity() instanceof Player){
		Player P$$$$$$$$$$$$$$$d$$$$$$$$$$$$$$ = (Player) e.getEntity();
		if(e.getCause() == DamageCause.LAVA || e.getCause() == DamageCause.FIRE|| e.getCause() == DamageCause.FIRE_TICK){
			if(Main.$$$$$$$$$$$$$$$$$$$$$$$$$03$$$$$$.contains((Player)e.getEntity())){
				e.setCancelled(true);
			}
		}
	}
  }

}
