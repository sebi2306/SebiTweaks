package com.sebi2306.sebitweaks;

import net.minecraft.item.ItemStack;

import com.sebi2306.sebitweaks.items.ItemFlightRing;
import com.sebi2306.sebitweaks.items.ModItems;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class ItemPickupEvent {

int removeDamage = ItemFlightRing.removeDamage;
	
	@SubscribeEvent
    public void onItemPickupEvent(PlayerEvent.ItemPickupEvent itemPickupEvent)
    {
       if(itemPickupEvent.pickedUp.getEntityItem() == new ItemStack(ModItems.flightRing))
       {
    	   removeDamage = 0;
       }
    }
}
