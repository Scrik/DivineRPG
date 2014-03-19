package net.divinerpg.twilight.entity.mob.model.block;

import net.divinerpg.api.blocks.BlockStatue;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

public class RenderStatueItem implements IItemRenderer {
    
    ModelDivineBlock model;
    ResourceLocation texture;
    
    public RenderStatueItem(BlockStatue statueBlock) {
        this.model = statueBlock.model;
        this.texture = statueBlock.texture;
    }
   
    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }
     
    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return true;
    }
     
    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        switch(type) {
            case ENTITY: {
                renderStatueItem(0f, 0f, 0f, 1.3f);
                return;
            }
             
            case EQUIPPED: {
                renderStatueItem(0f, 1f, 1f, 1.1f);
                return;
            }
                 
            case INVENTORY: {
                renderStatueItem(0f, 0f, 0f, 0.6f);
                return;
            }
             
            default:
            	return;
        }
    }
    
    private void renderStatueItem(float x, float y, float z, float scale) {
        GL11.glPushMatrix();
     
        GL11.glDisable(GL11.GL_LIGHTING);
         
        GL11.glTranslatef(x,  y+0.2F,  z);
        GL11.glScalef(scale, scale, scale);
        GL11.glRotatef(180, 1.0F, 0.0F, 0.0F);
        
        Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
        
        model.render(0.0625F);
         
        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glPopMatrix();
    }
}