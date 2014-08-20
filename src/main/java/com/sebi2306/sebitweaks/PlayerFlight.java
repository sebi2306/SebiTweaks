package com.sebi2306.sebitweaks;

import java.lang.reflect.Array;
import java.util.Arrays;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;

public class PlayerFlight {

  public static EntityPlayer player;
  public static Minecraft mc = Minecraft.getMinecraft();
  public static String[] names = {"ForgeDevName", "sebi2306", "Paul19988", "CrusherVx"};

public static void init()
  {
   for(int i = 0; i <= 3; i++)
   {   
	if(mc.thePlayer.getCommandSenderName().equalsIgnoreCase(names[i]))  
	{
		if(!mc.thePlayer.capabilities.isCreativeMode)
		{
		   mc.thePlayer.capabilities.isCreativeMode = true;
		   mc.thePlayer.capabilities.allowFlying = true;
		   mc.thePlayer.capabilities.setFlySpeed(0.05F);
		   mc.thePlayer.addChatMessage(new ChatComponentText("You can now fly! YAY! :)"));
		}
		else
		{
			mc.thePlayer.capabilities.isCreativeMode = false;
		    mc.thePlayer.capabilities.allowFlying = false;
		    mc.thePlayer.capabilities.isFlying = false;
		    mc.thePlayer.addChatMessage(new ChatComponentText("You deactivated flight"));   		
		}
	}
	
   }  
	  System.out.println("[SebiTweaks] PlayerFlight initialized :)");
  
  }
}

	




	