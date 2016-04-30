package com.Skype;

import net.minecraft.server.v1_9_R1.PacketPlayOutWorldParticles;

import org.bukkit.craftbukkit.v1_9_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class JS$$$$$$$$$$$$$$$$$$7$$$$$$$$$$$$$$$$ {

	
	public static void jumpscare(Player p){
		float f = 0; // Not used; The mob apperance is always in front of the player
        float data = 0;// This is also not used for this effect :P
        float count = 1; //Don't think that this is used either :P
     
        PacketPlayOutWorldParticles packet = new PacketPlayOutWorldParticles();
        ((CraftPlayer)p).getHandle().playerConnection.sendPacket(packet);
     
        //Normally you can do this without packets by using the player.spigot().playEffect(...); But it doesn't seem that the Effect.MOB_APPERANCE has been added yet
	}
}
