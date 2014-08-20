package com.sebi2306.sebitweaks.items;

import net.minecraft.item.ItemCoal;
import net.minecraftforge.oredict.OreDictionary;

import com.sebi2306.sebitweaks.reference.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
	
	 public static final ItemMainClass unsmeltingCoal = new ItemUnsmeltingCoal();
	 public static final ItemRope rope = new ItemRope();
	 public static final ItemFlightRing flightRing = new ItemFlightRing();
	 
      public static void init()
	    {
	        GameRegistry.registerItem(unsmeltingCoal, "unsmeltingCoal");
	        GameRegistry.registerItem(rope, "rope");
	        GameRegistry.registerItem(flightRing, "flightRing");
	       
	    }
}