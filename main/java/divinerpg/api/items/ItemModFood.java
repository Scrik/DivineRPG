package divinerpg.api.items;

import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import divinerpg.Reference;
import divinerpg.helper.tabs.DivineRPGTabs;
import divinerpg.helper.utils.LangRegistry;

public class ItemModFood extends ItemFood {
	
	private int food;
	private float sat;
	private boolean wolf;
	private EntityPlayer p = Minecraft.getMinecraft().thePlayer;
	
	public ItemModFood(int food, float sat, boolean wolfFood){
		super(food, sat, wolfFood);
		setCreativeTab(DivineRPGTabs.food);
		this.food = food;
		this.sat = sat;
		wolf = wolfFood;
		LangRegistry.addItem(this);
	}
	
	/**
	 * For potion effects
	 */
	public ItemModFood(int food, float sat, boolean wolfFood, int potionID, int potionDuration, int potionAmplifier, float potionEffectProbability){
        super(food, sat, wolfFood);
        setCreativeTab(DivineRPGTabs.food);
        this.food = food;
        this.sat = sat;
        wolf = wolfFood;
        LangRegistry.addItem(this);
        setPotionEffect(potionID, potionDuration, potionAmplifier, potionEffectProbability);
    }
	
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add("Fills " + (double) food/2 + " Hunger Bars");
		par3List.add(sat + " Saturation");
		par3List.add(!wolf ? "Pet Food: false" : "Pet Food: true");
	}
	
	public Item setImageName(String par1Str) {
        return setTextureName(Reference.PREFIX + par1Str);
    }
	
    private String name;
    public Item setName(String name){
        this.name = name;
        setImageName(name);
        setUnlocalizedName(name);
        register();
        return this;
    }
    
    public void register(){
        int numChars = 0;
        char firstLetter = name.charAt(0);
        if(Character.isLowerCase(firstLetter))
            firstLetter = Character.toUpperCase(firstLetter);
        String inGame = name.substring(1);
        for(int k = 0; k < name.length(); k++){
            char c = name.charAt(k);
            int code = (int) c;
            
            if(k != 0){
                for(int p = 65; p < 90; p++){
                    if(code == p){
                        numChars++;
                        if(numChars == 1)
                            inGame = new StringBuffer(inGame).insert(k - 1, " ").toString();
                        else
                            inGame = new StringBuffer(inGame).insert(k, " ").toString();
                    }
                }
            }
        }
        String finalName = firstLetter + inGame;
        GameRegistry.registerItem(this, name);
    }
	
}