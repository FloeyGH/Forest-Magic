package floey.forestmagic.common.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import floey.forestmagic.common.ForestMagicObjs;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

import java.util.List;

public class ForestCrystal extends Item {

    private final String[] names = new String[] {"forest", "infusion"};
    @SideOnly(Side.CLIENT)
    private IIcon[] icons;

    public ForestCrystal() {
        this.setCreativeTab(ForestMagicObjs.ForestTab);
        this.setUnlocalizedName("crystal");
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack)
    {
        return super.getUnlocalizedName() + "_" + names[stack.getItemDamage()];
    }

    @SideOnly(Side.CLIENT)
    public void getSubItems(Item item, CreativeTabs cTab, List list)
    {
        for (int i = 0; i < 2; i++)
        {
            list.add(new ItemStack(item, 1, i));
        }
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int par1)
    {
        return icons[MathHelper.clamp_int(par1, 0, 2)];
    }

    public String getTexture(String folder, String name)
    {
        return ("forestmagic:" + folder + "/" + name);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register)
    {
        icons = new IIcon[2];

        for (int i = 0; i < 2; i++)
        {
            icons[i] = register.registerIcon(this.getTexture("crystal", names[i]));
        }
    }
}