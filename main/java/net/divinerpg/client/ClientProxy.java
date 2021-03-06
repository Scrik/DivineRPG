package net.divinerpg.client;

import com.jadarstudios.developercapes.DevCapes;

import net.divinerpg.CommonProxy;
import net.divinerpg.DivineRPG;
import net.divinerpg.Reference;
import net.divinerpg.client.render.entity.ArcanaEntityRenderer;
import net.divinerpg.client.render.entity.IceikaEntityRenderer;
import net.divinerpg.client.render.entity.OverworldEntityRenderer;
import net.divinerpg.client.render.entity.TwilightEntityRenderer;
import net.divinerpg.client.render.entity.VetheaEntityRenderer;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.network.NetworkRegistry;

public class ClientProxy extends CommonProxy{

	@Override
	public void renderThings() {
		System.out.println("[DIVINERPG] RENDERING ENTITYS");
		OverworldEntityRenderer.init();
		TwilightEntityRenderer.init();
		IceikaEntityRenderer.init();
		VetheaEntityRenderer.init();
		ArcanaEntityRenderer.init();
		System.out.println("[DIVINERPG] REGISTERING SOUNDS");
		NetworkRegistry.INSTANCE.registerGuiHandler(DivineRPG.instance, new GuiHandler());
		if(Reference.registerCapes){
			System.out.println("[DIVINERPG] REGISTERING USER CAPES");
			DevCapes.getInstance().registerConfig("https://dl-web.dropbox.com/get/Divine%20RPG/DivineRPGCapes.json", Reference.MOD_NAME);
		}
	}
}