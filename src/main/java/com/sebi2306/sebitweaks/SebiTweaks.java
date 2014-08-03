package com.sebi2306.sebitweaks;

import items.ModItems;
import blocks.ModBlocks;
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
