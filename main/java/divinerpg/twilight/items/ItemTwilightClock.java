package net.divinerpg.twilight.items;

import net.divinerpg.api.items.ItemMod;
import net.divinerpg.helper.blocks.TwilightBlocks;
import net.divinerpg.helper.blocks.VanillaBlocks;
import net.divinerpg.helper.tabs.DivineRPGTabs;
import net.divinerpg.helper.utils.LangRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemTwilightClock extends ItemMod {

	public ItemTwilightClock(){
		super();
		setCreativeTab(DivineRPGTabs.utility);
		LangRegistry.addItem(this);
	}

	@Override
	public boolean onItemUse(ItemStack var1, EntityPlayer var2, World var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10) {
		if (var7 != 1) {
			return false;
		}
		
		else if (var2.canPlayerEdit(var4, var5, var6, var7, var1) && var2.canPlayerEdit(var4, var5 + 1, var6, var7, var1)) {
			Block var11 = var3.getBlock(var4, var5, var6);

			if ((var11 == VanillaBlocks.divineRock || var11 == TwilightBlocks.edenBlock || var11 == TwilightBlocks.wildWoodBlock || var11 == TwilightBlocks.apalachiaBlock || var11 == TwilightBlocks.skythernBlock || var11 == TwilightBlocks.mortumBlock || var11 == Blocks.netherrack) && var3.isAirBlock(var4, var5 + 1, var6)) {
				var3.playSoundEffect((double)var4 + 0.5D, (double)var5 + 0.5D, (double)var6 + 0.5D, "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
				var3.setBlock(var4, var5 + 1, var6, TwilightBlocks.blueFire);
				return true;
			} else {
				return false;
			}
		}  else {
			return false;
		}
	}
}
