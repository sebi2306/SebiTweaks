package com.sebi2306.sebitweaks;

import net.minecraft.entity.passive.EntityChicken;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

import com.sebi2306.sebitweaks.blocks.ModBlocks;
import com.sebi2306.sebitweaks.crafting.CraftingRecipes;
import com.sebi2306.sebitweaks.crafting.SmeltingRecipes;
import com.sebi2306.sebitweaks.items.ModItems;
import com.sebi2306.sebitweaks.modinteraction.ModCompatibility;
import com.sebi2306.sebitweaks.proxy.IProxy;
import com.sebi2306.sebitweaks.reference.Reference;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = SebiTweaks.MODID, version = SebiTweaks.VERSION)
public class SebiTweaks
{
    public static final String MODID = "sebitweaks";
    public static final String VERSION = "1.7.10-1.0";
    
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
    	ModItems.init();
    	ModBlocks.init();
    	Materials.initTools();
    	proxy.registerKeybindings();

    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
	    CraftingRecipes.init();
	    SmeltingRecipes.init();
        ModCompatibility.checkModsLoaded();
        FMLCommonHandler.instance().bus().register(new KeyInputHandler());
        FMLCommonHandler.instance().bus().register(new ItemDropEvent());
        FMLCommonHandler.instance().bus().register(new ItemPickupEvent());
        MinecraftForge.EVENT_BUS.register(new EntityDropEvent());
        MinecraftForge.EVENT_BUS.register(new RemoveDamageEvent());

        
        if(ModCompatibility.isIngotBronze())
        {
        	CraftingRecipes.initCompatRecipes();
        }
        
        if (ModCompatibility.isTE4Loaded())
        {
        	ModCompatibility.TERecipes();			
        }
       
    }
      
    
    
      @EventHandler
      public void serverLoad(FMLServerStartingEvent event)
      {
    	  
      }
}
