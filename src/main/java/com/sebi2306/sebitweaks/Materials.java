package com.sebi2306.sebitweaks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.sebi2306.sebitweaks.items.ItemBronzePickaxe;

import cpw.mods.fml.common.registry.GameRegistry;

public class Materials {

	public static Item ItemBronzePickaxe;
	
	public static ToolMaterial enumToolMaterialBronze = EnumHelper.addToolMaterial("BRONZE", 3, 1700, 7.0F, 4.0F, 30);
	 
	 
	public static void initTools()
	{
		ItemBronzePickaxe = new ItemBronzePickaxe(enumToolMaterialBronze).setUnlocalizedName("bronzePickaxe").setCreativeTab(CreativeTabs.tabTools);
		GameRegistry.registerItem(ItemBronzePickaxe, "bronzePickaxe");
	}
}