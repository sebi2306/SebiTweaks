package com.sebi2306.sebitweaks;

import com.sebi2306.sebitweaks.blocks.ModBlocks;
import com.sebi2306.sebitweaks.crafting.CraftingRecipes;
import com.sebi2306.sebitweaks.crafting.SmeltingRecipes;
import com.sebi2306.sebitweaks.items.ModItems;
import com.sebi2306.sebitweaks.modinteraction.ModCompatibility;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = SebiTweaks.MODID, version = SebiTweaks.VERSION)
public class SebiTweaks
{
    public static final String MODID = "sebitweaks";
    public static final String VERSION = "1.7.10-1.0";
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
    	ModItems.init();
    	ModBlocks.init();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		CraftingRecipes.init();
		SmeltingRecipes.init();
		//RecipeRemover.removeRecipe();
        ModCompatibility.checkModsLoaded();
        
        if (ModCompatibility.isTE3Loaded()){
        	ModCompatibility.TERecipes();
			
        }
    }
}
