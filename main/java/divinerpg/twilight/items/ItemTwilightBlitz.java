package divinerpg.twilight.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import divinerpg.api.items.ItemMod;
import divinerpg.helper.items.TwilightItemsOther;
import divinerpg.helper.items.TwilightItemsWeapons;
import divinerpg.helper.tabs.DivineRPGTabs;
import divinerpg.helper.utils.LangRegistry;
import divinerpg.twilight.entity.projectile.EntityBlitzAlapachia;
import divinerpg.twilight.entity.projectile.EntityBlitzEden;
import divinerpg.twilight.entity.projectile.EntityBlitzHalite;
import divinerpg.twilight.entity.projectile.EntityBlitzMortum;
import divinerpg.twilight.entity.projectile.EntityBlitzSkythern;
import divinerpg.twilight.entity.projectile.EntityBlitzWildWood;

public class ItemTwilightBlitz extends ItemMod {
	private String sound;
	private int damage;
	private String ammoType;
	public ItemTwilightBlitz(int damage, String ammoType)
	{
		super();
		this.maxStackSize = 1;
		sound = "";
		this.setMaxDamage(-1);
		this.setCreativeTab(DivineRPGTabs.ranged);
		this.damage = damage;
		this.ammoType = ammoType;
		LangRegistry.addItem(this);
	}

	public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
	{
		boolean var4 = var3.capabilities.isCreativeMode;

		if (!var4 && !var3.inventory.hasItem(TwilightItemsOther.wildWoodDust))
		{
			return var1;
		}
		else
		{
			if(var1.getItem() == TwilightItemsWeapons.wildWoodBlitz)
			{
				if(!var2.isRemote)
				{
					var2.playSoundAtEntity(var3, sound, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityBlitzWildWood(var2, var3));
				}
				var3.inventory.consumeInventoryItem(TwilightItemsOther.wildWoodDust);
			}
		}

		if (!var4 && !var3.inventory.hasItem(TwilightItemsOther.mortumDust))
		{
			return var1;
		}
		else
		{
			if(var1.getItem() == TwilightItemsWeapons.haliteBlitz)
			{
				if(!var2.isRemote)
				{
					var2.playSoundAtEntity(var3, sound, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityBlitzHalite(var2, var3));
				}
				var3.inventory.consumeInventoryItem(TwilightItemsOther.mortumDust);
			}

			if(var1.getItem() == TwilightItemsWeapons.mortumBlitz)
			{
				if(!var2.isRemote)
				{
					var2.playSoundAtEntity(var3, sound, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityBlitzMortum(var2, var3));
				}
				var3.inventory.consumeInventoryItem(TwilightItemsOther.mortumDust);
			}
		}

		if (!var4 && !var3.inventory.hasItem(TwilightItemsOther.apalachiaDust))
		{
			return var1;
		}
		else
		{
			if(var1.getItem() == TwilightItemsWeapons.apalachiaBlitz)
			{
				if(!var2.isRemote)
				{
					var2.playSoundAtEntity(var3, sound, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityBlitzAlapachia(var2, var3));
				}
				var3.inventory.consumeInventoryItem(TwilightItemsOther.apalachiaDust);
			}
		}

		if (!var4 && !var3.inventory.hasItem(TwilightItemsOther.skythernDust))
		{
			return var1;
		}
		else
		{
			if(var1.getItem() == TwilightItemsWeapons.skythernBlitz)
			{
				if(!var2.isRemote)
				{
					var2.playSoundAtEntity(var3, sound, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityBlitzSkythern(var2, var3));
				}
				var3.inventory.consumeInventoryItem(TwilightItemsOther.skythernDust);
			}
		}

		if (!var4 && !var3.inventory.hasItem(TwilightItemsOther.edenDust))
		{
			return var1;
		}
		else
		{
			if(var1.getItem() == TwilightItemsWeapons.edenBlitz)
			{
				if(!var2.isRemote)
				{
					var2.playSoundAtEntity(var3, sound, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityBlitzEden(var2, var3));
				}
				var3.inventory.consumeInventoryItem(TwilightItemsOther.edenDust);
			}
		}
		var1.damageItem(1, var3);
		return var1;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack var1, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
	    par3List.add(damage + " Ranged Damage");
	    par3List.add("Ammo: " + ammoType);
		par3List.add("Infinite Uses");
	}
}
