package divinerpg.client.render.entity;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelSpider;
import cpw.mods.fml.client.registry.RenderingRegistry;
import divinerpg.client.render.EntityResourceLocation;
import divinerpg.client.render.RenderDivineMob;
import divinerpg.client.render.RenderIconProjectile;
import divinerpg.client.render.RenderSizeable;
import divinerpg.helper.items.VanillaItemsWeapons;
import divinerpg.vanilla.entity.mobs.EntityAncientEntity;
import divinerpg.vanilla.entity.mobs.EntityAridWarrior;
import divinerpg.vanilla.entity.mobs.EntityAyeracoBlue;
import divinerpg.vanilla.entity.mobs.EntityAyeracoGreen;
import divinerpg.vanilla.entity.mobs.EntityAyeracoPurple;
import divinerpg.vanilla.entity.mobs.EntityAyeracoRed;
import divinerpg.vanilla.entity.mobs.EntityAyeracoYellow;
import divinerpg.vanilla.entity.mobs.EntityCaveCrawler;
import divinerpg.vanilla.entity.mobs.EntityCorruptedDramcryx;
import divinerpg.vanilla.entity.mobs.EntityCrab;
import divinerpg.vanilla.entity.mobs.EntityCyclops;
import divinerpg.vanilla.entity.mobs.EntityDesertCrawler;
import divinerpg.vanilla.entity.mobs.EntityEnderSpider;
import divinerpg.vanilla.entity.mobs.EntityEnderTriplets;
import divinerpg.vanilla.entity.mobs.EntityEnderWatcher;
import divinerpg.vanilla.entity.mobs.EntityFrost;
import divinerpg.vanilla.entity.mobs.EntityGlacon;
import divinerpg.vanilla.entity.mobs.EntityHellSpider;
import divinerpg.vanilla.entity.mobs.EntityIceMan;
import divinerpg.vanilla.entity.mobs.EntityJungleDramcryx;
import divinerpg.vanilla.entity.mobs.EntityKingCrab;
import divinerpg.vanilla.entity.mobs.EntityKingOfScorchers;
import divinerpg.vanilla.entity.mobs.EntityNetherWatcher;
import divinerpg.vanilla.entity.mobs.EntityRainbour;
import divinerpg.vanilla.entity.mobs.EntityRotatick;
import divinerpg.vanilla.entity.mobs.EntityScorcher;
import divinerpg.vanilla.entity.mobs.EntityShark;
import divinerpg.vanilla.entity.mobs.EntityTheEye;
import divinerpg.vanilla.entity.mobs.EntityWhale;
import divinerpg.vanilla.entity.mobs.EntityWildFire;
import divinerpg.vanilla.entity.mobs.models.ModelAncientEntity;
import divinerpg.vanilla.entity.mobs.models.ModelAridWarrior;
import divinerpg.vanilla.entity.mobs.models.ModelAyeraco;
import divinerpg.vanilla.entity.mobs.models.ModelCrab;
import divinerpg.vanilla.entity.mobs.models.ModelCrawler;
import divinerpg.vanilla.entity.mobs.models.ModelDramcryx;
import divinerpg.vanilla.entity.mobs.models.ModelEnderTriplets;
import divinerpg.vanilla.entity.mobs.models.ModelEye;
import divinerpg.vanilla.entity.mobs.models.ModelFrost;
import divinerpg.vanilla.entity.mobs.models.ModelGlacon;
import divinerpg.vanilla.entity.mobs.models.ModelKingScorcher;
import divinerpg.vanilla.entity.mobs.models.ModelRainbour;
import divinerpg.vanilla.entity.mobs.models.ModelRotatick;
import divinerpg.vanilla.entity.mobs.models.ModelScorcher;
import divinerpg.vanilla.entity.mobs.models.ModelShark;
import divinerpg.vanilla.entity.mobs.models.ModelWatcher;
import divinerpg.vanilla.entity.mobs.models.ModelWhale;
import divinerpg.vanilla.entity.mobs.models.ModelWildFire;
import divinerpg.vanilla.entity.projectiles.EntityShuriken;
import divinerpg.vanilla.entity.projectiles.EntityVileStorm;

public class OverworldEntityRenderer {

