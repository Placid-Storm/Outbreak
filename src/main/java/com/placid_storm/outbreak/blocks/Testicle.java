package com.placid_storm.outbreak.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Testicle extends BlockBase {

    public Testicle(String name, Material material) {

        super(name, material);
        setSoundType(SoundType.GROUND);
        setHardness(5.0f);
        setResistance(15.0f);
        setHarvestLevel("pickaxe", 2);
        setLightLevel(1.0f);
        setBlockUnbreakable();
    }
}