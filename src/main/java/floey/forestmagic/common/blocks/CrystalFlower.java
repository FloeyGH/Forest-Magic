package floey.forestmagic.common.blocks;

import floey.forestmagic.common.ForestMagicObjs;
import net.minecraft.block.BlockFlower;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.ObfuscationReflectionHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.world.World;
import java.util.Random;

public class CrystalFlower extends BlockFlower
{
    public CrystalFlower()
    {
        super(0);
        this.setStepSound(soundTypeGrass);
        this.setBlockName("CrystalFlower");
        this.setCreativeTab(CreativeTabs.tabFood);
        if (FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT)
        {
            ObfuscationReflectionHelper.setPrivateValue(BlockFlower.class, this, new IIcon[1], "field_149861_N");
        }
    }

    @Override
    public IIcon getIcon (IBlockAccess BlockAcc, int x, int y, int z, int par5)
    {
        return this.blockIcon;
    }

    @Override
    public IIcon getIcon (int par, int par2)
    {
        return this.blockIcon;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons (IIconRegister iconRegister)
    {
        this.blockIcon = iconRegister.registerIcon("forestmagic:crystalflower");
    }

    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World world, int x, int y, int z, Random random)
    {
        for (int l = 0; l < 3; ++l)
        {
            double d6 = (double)((float)x + random.nextFloat());
            double d1 = (double)((float)y + random.nextFloat());
            d6 = (double)((float)z + random.nextFloat());
            double d3 = 0.0D;
            double d4 = 0.0D;
            double d5 = 0.0D;
            int i1 = random.nextInt(2) * 2 - 1;
            int j1 = random.nextInt(2) * 2 - 1;
            d3 = ((double)random.nextFloat() - 0.5D) * 0.125D;
            d4 = ((double)random.nextFloat() - 0.5D) * 0.125D;
            d5 = ((double)random.nextFloat() - 0.5D) * 0.125D;
            double d2 = (double)z + 0.5D + 0.25D * (double)j1;
            d5 = (double)(random.nextFloat() * 1.0F * (float)j1);
            double d0 = (double)x + 0.5D + 0.25D * (double)i1;
            d3 = (double)(random.nextFloat() * 1.0F * (float)i1);
            world.spawnParticle("enchantmenttable", d0, d1, d2, d3, d4, d5);
        }
    }

    public Item getItemDropped(int par1, Random random, int par3)
    {
        return ForestMagicObjs.forestCrystal;
    }
}