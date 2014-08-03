package com.sebi2306.sebitweaks;

import java.util.Iterator;
import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;

public class RecipeRemover {
	public void removeRecipe() {
		List<IRecipe> recipe = CraftingManager.getInstance().getRecipeList();
		Iterator<IRecipe> remover = recipe.iterator();
		while(remover.hasNext()) {
			ItemStack itemstack = remover.next().getRecipeOutput();
			if(itemstack != null && itemstack.getItem() == null);
		}
	}
}

		
