package com.sebi2306.sebitweaks;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.item.ItemTossEvent;

import com.sebi2306.sebitweaks.items.ItemFlightRing;
import com.sebi2306.sebitweaks.items.ModItems;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ItemDropEvent {

	int removeDamage = ItemFlightRing.removeDamage;
	public static EntityPlayer player;
	public static Minecraft mc = Minecraft.getMinecraft();
	
	/*@SubscribeEvent
	public void ItemTossEvent(EntityItem entityItem, EntityPlayer player)
	{
		if(entityItem.getEntityItem() == new ItemStack(ModItems.flightRing))
		{
			removeDamage = 1;
			System.out.println("Remove Damage = " + removeDamage);
		}
	}*/
	
	 @SubscribeEvent
	    public void onItemTossEvent(ItemTossEvent event)
	    {
	       if(event.entityItem.getEntityItem() == new ItemStack(ModItems.flightRing))
	       {
	    	   removeDamage = 1;
			   //System.out.println("Remove Damage = " + removeDamage);
			   event.player.capabilities.isCreativeMode = false;
			   event.player.capabilities.allowFlying = false;
			   event.player.capabilities.isFlying = false;
	       }
	    }
}

