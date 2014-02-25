package divinerpg.twilight.entity.mob.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.util.MathHelper;


public class ModelEnchantedArcher extends ModelBase
{
    //fields
    ModelRenderer head;
    ModelRenderer body1;
    ModelRenderer rightarmext;
    ModelRenderer leftfoot;
    ModelRenderer bodymain;
    ModelRenderer body2;
    ModelRenderer body3;
    ModelRenderer body4;
    ModelRenderer body6;
    ModelRenderer body5;
    public ModelRenderer rightarm;
    ModelRenderer rightarmcap;
    ModelRenderer leftarm;
    ModelRenderer leftarmext;
    ModelRenderer leftarmcap;
    ModelRenderer leftleg;
    ModelRenderer leftlegcap;
    ModelRenderer rightfoot;
    ModelRenderer rightleg;
    ModelRenderer rightlegcap;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    ModelRenderer Shape12;
    ModelRenderer Shape13;
    ModelRenderer Shape14;
    ModelRenderer Shape15;
    ModelRenderer Shape16;
    ModelRenderer Shape17;
    ModelRenderer Shape18;
    ModelRenderer Shape19;
    ModelRenderer Shape20;

    public ModelEnchantedArcher()
    {
        textureWidth = 64;
        textureHeight = 32;

        head = new ModelRenderer(this, 0, 0);
        head.addBox(-4F, -8F, -4F, 8, 8, 8);
        head.setRotationPoint(0F, -16F, -19F);
        head.setTextureSize(64, 32);
        head.mirror = true;
        setRotation(head, 0F, 0F, 0F);
        body1 = new ModelRenderer(this, 0, 22);
        body1.addBox(-4F, 0F, -2F, 8, 6, 4);
        body1.setRotationPoint(0F, -12F, -2F);
        body1.setTextureSize(64, 32);
        body1.mirror = true;
        setRotation(body1, 0.2617994F, 0F, 0F);
        rightarmext = new ModelRenderer(this, 40, 10);
        rightarmext.addBox(-7F, -2F, -2F, 8, 4, 4);
        rightarmext.setRotationPoint(-5F, -16F, -6F);
        rightarmext.setTextureSize(64, 32);
        rightarmext.mirror = true;
        setRotation(rightarmext, 0F, 0F, 0F);
        leftfoot = new ModelRenderer(this, 28, 15);
        leftfoot.addBox(-3F, 17F, -9F, 6, 5, 12);
        leftfoot.setRotationPoint(10F, 2F, 0F);
        leftfoot.setTextureSize(64, 32);
        leftfoot.mirror = true;
        setRotation(leftfoot, 0F, 0F, 0F);
        bodymain = new ModelRenderer(this, 28, 10);
        bodymain.addBox(-4F, 0F, -2F, 14, 18, 4);
        bodymain.setRotationPoint(-3F, -6F, 0F);
        bodymain.setTextureSize(64, 32);
        bodymain.mirror = true;
        setRotation(bodymain, 0F, 0F, 0F);
        body2 = new ModelRenderer(this, 0, 22);
        body2.addBox(-4F, 0F, -2F, 8, 6, 4);
        body2.setRotationPoint(0F, -21F, -14F);
        body2.setTextureSize(64, 32);
        body2.mirror = true;
        setRotation(body2, 1.308997F, 0F, 0F);
        body3 = new ModelRenderer(this, 16, 16);
        body3.addBox(-4F, 0F, -2F, 4, 3, 4);
        body3.setRotationPoint(2F, -21F, -16F);
        body3.setTextureSize(64, 32);
        body3.mirror = true;
        setRotation(body3, 1.570796F, 0F, 0F);
        body4 = new ModelRenderer(this, 0, 22);
        body4.addBox(-4F, 0F, -2F, 4, 3, 4);
        body4.setRotationPoint(2F, -14F, -3F);
        body4.setTextureSize(64, 32);
        body4.mirror = true;
        setRotation(body4, 0.5235988F, 0F, 0F);
        body6 = new ModelRenderer(this, 0, 22);
        body6.addBox(-4F, 0F, -2F, 8, 6, 4);
        body6.setRotationPoint(0F, -18F, -7F);
        body6.setTextureSize(64, 32);
        body6.mirror = true;
        setRotation(body6, 0.7853982F, 0F, 0F);
        body5 = new ModelRenderer(this, 0, 22);
        body5.addBox(-4F, 0F, -2F, 4, 3, 4);
        body5.setRotationPoint(2F, -19F, -9F);
        body5.setTextureSize(64, 32);
        body5.mirror = true;
        setRotation(body5, 1.047198F, 0F, 0F);
        rightarm = new ModelRenderer(this, 40, 10);
        rightarm.addBox(-11F, -2F, -2F, 4, 18, 4);
        rightarm.setRotationPoint(-5F, -16F, -6F);
        rightarm.setTextureSize(64, 32);
        rightarm.mirror = true;
        setRotation(rightarm, 0F, 0F, 0F);
        rightarmcap = new ModelRenderer(this, 40, 10);
        rightarmcap.addBox(-12F, -3F, -3F, 6, 6, 6);
        rightarmcap.setRotationPoint(-5F, -16F, -6F);
        rightarmcap.setTextureSize(64, 32);
        rightarmcap.mirror = true;
        setRotation(rightarmcap, 0F, 0F, 0F);
        leftarm = new ModelRenderer(this, 40, 10);
        leftarm.addBox(7F, -2F, -2F, 4, 18, 4);
        leftarm.setRotationPoint(5F, -16F, -6F);
        leftarm.setTextureSize(64, 32);
        leftarm.mirror = true;
        setRotation(leftarm, 0F, 0F, 0F);
        leftarmext = new ModelRenderer(this, 40, 10);
        leftarmext.addBox(-1F, -2F, -2F, 8, 4, 4);
        leftarmext.setRotationPoint(5F, -16F, -6F);
        leftarmext.setTextureSize(64, 32);
        leftarmext.mirror = true;
        setRotation(leftarmext, 0F, 0F, 0F);
        leftarmcap = new ModelRenderer(this, 40, 10);
        leftarmcap.addBox(6F, -3F, -3F, 6, 6, 6);
        leftarmcap.setRotationPoint(5F, -16F, -6F);
        leftarmcap.setTextureSize(64, 32);
        leftarmcap.mirror = true;
        setRotation(leftarmcap, 0F, 0F, 0F);
        leftleg = new ModelRenderer(this, 37, 6);
        leftleg.addBox(-2F, 0F, -2F, 4, 22, 4);
        leftleg.setRotationPoint(10F, 2F, 0F);
        leftleg.setTextureSize(64, 32);
        leftleg.mirror = true;
        setRotation(leftleg, 0F, 0F, 0F);
        leftlegcap = new ModelRenderer(this, 37, 6);
        leftlegcap.addBox(-3F, -2F, -3F, 6, 5, 6);
        leftlegcap.setRotationPoint(10F, 2F, 0F);
        leftlegcap.setTextureSize(64, 32);
        leftlegcap.mirror = true;
        setRotation(leftlegcap, 0F, 0F, 0F);
        rightfoot = new ModelRenderer(this, 28, 15);
        rightfoot.addBox(-3F, 17F, -9F, 6, 5, 12);
        rightfoot.setRotationPoint(-10F, 2F, 0F);
        rightfoot.setTextureSize(64, 32);
        rightfoot.mirror = true;
        setRotation(rightfoot, 0F, 0F, 0F);
        rightleg = new ModelRenderer(this, 37, 6);
        rightleg.addBox(-2F, 0F, -2F, 4, 22, 4);
        rightleg.setRotationPoint(-10F, 2F, 0F);
        rightleg.setTextureSize(64, 32);
        rightleg.mirror = true;
        setRotation(rightleg, 0F, 0F, 0F);
        rightlegcap = new ModelRenderer(this, 37, 6);
        rightlegcap.addBox(-3F, -2F, -3F, 6, 5, 6);
        rightlegcap.setRotationPoint(-10F, 2F, 0F);
        rightlegcap.setTextureSize(64, 32);
        rightlegcap.mirror = true;
        setRotation(rightlegcap, 0F, 0F, 0F);
        Shape1 = new ModelRenderer(this, 35, 14);
        Shape1.addBox(0F, 0F, 0F, 4, 9, 1);
        Shape1.setRotationPoint(-2F, -31F, -13F);
        Shape1.setTextureSize(64, 32);
        Shape1.mirror = true;
        setRotation(Shape1, 0F, 0F, 0F);
        Shape2 = new ModelRenderer(this, 35, 14);
        Shape2.addBox(0F, 0F, 0F, 4, 9, 1);
        Shape2.setRotationPoint(-2F, -29F, -11F);
        Shape2.setTextureSize(64, 32);
        Shape2.mirror = true;
        setRotation(Shape2, 0F, 0F, 0F);
        Shape3 = new ModelRenderer(this, 35, 14);
        Shape3.addBox(0F, 0F, 0F, 4, 9, 1);
        Shape3.setRotationPoint(-2F, -27F, -9F);
        Shape3.setTextureSize(64, 32);
        Shape3.mirror = true;
        setRotation(Shape3, 0F, 0F, 0F);
        Shape4 = new ModelRenderer(this, 35, 14);
        Shape4.addBox(0F, 0F, 0F, 4, 9, 1);
        Shape4.setRotationPoint(-2F, -8F, 8F);
        Shape4.setTextureSize(64, 32);
        Shape4.mirror = true;
        setRotation(Shape4, -1.047198F, 0F, 0F);
        Shape5 = new ModelRenderer(this, 35, 14);
        Shape5.addBox(0F, 0F, 0F, 4, 9, 1);
        Shape5.setRotationPoint(-2F, -5F, 10F);
        Shape5.setTextureSize(64, 32);
        Shape5.mirror = true;
        setRotation(Shape5, -1.308997F, 0F, 0F);
        Shape6 = new ModelRenderer(this, 35, 14);
        Shape6.addBox(0F, 0F, 0F, 4, 9, 1);
        Shape6.setRotationPoint(-2F, -24F, -2F);
        Shape6.setTextureSize(64, 32);
        Shape6.mirror = true;
        setRotation(Shape6, -0.2617994F, 0F, 0F);
        Shape7 = new ModelRenderer(this, 35, 14);
        Shape7.addBox(0F, 0F, 0F, 4, 9, 1);
        Shape7.setRotationPoint(-2F, -25F, -4F);
        Shape7.setTextureSize(64, 32);
        Shape7.mirror = true;
        setRotation(Shape7, -0.2617994F, 0F, 0F);
        Shape8 = new ModelRenderer(this, 35, 14);
        Shape8.addBox(1F, 0F, 0F, 2, 9, 1);
        Shape8.setRotationPoint(-2F, -20F, 3F);
        Shape8.setTextureSize(64, 32);
        Shape8.mirror = true;
        setRotation(Shape8, -0.5235988F, 0F, 0F);
        Shape9 = new ModelRenderer(this, 35, 14);
        Shape9.addBox(0F, 0F, 0F, 4, 9, 1);
        Shape9.setRotationPoint(-2F, -12F, 7F);
        Shape9.setTextureSize(64, 32);
        Shape9.mirror = true;
        setRotation(Shape9, -0.7853982F, 0F, 0F);
        Shape10 = new ModelRenderer(this, 35, 14);
        Shape10.addBox(0F, 0F, 0F, 4, 9, 1);
        Shape10.setRotationPoint(-2F, -15F, 6F);
        Shape10.setTextureSize(64, 32);
        Shape10.mirror = true;
        setRotation(Shape10, -0.7853982F, 0F, 0F);
        Shape11 = new ModelRenderer(this, 35, 14);
        Shape11.addBox(0F, 0F, 0F, 2, 9, 1);
        Shape11.setRotationPoint(-1F, -18F, 5F);
        Shape11.setTextureSize(64, 32);
        Shape11.mirror = true;
        setRotation(Shape11, -0.7853982F, 0F, 0F);
        Shape12 = new ModelRenderer(this, 35, 14);
        Shape12.addBox(0F, 0F, 0F, 4, 9, 1);
        Shape12.setRotationPoint(-2F, 10F, 10F);
        Shape12.setTextureSize(64, 32);
        Shape12.mirror = true;
        setRotation(Shape12, -1.570796F, 0F, 0F);
        Shape13 = new ModelRenderer(this, 35, 14);
        Shape13.addBox(0F, 0F, 0F, 4, 9, 1);
        Shape13.setRotationPoint(-2F, 8F, 10F);
        Shape13.setTextureSize(64, 32);
        Shape13.mirror = true;
        setRotation(Shape13, -1.570796F, 0F, 0F);
        Shape14 = new ModelRenderer(this, 35, 14);
        Shape14.addBox(0F, 0F, 0F, 4, 9, 1);
        Shape14.setRotationPoint(-2F, 6F, 10F);
        Shape14.setTextureSize(64, 32);
        Shape14.mirror = true;
        setRotation(Shape14, -1.570796F, 0F, 0F);
        Shape15 = new ModelRenderer(this, 35, 14);
        Shape15.addBox(0F, 0F, 0F, 4, 9, 1);
        Shape15.setRotationPoint(-2F, 4F, 10F);
        Shape15.setTextureSize(64, 32);
        Shape15.mirror = true;
        setRotation(Shape15, -1.570796F, 0F, 0F);
        Shape16 = new ModelRenderer(this, 35, 14);
        Shape16.addBox(0F, 0F, 0F, 4, 9, 1);
        Shape16.setRotationPoint(-2F, 2F, 10F);
        Shape16.setTextureSize(64, 32);
        Shape16.mirror = true;
        setRotation(Shape16, -1.570796F, 0F, 0F);
        Shape17 = new ModelRenderer(this, 35, 14);
        Shape17.addBox(0F, 0F, 0F, 4, 9, 1);
        Shape17.setRotationPoint(-2F, 0F, 10F);
        Shape17.setTextureSize(64, 32);
        Shape17.mirror = true;
        setRotation(Shape17, -1.570796F, 0F, 0F);
        Shape18 = new ModelRenderer(this, 35, 14);
        Shape18.addBox(0F, 0F, 0F, 4, 9, 1);
        Shape18.setRotationPoint(-2F, -2F, 10F);
        Shape18.setTextureSize(64, 32);
        Shape18.mirror = true;
        setRotation(Shape18, -1.570796F, 0F, 0F);
        Shape19 = new ModelRenderer(this, 35, 14);
        Shape19.addBox(1F, 0F, 0F, 2, 9, 1);
        Shape19.setRotationPoint(-2F, -26F, -6F);
        Shape19.setTextureSize(64, 32);
        Shape19.mirror = true;
        setRotation(Shape19, -0.2617994F, 0F, 0F);
        Shape20 = new ModelRenderer(this, 35, 14);
        Shape20.addBox(1F, 0F, 0F, 2, 9, 1);
        Shape20.setRotationPoint(-2F, -22F, 1F);
        Shape20.setTextureSize(64, 32);
        Shape20.mirror = true;
        setRotation(Shape20, -0.5235988F, 0F, 0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5);
        head.render(f5);
        body1.render(f5);
        rightarmext.render(f5);
        leftfoot.render(f5);
        bodymain.render(f5);
        body2.render(f5);
        body3.render(f5);
        body4.render(f5);
        body6.render(f5);
        body5.render(f5);
        rightarm.render(f5);
        rightarmcap.render(f5);
        leftarm.render(f5);
        leftarmext.render(f5);
        leftarmcap.render(f5);
        leftleg.render(f5);
        leftlegcap.render(f5);
        rightfoot.render(f5);
        rightleg.render(f5);
        rightlegcap.render(f5);
        Shape1.render(f5);
        Shape2.render(f5);
        Shape3.render(f5);
        Shape4.render(f5);
        Shape5.render(f5);
        Shape6.render(f5);
        Shape7.render(f5);
        Shape8.render(f5);
        Shape9.render(f5);
        Shape10.render(f5);
        Shape11.render(f5);
        Shape12.render(f5);
        Shape13.render(f5);
        Shape14.render(f5);
        Shape15.render(f5);
        Shape16.render(f5);
        Shape17.render(f5);
        Shape18.render(f5);
        Shape19.render(f5);
        Shape20.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6)
    {
        this.head.rotateAngleY = var4 / (180F / (float)Math.PI);
        this.head.rotateAngleX = var5 / (180F / (float)Math.PI);

        this.rightarm.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.rightarmcap.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;
        this.rightarmext.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 2.0F * var2 * 0.5F;

        this.leftarm.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.leftarmcap.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;
        this.leftarmext.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 2.0F * var2 * 0.5F;

        this.rightarm.rotateAngleZ = 0.0F;
        this.rightarmcap.rotateAngleZ = 0.0F;
        this.rightarmext.rotateAngleZ = 0.0F;

        this.leftarm.rotateAngleZ = 0.0F;
        this.leftarmcap.rotateAngleZ = 0.0F;
        this.leftarmext.rotateAngleZ = 0.0F;

        this.rightleg.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.rightlegcap.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
        this.rightfoot.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;

        this.leftleg.rotateAngleX = MathHelper.cos((float) (var1 * 0.6662F + Math.PI)) * 1.4F * var2;
        this.leftlegcap.rotateAngleX = MathHelper.cos((float) (var1 * 0.6662F + Math.PI)) * 1.4F * var2;
        this.leftfoot.rotateAngleX = MathHelper.cos((float) (var1 * 0.6662F + Math.PI)) * 1.4F * var2;

        this.rightleg.rotateAngleY = 0.0F;
        this.rightlegcap.rotateAngleY = 0.0F;
        this.rightfoot.rotateAngleY = 0.0F;

        this.leftleg.rotateAngleY = 0.0F;
        this.leftlegcap.rotateAngleY = 0.0F;
        this.leftfoot.rotateAngleY = 0.0F;

        this.rightarm.rotateAngleY = 0.0F;
        this.rightarmcap.rotateAngleY = 0.0F;
        this.rightarmext.rotateAngleY = 0.0F;

        this.leftarm.rotateAngleY = 0.0F;
        this.leftarmcap.rotateAngleY = 0.0F;
        this.leftarmext.rotateAngleY = 0.0F;

        this.rightarm.rotateAngleZ += MathHelper.cos(var3 * 0.09F) * 0.05F + 0.05F;
        this.rightarmcap.rotateAngleZ += MathHelper.cos(var3 * 0.09F) * 0.05F + 0.05F;
        this.rightarmext.rotateAngleZ += MathHelper.cos(var3 * 0.09F) * 0.05F + 0.05F;

        this.leftarm.rotateAngleZ -= MathHelper.cos(var3 * 0.09F) * 0.05F + 0.05F;
        this.leftarmcap.rotateAngleZ -= MathHelper.cos(var3 * 0.09F) * 0.05F + 0.05F;
        this.leftarmext.rotateAngleZ -= MathHelper.cos(var3 * 0.09F) * 0.05F + 0.05F;

        this.rightarm.rotateAngleX += MathHelper.sin(var3 * 0.067F) * 0.05F;
        this.rightarmcap.rotateAngleX += MathHelper.sin(var3 * 0.067F) * 0.05F;
        this.rightarmext.rotateAngleX += MathHelper.sin(var3 * 0.067F) * 0.05F;

        this.leftarm.rotateAngleX -= MathHelper.sin(var3 * 0.067F) * 0.05F;
        this.leftarmcap.rotateAngleX -= MathHelper.sin(var3 * 0.067F) * 0.05F;
        this.leftarmext.rotateAngleX -= MathHelper.sin(var3 * 0.067F) * 0.05F;
    }

}
