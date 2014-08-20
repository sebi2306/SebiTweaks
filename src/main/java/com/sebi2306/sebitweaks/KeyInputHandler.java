package com.sebi2306.sebitweaks;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;

import com.sebi2306.sebitweaks.reference.Keybindings;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

	public class KeyInputHandler {

		public static EntityPlayer player;
		Minecraft mc = Minecraft.getMinecraft();
	    @SubscribeEvent
	    public void onKeyInput(InputEvent.KeyInputEvent event) {
	        if(Keybindings.fly.isPressed())
	        {
	        	PlayerFlight.init();
	        	//System.out.println("[DEBUG] Button");
	        	//mc.thePlayer.addChatMessage(new ChatComponentText("[DEBUG] Button"));
	        	
	        }
	            
	    }

	}

