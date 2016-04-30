package com.Skype;

import net.minecraft.server.v1_9_R1.EnumParticle;
import net.minecraft.server.v1_9_R1.PacketPlayOutWorldParticles;

import org.bukkit.Effect;
import org.bukkit.Sound;
import org.bukkit.craftbukkit.v1_9_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class JS$$$$$$$$$$$$$$$$$$7$$$$$$$$$$$$$$$$ {

	
	public static void jumpscare(Player $$$$$$$$$$$$$$$$87$$$$$$$$$$$){
		float f = 0; // Not used; The mob apperance is always in front of the player
        float data = 0;// This is also not used for this effect :P
        float count = 1; //Don't think that this is used either :P
        int a = 1;
        new PacketPlayOutWorldParticles(EnumParticle.MOB_APPEARANCE, false, f, f, f, f, f, data, count, a, a);
     
        PacketPlayOutWorldParticles packet = new PacketPlayOutWorldParticles(EnumParticle.MOB_APPEARANCE, false, f, f, f, f, f, data, count, a, a);
        ((CraftPlayer)$$$$$$$$$$$$$$$$87$$$$$$$$$$$).getHandle().playerConnection.sendPacket(packet);
     
        $$$$$$$$$$$$$$$$87$$$$$$$$$$$.playSound($$$$$$$$$$$$$$$$87$$$$$$$$$$$.getLocation(), Sound.ENTITY_HORSE_DEATH, 100, 1);
        //Normally you can do this without packets by using the player.spigot().playEffect(...); But it doesn't seem that the Effect.MOB_APPERANCE has been added yet
	}
}
