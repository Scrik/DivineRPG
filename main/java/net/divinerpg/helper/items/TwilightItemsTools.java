package net.divinerpg.helper.items;

import net.divinerpg.api.items.ItemModAxe;
import net.divinerpg.api.items.ItemModPickaxe;
import net.divinerpg.api.items.ItemModShovel;
import net.divinerpg.api.items.ItemShickaxe;
import net.divinerpg.helper.material.ToolMaterialMod;
import net.minecraft.item.Item;

public class TwilightItemsTools {
	
	public static final Item edenShickaxe       = new ItemShickaxe(ToolMaterialMod.edenTools).setName("edenShickaxe");
    public static final Item wildWoodShickaxe   = new ItemShickaxe(ToolMaterialMod.wildWoodTools).setName("wildWoodShickaxe");
    public static final Item apalachiaShickaxe  = new ItemShickaxe(ToolMaterialMod.apalachiaTools).setName("apalachiaShickaxe");
    public static final Item skythernShickaxe   = new ItemShickaxe(ToolMaterialMod.skythernTools).setName("skythernShickaxe");
    public static final Item mortumShickaxe     = new ItemShickaxe(ToolMaterialMod.mortumTools).setName("mortumShickaxe");

    public static final Item edenPickaxe        = new ItemModPickaxe(ToolMaterialMod.edenTools).setName("edenPickaxe");
    public static final Item wildWoodPickaxe    = new ItemModPickaxe(ToolMaterialMod.wildWoodTools).setName("wildWoodPickaxe");
    public static final Item apalachiaPickaxe   = new ItemModPickaxe(ToolMaterialMod.apalachiaTools).setName("apalachiaPickaxe");
    public static final Item skythernPickaxe    = new ItemModPickaxe(ToolMaterialMod.skythernTools).setName("skythernPickaxe");
    public static final Item mortumPickaxe      = new ItemModPickaxe(ToolMaterialMod.mortumTools).setName("mortumPickaxe");

    public static final Item edenAxe            = new ItemModAxe(ToolMaterialMod.edenSword).setName("edenAxe");
    public static final Item wildWoodAxe        = new ItemModAxe(ToolMaterialMod.wildWoodTools).setName("wildWoodAxe");
    public static final Item apalachiaAxe       = new ItemModAxe(ToolMaterialMod.apalachiaTools).setName("apalachiaAxe");
    public static final Item skythernAxe        = new ItemModAxe(ToolMaterialMod.skythernTools).setName("skythernAxe");
    public static final Item mortumAxe          = new ItemModAxe(ToolMaterialMod.mortumTools).setName("mortumAxe");

    public static final Item edenShovel         = new ItemModShovel(ToolMaterialMod.edenTools).setName("edenShovel");
    public static final Item wildWoodShovel     = new ItemModShovel(ToolMaterialMod.wildWoodTools).setName("wildWoodShovel");
    public static final Item apalachiaShovel    = new ItemModShovel(ToolMaterialMod.apalachiaTools).setName("apalachiaShovel");
    public static final Item skythernShovel     = new ItemModShovel(ToolMaterialMod.skythernTools).setName("skythernShovel");
    public static final Item mortumShovel       = new ItemModShovel(ToolMaterialMod.mortumTools).setName("mortumShovel");

}
