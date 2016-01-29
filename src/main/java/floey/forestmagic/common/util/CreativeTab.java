package floey.forestmagic.common.util;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import floey.forestmagic.ForestMagic;
import floey.forestmagic.common.ForestMagicObjs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTab extends CreativeTabs {
    public CreativeTab()
    {
        super(ForestMagic.MODID);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem()
    {
        return ForestMagicObjs.forestWand;
    }
}