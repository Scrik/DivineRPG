package net.divinerpg.overworld.entity.mobs;

import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.config.ConfigurationHelper;
import net.divinerpg.helper.items.VanillaItems;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class EntityEnderWatcher extends EntityEnderman{

	public EntityEnderWatcher(World par1World) {
		super(par1World);
		this.setSize(0.6F, 0.6F);
	}
	
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(50.0D);
    }

    protected Item func_146068_u()
    {
        return VanillaItems.enderShard;
    }
    
    protected void dropFewItems(boolean par1, int par2)
    {
        Item item = this.func_146068_u();
        Item item2 = VanillaItems.watchingEye;

        if (item != null)
        {
            int j = this.rand.nextInt(2 + par2);

            for (int k = 0; k < j; ++k)
            {
                this.func_145779_a(item, 2);
                this.func_145779_a(item2, 1);
            }
        }
    }
    
    public void onDeath(DamageSource d) {
		EntityPlayer p = Minecraft.getMinecraft().thePlayer;
		if(ConfigurationHelper.canShowDeathChat){
			p.func_145747_a(DivineAPI.addChatMessage(EnumChatFormatting.DARK_AQUA, p.getDisplayName() + " Has Slain A Ender Watcher."));
		}
	}
}
