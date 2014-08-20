package com.sebi2306.sebitweaks.util;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public interface IKeyBound
{
	public abstract void doKeyBindingAction(EntityPlayer player, ItemStack stack, int key);
}