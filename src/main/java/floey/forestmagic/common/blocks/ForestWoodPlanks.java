package floey.forestmagic.common.blocks;

import floey.forestmagic.common.ForestMagicObjs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

public class ForestWoodPlanks extends Block {

    public ForestWoodPlanks(Material material) {
        super(material);
        this.setHardness(2.5F);
        this.setCreativeTab(ForestMagicObjs.ForestTab);
        this.setStepSound(soundTypeWood);
        this.setHarvestLevel("axe", 0);
        this.setBlockName("ForestWoodPlanks");
        this.setBlockTextureName("forestmagic:forestwoodplanks");
    }

    @Override
    public boolean isWood(IBlockAccess world, int x, int y, int z)
    {
        return true;
    }
}