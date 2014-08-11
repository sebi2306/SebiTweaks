package com.sebi2306.sebitweaks.modinteraction;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import cofh.util.ThermalExpansionHelper;
import cpw.mods.fml.common.Loader;

public class ModCompatibility {


	
	public static boolean isTE4Loaded() {
		return Loader.isModLoaded("ThermalExpansion");
	}
	
	public static boolean isForestryLoaded()
	{
		return Loader.isModLoaded("Forestry");
	}
	
	public static boolean isIngotBronze()
	{
	   if(OreDictionary.getOres("ingotBronze") != null)
	   {
		   return true;
	   }
	   else
	   {
		   return false;
	   }
	}
	
	public static boolean isMekanismLoaded()
	{
		return Loader.isModLoaded("Mekanism");
	}
	
	public static void checkModsLoaded() {
		if (isTE4Loaded()) {
			System.out.println("[SebiTweaks] Thermal Expansion is loaded :)");
		}
		else {
			System.out.println("[SebiTweaks] Thermal Expansion could not be found");
			System.out.println("[SebiTweaks] Thermal Expansion Recipes were not loaded");
		}
		
	}
	
	public static void TERecipes()
	{
		ThermalExpansionHelper.addPulverizerRecipe(1600, new ItemStack(Blocks.vine), new ItemStack(Items.string), new ItemStack(Blocks.air), 10);
		System.out.println("[SebiTweaks] Thermal Expansion Recipes loaded");
		
	}
	
}




