package com.placid_storm.outbreak.blocks;

import com.placid_storm.outbreak.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Testicle extends BlockBase {


    public Testicle(String name,Material material) {

        super(name, material);
        setSoundType(SoundType.GROUND);
        setHardness(5.0f);
        setResistance(15.0f);
        setHarvestLevel("pickaxe", 0);
        setCreativeTab(CreativeTabs.MATERIALS);
        setBlockUnbreakable();
        //setLightLevel(1.0f);
        //setLightOpacity(255);
    }

    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side)
    {
        IBlockState iblockstate = blockAccess.getBlockState(pos.offset(side));
        Block block = iblockstate.getBlock();

        if (this == ModBlocks.TESTICLE)
        {
            if (blockState != iblockstate)
            {
                return true;
            }

            if (block == this)
            {
                return false;
            }
        }

        return block == this ? false : super.shouldSideBeRendered(blockState, blockAccess, pos, side);
    }
    @Override
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.TRANSLUCENT;
    }
//False exposes the texture of the block behind it.
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
//Determines whether to cast a shadow.
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }


}