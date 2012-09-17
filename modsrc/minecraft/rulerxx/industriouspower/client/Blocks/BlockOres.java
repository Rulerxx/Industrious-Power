package rulerxx.industriouspower.client.Blocks;

import rulerxx.industriouspower.CommonProxy;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class BlockOres extends Block
{
    public BlockOres(int par1, int par2)
    {
        super(par1, par2, Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    
    public String getTextureFile () {
    	return CommonProxy.BLOCK_PNG;
    }
}