package com.sebi2306.sebitweaks.items;

import net.minecraftforge.oredict.OreDictionary;

import com.sebi2306.sebitweaks.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
	
	 public static final ItemMainClass unsmeltingCoal = new ItemUnsmeltingCoal();
	 public static final ItemRope rope = new ItemRope();
	 public static final ItemBronzeIngot ingotBronze = new ItemBronzeIngot();

      public static void init()
	    {
	        GameRegistry.registerItem(unsmeltingCoal, "unsmeltingCoal");
	        GameRegistry.registerItem(rope, "rope");
	        OreDictionary.registerOre("ingotBronze", ingotBronze);
	        GameRegistry.registerItem(ingotBronze, "ingotBronze");
	    }
}