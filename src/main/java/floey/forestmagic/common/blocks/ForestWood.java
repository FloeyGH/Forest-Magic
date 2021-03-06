package floey.forestmagic.common.blocks;

import floey.forestmagic.common.ForestMagicObjs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

public class ForestWood extends Block {

    public ForestWood(Material material) {
        super(material);
        this.setCreativeTab(ForestMagicObjs.ForestTab);
        this.setBlockTextureName("forestmagic:forestwood");
        this.setStepSound(soundTypeWood);
        this.setBlockName("ForestWood");
        this.setHarvestLevel("axe", 0);
        this.setLightLevel(0.3F);
        this.setHardness(2.5F);
    }

    @Override
    public boolean canSustainLeaves(IBlockAccess world, int x, int y, int z)
    {
        return true;
    }

    @Override
    public boolean isWood(IBlockAccess world, int x, int y, int z)
    {
        return true;
    }
}