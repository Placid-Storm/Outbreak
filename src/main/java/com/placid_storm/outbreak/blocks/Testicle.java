package com.placid_storm.outbreak.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Testicle extends BlockBase {


    public Testicle(String name,Material material) {

        super(name, material);
        setSoundType(SoundType.GROUND);
        setHardness(5.0f);
        setResistance(15.0f);
        setHarvestLevel("pickaxe", 0);
        //setLightLevel(1.0f);
        setBlockUnbreakable();
        setLightOpacity(255);
    }

    @SideOnly(Side.CLIENT)
    /*
    private boolean shouldSideBeRendered2(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
        AxisAlignedBB axisalignedbb = blockState.getBoundingBox(blockAccess, pos);

        switch (side)
        {
            case DOWN:

                if (axisalignedbb.minY > 0.0D){return true;}

                break;
            case UP:

                if (axisalignedbb.maxY < 1.0D){return true;}

                break;
            case NORTH:

                if (axisalignedbb.minZ > 0.0D){return true;}

                break;
            case SOUTH:

                if (axisalignedbb.maxZ < 1.0D){return true;}

                break;
            case WEST:

                if (axisalignedbb.minX > 0.0D){return true;}

                break;
            case EAST:

                if (axisalignedbb.maxX < 1.0D){return true;}
        }

        return !blockAccess.getBlockState(pos.offset(side)).doesSideBlockRendering(blockAccess, pos.offset(side), side.getOpposite());
    }*/

    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
    @Override
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }

}