package com.sebi2306.sebitweaks.proxy;

import com.sebi2306.sebitweaks.reference.Keybindings;

import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy implements IProxy {
	
	@Override
    public void registerKeybindings()
    {
        ClientRegistry.registerKeyBinding(Keybindings.fly);
    }

}
