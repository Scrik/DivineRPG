/*
 *** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
 */

package net.divinerpg.dimension.gen.iceika;
import java.util.Random;

import net.divinerpg.helper.blocks.IceikaBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class LightPost1 extends WorldGenerator
{
	protected Block[] GetValidSpawnBlocks() {
        return new Block[] {
                IceikaBlocks.frozenGrass
        };
    }

    public boolean LocationIsValidSpawn(World world, int i, int j, int k){
        int distanceToAir = 0;
        Block checkID = world.getBlock(i, j, k);

        while (checkID != Blocks.air){
            distanceToAir++;
            checkID = world.getBlock(i, j + distanceToAir, k);
        }

        if (distanceToAir > 3)
            return false;
        j += distanceToAir - 1;

        Block blockID = world.getBlock(i, j, k);
        Block blockIDAbove = world.getBlock(i, j+1, k);
        Block blockIDBelow = world.getBlock(i, j-1, k);
        for (Block x : GetValidSpawnBlocks()){
            if (blockIDAbove != Blocks.air)
                return false;
            if (blockID == x)
                return true;
            else if (blockID == Blocks.snow && blockIDBelow == x)
                return true;
        }
        return false;
    }


    public LightPost1() { }

    @Override
    public boolean generate(World world, Random rand, int i, int j, int k) {
        //check that each corner is one of the valid spawn blocks
        if(!LocationIsValidSpawn(world, i, j, k) || !LocationIsValidSpawn(world, i + 3, j, k) || !LocationIsValidSpawn(world, i + 3, j, k + 3) || !LocationIsValidSpawn(world, i, j, k + 3))
            return false;

        world.setBlock(i + 0, j + 0, k + 1, IceikaBlocks.coalstone);
        world.setBlock(i + 0, j + 0, k + 2, IceikaBlocks.coalstone);
        world.setBlock(i + 1, j + 0, k + 0, IceikaBlocks.coalstone);
        world.setBlock(i + 1, j + 0, k + 1, IceikaBlocks.coalstone);
        world.setBlock(i + 1, j + 0, k + 2, IceikaBlocks.coalstone);
        world.setBlock(i + 1, j + 0, k + 3, IceikaBlocks.coalstone);
        world.setBlock(i + 1, j + 1, k + 1, IceikaBlocks.coalstone);
        world.setBlock(i + 1, j + 1, k + 2, IceikaBlocks.coalstone);
        world.setBlock(i + 1, j + 2, k + 1, IceikaBlocks.workshopLamp);
        world.setBlock(i + 1, j + 2, k + 2, IceikaBlocks.workshopLamp);
        world.setBlock(i + 2, j + 0, k + 0, IceikaBlocks.coalstone);
        world.setBlock(i + 2, j + 0, k + 1, IceikaBlocks.coalstone);
        world.setBlock(i + 2, j + 0, k + 2, IceikaBlocks.coalstone);
        world.setBlock(i + 2, j + 0, k + 3, IceikaBlocks.coalstone);
        world.setBlock(i + 2, j + 1, k + 1, IceikaBlocks.coalstone);
        world.setBlock(i + 2, j + 1, k + 2, IceikaBlocks.coalstone);
        world.setBlock(i + 2, j + 2, k + 1, IceikaBlocks.workshopLamp);
        world.setBlock(i + 2, j + 2, k + 2, IceikaBlocks.workshopLamp);
        world.setBlock(i + 3, j + 0, k + 1, IceikaBlocks.coalstone);
        world.setBlock(i + 3, j + 0, k + 2, IceikaBlocks.coalstone);

        return true;
    }
}