package com.sebi2306.sebitweaks.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

import com.sebi2306.sebitweaks.reference.Names;
import com.sebi2306.sebitweaks.util.IKeyBound;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class ItemFlightRing extends ItemMainClass implements IKeyBound {
	
	public static int removeDamage = 1;
	
	public ItemFlightRing()
	{
		super();
		this.setMaxStackSize(1);
		this.setUnlocalizedName("flightRing");
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player){
		if(player != null)
		{
			if(!player.capabilities.isCreativeMode)
			{
			   player.capabilities.isCreativeMode = true;
			   player.capabilities.allowFlying = true;
			   player.capabilities.setFlySpeed(0.05F);
			   player.addChatMessage(new ChatComponentText("You can now fly! YAY! :)"));
			}
			else
			{
				player.capabilities.isCreativeMode = false;
			    player.capabilities.allowFlying = false;
			    player.capabilities.isFlying = false;
			    player.addChatMessage(new ChatComponentText("You deactivated flight"));   		
			}
		
		 
		}
		return stack;	
	 }
	
	@Override
	public void doKeyBindingAction(EntityPlayer player, ItemStack stack, int key) 
	{
		if(key == Names.Keys.KEYBIND_FLY)
		{
				if(!player.capabilities.isCreativeMode)
				{
				   player.capabilities.isCreativeMode = true;
				   player.capabilities.allowFlying = true;
				   player.capabilities.setFlySpeed(0.05F);
				   player.addChatMessage(new ChatComponentText("You can now fly! YAY! :)"));
				}
				else
				{
					player.capabilities.isCreativeMode = false;
				    player.capabilities.allowFlying = false;
				    player.capabilities.isFlying = false;
				    player.addChatMessage(new ChatComponentText("You deactivated flight"));   		
				}
			}
			
	    }
	
	
	
}


