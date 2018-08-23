package com.placid_storm.outbreak.init;

import com.placid_storm.outbreak.blocks.BlockBase;
import com.placid_storm.outbreak.blocks.ModPodzol;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block MOD_PODZOL = new ModPodzol("mod_podzol", Material.ROCK);

    //public static final Block RUBY_ORE = new RubyOre("ruby_ore", Material.ROCK);
}
