package com.placid_storm.outbreak.blocks;

import com.placid_storm.outbreak.Main;
import com.placid_storm.outbreak.init.ModBlocks;
import com.placid_storm.outbreak.init.ModItems;
import com.placid_storm.outbreak.util.CustomTabs;
import com.placid_storm.outbreak.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

    public BlockBase(String name, Material material) {

        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CustomTabs.MODBLOCKS);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {

        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
