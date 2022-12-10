package net.ollyh.magecraft.items;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTeirs {
    public static final ForgeTier AMBER = new ForgeTier(4, 3452, 3.f, 4, 20,
            BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.AMBER.get()));
    public static final ForgeTier IOLITE = new ForgeTier(4, 3452, 3.f, 4, 20,
            BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.IOLITE.get()));
}
