package divinerpg.helper.recipes.modded;

import java.util.Comparator;

import net.minecraft.item.crafting.IRecipe;
import divinerpg.helper.recipes.CraftingDivineTableManager;
import divinerpg.helper.recipes.DivineShapedRecipes;
import divinerpg.helper.recipes.DivineShapelessRecipes;

public class RecipeSorterBig implements Comparator{

	final CraftingDivineTableManager BigCraftingManager;

	RecipeSorterBig(CraftingDivineTableManager par1BigCraftingManager)
	{
		this.BigCraftingManager = par1BigCraftingManager;
	}

	public int compareRecipes(IRecipe par1IRecipe, IRecipe par2IRecipe)
	{
		return par1IRecipe instanceof DivineShapelessRecipes && par2IRecipe instanceof DivineShapedRecipes ? 1 : (par2IRecipe instanceof DivineShapelessRecipes && par1IRecipe instanceof DivineShapedRecipes ? -1 : (par2IRecipe.getRecipeSize() < par1IRecipe.getRecipeSize() ? -1 : (par2IRecipe.getRecipeSize() > par1IRecipe.getRecipeSize() ? 1 : 0)));
	}

	public int compare(Object par1Obj, Object par2Obj)
	{
		return this.compareRecipes((IRecipe)par1Obj, (IRecipe)par2Obj);
	}
}