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

public class SnowyVillage2 extends WorldGenerator
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

	public SnowyVillage2() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {
		//check that each corner is one of the valid spawn blocks
		if(!LocationIsValidSpawn(world, i, j, k) || !LocationIsValidSpawn(world, i + 10, j, k) || !LocationIsValidSpawn(world, i + 10, j, k + 10) || !LocationIsValidSpawn(world, i, j, k + 10))
		{
			return false;
		}

		world.setBlock(i + 2, j + 0, k + 2, IceikaBlocks.coalstone);
		world.setBlock(i + 2, j + 0, k + 3, IceikaBlocks.snowBricks);
		world.setBlock(i + 2, j + 0, k + 4, IceikaBlocks.snowBricks);
		world.setBlock(i + 2, j + 0, k + 5, IceikaBlocks.snowBricks);
		world.setBlock(i + 2, j + 0, k + 6, IceikaBlocks.snowBricks);
		world.setBlock(i + 2, j + 0, k + 7, IceikaBlocks.snowBricks);
		world.setBlock(i + 2, j + 0, k + 8, IceikaBlocks.coalstone);
		world.setBlock(i + 2, j + 1, k + 2, IceikaBlocks.coalstone);
		world.setBlock(i + 2, j + 1, k + 3, IceikaBlocks.snowBricks);
		world.setBlock(i + 2, j + 1, k + 4, IceikaBlocks.snowBricks);
		world.setBlock(i + 2, j + 1, k + 5, IceikaBlocks.snowBricks);
		world.setBlock(i + 2, j + 1, k + 6, IceikaBlocks.snowBricks);
		world.setBlock(i + 2, j + 1, k + 7, IceikaBlocks.snowBricks);
		world.setBlock(i + 2, j + 1, k + 8, IceikaBlocks.coalstone);
		world.setBlock(i + 2, j + 2, k + 2, IceikaBlocks.coalstone);
		world.setBlock(i + 2, j + 2, k + 3, IceikaBlocks.snowBricks);
		world.setBlock(i + 2, j + 2, k + 4, IceikaBlocks.snowBricks);
		world.setBlock(i + 2, j + 2, k + 5, IceikaBlocks.snowBricks);
		world.setBlock(i + 2, j + 2, k + 6, IceikaBlocks.snowBricks);
		world.setBlock(i + 2, j + 2, k + 7, IceikaBlocks.snowBricks);
		world.setBlock(i + 2, j + 2, k + 8, IceikaBlocks.coalstone);
		world.setBlock(i + 2, j + 3, k + 2, IceikaBlocks.coalstone);
		world.setBlock(i + 2, j + 3, k + 3, IceikaBlocks.snowBricks);
		world.setBlock(i + 2, j + 3, k + 4, IceikaBlocks.frostedGlass);
		world.setBlock(i + 2, j + 3, k + 5, IceikaBlocks.snowBricks);
		world.setBlock(i + 2, j + 3, k + 6, IceikaBlocks.frostedGlass);
		world.setBlock(i + 2, j + 3, k + 7, IceikaBlocks.snowBricks);
		world.setBlock(i + 2, j + 3, k + 8, IceikaBlocks.coalstone);
		world.setBlock(i + 2, j + 4, k + 3, IceikaBlocks.snowBricks);
		world.setBlock(i + 2, j + 4, k + 4, IceikaBlocks.snowBricks);
		world.setBlock(i + 2, j + 4, k + 5, IceikaBlocks.snowBricks);
		world.setBlock(i + 2, j + 4, k + 6, IceikaBlocks.snowBricks);
		world.setBlock(i + 2, j + 4, k + 7, IceikaBlocks.snowBricks);
		world.setBlock(i + 2, j + 5, k + 4, IceikaBlocks.snowBricks);
		world.setBlock(i + 2, j + 5, k + 5, IceikaBlocks.snowBricks);
		world.setBlock(i + 2, j + 5, k + 6, IceikaBlocks.snowBricks);
		world.setBlock(i + 3, j + 0, k + 2, IceikaBlocks.snowBricks);
		world.setBlock(i + 3, j + 0, k + 3, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 3, j + 0, k + 4, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 3, j + 0, k + 5, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 3, j + 0, k + 6, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 3, j + 0, k + 7, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 3, j + 0, k + 8, IceikaBlocks.snowBricks);
		world.setBlock(i + 3, j + 1, k + 2, IceikaBlocks.snowBricks);
		world.setBlock(i + 3, j + 1, k + 3, IceikaBlocks.workshopBookcase);
		world.setBlock(i + 3, j + 1, k + 4, IceikaBlocks.coalstone);
		world.setBlock(i + 3, j + 1, k + 5, IceikaBlocks.coalstoneFurnace);
		world.setBlock(i + 3, j + 1, k + 6, IceikaBlocks.coalstone);
		world.setBlock(i + 3, j + 1, k + 7, IceikaBlocks.workshopBookcase);
		world.setBlock(i + 3, j + 1, k + 8, IceikaBlocks.snowBricks);
		world.setBlock(i + 3, j + 2, k + 2, IceikaBlocks.snowBricks);
		world.setBlock(i + 3, j + 2, k + 4, IceikaBlocks.coalstone);
		world.setBlock(i + 3, j + 2, k + 5, IceikaBlocks.coalstone);
		world.setBlock(i + 3, j + 2, k + 6, IceikaBlocks.coalstone);
		world.setBlock(i + 3, j + 2, k + 8, IceikaBlocks.snowBricks);
		world.setBlock(i + 3, j + 3, k + 2, IceikaBlocks.snowBricks);
		world.setBlock(i + 3, j + 3, k + 5, IceikaBlocks.coalstone);
		world.setBlock(i + 3, j + 3, k + 8, IceikaBlocks.snowBricks);
		world.setBlock(i + 3, j + 4, k + 3, IceikaBlocks.snowBricks);
		world.setBlock(i + 3, j + 4, k + 4, IceikaBlocks.snowBricks);
		world.setBlock(i + 3, j + 4, k + 5, IceikaBlocks.coalstone);
		world.setBlock(i + 3, j + 4, k + 6, IceikaBlocks.snowBricks);
		world.setBlock(i + 3, j + 4, k + 7, IceikaBlocks.snowBricks);
		world.setBlock(i + 3, j + 5, k + 4, IceikaBlocks.snowBricks);
		world.setBlock(i + 3, j + 5, k + 5, IceikaBlocks.coalstone);
		world.setBlock(i + 3, j + 5, k + 6, IceikaBlocks.snowBricks);
		world.setBlock(i + 3, j + 6, k + 5, IceikaBlocks.coalstone);
		world.setBlock(i + 3, j + 7, k + 5, IceikaBlocks.coalstone);
		world.setBlock(i + 4, j + 0, k + 2, IceikaBlocks.snowBricks);
		world.setBlock(i + 4, j + 0, k + 3, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 4, j + 0, k + 4, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 4, j + 0, k + 5, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 4, j + 0, k + 6, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 4, j + 0, k + 7, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 4, j + 0, k + 8, IceikaBlocks.snowBricks);
		world.setBlock(i + 4, j + 1, k + 2, IceikaBlocks.snowBricks);
		world.setBlock(i + 4, j + 1, k + 8, IceikaBlocks.snowBricks);
		world.setBlock(i + 4, j + 2, k + 2, IceikaBlocks.snowBricks);
		world.setBlock(i + 4, j + 2, k + 8, IceikaBlocks.snowBricks);
		world.setBlock(i + 4, j + 3, k + 2, IceikaBlocks.snowBricks);
		world.setBlock(i + 4, j + 3, k + 8, IceikaBlocks.snowBricks);
		world.setBlock(i + 4, j + 4, k + 3, IceikaBlocks.snowBricks);
		world.setBlock(i + 4, j + 4, k + 4, IceikaBlocks.snowBricks);
		world.setBlock(i + 4, j + 4, k + 5, IceikaBlocks.snowBricks);
		world.setBlock(i + 4, j + 4, k + 6, IceikaBlocks.snowBricks);
		world.setBlock(i + 4, j + 4, k + 7, IceikaBlocks.snowBricks);
		world.setBlock(i + 4, j + 5, k + 4, IceikaBlocks.snowBricks);
		world.setBlock(i + 4, j + 5, k + 5, IceikaBlocks.snowBricks);
		world.setBlock(i + 4, j + 5, k + 6, IceikaBlocks.snowBricks);
		world.setBlock(i + 5, j + 0, k + 2, IceikaBlocks.snowBricks);
		world.setBlock(i + 5, j + 0, k + 3, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 5, j + 0, k + 4, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 5, j + 0, k + 5, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 5, j + 0, k + 6, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 5, j + 0, k + 7, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 5, j + 0, k + 8, IceikaBlocks.snowBricks);
		world.setBlock(i + 5, j + 1, k + 2, IceikaBlocks.snowBricks);
		world.setBlock(i + 5, j + 1, k + 8, IceikaBlocks.snowBricks);
		world.setBlock(i + 5, j + 2, k + 2, IceikaBlocks.snowBricks);
		world.setBlock(i + 5, j + 2, k + 8, IceikaBlocks.snowBricks);
		world.setBlock(i + 5, j + 3, k + 2, IceikaBlocks.snowBricks);
		world.setBlock(i + 5, j + 3, k + 8, IceikaBlocks.snowBricks);
		world.setBlock(i + 5, j + 4, k + 3, IceikaBlocks.snowBricks);
		world.setBlock(i + 5, j + 4, k + 4, IceikaBlocks.snowBricks);
		world.setBlock(i + 5, j + 4, k + 5, IceikaBlocks.snowBricks);
		world.setBlock(i + 5, j + 4, k + 6, IceikaBlocks.snowBricks);
		world.setBlock(i + 5, j + 4, k + 7, IceikaBlocks.snowBricks);
		world.setBlock(i + 6, j + 0, k + 0, IceikaBlocks.snowBricks);
		world.setBlock(i + 6, j + 0, k + 1, IceikaBlocks.snowBricks);
		world.setBlock(i + 6, j + 0, k + 2, IceikaBlocks.snowBricks);
		world.setBlock(i + 6, j + 0, k + 3, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 6, j + 0, k + 4, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 6, j + 0, k + 5, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 6, j + 0, k + 6, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 6, j + 0, k + 7, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 6, j + 0, k + 8, IceikaBlocks.snowBricks);
		world.setBlock(i + 6, j + 0, k + 9, IceikaBlocks.snowBricks);
		world.setBlock(i + 6, j + 0, k + 10, IceikaBlocks.snowBricks);
		world.setBlock(i + 6, j + 1, k + 0, IceikaBlocks.snowBricks);
		world.setBlock(i + 6, j + 1, k + 1, IceikaBlocks.snowBricks);
		world.setBlock(i + 6, j + 1, k + 2, IceikaBlocks.snowBricks);
		world.setBlock(i + 6, j + 1, k + 8, IceikaBlocks.snowBricks);
		world.setBlock(i + 6, j + 1, k + 9, IceikaBlocks.snowBricks);
		world.setBlock(i + 6, j + 1, k + 10, IceikaBlocks.snowBricks);
		world.setBlock(i + 6, j + 2, k + 1, IceikaBlocks.snowBricks);
		world.setBlock(i + 6, j + 2, k + 2, IceikaBlocks.snowBricks);
		world.setBlock(i + 6, j + 2, k + 8, IceikaBlocks.snowBricks);
		world.setBlock(i + 6, j + 2, k + 9, IceikaBlocks.snowBricks);
		world.setBlock(i + 6, j + 3, k + 1, IceikaBlocks.snowBricks);
		world.setBlock(i + 6, j + 3, k + 2, IceikaBlocks.snowBricks);
		world.setBlock(i + 6, j + 3, k + 8, IceikaBlocks.snowBricks);
		world.setBlock(i + 6, j + 3, k + 9, IceikaBlocks.snowBricks);
		world.setBlock(i + 6, j + 4, k + 3, IceikaBlocks.snowBricks);
		world.setBlock(i + 6, j + 4, k + 4, IceikaBlocks.snowBricks);
		world.setBlock(i + 6, j + 4, k + 5, IceikaBlocks.snowBricks);
		world.setBlock(i + 6, j + 4, k + 6, IceikaBlocks.snowBricks);
		world.setBlock(i + 6, j + 4, k + 7, IceikaBlocks.snowBricks);
		world.setBlock(i + 7, j + 0, k + 0, IceikaBlocks.coalstone);
		world.setBlock(i + 7, j + 0, k + 1, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 7, j + 0, k + 2, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 7, j + 0, k + 3, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 7, j + 0, k + 4, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 7, j + 0, k + 5, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 7, j + 0, k + 6, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 7, j + 0, k + 7, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 7, j + 0, k + 8, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 7, j + 0, k + 9, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 7, j + 0, k + 10, IceikaBlocks.coalstone);
		world.setBlock(i + 7, j + 1, k + 1, IceikaBlocks.snowBricks);
		world.setBlock(i + 7, j + 1, k + 9, IceikaBlocks.snowBricks);
		world.setBlock(i + 7, j + 2, k + 1, IceikaBlocks.snowBricks);
		world.setBlock(i + 7, j + 2, k + 9, IceikaBlocks.snowBricks);
		world.setBlock(i + 7, j + 3, k + 1, IceikaBlocks.snowBricks);
		world.setBlock(i + 7, j + 3, k + 2, IceikaBlocks.workshopLamp);
		world.setBlock(i + 7, j + 3, k + 8, IceikaBlocks.workshopLamp);
		world.setBlock(i + 7, j + 3, k + 9, IceikaBlocks.snowBricks);
		world.setBlock(i + 7, j + 4, k + 2, IceikaBlocks.snowBricks);
		world.setBlock(i + 7, j + 4, k + 3, IceikaBlocks.snowBricks);
		world.setBlock(i + 7, j + 4, k + 4, IceikaBlocks.snowBricks);
		world.setBlock(i + 7, j + 4, k + 5, IceikaBlocks.snowBricks);
		world.setBlock(i + 7, j + 4, k + 6, IceikaBlocks.snowBricks);
		world.setBlock(i + 7, j + 4, k + 7, IceikaBlocks.snowBricks);
		world.setBlock(i + 7, j + 4, k + 8, IceikaBlocks.snowBricks);
		world.setBlock(i + 8, j + 0, k + 0, IceikaBlocks.coalstone);
		world.setBlock(i + 8, j + 0, k + 1, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 8, j + 0, k + 2, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 8, j + 0, k + 3, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 8, j + 0, k + 4, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 8, j + 0, k + 5, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 8, j + 0, k + 6, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 8, j + 0, k + 7, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 8, j + 0, k + 8, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 8, j + 0, k + 9, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 8, j + 0, k + 10, IceikaBlocks.coalstone);
		world.setBlock(i + 8, j + 1, k + 1, IceikaBlocks.steelDoorBlock, 1, 0);
		world.setBlock(i + 8, j + 1, k + 9, IceikaBlocks.steelDoorBlock, 3, 0);
		world.setBlock(i + 8, j + 2, k + 1, IceikaBlocks.steelDoorBlock, 8, 0);
		world.setBlock(i + 8, j + 2, k + 9, IceikaBlocks.steelDoorBlock, 8, 0);
		world.setBlock(i + 8, j + 3, k + 1, IceikaBlocks.snowBricks);
		world.setBlock(i + 8, j + 3, k + 9, IceikaBlocks.snowBricks);
		world.setBlock(i + 8, j + 4, k + 2, IceikaBlocks.snowBricks);
		world.setBlock(i + 8, j + 4, k + 3, IceikaBlocks.snowBricks);
		world.setBlock(i + 8, j + 4, k + 4, IceikaBlocks.snowBricks);
		world.setBlock(i + 8, j + 4, k + 5, IceikaBlocks.snowBricks);
		world.setBlock(i + 8, j + 4, k + 6, IceikaBlocks.snowBricks);
		world.setBlock(i + 8, j + 4, k + 7, IceikaBlocks.snowBricks);
		world.setBlock(i + 8, j + 4, k + 8, IceikaBlocks.snowBricks);
		world.setBlock(i + 9, j + 0, k + 0, IceikaBlocks.coalstone);
		world.setBlock(i + 9, j + 0, k + 1, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 9, j + 0, k + 2, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 9, j + 0, k + 3, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 9, j + 0, k + 4, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 9, j + 0, k + 5, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 9, j + 0, k + 6, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 9, j + 0, k + 7, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 9, j + 0, k + 8, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 9, j + 0, k + 9, IceikaBlocks.workshopCarpet);
		world.setBlock(i + 9, j + 0, k + 10, IceikaBlocks.coalstone);
		world.setBlock(i + 9, j + 1, k + 1, IceikaBlocks.snowBricks);
		world.setBlock(i + 9, j + 1, k + 9, IceikaBlocks.snowBricks);
		world.setBlock(i + 9, j + 2, k + 1, IceikaBlocks.snowBricks);
		world.setBlock(i + 9, j + 2, k + 9, IceikaBlocks.snowBricks);
		world.setBlock(i + 9, j + 3, k + 1, IceikaBlocks.snowBricks);
		world.setBlock(i + 9, j + 3, k + 9, IceikaBlocks.snowBricks);
		world.setBlock(i + 9, j + 4, k + 2, IceikaBlocks.snowBricks);
		world.setBlock(i + 9, j + 4, k + 3, IceikaBlocks.snowBricks);
		world.setBlock(i + 9, j + 4, k + 4, IceikaBlocks.snowBricks);
		world.setBlock(i + 9, j + 4, k + 5, IceikaBlocks.snowBricks);
		world.setBlock(i + 9, j + 4, k + 6, IceikaBlocks.snowBricks);
		world.setBlock(i + 9, j + 4, k + 7, IceikaBlocks.snowBricks);
		world.setBlock(i + 9, j + 4, k + 8, IceikaBlocks.snowBricks);
		world.setBlock(i + 10, j + 0, k + 0, IceikaBlocks.snowBricks);
		world.setBlock(i + 10, j + 0, k + 1, IceikaBlocks.snowBricks);
		world.setBlock(i + 10, j + 0, k + 2, IceikaBlocks.snowBricks);
		world.setBlock(i + 10, j + 0, k + 3, IceikaBlocks.snowBricks);
		world.setBlock(i + 10, j + 0, k + 4, IceikaBlocks.snowBricks);
		world.setBlock(i + 10, j + 0, k + 5, IceikaBlocks.snowBricks);
		world.setBlock(i + 10, j + 0, k + 6, IceikaBlocks.snowBricks);
		world.setBlock(i + 10, j + 0, k + 7, IceikaBlocks.snowBricks);
		world.setBlock(i + 10, j + 0, k + 8, IceikaBlocks.snowBricks);
		world.setBlock(i + 10, j + 0, k + 9, IceikaBlocks.snowBricks);
		world.setBlock(i + 10, j + 0, k + 10, IceikaBlocks.snowBricks);
		world.setBlock(i + 10, j + 1, k + 0, IceikaBlocks.snowBricks);
		world.setBlock(i + 10, j + 1, k + 1, IceikaBlocks.snowBricks);
		world.setBlock(i + 10, j + 1, k + 2, IceikaBlocks.snowBricks);
		world.setBlock(i + 10, j + 1, k + 3, IceikaBlocks.snowBricks);
		world.setBlock(i + 10, j + 1, k + 4, IceikaBlocks.snowBricks);
		world.setBlock(i + 10, j + 1, k + 5, IceikaBlocks.snowBricks);
		world.setBlock(i + 10, j + 1, k + 6, IceikaBlocks.snowBricks);
		world.setBlock(i + 10, j + 1, k + 7, IceikaBlocks.snowBricks);
		world.setBlock(i + 10, j + 1, k + 8, IceikaBlocks.snowBricks);
		world.setBlock(i + 10, j + 1, k + 9, IceikaBlocks.snowBricks);
		world.setBlock(i + 10, j + 1, k + 10, IceikaBlocks.snowBricks);
		world.setBlock(i + 10, j + 2, k + 1, IceikaBlocks.snowBricks);
		world.setBlock(i + 10, j + 2, k + 2, IceikaBlocks.snowBricks);
		world.setBlock(i + 10, j + 2, k + 3, IceikaBlocks.frostedGlass);
		world.setBlock(i + 10, j + 2, k + 4, IceikaBlocks.snowBricks);
		world.setBlock(i + 10, j + 2, k + 5, IceikaBlocks.frostedGlass);
		world.setBlock(i + 10, j + 2, k + 6, IceikaBlocks.snowBricks);
		world.setBlock(i + 10, j + 2, k + 7, IceikaBlocks.frostedGlass);
		world.setBlock(i + 10, j + 2, k + 8, IceikaBlocks.snowBricks);
		world.setBlock(i + 10, j + 2, k + 9, IceikaBlocks.snowBricks);
		world.setBlock(i + 10, j + 3, k + 1, IceikaBlocks.snowBricks);
		world.setBlock(i + 10, j + 3, k + 2, IceikaBlocks.snowBricks);
		world.setBlock(i + 10, j + 3, k + 3, IceikaBlocks.snowBricks);
		world.setBlock(i + 10, j + 3, k + 4, IceikaBlocks.snowBricks);
		world.setBlock(i + 10, j + 3, k + 5, IceikaBlocks.snowBricks);
		world.setBlock(i + 10, j + 3, k + 6, IceikaBlocks.snowBricks);
		world.setBlock(i + 10, j + 3, k + 7, IceikaBlocks.snowBricks);
		world.setBlock(i + 10, j + 3, k + 8, IceikaBlocks.snowBricks);
		world.setBlock(i + 10, j + 3, k + 9, IceikaBlocks.snowBricks);
        /*EntityWorkshopTickerer tinkerer = new EntityWorkshopTickerer(world);
        tinkerer.setLocationAndAngles((double)i + 3.0D, (double)j + 1.0D, (double)k + 3.0D, 0.0F, 0.0F);
        world.spawnEntityInWorld(tinkerer);
        
        EntityWorkshopMerchant merchant = new EntityWorkshopMerchant(world);
        merchant.setLocationAndAngles((double)i + 3.0D, (double)j + 1.0D, (double)k + 3.0D, 0.0F, 0.0F);
        world.spawnEntityInWorld(merchant);*/

		return true;
	}
}