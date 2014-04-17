package net.divinerpg.entity.vethea;

import net.divinerpg.api.entity.EntityDivineRPGMob;
import net.divinerpg.helper.items.VetheanItems;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityTocaxin extends EntityDivineRPGMob
{
    private static final double spawnLayer = 3;
    public int hurtTimer;
    public EntityTocaxin(World var1)
    {
        super(var1);
        double moveSpeed = 0.25F;
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(moveSpeed); // speed
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(10); // Attack
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(65); // MaxHP
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, moveSpeed));
        this.tasks.addTask(6, new EntityAIWander(this, moveSpeed));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 24.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(64.0);
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.hurtTimer = 0;
    }

    /**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    @Override
    public boolean getCanSpawnHere()
    {
        return this.posY < 64.0D * spawnLayer  && this.posY > 64.0D * (spawnLayer - 1) && super.getCanSpawnHere();
    }

    @Override
    public void onLivingUpdate()
    {
        super.onLivingUpdate();
        EntityLivingBase var1 = this.getAttackTarget();

        if (var1 == null || var1.getDistanceToEntity(this) > 8 || this.hurtTimer != 0)
        {
            this.hurtTimer--;
            return;
        }
        else
        {
            this.hurtTimer = 10;
            var1.attackEntityFrom(DamageSource.magic, (int) (8 - var1.getDistanceToEntity(this)));
        }
    }

    /**
     * Returns the volume for the sounds this mob makes.
     */
    @Override
    protected float getSoundVolume()
    {
        return 0.7F;
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    @Override
    protected String getLivingSound()
    {
        return "";//Sound.Tocaxin;
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    @Override
    protected String getHurtSound()
    {
        return "";//Sound.TocaxinHit;
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    @Override
    public boolean isAIEnabled()
    {
        return true;
    }

    /**
     * Returns the sound this mob makes on death.
     */
    @Override
    protected String getDeathSound()
    {
        return "";
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    @Override
    protected Item getDropItem()
    {
        return null;
    }

    /**
     * Get this Entity's EnumCreatureAttribute
     */
    @Override
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEFINED;
    }


    /**
     * Drop 0-2 items of this living's type
     */
    @Override
    protected void dropFewItems(boolean par1, int par2)
    {
        this.dropItem(VetheanItems.polishedPearls, 1);
    }

	@Override
	public String mobName() {
		return "Tocxin";
	}
}