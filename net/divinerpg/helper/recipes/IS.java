package net.divinerpg.helper.recipes;

import net.divinerpg.helper.blocks.VanillaBlocks;
import net.divinerpg.helper.items.EndItems;
import net.divinerpg.helper.items.NetherItems;
import net.divinerpg.helper.items.OverworldItems;
import net.divinerpg.helper.items.TwilightItems;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;

public class IS {
		//IS stands for ItemStack
		//Food
		public static ItemStack boiledEgg = new ItemStack(OverworldItems.boiledEgg);
		public static ItemStack egg = new ItemStack(Items.egg);
		public static ItemStack bacon = new ItemStack(OverworldItems.bacon, 6);
		public static ItemStack rawPork = new ItemStack(Items.porkchop);
		public static ItemStack cheese = new ItemStack(OverworldItems.cheese, 3);
		public static ItemStack advStew = new ItemStack(OverworldItems.advMushroomStew);
		public static ItemStack chickDinner = new ItemStack(OverworldItems.chickenDinner);
		
		//Weapons
		public static ItemStack enderSword = new ItemStack(EndItems.enderSword);
		public static ItemStack slimeSword = new ItemStack(OverworldItems.slimeSword);
		public static ItemStack legEnderEye = new ItemStack(OverworldItems.legendaryEnderEye);
		
		//Materials
		public static ItemStack shadow = new ItemStack(OverworldItems.shadowBar);
		public static ItemStack netherChuck = new ItemStack(NetherItems.netheriteChunk);
		public static ItemStack arlemiteIngot = new ItemStack(OverworldItems.arlemiteIngot, 9);
		public static ItemStack rupeeIngot = new ItemStack(OverworldItems.rupeeIngot, 9);
		public static ItemStack realIngot = new ItemStack(OverworldItems.realmiteIngot, 9);
		public static ItemStack netherIngot = new ItemStack(NetherItems.netheriteIngot, 9);
		public static ItemStack bloodgem = new ItemStack(NetherItems.bloodgem, 9);
		public static ItemStack corruptStone = new ItemStack(OverworldItems.corruptedStone);
		public static ItemStack jungleStone = new ItemStack(OverworldItems.jungleStone);
		public static ItemStack iceStone = new ItemStack(OverworldItems.iceStone);
		public static ItemStack moltenStone = new ItemStack(NetherItems.moltenStone);
		public static ItemStack divineStone = new ItemStack(OverworldItems.divineStone);
		public static ItemStack enderStone = new ItemStack(EndItems.enderStone);
		public static ItemStack draviteFragments = new ItemStack(TwilightItems.draviteFragments);
		public static ItemStack azuriteFragments = new ItemStack(TwilightItems.azuriteFragments);
		public static ItemStack uviteFragments = new ItemStack(TwilightItems.uviteFragments);
		public static ItemStack mythrilFragments = new ItemStack(TwilightItems.mythrilFragments);
		public static ItemStack augiteFragments = new ItemStack(TwilightItems.augiteFragments);
		public static ItemStack draviteGem = new ItemStack(TwilightItems.draviteGem);
		public static ItemStack azuriteGem = new ItemStack(TwilightItems.azuriteGem);
		public static ItemStack uviteGem = new ItemStack(TwilightItems.uviteGem);
		public static ItemStack mythrilGem = new ItemStack(TwilightItems.mythrilGem);
		public static ItemStack augiteGem = new ItemStack(TwilightItems.augiteGem);


		//Blocks
		public static ItemStack arlemiteBlock = new ItemStack(VanillaBlocks.arlemiteBlock);
		public static ItemStack rupeeBlock = new ItemStack(VanillaBlocks.rupeeBlock);
		public static ItemStack realBlock = new ItemStack(VanillaBlocks.realmiteBlock);
		public static ItemStack netherBlock = new ItemStack(VanillaBlocks.netheriteBlock);
		public static ItemStack bloodBlock = new ItemStack(VanillaBlocks.bloodgemBlock);

}
