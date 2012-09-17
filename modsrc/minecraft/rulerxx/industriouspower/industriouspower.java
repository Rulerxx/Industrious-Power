package rulerxx.industriouspower;

import net.minecraft.src.Block;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import rulerxx.industriouspower.client.Blocks.ModBlocks;

@Mod(modid="rulerxx_industriouspower", name="Industrius Power", version="0.0.0")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class industriouspower {
	@SidedProxy(clientSide="rulerxx.industriouspower.client.ClientProxy", serverSide="rulerxx.industriouspower.CommonProxy")
	public static CommonProxy proxy;
	
	
	//Block Declarations
	public static Block oreCopper;
	public static Block oreTin;
	public static Block oreUranium;
	public static Block Test;
	
	//BlockID Declarations
	public static int oreCopperBlockID;
	public static int oreTinBlockID;
	public static int oreUraniumBlockID;
	
	//worldGen Declarations
	public static boolean enableworldGenTin;
	public static boolean enableworldGenCopper;
	public static boolean enableworldGenUranium;
	


	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());

        config.load();

        oreCopperBlockID = config.getOrCreateBlockIdProperty("Copper Ore", 200).getInt();
        oreTinBlockID = config.getOrCreateBlockIdProperty("Tin Ore", 201).getInt();
        oreUraniumBlockID = config.getOrCreateBlockIdProperty("Uranium Ore", 202).getInt();
        enableworldGenCopper = config.getOrCreateBooleanProperty("Enable Copper Generation", Configuration.CATEGORY_GENERAL, true).getBoolean(true);
        enableworldGenTin = config.getOrCreateBooleanProperty("Enable Tin Generation", Configuration.CATEGORY_GENERAL, true).getBoolean(true);
        enableworldGenUranium = config.getOrCreateBooleanProperty("Enable Uranium Generation", Configuration.CATEGORY_GENERAL, true).getBoolean(true);
        

        config.save();
		
		
	}
	
	@Init
	public void load(FMLInitializationEvent event) {
		ModBlocks.init();
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}