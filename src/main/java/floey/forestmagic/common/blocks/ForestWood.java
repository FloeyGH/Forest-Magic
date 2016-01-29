package floey.forestmagic.common.blocks;

import floey.forestmagic.common.ForestMagicObjs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ForestWood extends Block {

    public ForestWood(Material material) {
        super(material);
        this.setCreativeTab(ForestMagicObjs.ForestTab);
        this.setBlockTextureName("forestmagic:forestwood");
        this.setStepSound(soundTypeWood);
        this.setBlockName("ForestWood");
        this.setHarvestLevel("axe", 1);
        this.setLightLevel(0.1F);
        this.setHardness(2.5F);
    }
}