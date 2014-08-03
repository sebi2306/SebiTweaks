package com.sebi2306.sebitweaks.modinteraction;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cofh.util.ThermalExpansionHelper;
import cpw.mods.fml.common.Loader;

public class ModCompatibility {

	public static boolean isTE3Loaded() {
		return Loader.isModLoaded("ThermalExpansion");
	}
	
	public static void checkModsLoaded() {
		if (isTE3Loaded()) {
			System.out.println("Thermal Expansion is loaded :)");
		}
		else {
			System.out.println("Thermal Expansion could not be found");
			System.out.println("Thermal Expansion Recipes were not loaded");
		}
		
	}
	
	public static void TERecipes()
	{
		ThermalExpansionHelper.addPulverizerRecipe(1600, new ItemStack(Blocks.vine), new ItemStack(Items.string), new ItemStack(Blocks.air), 10);
		System.out.println("Thermal Expansion Recipes loaded");
		
	}
	
}




