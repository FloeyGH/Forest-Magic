package floey.forestmagic.common.items;

import floey.forestmagic.common.ForestMagicObjs;
import net.minecraft.item.Item;

public class ForestCrystal extends Item {

    public ForestCrystal() {
        this.setCreativeTab(ForestMagicObjs.ForestTab);
        this.setTextureName("forestmagic:forestcrystal");
        this.setUnlocalizedName("forestcrystal");
    }
}
