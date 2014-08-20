package com.sebi2306.sebitweaks.reference;

import net.minecraft.client.settings.KeyBinding;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class Keybindings
{
    public static KeyBinding fly = new KeyBinding("key.fly", Keyboard.KEY_F, Names.Keys.CATEGORY);
}
