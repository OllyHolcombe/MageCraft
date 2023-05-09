package net.ollyh.magecraft.items;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier AMBER = new ForgeTier(6, 3452, 0.1f, 6, 20,
            BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.AMBER.get()));
    public static final ForgeTier IOLITE = new ForgeTier(7, 6904, 0.3f, 8, 26,
            BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.IOLITE.get()));
}
