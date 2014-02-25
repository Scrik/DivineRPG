package divinerpg.vanilla.entity.mobs;

import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import divinerpg.helper.items.VanillaItemsWeapons;

public class EntityAyeracoRed extends EntityAyeraco
{
    private EntityAyeraco aGreen;
    private EntityAyeraco aBlue;
    private EntityAyeraco aYellow;
    private EntityAyeraco aPurple;
    private int healTick;

    private int beamX;
    private int beamY;
    private int beamZ;

    public EntityAyeracoRed (World par1World)
    {
        super (par1World, "Red");
        this.healTick = 0;
    }

    public void initOthers (EntityAyeraco par2, EntityAyeraco par3, EntityAyeraco par4, EntityAyeraco par5)
	{
		this.aGreen = par2;
		this.aBlue = par3;
		this.aYellow = par4;
		this.aPurple = par5;
	}
	
	public void setBeamLocation(int x, int y, int z)
	{
		beamX = x;
		beamY = y;
		beamZ = z;
	}

    /**
     * Called when the mob's health reaches 0.
     */
    public void onDeath(DamageSource par1DamageSource)
    {
    	super.onDeath(par1DamageSource);
    	//worldObj.func_147449_b(beamX, beamY, beamZ, null);
    }

	
	protected boolean canBlockProjectiles()
	{
		if (this.aGreen != null && this.aGreen.abilityActive())
		{
			return true;
		}
		return false;
	}
	
	protected void tickAbility()
	{
		if (this.healTick == 0)
		{
			if (this.aGreen != null && !this.aGreen.isDead)
			{
				aGreen.heal(1);
			}
			if (this.aBlue != null && !this.aBlue.isDead)
			{
				aBlue.heal(1);
			}
			if (this.aYellow != null && !this.aYellow.isDead)
			{
				aYellow.heal(1);
			}
			if (this.aPurple != null && !this.aPurple.isDead)
			{
				aPurple.heal(1);
			}
		}
		else
		{
			healTick--;
		}
	}
	
	protected boolean canTeleport()
	{
		if (this.aPurple != null && this.aPurple.abilityActive())
		{
			return true;
		}
		return false;
	}

    @Override
    protected void dropRareDrop(int par1) 
    {
        this.dropItem(VanillaItemsWeapons.enderSwordRed, 1);
    }
}