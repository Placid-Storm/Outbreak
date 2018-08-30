package com.placid_storm.outbreak.util;

import com.placid_storm.outbreak.init.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CustomTabs extends CreativeTabs {

    public static CreativeTabs MODBLOCKS = new CreativeTabs("modblocks") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModBlocks.STICKS);
        }
    };

    public CustomTabs(String label) {
        super("modblocks");
        this.setBackgroundImageName("custom.png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModBlocks.STICKS);
    }
}