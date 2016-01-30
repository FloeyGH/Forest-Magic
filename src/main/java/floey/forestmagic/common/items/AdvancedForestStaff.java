package floey.forestmagic.common.items;

import floey.forestmagic.common.ForestMagicObjs;
import floey.forestmagic.common.util.MetaBlock;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class AdvancedForestStaff extends Item {

    public AdvancedForestStaff() {
        this.setCreativeTab(ForestMagicObjs.ForestTab);
        this.setUnlocalizedName("advancedforeststaff");
        this.setTextureName("forestmagic:advancedforeststaff");
        this.setMaxStackSize(1);
        this.setMaxDamage(256);
    }

    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int blockX, int blockY, int blockZ, int sideHit, float px, float py, float pz) {

        if (world.isRemote) {
            return false;
        }

        MetaBlock mBlock = new MetaBlock(world, blockX, blockY, blockZ);

        if (mBlock.getBlock() != Blocks.air) {
            if (player.isSneaking()) {

                if (mBlock.getBlock() == Blocks.log || mBlock.getBlock() == Blocks.log2)
                {
                    world.setBlock(blockX, blockY, blockZ,ForestMagicObjs.forestWood);
                    world.playSoundAtEntity(player, "random.orb", 1.0F, 1.0F);
                    stack.damageItem(+1, player);
                }
            }
        }
        return true;
    }
}