	public static void init(){
        RenderingRegistry.registerEntityRenderingHandler(EntityShuriken.class, new RenderIconProjectile(VanillaItemsWeapons.shuriken));
        RenderingRegistry.registerEntityRenderingHandler(EntityVileStorm.class, new RenderIconProjectile(VanillaItemsWeapons.vileStorm));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnderWatcher.class, new RenderDivineMob(new ModelWatcher(), 0.0F, EntityResourceLocation.enderWatcher));
		RenderingRegistry.registerEntityRenderingHandler(EntityCrab.class, new RenderDivineMob(new ModelCrab(), 0.0F, EntityResourceLocation.crab));
		RenderingRegistry.registerEntityRenderingHandler(EntityKingCrab.class, new RenderSizeable(new ModelCrab(), 0.0F, 1.8F, EntityResourceLocation.crab));
		RenderingRegistry.registerEntityRenderingHandler(EntityCaveCrawler.class, new RenderDivineMob(new ModelCrawler(), 0.0F, EntityResourceLocation.caveCrawler));
		RenderingRegistry.registerEntityRenderingHandler(EntityDesertCrawler.class, new RenderDivineMob(new ModelCrawler(), 0.0F, EntityResourceLocation.desertCrawler));
		RenderingRegistry.registerEntityRenderingHandler(EntityJungleDramcryx.class, new RenderDivineMob(new ModelDramcryx(), 0.0F, EntityResourceLocation.jungleDramcryx));
		RenderingRegistry.registerEntityRenderingHandler(EntityCyclops.class, new RenderSizeable(new ModelBiped(), 0.0F, 2.0F, EntityResourceLocation.cyclops));
		RenderingRegistry.registerEntityRenderingHandler(EntityAncientEntity.class, new RenderSizeable(new ModelAncientEntity(), 0.0F, 5.0F, EntityResourceLocation.ancient));
		RenderingRegistry.registerEntityRenderingHandler(EntityWhale.class, new RenderSizeable(new ModelWhale(), 0.0F, 5.0F, EntityResourceLocation.whale));
		RenderingRegistry.registerEntityRenderingHandler(EntityScorcher.class, new RenderSizeable(new ModelScorcher(), 0.0F, 1.8F, EntityResourceLocation.scorcher));
		RenderingRegistry.registerEntityRenderingHandler(EntityHellSpider.class, new RenderSizeable(new ModelSpider(), 0.0F, 1.2F ,EntityResourceLocation.hellSpider));
		RenderingRegistry.registerEntityRenderingHandler(EntityEnderSpider.class, new RenderSizeable(new ModelSpider(), 0.0F, 0.5F, EntityResourceLocation.enderSpider));
		RenderingRegistry.registerEntityRenderingHandler(EntityEnderTriplets.class, new RenderDivineMob(new ModelEnderTriplets(), 0.0F, EntityResourceLocation.enderTriplets));	
		RenderingRegistry.registerEntityRenderingHandler(EntityAridWarrior.class, new RenderDivineMob(new ModelAridWarrior(), 0.0F, EntityResourceLocation.aridWarrior));
		RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoBlue.class, new RenderDivineMob(new ModelAyeraco(), 0.0F, EntityResourceLocation.ayeraco_Blue));
		RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoGreen.class, new RenderDivineMob(new ModelAyeraco(), 0.0F, EntityResourceLocation.ayeraco_Green));
		RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoPurple.class, new RenderDivineMob(new ModelAyeraco(), 0.0F, EntityResourceLocation.ayeraco_Purple));
		RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoRed.class, new RenderDivineMob(new ModelAyeraco(), 0.0F, EntityResourceLocation.ayeraco_Red));
		RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoYellow.class, new RenderDivineMob(new ModelAyeraco(), 0.0F, EntityResourceLocation.ayeraco_Yellow));
		RenderingRegistry.registerEntityRenderingHandler(EntityCorruptedDramcryx.class, new RenderDivineMob(new ModelDramcryx(), 0.0F, EntityResourceLocation.caveDramcryx));
		RenderingRegistry.registerEntityRenderingHandler(EntityTheEye.class, new RenderDivineMob(new ModelEye(), 0.0F, EntityResourceLocation.theEye));
		RenderingRegistry.registerEntityRenderingHandler(EntityFrost.class, new RenderDivineMob(new ModelFrost(), 0.0F, EntityResourceLocation.frost));
		RenderingRegistry.registerEntityRenderingHandler(EntityIceMan.class, new RenderDivineMob(new ModelBiped(), 0.0F, EntityResourceLocation.iceMan));
		RenderingRegistry.registerEntityRenderingHandler(EntityKingOfScorchers.class, new RenderDivineMob(new ModelKingScorcher(), 0.0F, EntityResourceLocation.kingOfScorchers));
		RenderingRegistry.registerEntityRenderingHandler(EntityRainbour.class, new RenderDivineMob(new ModelRainbour(), 0.0F, EntityResourceLocation.rainbour));
		RenderingRegistry.registerEntityRenderingHandler(EntityRotatick.class, new RenderDivineMob(new ModelRotatick(), 0.0F, EntityResourceLocation.rotatick));
		RenderingRegistry.registerEntityRenderingHandler(EntityShark.class, new RenderDivineMob(new ModelShark(), 0.0F, EntityResourceLocation.shark));
		RenderingRegistry.registerEntityRenderingHandler(EntityNetherWatcher.class, new RenderDivineMob(new ModelWatcher(), 0.0F, EntityResourceLocation.netherWatcher));
		RenderingRegistry.registerEntityRenderingHandler(EntityWildFire.class, new RenderDivineMob(new ModelWildFire(), 0.0F, EntityResourceLocation.wildFire));
		RenderingRegistry.registerEntityRenderingHandler(EntityGlacon.class, new RenderDivineMob(new ModelGlacon(), 0.0F, EntityResourceLocation.glacon));
		
		//RenderingRegistry.getItemRenderer(item, type)
	}
}
