package floey.forestmagic.common.items;

import floey.forestmagic.common.ForestMagicObjs;
import net.minecraft.item.Item;

public class ForestStick extends Item {

    public ForestStick() {
        this.setTextureName("forestmagic:foreststick");
        this.setUnlocalizedName("foreststick");
        this.setCreativeTab(ForestMagicObjs.ForestTab);
    }
}