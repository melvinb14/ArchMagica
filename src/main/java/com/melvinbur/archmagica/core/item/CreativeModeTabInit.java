package com.melvinbur.archmagica.core.item;

import com.melvinbur.archmagica.core.block.BlockInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeModeTabInit {
    public static final CreativeModeTab ARCHMAGICA_TAB = new CreativeModeTab("archmagicaTab") {
    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemInit.ARCH_CRYSTAL.get());
    }
};


 public static final CreativeModeTab ARCHMAGICA_TAB2 = new CreativeModeTab("archmagicaTab2") {
    @Override
    public ItemStack makeIcon() {
        return new ItemStack(BlockInit.BRECCIA_STONE.get());
    }


};
    public static final CreativeModeTab ARCHMAGICA_TAB3 = new CreativeModeTab("archmagicaTab3") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemInit.CELESTINE_HELMET.get());
        }


    };
}

