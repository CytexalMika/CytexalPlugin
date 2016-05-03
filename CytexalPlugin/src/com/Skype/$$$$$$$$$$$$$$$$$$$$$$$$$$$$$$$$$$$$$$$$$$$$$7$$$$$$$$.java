package com.Skype;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerToggleSprintEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

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
			
		}else if(Main.$$$$$$$$$$$$$$$$$$$$$$$$$03$$$$$$.contains($$$$$$$$$$$$7$$$$$$$$$$$$$$$$$$)){
			 e.getTo().getBlock().setType(Material.LAVA);
			 $$$$$$$$$$$$7$$$$$$$$$$$$$$$$$$.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 99999999, 1));
		}
	}
	
	@EventHandler
	public void Sprint(PlayerToggleSprintEvent e){
		Player $$$$$$$$$$$$7$$$$$$$$$$$$$$$$$$ = e.getPlayer();
		if(Main.Spri$$$$$$$$$$$$$$$$$$$$$$$03$$$$$$.contains($$$$$$$$$$$$7$$$$$$$$$$$$$$$$$$)){
			$$$$$$$$$$$$7$$$$$$$$$$$$$$$$$$.setFoodLevel(0);
			e.setCancelled(true);
		}
	}
}
