package net.divinerpg.helper.recipes.modded;

import net.divinerpg.helper.recipes.CraftingDivineTableManager;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RecipesArmor
{
    private String[][] recipePatterns = new String[][] {{"XXX", "X X"}, {"X X", "XXX", "XXX"}, {"XXX", "X X", "X X"}, {"X X", "X X"}};
    private Object[][] recipeItems;

    public RecipesArmor()
    {
        this.recipeItems = new Object[][] {{Items.leather, Blocks.fire, Items.iron_ingot, Items.diamond, Items.gold_ingot}, {Items.leather_helmet, Items.chainmail_helmet, Items.iron_helmet, Items.diamond_helmet, Items.golden_helmet}, {Items.leather_chestplate, Items.chainmail_chestplate, Items.iron_chestplate, Items.diamond_chestplate, Items.golden_chestplate}, {Items.leather_leggings, Items.chainmail_leggings, Items.iron_leggings, Items.diamond_leggings, Items.golden_leggings}, {Items.leather_boots, Items.chainmail_boots, Items.iron_boots, Items.diamond_boots, Items.golden_boots}};
    }

    /**
     * Adds the armor recipes to the CraftingManager.
     */
    public void addRecipes(CraftingDivineTableManager par1CraftingManager)
    {
        for (int i = 0; i < recipeItems[0].length; ++i)
        {
            Object object = recipeItems[0][i];

            for (int j = 0; j < recipeItems.length - 1; ++j)
            {
                Item item = (Item)recipeItems[j + 1][i];
                par1CraftingManager.addRecipe(new ItemStack(item), new Object[] {recipePatterns[j], 'X', object});
            }
        }
    }
}