package divinerpg.vanilla.entity.mobs;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;
import divinerpg.api.entity.EntityDivineRPGMob;
import divinerpg.helper.items.VanillaItemsOther;

public class EntityJungleDramcryx extends EntityDivineRPGMob {
	
	public EntityJungleDramcryx(World par1World) {
		super(par1World);
	}

	protected String getLivingSound() {
		return "";
	}

	protected String getHurtSound() {
		return "";
	}

	protected String getDeathSound() {
		return "";
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.7D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(19.0D);
	}

	protected Item getDropItem() {
		return VanillaItemsOther.jungleShards;
	}

	@Override
	protected boolean isValidLightLevel() {
		return true;
	}

	@Override
	public String mobName() {
		return "Jungle Dramcryx";
	}
}
