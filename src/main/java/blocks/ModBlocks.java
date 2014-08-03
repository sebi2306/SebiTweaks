package blocks;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	public static final BlockMainClass unsmeltingCoalBlock = new UnsmeltingCoalBlock();
	
	public static void init()
	{
		GameRegistry.registerBlock(unsmeltingCoalBlock, "unsmeltingCoalBlock");
	}

}
