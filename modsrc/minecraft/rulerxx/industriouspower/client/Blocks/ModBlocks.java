package rulerxx.industriouspower.client.Blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.src.Block;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.*;
import rulerxx.industriouspower.*;

public class ModBlocks extends industriouspower {
	
	
	
	
	
	public static void init() {
		oreCopper = new BlockOres(oreCopperBlockID, 0).setStepSound(Block.soundStoneFootstep).setHardness(3F).setResistance(1.0F).setBlockName("oreCopper");
		oreTin = new BlockOres(oreTinBlockID, 1).setStepSound(Block.soundStoneFootstep).setHardness(3F).setResistance(1.0F).setBlockName("oreTin");
		oreUranium = new BlockOres(oreUraniumBlockID, 2).setStepSound(Block.soundStoneFootstep).setHardness(3F).setResistance(1.0F).setBlockName("oreUranium");
		GameRegistry.registerBlock(oreCopper);
		GameRegistry.registerBlock(oreTin);
		GameRegistry.registerBlock(oreUranium);
		LanguageRegistry.addName(oreUranium, "Uranium Ore");
		LanguageRegistry.addName(oreTin, "Tin Ore");
		LanguageRegistry.addName(oreCopper, "Copper Ore");
		GameRegistry.registerWorldGenerator(new worldGen());
		
	}

}
