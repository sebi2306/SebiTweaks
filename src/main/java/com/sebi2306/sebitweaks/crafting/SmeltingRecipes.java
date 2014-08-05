package com.sebi2306.sebitweaks.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.sebi2306.sebitweaks.blocks.ModBlocks;
import com.sebi2306.sebitweaks.items.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class SmeltingRecipes {
	
	public static void init()
	{
	
	GameRegistry.addSmelting(new ItemStack(Items.coal), new ItemStack(ModItems.unsmeltingCoal), 1F);
	GameRegistry.addSmelting(new ItemStack(ModItems.unsmeltingCoal), new ItemStack(Items.coal), 1F);
	GameRegistry.addSmelting(new ItemStack(Blocks.coal_block), new ItemStack(ModBlocks.unsmeltingCoalBlock), 2F);
	GameRegistry.addSmelting(new ItemStack(ModBlocks.unsmeltingCoalBlock), new ItemStack(Blocks.coal_block), 2F);
	GameRegistry.addSmelting(new ItemStack(Items.rotten_flesh), new ItemStack(Items.leather), 0.50F);
//	GameRegistry.addSmelting(new ItemStack(Items.dye, 6, 15), new ItemStack(Items.bone), 1F);
	
	
	}

	

}
