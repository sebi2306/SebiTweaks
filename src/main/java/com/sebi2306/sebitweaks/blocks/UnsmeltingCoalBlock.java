package com.sebi2306.sebitweaks.blocks;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

public class UnsmeltingCoalBlock extends BlockMainClass 
{
	
	public UnsmeltingCoalBlock()
	{
		super();
		this.setBlockName("unsmeltingCoalBlock");
		this.setBlockTextureName("unsmeltingCoalBlock");
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(5.0F);
		this.setResistance(10.0F);
	}

}
