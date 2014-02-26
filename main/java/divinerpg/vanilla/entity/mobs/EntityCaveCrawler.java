package divinerpg.vanilla.entity.mobs;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import divinerpg.api.entity.EntityDivineRPGMob;
import divinerpg.helper.items.VanillaItemsOther;

public class EntityCaveCrawler extends EntityDivineRPGMob
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
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(30.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.7D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(12.0D);
	}

    protected Item getDropItem() {
        return VanillaItemsOther.realmiteIngot;
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

	@Override
	public String mobName() {
		return "Cave Crawler";
	}
}