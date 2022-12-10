package net.ollyh.magecraft.items;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ollyh.magecraft.MageCraft;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MageCraft.MOD_ID);

    public static final RegistryObject<Item> IOLITE = ITEMS.register("iolite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAGE_TAB)));
    public static final RegistryObject<Item> POLISHED_IOLITE = ITEMS.register("polished_iolite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAGE_TAB)));
    public static final RegistryObject<Item> RAW_IOLITE = ITEMS.register("raw_iolite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAGE_TAB)));

    public static final RegistryObject<Item> AMBER = ITEMS.register("amber",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAGE_TAB)));
    public static final RegistryObject<Item> RAW_AMBER = ITEMS.register("raw_amber",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAGE_TAB)));

    public static final RegistryObject<Item> ARCHAICSOUL = ITEMS.register("archaicsoul",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAGE_TAB)));
    public static final RegistryObject<Item> ARCANAKEY = ITEMS.register("arcanakey",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAGE_TAB)));

    public static final RegistryObject<Item> IOLITE_SWORD= ITEMS.register("iolite_sword",
            () -> new SwordItem(ModTeirs.IOLITE, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MAGE_TAB)));
    public static final RegistryObject<Item> IOLITE_AXE= ITEMS.register("iolite_axe",
            () -> new AxeItem(ModTeirs.IOLITE, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MAGE_TAB)));
    public static final RegistryObject<Item> IOLITE_PICKAXE= ITEMS.register("iolite_pickaxe",
            () -> new PickaxeItem(ModTeirs.IOLITE, 5, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MAGE_TAB)));
    public static final RegistryObject<Item> IOLITE_SHOVEL= ITEMS.register("iolite_shovel",
            () -> new ShovelItem(ModTeirs.IOLITE, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MAGE_TAB)));
    public static final RegistryObject<Item> IOLITE_HOE= ITEMS.register("iolite_hoe",
            () -> new HoeItem(ModTeirs.IOLITE, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MAGE_TAB)));

    public static final RegistryObject<Item> IOLITE_HELMET = ITEMS.register("iolite_helmet",
            () -> new ArmorItem(ModArmorMaterials.IOLITE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MAGE_TAB)));
    public static final RegistryObject<Item> IOLITE_CHESTPLATE= ITEMS.register("iolite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.IOLITE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MAGE_TAB)));
    public static final RegistryObject<Item> IOLITE_LEGGINGS = ITEMS.register("iolite_leggings",
            () -> new ArmorItem(ModArmorMaterials.IOLITE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MAGE_TAB)));
    public static final RegistryObject<Item> IOLITE_BOOTS = ITEMS.register("iolite_boots",
            () -> new ArmorItem(ModArmorMaterials.IOLITE, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MAGE_TAB)));


    public static final RegistryObject<Item> AMBER_SWORD= ITEMS.register("amber_sword",
            () -> new SwordItem(ModTeirs.AMBER, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MAGE_TAB)));
    public static final RegistryObject<Item> AMBER_AXE= ITEMS.register("amber_axe",
            () -> new AxeItem(ModTeirs.AMBER, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MAGE_TAB)));
    public static final RegistryObject<Item> AMBER_PICKAXE= ITEMS.register("amber_pickaxe",
            () -> new PickaxeItem(ModTeirs.AMBER, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MAGE_TAB)));
    public static final RegistryObject<Item> AMBER_SHOVEL= ITEMS.register("amber_shovel",
            () -> new ShovelItem(ModTeirs.AMBER, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MAGE_TAB)));
    public static final RegistryObject<Item> AMBER_HOE= ITEMS.register("amber_hoe",
            () -> new HoeItem(ModTeirs.AMBER, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MAGE_TAB)));

    public static final RegistryObject<Item> AMBER_HELMET = ITEMS.register("amber_helmet",
            () -> new ArmorItem(ModArmorMaterials.AMBER, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MAGE_TAB)));
    public static final RegistryObject<Item> AMBER_CHESTPLATE= ITEMS.register("amber_chestplate",
            () -> new ArmorItem(ModArmorMaterials.AMBER, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MAGE_TAB)));
    public static final RegistryObject<Item> AMBER_LEGGINGS = ITEMS.register("amber_leggings",
            () -> new ArmorItem(ModArmorMaterials.AMBER, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MAGE_TAB)));
    public static final RegistryObject<Item> AMBER_BOOTS = ITEMS.register("amber_boots",
            () -> new ArmorItem(ModArmorMaterials.AMBER, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MAGE_TAB)));



    public static void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
