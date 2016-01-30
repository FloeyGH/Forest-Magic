package floey.forestmagic.common;

import cpw.mods.fml.common.registry.GameRegistry;
import floey.forestmagic.common.blocks.CrystalFlower;
import floey.forestmagic.common.blocks.ForestWood;
import floey.forestmagic.common.blocks.ForestWoodPlanks;
import floey.forestmagic.common.items.AdvancedForestStaff;
import floey.forestmagic.common.items.ForestCrystal;
import floey.forestmagic.common.items.ForestStick;
import floey.forestmagic.common.items.ForestStaff;
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
    public static Block forestWoodPlanks = new ForestWoodPlanks(Material.wood);

    public static Item forestCrystal = new ForestCrystal();
    public static Item forestStaff = new ForestStaff();
    public static Item advancedForestStaff = new AdvancedForestStaff();
    public static Item forestStick = new ForestStick();

    public static void load() {

        GameRegistry.registerItem(forestCrystal, forestCrystal.getUnlocalizedName());
        GameRegistry.registerItem(forestStaff, forestStaff.getUnlocalizedName());
        GameRegistry.registerItem(advancedForestStaff, advancedForestStaff.getUnlocalizedName());
        GameRegistry.registerItem(forestStick, forestStick.getUnlocalizedName());

        GameRegistry.registerBlock(crystalFlower, crystalFlower.getUnlocalizedName());
        GameRegistry.registerBlock(forestWood, forestWood.getUnlocalizedName());
        GameRegistry.registerBlock(forestWoodPlanks, forestWoodPlanks.getUnlocalizedName());
    }

    public static void recipes() {

        GameRegistry.addRecipe(new ItemStack(forestWoodPlanks,0,4), "w", 'w', new ItemStack(forestWood));
        GameRegistry.addRecipe(new ItemStack(forestStaff), " sc", " ss", "s  ", 's', new ItemStack(Items.stick), 'c', new ItemStack(forestCrystal,1,1));
    }
}