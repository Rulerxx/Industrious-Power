package rulerxx.industriouspower;

import java.util.Random;


import net.minecraft.src.IChunkProvider;
import net.minecraft.src.World;
import net.minecraft.src.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class worldGen implements IWorldGenerator
{

   @Override
public void generate(Random random, int chunkX, int chunkZ, World world,IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
   {
    {
    	
    	/* delete but no sure if its supposed to stay or not, will check in next re-run
    	 *         chunkX <<= 4;
    	 *			chunkZ <<= 4;
    	 */
    	if(industriouspower.enableworldGenTin)
        {
           
            {
                int randPosX = chunkX + random.nextInt(16);
                int randPosY = random.nextInt(76) + 0;
                int randPosZ = chunkZ + random.nextInt(16);
                (new WorldGenMinable(industriouspower.oreTin.blockID, 90)).generate(world, random, randPosX, randPosY, randPosZ);

            }
            
            if(industriouspower.enableworldGenCopper)
            {
                
                {
                    int randPosX = chunkX + random.nextInt(16);
                    int randPosY = random.nextInt(76) + 0;
                    int randPosZ = chunkZ + random.nextInt(16);
                    (new WorldGenMinable(industriouspower.oreCopper.blockID, 90)).generate(world, random, randPosX, randPosY, randPosZ);

                }            
                if(industriouspower.enableworldGenUranium)
                {
                    
                    {
                        int randPosX = chunkX + random.nextInt(16);
                        int randPosY = random.nextInt(76) + 0;
                        int randPosZ = chunkZ + random.nextInt(16);
                        (new WorldGenMinable(industriouspower.oreUranium.blockID, 90)).generate(world, random, randPosX, randPosY, randPosZ);

                    }
                
                

        }
    }
       
    }
   }
   }
}

   


