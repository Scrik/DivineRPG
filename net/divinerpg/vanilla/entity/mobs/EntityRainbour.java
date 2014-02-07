package net.divinerpg.vanilla.entity.mobs;

import java.util.Calendar;

import net.divinerpg.api.entity.EntityDivineRPGMob;
import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.config.ConfigurationHelper;
import net.divinerpg.helper.items.VanillaItems;
import net.divinerpg.vanilla.entity.projectiles.EntitySparklerFX;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityRainbour extends EntityDivineRPGMob
{
	private ChunkCoordinates currentFlightTarget;

	public EntityRainbour(World par1World)
	{
		super(par1World);
		this.setSize(0.9F, 0.9F);
		this.setIsBatHanging(true);
		float moveSpeed = 0.3F;
		this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.tasks.addTask(2, new EntityAIWander(this, moveSpeed));
		//this.tasks.addTask(3, new EntityAIAvoidEntity(this, EntityPlayer.class, 16.0F, 0.23F, 0.4F));
		this.tasks.addTask(4, new EntityAIAttackOnCollide(this, moveSpeed, true));
		this.tasks.addTask(5, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(6, new EntityAILookIdle(this));
		this.targetTasks.addTask(7, new EntityAIHurtByTarget(this, true));
	}

	public boolean isAIEnabled()
	{
		return true;
	}

	public void entityInit()
	{
		super.entityInit();
		this.dataWatcher.addObject(17, "");
		this.dataWatcher.addObject(16, new Byte((byte)0));
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(300.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.7D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(33.0D);
	}

	/**
	 * Returns the current armor value as determined by a call to InventoryPlayer.getTotalArmorValue
	 */
	public int getTotalArmorValue()
	{
		return 0;
	}

	/**
	 * (abstract) Protected helper method to write subclass entity data to NBT.
	 */
	public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.writeEntityToNBT(par1NBTTagCompound);
		par1NBTTagCompound.setByte("BatFlags", this.dataWatcher.getWatchableObjectByte(16));
	}

	/**
	 * (abstract) Protected helper method to read subclass entity data from NBT.
	 */
	public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.readEntityFromNBT(par1NBTTagCompound);

		this.dataWatcher.updateObject(16, Byte.valueOf(par1NBTTagCompound.getByte("BatFlags")));
	}

	/**
	 * Returns the volume for the sounds this mob makes.
	 */
	protected float getSoundVolume()
	{
		return 0.1F;
	}

	/**
	 * Gets the pitch of living sounds in living entities.
	 */
	protected float getSoundPitch()
	{
		return super.getSoundPitch() * 0.95F;
	}

	/**
	 * Returns the sound this mob makes while it's alive.
	 */
	protected String getLivingSound()
	{
		return "mob.RPG.Rainbour";
	}

	/**
	 * Returns the sound this mob makes when it is hurt.
	 */
	protected String getHurtSound()
	{
		return "mob.RPG.RainbourHit";
	}

	/**
	 * Returns the sound this mob makes on death.
	 */
	protected String getDeathSound()
	{
		return "mob.RPG.RainbourHit";
	}

	/**
	 * Returns true if this entity should push and be pushed by other entities when colliding.
	 */
	public boolean canBePushed()
	{
		return false;
	}

	protected void collideWithEntity(Entity par1Entity) {}

	protected void func_85033_bc() {}

	public boolean getIsBatHanging()
	{
		return (this.dataWatcher.getWatchableObjectByte(16) & 1) != 0;
	}

	public void setIsBatHanging(boolean par1)
	{
		byte var2 = this.dataWatcher.getWatchableObjectByte(16);

		if (par1)
		{
			this.dataWatcher.updateObject(16, Byte.valueOf((byte)(var2 | 1)));
		}
		else
		{
			this.dataWatcher.updateObject(16, Byte.valueOf((byte)(var2 & -2)));
		}
	}

	/**
	 * Called to update the entity's position/logic.
	 */
	public void onUpdate()
	{
		super.onUpdate();

		if (this.getIsBatHanging())
		{
			this.motionX = this.motionY = this.motionZ = 0.0D;
			this.posY = (double)MathHelper.floor_double(this.posY) + 1.0D - (double)this.height;
		}
		else
		{
			this.motionY *= 0.6000000238418579D;
		}
	}

	protected void updateAITasks()
	{
		super.updateAITasks();

		if (this.getAttackTarget() != null)
		{
			int var1 = (int) this.getAttackTarget().posX;
			int var2 = (int) this.getAttackTarget().posY;
			int var3 = (int) this.getAttackTarget().posZ;
			this.currentFlightTarget = new ChunkCoordinates(var1, var2, var3);
		}
		else if (this.currentFlightTarget != null)
		{
			this.currentFlightTarget = new ChunkCoordinates((int)(this.posX + this.rand.nextInt(16)), (int)(this.posY + this.rand.nextInt(16)), (int)(this.posZ + this.rand.nextInt(16)));
		}

		if (this.currentFlightTarget != null)
		{
			double var1 = (double)this.currentFlightTarget.posX - this.posX;
			double var3 = (double)this.currentFlightTarget.posY - this.posY;
			double var5 = (double)this.currentFlightTarget.posZ - this.posZ;

			if (Math.signum(var1) != 0 || Math.signum(var3) != 0 || Math.signum(var5) != 0)
			{
				this.motionX += (Math.signum(var1) * 0.5D - this.motionX) * 0.10000000149011612D;
				this.motionY += (Math.signum(var3) * 1.699999988079071D - this.motionY) * 0.10000000149011612D;
				this.motionZ += (Math.signum(var5) * 0.5D - this.motionZ) * 0.10000000149011612D;
				float var7 = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0D / Math.PI) - 90.0F;
				float var8 = MathHelper.wrapAngleTo180_float(var7 - this.rotationYaw);
				this.moveForward = 0.5F;
				this.rotationYaw += var8;
			}
		}

	}

	protected void dropFewItems(boolean var1, int var2) {
		this.dropItem(VanillaItems.healingStone, 1);
	}

	/**
	 * returns if this entity triggers Block.onEntityWalking on the blocks they walk on. used for spiders and wolves to
	 * prevent them from trampling crops
	 */
	protected boolean canTriggerWalking()
	{
		return false;
	}

	/**
	 * Called when the mob is falling. Calculates and applies fall damage.
	 */
	protected void fall(float par1) {}

	/**
	 * Takes in the distance the entity has fallen this tick and whether its on the ground to update the fall distance
	 * and deal fall damage if landing on the ground.  Args: distanceFallenThisTick, onGround
	 */
	protected void updateFallState(double par1, boolean par3) {}

	/**
	 * Return whether this entity should NOT trigger a pressure plate or a tripwire.
	 */
	public boolean doesEntityNotTriggerPressurePlate()
	{
		return true;
	}

	/**
	 * Called when the entity is attacked.
	 */
	public boolean attackEntityFrom(DamageSource par1DamageSource, int par2)
	{
		{
			if (!this.worldObj.isRemote && this.getIsBatHanging())
			{
				this.setIsBatHanging(false);
			}

			return super.attackEntityFrom(par1DamageSource, par2);
		}
	}

	/**
	 * Checks if the entity's current position is a valid location to spawn this entity.
	 */
	public boolean getCanSpawnHere()
	{
		int var1 = MathHelper.floor_double(this.boundingBox.minY);

		if (var1 >= 63)
		{
			return false;
		}
		else
		{
			int var2 = MathHelper.floor_double(this.posX);
			int var3 = MathHelper.floor_double(this.posZ);
			int var4 = this.worldObj.getBlockLightValue(var2, var1, var3);
			byte var5 = 4;
			Calendar var6 = this.worldObj.getCurrentDate();

			if ((var6.get(2) + 1 != 10 || var6.get(5) < 20) && (var6.get(2) + 1 != 11 || var6.get(5) > 3))
			{
				if (this.rand.nextBoolean())
				{
					return false;
				}
			}
			else
			{
				var5 = 7;
			}

			return var4 > this.rand.nextInt(var5) ? false : super.getCanSpawnHere();
		}
	}

	/**
	 * Initialize this creature.
	 */
	public void initCreature() {}

	@SideOnly(Side.CLIENT)
	public void onLivingUpdate() {
		super.onLivingUpdate();
		for (int var3 = 0; var3 < 8; ++var3) {
			EntitySparklerFX var20 = new EntitySparklerFX(this.worldObj, this.posX + (this.rand.nextDouble() - 0.5D) * (double)this.width, this.posY + this.rand.nextDouble() * (double)this.height - 0.25D, this.posZ + (this.rand.nextDouble() - 0.5D) * (double)this.width, (this.rand.nextDouble() - 0.5D) * 2.0D, -this.rand.nextDouble(), (this.rand.nextDouble() - 0.5D) * 2.0D);
			FMLClientHandler.instance().getClient().effectRenderer.addEffect(var20);
		}
	}

	protected boolean isValidLightLevel() {    
		return true;
	}

	@Override
	public String mobName() {
		return "Rainbour";
	}
}
