package net.ollyh.magecraft.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MAGE_TAB = new CreativeModeTab("magetab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.IOLITE.get());
        }
    };
}
