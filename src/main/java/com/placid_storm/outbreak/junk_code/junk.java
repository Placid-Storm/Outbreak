package com.placid_storm.outbreak.junk_code;

public class junk {
    /*
    public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side) {
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
    }
*/
}
