package com.sebi2306.sebitweaks;

import net.minecraft.entity.passive.EntityChicken;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

import com.sebi2306.sebitweaks.items.ModItems;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EntityDropEvent {

	@SubscribeEvent
    public void chickenDropEvent(LivingDropsEvent evt)
    {
        if (evt.entityLiving instanceof EntityChicken)
        {
          evt.entityLiving.dropItem(ModItems.flightRing, 1 /*+ evt.entityLiving.worldObj.rand.nextInt(3)*/);
          //System.out.println("[DEBUG] Flight Ring dropped by Chicken");
        }
    }
	
}
