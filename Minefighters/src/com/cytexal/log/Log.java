package com.cytexal.log;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.block.BlockFace;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Log extends JavaPlugin implements Listener{
	Handler handler;
	static List<Player> players;
	static List<Filter> filters;

	@Override
	public void onEnable() {
		players=new ArrayList<Player>();
		try {
			handler=new Handler() {
				
				@Override
				public void publish(LogRecord record) {
					show(record.getMessage());
					record.setMessage(null);
					
				}
				
				@Override
				public void flush() {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void close() throws SecurityException {
					// TODO Auto-generated method stub
					
				}
			};
			org.bukkit.Bukkit.getLogger().addHandler(handler);
			
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void show(String s){
		Player rm=null;
		for(Player p:players){
			try{
				p.sendMessage("§3[Log]§7"+s);
			}catch(Exception e){
				rm=p;
			}
		}
		if(rm!=null)
			players.remove(rm);
	}
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		Player p=(Player) sender;
		if(players.contains(p)){
			players.remove(p);
			p.sendMessage("§3[CytexalLog]§7DEAKTIVIERT");
		}else{
			p.sendMessage("§3[CytexalLog]§7AKTIVIERT");
			players.add(p);
		}
		
		return true;
	}
}