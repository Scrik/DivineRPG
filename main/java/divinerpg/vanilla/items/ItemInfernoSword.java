package divinerpg.vanilla.items;

import java.util.List;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import divinerpg.api.items.ItemModSword;
import divinerpg.helper.tabs.DivineRPGTabs;

public class ItemInfernoSword extends ItemModSword {

	public ItemInfernoSword(ToolMaterial var2) {
		super(var2);
		setCreativeTab(DivineRPGTabs.swords);
	}

	public boolean hitEntity(ItemStack var1, EntityLivingBase var2, EntityLivingBase var3) {
		var1.damageItem(1, var3);
		var2.setFire(12);
		return true;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add("On Hit: Burns for 12 seconds");
		par3List.add("Infinate Uses");
	}
}
