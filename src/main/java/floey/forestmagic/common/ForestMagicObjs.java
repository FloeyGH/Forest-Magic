package floey.forestmagic.common;

import cpw.mods.fml.common.registry.GameRegistry;
import floey.forestmagic.common.blocks.CrystalFlower;
import floey.forestmagic.common.blocks.ForestWood;
import floey.forestmagic.common.items.ForestCrystal;
import floey.forestmagic.common.items.ForestWand;
import floey.forestmagic.common.util.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ForestMagicObjs {

    public static final CreativeTabs ForestTab = new CreativeTab();
    public static Block crystalFlower = new CrystalFlower();
    public static Block forestWood = new ForestWood(Material.wood);

    public static Item forestCrystal = new ForestCrystal();
    public static Item forestWand = new ForestWand();

    public static void load() {

        GameRegistry.registerItem(forestCrystal, forestCrystal.getUnlocalizedName());
        GameRegistry.registerItem(forestWand, forestWand.getUnlocalizedName());

        GameRegistry.registerBlock(crystalFlower, crystalFlower.getUnlocalizedName());
        GameRegistry.registerBlock(forestWood, forestWood.getUnlocalizedName());
    }

    public static void recipes() {

        GameRegistry.addRecipe(new ItemStack(forestWand), " sc", " ss", "s  ", 's', new ItemStack(Items.stick), 'c', new ItemStack(forestCrystal));
    }
}