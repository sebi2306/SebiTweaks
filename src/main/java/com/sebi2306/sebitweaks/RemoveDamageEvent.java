package com.sebi2306.sebitweaks;

import com.sebi2306.sebitweaks.items.ItemFlightRing;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class RemoveDamageEvent {

int removeDamage = ItemFlightRing.removeDamage;	

	@SubscribeEvent
	public void livingFall(LivingFallEvent event)
	{
	    if (!(event.entityLiving instanceof EntityPlayer)) return;
	    EntityPlayer eventPlayer = (EntityPlayer)event.entityLiving;
	    if(removeDamage == 0)
	    {
	    	//Check if the damage should be removed
		    event.distance = 0F;
	    }
	    
	}
}
