package net.divinerpg.overworld.entity.mobs;

import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.config.ConfigurationHelper;
import net.divinerpg.helper.items.VanillaItems;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class EntityCaveCrawler extends EntityMob
{
    public EntityCaveCrawler(World par1World)
    {
        super(par1World);
        this.setSize(1.5F, 2.0F);
    }

    protected String getLivingSound()
    {
        return "";
    }

    protected String getHurtSound()
    {
        return "";
    }

    protected String getDeathSound()
    {
        return "";
    }

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(30.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.7D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(12.0D);
	}

    protected Item func_146068_u() {
        return VanillaItems.realmiteIngot;
    }

    protected void dropRareDrop(int par1)
    {
        switch (this.rand.nextInt(1))
        {
            case 0:
                this.entityDropItem(new ItemStack(Items.potionitem, 1, 8196), 0.0F);
                break;
        }
    }

    @Override
    protected boolean isValidLightLevel()
    {
        return true;
    }

    @Override
    public boolean getCanSpawnHere()
    {
        return this.posY < 35.0D && super.getCanSpawnHere();
    }
    
    public void onDeath(DamageSource d) {
		EntityPlayer p = Minecraft.getMinecraft().thePlayer;
		if(ConfigurationHelper.canShowDeathChat){
			p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.DARK_AQUA, p.getDisplayName() + " Has Slain A Cave Crawler."));
		}
	}
}
