package net.divinerpg.entity.vanilla;

import net.divinerpg.Sounds;
import net.divinerpg.api.entity.EntityDivineRPGMob;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
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
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityAridWarrior extends EntityDivineRPGMob implements IRangedAttackMob {
    private static final ItemStack defaultHeldItem = new ItemStack(Items.bow, 1);

    public EntityAridWarrior(World par1World) {
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
    }
    
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.7D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(13.0D);
	}

    protected String getLivingSound() {
    	 return playSound(Sounds.aridWarrior);
    }

    protected String getHurtSound() {
    	 return playSound(Sounds.aridWarriorHurt);
    }

    protected String getDeathSound() {
        return playSound(Sounds.aridWarriorHurt);
    }

    public boolean isAIEnabled() {
        return true;
    }

    public ItemStack getHeldItem() {
        return defaultHeldItem;
    }

    protected void dropFewItems(boolean par1, int par2) {
        int var3;
        int var4;
        var3 = this.rand.nextInt(3 + par2);

        for (var4 = 0; var4 < var3; ++var4) {
            this.dropItem(Item.getItemFromBlock(Blocks.sandstone), 30);
        }

        var3 = this.rand.nextInt(3 + par2);

        for (var4 = 0; var4 < var3; ++var4) {
            this.entityDropItem(new ItemStack(Blocks.wool, 10, 14), 0.0F);
        }
    }

    @Override
    public void attackEntityWithRangedAttack(EntityLivingBase var1, float f) {
        EntityArrow var2 = new EntityArrow(this.worldObj, this, var1, 1.6F, 12.0F);
        int var3 = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, this.getHeldItem());
        int var4 = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, this.getHeldItem());

        if (var3 > 0) {
            var2.setDamage(var2.getDamage() + (double)var3 * 0.5D + 0.5D);
        }

        if (var4 > 0) {
            var2.setKnockbackStrength(var4);
        }

        if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, this.getHeldItem()) > 0) {
            var2.setFire(100);
        }

        this.playSound("random.bow", 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld(var2);
    }

	protected Item getDropItem() {
        return Item.getItemFromBlock(Blocks.sandstone);
    }

	@Override
	public String mobName() {
		return "Arid Warrior";
	}
}
