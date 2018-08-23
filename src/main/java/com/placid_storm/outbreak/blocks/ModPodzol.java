package com.placid_storm.outbreak.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;

public class ModPodzol extends BlockBase {

    public ModPodzol(String name, Material material){

        super(name, material);
        setSoundType(SoundType.GROUND);
        setHardness(5.0f);
        setResistance(15.0f);
        setHarvestLevel("pickaxe", 2);
        setLightLevel(1.0f);
        //IBlockState PODZOL = Blocks.DIRT.getStateFromMeta(2);
    }
}
