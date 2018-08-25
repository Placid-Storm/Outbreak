package com.placid_storm.outbreak.blocks;

import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Sticks extends BlockBase {

    public static final PropertyDirection FACING = BlockHorizontal.FACING;
    protected static final AxisAlignedBB X_AXIS_AABB = new AxisAlignedBB(0.3125D, 0.0D, 0.0D, 0.6875D, 0.0625D, 1.0D);
    protected static final AxisAlignedBB Z_AXIS_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.3125D, 1.0D, 0.0625D, 0.6875D);

    public Sticks(String name, Material material) {
        super(name, material);
        setSoundType(SoundType.WOOD);
        setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
        setCreativeTab(CreativeTabs.MATERIALS);
    }
    /**
     * Called by ItemBlocks just before a block is actually set in the world, to allow for adjustments to the
     * IBlockstate
     */
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {FACING});
    }

    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        EnumFacing enumfacing = placer.getHorizontalFacing().rotateY();
        return super.getStateForPlacement(worldIn, pos, facing, hitX, hitY, hitZ, 0, placer).withProperty(FACING, enumfacing);
    }
    public int getMetaFromState(IBlockState state) {
        //return 0;
        return ((EnumFacing)state.getValue(FACING)).getHorizontalIndex();

    }
    public IBlockState getStateFromMeta(int meta) {
        //return this.getDefaultState();
        return this.getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta & 3));

    }
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        EnumFacing enumfacing = (EnumFacing)state.getValue(FACING);
        return enumfacing.getAxis() == EnumFacing.Axis.X ? X_AXIS_AABB : Z_AXIS_AABB;
    }
    @SideOnly(Side.CLIENT)
    @Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }
}
