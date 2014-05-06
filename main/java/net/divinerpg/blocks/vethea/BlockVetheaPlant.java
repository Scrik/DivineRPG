package net.divinerpg.blocks.vethea;

import net.divinerpg.Reference;
import net.divinerpg.api.blocks.BlockMod;
import net.divinerpg.helper.blocks.VetheaBlocks;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockVetheaPlant extends BlockMod implements IPlantable{

	public BlockVetheaPlant() {
		super(Material.plants);
		float var4 = 0.2F;
		this.setBlockBounds(0.5F - var4, 0.0F, 0.5F - var4, 0.5F + var4, var4 * 3.0F, 0.5F + var4);
		setStepSound(Block.soundTypeGrass);
		setCreativeTab(DivineRPGTabs.vethea);
	}

	public Block setName(String name){
		setBlockTextureName(Reference.PREFIX + name);
		setBlockName(name);
		GameRegistry.registerBlock(this, name);
		return this;
	}

	@Override
	public boolean canPlaceBlockAt(World w, int x, int y, int z) {
		return w.getBlock(x, y, z).canSustainPlant(w, x, y, z, ForgeDirection.UNKNOWN, this);
	}
	
    public boolean canBlockStay(World w, int x, int y, int z) {
        return w.getBlock(x, y - 1, z).canSustainPlant(w, x, y - 1, z, ForgeDirection.UP, this) && w.getBlock(x, y, z).getMaterial().isSolid();
    }

	@Override
	public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z) {
		return EnumPlantType.Plains;
	}

	@Override
	public Block getPlant(IBlockAccess world, int x, int y, int z) {
		return this;
	}

	@Override
	public int getPlantMetadata(IBlockAccess world, int x, int y, int z) {
		return world.getBlockMetadata(x, y, z);
	}
	
    public boolean isOpaqueCube() {
        return false;
    }

    public boolean renderAsNormalBlock() {
        return false;
    }
    
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World w, int x, int y, int z) {
        return null;
    }
    
    @Override
    public int getRenderType() {
    	return 1;
    }
}