package net.divinerpg.entity.vanilla;

import net.divinerpg.Sounds;
import net.divinerpg.api.entity.EntityDivineRPGMob;
import net.divinerpg.helper.items.VanillaItemsOther;
import net.divinerpg.helper.items.VanillaItemsWeapons;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIFleeSun;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIRestrictSun;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityWildFire extends EntityDivineRPGMob implements IRangedAttackMob
{
    private static final ItemStack defaultHeldItem = new ItemStack(VanillaItemsWeapons.infernoSword, 1);

    public EntityWildFire(World par1World)
    {
        super(par1World);
        float moveSpeed = 0.25F;
        this.tasks.addTask(7, new EntityAIArrowAttack(this, 0.25F, 15, 10.0F));        
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIRestrictSun(this));
        this.tasks.addTask(3, new EntityAIFleeSun(this, moveSpeed));
        this.tasks.addTask(5, new EntityAIWander(this, moveSpeed));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.isImmuneToFire = true;
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return playSound(Sounds.wildFire);
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return playSound(Sounds.wildFireHurt);
    }

    protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.7D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(13.0D);
	}

    /**
     * Returns true if the newer Entity AI code should be run
     */
    public boolean isAIEnabled()
    {
        return true;
    }

    /**
     * Returns the item that this EntityLiving is holding, if any.
     */
    public ItemStack getHeldItem()
    {
        return defaultHeldItem;
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected Item getDropItem()
    {
        return VanillaItemsOther.moltenShards;
    }

    /**
     * Drop 0-2 items of this living's type
     */
    protected void dropFewItems(boolean par1, int par2)
    {
    	this.dropItem(VanillaItemsOther.moltenShards, 4);
    }

    protected void dropRareDrop(int var1)
    {
        if (this.rand.nextInt(5) == 0)
        {
            this.dropItem(VanillaItemsOther.hellstoneIngot, 1);
        }
        else
        {
        	this.dropItem(VanillaItemsOther.netheriteIngot, 40);
        }
    }

    @Override
    public void attackEntityWithRangedAttack(EntityLivingBase var1, float f)
    {
        EntityArrow var2 = new EntityArrow(this.worldObj, this, var1, 1.6F, 12.0F);
        
        var2.setDamage(14);
        var2.setFire(100);

        this.playSound("random.bow", 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld(var2);
    }

	@Override
	public String mobName() {
		return "Wildfire";
	}
}