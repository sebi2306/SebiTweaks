package com.sebi2306.sebitweaks.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.sebi2306.sebitweaks.blocks.ModBlocks;
import com.sebi2306.sebitweaks.items.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingRecipes {

	public static void init() {
	
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone, 8), new Object[] {new ItemStack(Blocks.furnace)});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.stone, 8), new Object[] {Blocks.cobblestone, Items.coal, Blocks.cobblestone, Blocks.cobblestone, Blocks.cobblestone, Blocks.cobblestone, Blocks.cobblestone, Blocks.cobblestone, Blocks.cobblestone});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone, 8), new Object[] {Blocks.stone, ModItems.unsmeltingCoal, Blocks.stone, Blocks.stone, Blocks.stone, Blocks.stone, Blocks.stone, Blocks.stone, Blocks.stone});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.glass, 8), new Object[] {Items.coal, Blocks.sand, Blocks.sand, Blocks.sand, Blocks.sand, Blocks.sand, Blocks.sand, Blocks.sand, Blocks.sand});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.rope), new Object[] {Items.string, Items.string, Items.string});
		
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.unsmeltingCoalBlock), new Object[] {"XXX", "XXX", "XXX", 'X', new ItemStack(ModItems.unsmeltingCoal)});
		GameRegistry.addShapedRecipe(new ItemStack(Items.name_tag), new Object[] {" AA", " BA", "C  ", 'A', new ItemStack(Items.string), 'B', new ItemStack(Items.slime_ball), 'C', new ItemStack(Items.paper)});
		GameRegistry.addShapedRecipe(new ItemStack(Items.saddle), new Object[] {"AAA", "ABA", "C C", 'A', new ItemStack(Items.leather), 'B', new ItemStack(Items.iron_ingot), 'C', new ItemStack(ModItems.rope)});
		
	}
	
}
	
	
	