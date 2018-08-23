package com.placid_storm.outbreak.init;

import com.placid_storm.outbreak.blocks.Testicle;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block TESTICLE = new Testicle("testicle", Material.ROCK);

    //public static final Block RUBY_ORE = new RubyOre("ruby_ore", Material.ROCK);
}
