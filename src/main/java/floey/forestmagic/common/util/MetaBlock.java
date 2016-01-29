package floey.forestmagic.common.util;

import net.minecraft.block.Block;
import net.minecraft.world.World;

public class MetaBlock
{
    private Block block;
    private int meta;

    public MetaBlock(World world, int x, int y, int z)
    {
        this.block = world.getBlock(x, y, z);
        this.meta = world.getBlockMetadata(x, y, z);
    }

    public Block getBlock()
    {
        return block;
    }

    @Override
    public String toString()
    {
        return block.toString();
    }

    @Override
    public int hashCode()
    {
        return toString().hashCode();
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof MetaBlock)
        {
            MetaBlock block = (MetaBlock) obj;

            if (this.block == block.getBlock())
            {
                return this.meta == block.meta || this.block.damageDropped(this.meta) == block.block.damageDropped(block.meta);
            }
        }

        return false;
    }
}
