package net.divinerpg.helper.recipes;

import net.divinerpg.helper.DivineAPI;
import net.divinerpg.helper.blocks.VanillaBlocks;
import net.divinerpg.helper.items.IceikaItems;
import net.divinerpg.helper.items.ItemsFood;
import net.divinerpg.helper.items.VanillaItemsOther;
import net.divinerpg.helper.items.VanillaItemsWeapons;
import net.minecraft.init.Items;

public class VanillaRecipeHelper {

	public static void init(){
		DivineAPI.addRecipe(IS.slimeSword, "SDS", "SDS", "SDS", 'D', Items.diamond_sword, 'S', Items.slime_ball);
		DivineAPI.addRecipe(IS.enderSword, " L ", " L ", " S ", 'L', VanillaItemsOther.legendaryEnderEye, 'S', VanillaItemsOther.shadowBar);
		DivineAPI.addRecipe(IS.arlemiteSword, " I ", " I ", " S ", 'I', VanillaItemsOther.arlemiteIngot, 'S', Items.stick);
		DivineAPI.addRecipe(IS.rupeeSword, " I ", " I ", " S ", 'I', VanillaItemsWeapons.rupeeSword, 'S', Items.stick);
		DivineAPI.addRecipe(IS.realmiteSword, " I ", " I ", " S ", 'I', VanillaItemsOther.realmiteIngot, 'S', Items.stick);
		DivineAPI.addRecipe(IS.shuriken, " I ", "III", " I ", 'I', Items.iron_ingot);
		DivineAPI.addShapelessRecipe(IS.vile, VanillaItemsOther.jungleShards, VanillaItemsWeapons.vileStorm);
		DivineAPI.addBigRecipe(IS.slimeSword, "SDS", "SDS", "SDS", 'D', Items.diamond_sword, 'S', Items.slime_ball);
		DivineAPI.addBigRecipe(IS.longsword, " I ", " I ", " I ", "III", " S ", 'I', Items.iron_ingot, 'S', Items.stick);
		
		DivineAPI.addRecipe(IS.arlemitePick, "III", " S ", " S ", 'I', VanillaItemsOther.arlemiteIngot, 'S', Items.stick);
		
		DivineAPI.addRecipe(IS.realHead, "III", "I I", "  ", 'I', VanillaItemsOther.realmiteIngot);
		DivineAPI.addRecipe(IS.realBody, "I I", "III", "III", 'I', VanillaItemsOther.realmiteIngot);
		DivineAPI.addRecipe(IS.realLegs, "III", "I I", "I I", 'I', VanillaItemsOther.realmiteIngot);
		DivineAPI.addRecipe(IS.realFeet, "   ", "I I", "I I", 'I', VanillaItemsOther.realmiteIngot);
		
		DivineAPI.addRecipe(IS.eliteHead, "III", "I I", "  ", 'I', VanillaBlocks.realmiteBlock);
		DivineAPI.addRecipe(IS.eliteBody, "I I", "III", "III", 'I', VanillaBlocks.realmiteBlock);
		DivineAPI.addRecipe(IS.eliteLegs, "III", "I I", "I I", 'I', VanillaBlocks.realmiteBlock);
		DivineAPI.addRecipe(IS.eliteFeet, "   ", "I I", "I I", 'I', VanillaBlocks.realmiteBlock);

		DivineAPI.addRecipe(IS.netherChuck, " I ", "III", " I ", 'I', VanillaItemsOther.netheriteIngot);

		DivineAPI.addRecipe(IS.arlemiteBlock, "III", "III", "III", 'I', VanillaItemsOther.arlemiteIngot);
		DivineAPI.addRecipe(IS.rupeeBlock, "III", "III", "III", 'I', VanillaItemsOther.rupeeIngot);
		DivineAPI.addRecipe(IS.realBlock, "III", "III", "III", 'I', VanillaItemsOther.realmiteIngot);
		DivineAPI.addRecipe(IS.netherBlock, "III", "III", "III", 'I', VanillaItemsOther.netheriteIngot);
		DivineAPI.addRecipe(IS.bloodBlock, "III", "III", "III", 'I', VanillaItemsOther.bloodgem);

		DivineAPI.addShapelessRecipe(IS.arlemiteIngot, VanillaBlocks.arlemiteBlock);
		DivineAPI.addShapelessRecipe(IS.rupeeIngot, VanillaBlocks.rupeeBlock);
		DivineAPI.addShapelessRecipe(IS.realIngot, VanillaBlocks.realmiteBlock);
		DivineAPI.addShapelessRecipe(IS.netherIngot, VanillaBlocks.netheriteBlock);
		DivineAPI.addShapelessRecipe(IS.bloodgem, VanillaBlocks.bloodgemBlock);
		DivineAPI.addShapelessRecipe(IS.shadow, VanillaItemsOther.rupeeIngot, VanillaItemsOther.arlemiteIngot);
		
		DivineAPI.addRecipe(IS.corruptStone, "III", "III", "III", 'I', VanillaItemsOther.corruptedShards);
		DivineAPI.addRecipe(IS.enderStone, "III", "III", "III", 'I', VanillaItemsOther.jungleShards);
		DivineAPI.addRecipe(IS.iceStone, "III", "III", "III", 'I', IceikaItems.iceShards);
		DivineAPI.addRecipe(IS.moltenStone, "III", "III", "III", 'I', VanillaItemsOther.moltenShards);
		DivineAPI.addRecipe(IS.divineStone, "III", "III", "III", 'I', VanillaItemsOther.divineShards);
		DivineAPI.addRecipe(IS.enderStone, "III", "III", "III", 'I', VanillaItemsOther.enderShard);

		DivineAPI.addRecipe(IS.legEnderEye, "III", "III", "III", 'I', VanillaItemsOther.enderStone);
		
		DivineAPI.addShapelessRecipe(IS.bacon, Items.porkchop);
		DivineAPI.addRecipe(IS.cheese, "MMM", "MMM", "MMM", 'M', Items.milk_bucket);
		DivineAPI.addSmelting(IS.egg, IS.boiledEgg, 0.3F);
		DivineAPI.addShapelessRecipe(IS.advStew, ItemsFood.whiteMushroom, Items.mushroom_stew);
		DivineAPI.addShapelessRecipe(IS.chickDinner, ItemsFood.advMushroomStew, Items.cooked_chicken, Items.bread);
	}
}