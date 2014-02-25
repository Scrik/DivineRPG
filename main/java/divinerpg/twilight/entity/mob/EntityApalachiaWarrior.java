package net.divinerpg.twilight.entity.mob;

import net.divinerpg.api.entity.EntityDivineRPGMob;
import net.divinerpg.helper.items.TwilightItemsOther;
import net.divinerpg.helper.items.TwilightItemsWeapons;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityApalachiaWarrior extends EntityDivineRPGMob
{
    private static final ItemStack defaultHeldItem = new ItemStack(TwilightItemsWeapons.apalachiaBlade, 1);

    public EntityApalachiaWarrior(World var1)
    {
        super(var1);
    }
    
    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.4D);
        getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(430D);
        getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(30D);
    }

    /**
     * Returns the current armor value as determined by a call to InventoryPlayer.getTotalArmorValue
     */
    @Override
    public int getTotalArmorValue()
    {
        return 10;
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    @Override
    public void onLivingUpdate()
    {
        if (this.worldObj.isDaytime() && !this.worldObj.isRemote)
        {
            float var1 = this.getBrightness(1.0F);

            if (var1 > 0.5F && this.worldObj.canBlockSeeTheSky(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)) && this.rand.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F)
            {
                this.setFire(8);
            }
        }

        super.onLivingUpdate();
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    @Override
    protected String getLivingSound()
    {
        return "";//Sound.Hiss;
    }

    /**
     * Returns the item that this EntityLiving is holding, if any.
     */
    @Override
    public ItemStack getHeldItem()
    {
        return defaultHeldItem;
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    @Override
    protected String getHurtSound()
    {
        return "";//Sound.GrowlHit;
    }

    /**
     * Returns the sound this mob makes on death.
     */
    @Override
    protected String getDeathSound()
    {
        return "";//Sound.GrowlHit;
    }

    /**
     * Drop 0-2 items of this living's type
     */
    @Override
    protected void dropFewItems(boolean var1, int var2)
    {
        int var3 = this.rand.nextInt(2 + var2);
        int var4;

        for (var4 = 0; var4 < var3; ++var4)
        {
            this.dropItem(getDropItem(), 1);
        }

        this.dropItem(getDropItem(), 1);
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    @Override
    protected Item getDropItem()
    {
        return TwilightItemsOther.apalachiaSoul;
    }

    /**
     * Get this Entity's EnumCreatureAttribute
     */
    @Override
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEAD;
    }

    /**
     * Checks to make sure the light is not too bright where the mob is spawning
     */
    @Override
    protected boolean isValidLightLevel()
    {
        return true;
    }

	@Override
	public String mobName() {
		return "Apalachia Warrior";
	}
}
