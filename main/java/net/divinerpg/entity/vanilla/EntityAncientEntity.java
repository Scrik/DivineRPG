package net.divinerpg.entity.vanilla;

import net.divinerpg.api.entity.EntityDivineRPGBoss;
import net.divinerpg.helper.items.VanillaItemsOther;
import net.divinerpg.helper.items.VanillaItemsWeapons;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class EntityAncientEntity extends EntityDivineRPGBoss implements IBossDisplayData{
	
	public EntityAncientEntity(World par1World) {
		super(par1World);
		this.setSize(4.0F, 6.5F);
	}
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(4000.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.7D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(16.0D);
	}

	@Override
    public boolean attackEntityAsMob(Entity par1Entity) {
        super.attackEntityAsMob(par1Entity);
        if (this.entityToAttack != null) {
            this.entityToAttack.addVelocity(this.motionX * 10.0D, 3.0D, this.motionZ * 10.0D);
            if(this.entityToAttack instanceof EntityLiving) {
                ((EntityLiving)this.entityToAttack).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 100, 0));
            }
            return true;
        }
        return false;
    }
	
	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataWatcher.addObject(16, new Integer(100));
	}
	
	@Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
    }
    
	@Override
    protected String getHurtSound() {
        return "mob.irongolem.hit";
    }

	@Override
    protected String getDeathSound() {
        return "mob.irongolem.death";
    }

	@Override
    protected void dropFewItems(boolean par1, int par2) {
    	
    	Item i = getDropItem();
    	Item i2 = VanillaItemsWeapons.sandslash;

        int var3, var4;
        
        var3 = this.rand.nextInt(6) + 4;

        for (var4 = 0; var4 < var3; var4++) {
            this.dropItem(i, 1);
        }

        for (var4 = 0; var4 < 1; var4++) {
            this.dropItem(i2, 1);
        }
    }

	@Override
    protected Item getDropItem() {
        return VanillaItemsOther.divineShards;
    }

	@Override
	public String mobName() {
		return "Ancient Entity";
	}

	@Override
	public String setName(String name) {
		return "Ancient Entity";
	}
	
	@Override
	public String name() {
		return "Ancient Entity";
	}

	@Override
	public IChatComponent chat() {
		// TODO Auto-generated method stub
		return null;
	}
}
