package com.sebi2306.sebitweaks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

import com.sebi2306.sebitweaks.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockMainClass extends Block
{
	
	 public BlockMainClass(Material material)
	    {
	        super(material);
	    }

	    public BlockMainClass()
	    {
	        this(Material.rock);
	    }

	    @Override
	    public String getUnlocalizedName()
	    {
	        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	    }

	    @Override
	    @SideOnly(Side.CLIENT)
	    public void registerBlockIcons(IIconRegister iconRegister)
	    {
	        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
	    }

	    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	    {
	        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	    }

}
