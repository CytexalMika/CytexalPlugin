package com.Skype;

import net.minecraft.server.v1_9_R1.EnumParticle;
import net.minecraft.server.v1_9_R1.PacketPlayOutWorldParticles;

import org.bukkit.Effect;
import org.bukkit.Sound;
import org.bukkit.craftbukkit.v1_9_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class JS$$$$$$$$$$$$$$$$$$7$$$$$$$$$$$$$$$$ {

	
	public static void jumpscare(Player $$$$$$$$$$$$$$$$87$$$$$$$$$$$){
		float f = 0;
        float data = 0;
        float count = 1;
        int a = 1;
        new PacketPlayOutWorldParticles(EnumParticle.MOB_APPEARANCE, false, f, f, f, f, f, data, count, a, a);
     
        PacketPlayOutWorldParticles packet = new PacketPlayOutWorldParticles(EnumParticle.MOB_APPEARANCE, false, f, f, f, f, f, data, count, a, a);
        ((CraftPlayer)$$$$$$$$$$$$$$$$87$$$$$$$$$$$).getHandle().playerConnection.sendPacket(packet);
        $$$$$$$$$$$$$$$$87$$$$$$$$$$$.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 40, 1));
        $$$$$$$$$$$$$$$$87$$$$$$$$$$$.playSound($$$$$$$$$$$$$$$$87$$$$$$$$$$$.getLocation(), Sound.ENTITY_BAT_DEATH, 100, 1);
        $$$$$$$$$$$$$$$$87$$$$$$$$$$$.playSound($$$$$$$$$$$$$$$$87$$$$$$$$$$$.getLocation(), Sound.ENTITY_HORSE_DEATH, 100, 1);
	}
}
