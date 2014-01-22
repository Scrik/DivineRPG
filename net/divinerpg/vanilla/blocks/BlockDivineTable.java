package net.divinerpg.vanilla.blocks;

import net.divinerpg.DivineRPG;
import net.divinerpg.Reference;
import net.divinerpg.api.blocks.BlockMod;
import net.divinerpg.client.GuiHandler;
import net.divinerpg.helper.DivineRPGTabs;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDivineTable extends BlockMod{

	@SideOnly(Side.CLIENT)
	private IIcon top, front, bottom, side;

	public BlockDivineTable() {
		super(rock);
		setCreativeTab(DivineRPGTabs.blocks);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon func_149691_a(int par1, int par2)
	{
		return par1 == 1 ? top : (par1 == 0 ? bottom : (par1 != 2 && par1 != 4 ? side : front));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void func_149651_a(IIconRegister par1IconRegister) {
		this.side = par1IconRegister.registerIcon(Reference.PREFIX + "divineTableSide");
		this.top = par1IconRegister.registerIcon(Reference.PREFIX + "divineTableTop");
		this.front = par1IconRegister.registerIcon(Reference.PREFIX + "divineTableFront");
		this.bottom = par1IconRegister.registerIcon(Reference.PREFIX + "divineWoodPlank");
	}

	@Override
	public boolean func_149727_a(World var1, int var2, int var3, int var4, EntityPlayer player, int var6, float var7, float var8, float var9) {
		if (!player.isSneaking()) {
			player.openGui(DivineRPG.instance, GuiHandler.divineTable, var1, var2, var3, var4);
			return true;
		} else {
			return false;
		}
	}
}