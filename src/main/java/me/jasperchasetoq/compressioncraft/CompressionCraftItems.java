package me.jasperchasetoq.compressioncraft;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;


public class CompressionCraftItems {

    private CompressionCraftItems() {}
    //Machines
    public static final SlimefunItemStack JC_COMPRESSOR_1 = new SlimefunItemStack("JC_COMPRESSOR_1", Material.PISTON, "&e压缩机", "", "&7用于压缩方块", "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.powerPerSecond(50), LoreBuilder.speed(1), LoreBuilder.powerBuffer(250), "&e压缩工艺");
    public static final SlimefunItemStack JC_COMPRESSOR_2 = new SlimefunItemStack("JC_COMPRESSOR_2", Material.PISTON, "&6压缩机", "", "&7用于压缩方块", "", LoreBuilder.machine(MachineTier.AVERAGE, MachineType.MACHINE), LoreBuilder.powerPerSecond(100), LoreBuilder.speed(2), LoreBuilder.powerBuffer(500), "&6压缩工艺");
    public static final SlimefunItemStack JC_COMPRESSOR_3 = new SlimefunItemStack("JC_COMPRESSOR_3", Material.PISTON, "&a压缩机", "", "&7用于压缩方块", "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.powerPerSecond(150), LoreBuilder.speed(3), LoreBuilder.powerBuffer(750), "&a压缩工艺");
    public static final SlimefunItemStack JC_COMPRESSOR_4 = new SlimefunItemStack("JC_COMPRESSOR_4", Material.PISTON, "&2压缩机", "", "&7用于压缩方块", "", LoreBuilder.machine(MachineTier.GOOD, MachineType.MACHINE), LoreBuilder.powerPerSecond(200), LoreBuilder.speed(4), LoreBuilder.powerBuffer(1000), "&2压缩工艺");
    public static final SlimefunItemStack JC_COMPRESSOR_5 = new SlimefunItemStack("JC_COMPRESSOR_5", Material.PISTON, "&6压缩机", "", "&7用于压缩方块", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.powerPerSecond(250), LoreBuilder.speed(5), LoreBuilder.powerBuffer(1250), "&6压缩工艺");
    public static final SlimefunItemStack JC_COMPRESSOR_6 = new SlimefunItemStack("JC_COMPRESSOR_6", Material.PISTON, "&4压缩机", "", "&7用于压缩方块", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.powerPerSecond(300), LoreBuilder.speed(6), LoreBuilder.powerBuffer(1500), "&4压缩工艺");
    public static final SlimefunItemStack JC_DECOMPRESSOR_1 = new SlimefunItemStack("JC_DECOMPRESSOR_1", Material.PISTON, "&e压缩机", "", "&7用于解压方块", "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.powerPerSecond(50), LoreBuilder.speed(1), LoreBuilder.powerBuffer(250), "&e压缩工艺");
    public static final SlimefunItemStack JC_DECOMPRESSOR_2 = new SlimefunItemStack("JC_DECOMPRESSOR_2", Material.PISTON, "&6压缩机", "", "&7用于解压方块", "", LoreBuilder.machine(MachineTier.AVERAGE, MachineType.MACHINE), LoreBuilder.powerPerSecond(100), LoreBuilder.speed(2), LoreBuilder.powerBuffer(500), "&6压缩工艺");
    public static final SlimefunItemStack JC_DECOMPRESSOR_3 = new SlimefunItemStack("JC_DECOMPRESSOR_3", Material.PISTON, "&a压缩机", "", "&7用于解压方块", "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.powerPerSecond(150), LoreBuilder.speed(3), LoreBuilder.powerBuffer(750), "&a压缩工艺");
    public static final SlimefunItemStack JC_DECOMPRESSOR_4 = new SlimefunItemStack("JC_DECOMPRESSOR_4", Material.PISTON, "&2压缩机", "", "&7用于解压方块", "", LoreBuilder.machine(MachineTier.GOOD, MachineType.MACHINE), LoreBuilder.powerPerSecond(200), LoreBuilder.speed(4), LoreBuilder.powerBuffer(1000), "&2压缩工艺");
    public static final SlimefunItemStack JC_DECOMPRESSOR_5 = new SlimefunItemStack("JC_DECOMPRESSOR_5", Material.PISTON, "&6压缩机", "", "&7用于解压方块", "", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.powerPerSecond(250), LoreBuilder.speed(5), LoreBuilder.powerBuffer(1250), "&6压缩工艺");
    public static final SlimefunItemStack JC_DECOMPRESSOR_6 = new SlimefunItemStack("JC_DECOMPRESSOR_6", Material.PISTON, "&4压缩机", "", "&7用于解压方块", "", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.powerPerSecond(300), LoreBuilder.speed(6), LoreBuilder.powerBuffer(1500), "&4压缩工艺");
    //Compressed Items
    //COmpressed Cobblestone
    public static final SlimefunItemStack JC_COBBLESTONE_1 = new SlimefunItemStack("JC_COBBLESTONE_1",
        Material.COBBLESTONE, "&f压缩圆石", "&f8 圆石", "&f压缩工艺");
    public static final SlimefunItemStack JC_COBBLESTONE_2 = new SlimefunItemStack("JC_COBBLESTONE_2", Material.COBBLESTONE, "&f双重压缩圆石", "&f64圆石", "&f压缩工艺");
    public static final SlimefunItemStack JC_COBBLESTONE_3 = new SlimefunItemStack("JC_COBBLESTONE_3", Material.COBBLESTONE, "&f三重压缩圆石", "&f512圆石", "&f压缩工艺");
    public static final SlimefunItemStack JC_COBBLESTONE_4 = new SlimefunItemStack("JC_COBBLESTONE_4", Material.COBBLESTONE, "&f四重压缩圆石", "&f4096圆石", "&f压缩工艺");
    public static final SlimefunItemStack JC_COBBLESTONE_5 = new SlimefunItemStack("JC_COBBLESTONE_5", Material.COBBLESTONE, "&f五重压缩圆石", "&f32768圆石", "&f压缩工艺");
    public static final SlimefunItemStack JC_COBBLESTONE_6 = new SlimefunItemStack("JC_COBBLESTONE_6", Material.COBBLESTONE, "&f六重压缩圆石", "&f262144圆石", "&f压缩工艺");

    //Compressed 石头
    public static final SlimefunItemStack JC_STONE_1 = new SlimefunItemStack("JC_STONE_1", Material.STONE, "&f压缩石头", "&f8石头", "&f压缩工艺");
    public static final SlimefunItemStack JC_STONE_2 = new SlimefunItemStack("JC_STONE_2", Material.STONE, "&f双重压缩石头", "&f64石头", "&f压缩工艺");
    public static final SlimefunItemStack JC_STONE_3 = new SlimefunItemStack("JC_STONE_3", Material.STONE, "&f三重压缩石头", "&f512石头", "&f压缩工艺");
    public static final SlimefunItemStack JC_STONE_4 = new SlimefunItemStack("JC_STONE_4", Material.STONE, "&f四重压缩石头", "&f4096石头", "&f压缩工艺");
    public static final SlimefunItemStack JC_STONE_5 = new SlimefunItemStack("JC_STONE_5", Material.STONE, "&f五重压缩石头", "&f32768石头", "&f压缩工艺");
    public static final SlimefunItemStack JC_STONE_6 = new SlimefunItemStack("JC_STONE_6", Material.STONE, "&f六重压缩石头", "&f262144 石头", "&f压缩工艺");

    public static final SlimefunItemStack JC_ANDESITE_1 = new SlimefunItemStack("JC_ANDESITE_1", Material.ANDESITE, "&f压缩Andesite", "&f8 Andesite", "&f压缩工艺");
    public static final SlimefunItemStack JC_DIORITE_1 = new SlimefunItemStack("JC_DIORITE_1", Material.DIORITE, "&f压缩Diorite", "&f8 Diorite", "&f压缩工艺");
    public static final SlimefunItemStack JC_GRANITE_1 = new SlimefunItemStack("JC_GRANITE_1", Material.GRANITE, "&f压缩Granite", "&f8 Granite", "&f压缩工艺");
    public static final SlimefunItemStack JC_COBBLED_DEEPSLATE_1 = new SlimefunItemStack("JC_COBBLED_DEEPSLATE_1", Material.COBBLED_DEEPSLATE, "&f压缩Cobbled Deepslate", "&f8 Cobbled Deepslate", "&f压缩工艺");
    public static final SlimefunItemStack JC_DEEPSLATE_1 = new SlimefunItemStack("JC_DEEPSLATE_1", Material.DEEPSLATE, "&f压缩Deepslate", "&f8 Deepslate", "&f压缩工艺");
    public static final SlimefunItemStack JC_FLINT_1 = new SlimefunItemStack("JC_FLINT_1", Material.FLINT, "&f压缩Flint", "&f8 Flint", "&f压缩工艺");
    public static final SlimefunItemStack JC_GRAVEL_1 = new SlimefunItemStack("JC_GRAVEL_1", Material.GRAVEL, "&f压缩Gravel", "&f8 Gravel", "&f压缩工艺");
    public static final SlimefunItemStack JC_DIRT_1 = new SlimefunItemStack("JC_DIRT_1", Material.DIRT, "&f压缩Dirt", "&f8 Dirt", "&f压缩工艺");
    public static final SlimefunItemStack JC_CLAY_BALL_1 = new SlimefunItemStack("JC_CLAY_BALL_1", Material.CLAY_BALL, "&f压缩Clay Ball", "&f8 Clay Ball", "&f压缩工艺");
    public static final SlimefunItemStack JC_CLAY_1 = new SlimefunItemStack("JC_CLAY_1", Material.CLAY, "&f压缩Clay", "&f8 Clay", "&f压缩工艺");
    public static final SlimefunItemStack JC_SNOW_BALL_1 = new SlimefunItemStack("JC_SNOW_BALL_1", Material.SNOWBALL, "&f压缩Snow Ball", "&f8 Snow Ball", "&f压缩工艺");
    public static final SlimefunItemStack JC_SNOW_BLOCK_1 = new SlimefunItemStack("JC_SNOW_BLOCK_1", Material.SNOW_BLOCK, "&f压缩Snow Block", "&f8 Snow Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_OBSIDIAN_1 = new SlimefunItemStack("JC_OBSIDIAN_1", Material.SNOW_BLOCK, "&f压缩Obsidian", "&f8 Obsidian", "&f压缩工艺");
    public static final SlimefunItemStack JC_CRYING_OBSIDIAN_1 = new SlimefunItemStack("JC_CRYING_OBSIDIAN_1", Material.CRYING_OBSIDIAN, "&f压缩Crying Obsidian", "&f8 Crying Obsidian", "&f压缩工艺");
    public static final SlimefunItemStack JC_CHARCOAL_1 = new SlimefunItemStack("JC_CHARCOAL_1", Material.CHARCOAL, "&f压缩Charcoal", "&f8 Charcoal", "&f压缩工艺");
    public static final SlimefunItemStack JC_COAL_1 = new SlimefunItemStack("JC_COAL_1", Material.COAL, "&f压缩Coal", "&f8 Coal", "&f压缩工艺");
    public static final SlimefunItemStack JC_COAL_BLOCK_1 = new SlimefunItemStack("JC_COAL_BLOCK_1", Material.COAL_BLOCK, "&f压缩Coal Block", "&f8 Coal Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_IRON_NUGGET_1 = new SlimefunItemStack("JC_IRON_NUGGET_1", Material.IRON_NUGGET, "&f压缩Iron Nugget", "&f8 Iron Nugget", "&f压缩工艺");
    public static final SlimefunItemStack JC_IRON_INGOT_1 = new SlimefunItemStack("JC_IRON_INGOT_1", Material.IRON_INGOT, "&f压缩Iron Ingot", "&f8 Iron Ingot", "&f压缩工艺");
    public static final SlimefunItemStack JC_IRON_BLOCk_1 = new SlimefunItemStack("JC_IRON_BLOCK_1", Material.IRON_BLOCK, "&f压缩Iron Block", "&f8 Iron Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_GOLD_NUGGET_1 = new SlimefunItemStack("JC_GOLD_NUGGET_1", Material.GOLD_NUGGET, "&f压缩Gold Nugget", "&f8 Gold Nugget", "&f压缩工艺");
    public static final SlimefunItemStack JC_GOLD_INGOT_1 = new SlimefunItemStack("JC_GOLD_INGOT_1", Material.GOLD_INGOT, "&f压缩Gold Ingot", "&f8 Gold Ingot", "&f压缩工艺");
    public static final SlimefunItemStack JC_GOLD_BLOCK_1 = new SlimefunItemStack("JC_GOLD_BLOCK_1", Material.GOLD_BLOCK, "&f压缩Gold Block", "&f8 Gold Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_REDSTONE_1 = new SlimefunItemStack("JC_REDSTONE_1", Material.REDSTONE, "&f压缩Redstone", "&f8 Redstone", "&f压缩工艺");
    public static final SlimefunItemStack JC_REDSTONE_BLOCK_1 = new SlimefunItemStack("JC_REDSTONE_BLOCK_1", Material.REDSTONE_BLOCK, "&f压缩Redstone Block", "&f8 Redstone Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_LAPIS_LAZULI_1 = new SlimefunItemStack("JC_LAPIS_LAZULI_1", Material.LAPIS_LAZULI, "&f压缩Lapis Lazuli", "&f8 Lapis Lazuli", "&f压缩工艺");
    public static final SlimefunItemStack JC_LAPIS_BLOCK_1 = new SlimefunItemStack("JC_LAPIS_BLOCK_1", Material.LAPIS_BLOCK, "&f压缩Lapis Block", "&f8 Lapis Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_DIAMOND_1 = new SlimefunItemStack("JC_DIAMOND_1", Material.DIAMOND, "&f压缩Diamond", "&f8 Diamond", "&f压缩工艺");
    public static final SlimefunItemStack JC_DIAMOND_BLOCK_1 = new SlimefunItemStack("JC_DIAMOND_BLOCK_1", Material.DIAMOND_BLOCK, "&f压缩Diamond Block", "&f8 Diamond Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_EMERALD_1 = new SlimefunItemStack("JC_EMERALD_1", Material.EMERALD, "&f压缩Emerald", "&f8 Emerald", "&f压缩工艺");
    public static final SlimefunItemStack JC_EMERALD_BLOCK_1 = new SlimefunItemStack("JC_EMERALD_BLOCK_1", Material.EMERALD_BLOCK, "&f压缩Emerald Block", "&f8 Emerald Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_AMETHYST_SHARD_1 = new SlimefunItemStack("JC_AMETHYST_SHARD_1", Material.AMETHYST_SHARD, "&f压缩Amethyst Shard", "&f8 Amethyst Shard", "&f压缩工艺");
    public static final SlimefunItemStack JC_AMETHYST_BLOCK_1 = new SlimefunItemStack("JC_AMETHYST_BLOCK_1", Material.AMETHYST_BLOCK, "&f压缩Amethyst Block", "&f8 Amethyst Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_SMALL_AMETHYST_BUD_1 = new SlimefunItemStack("JC_SMALL_AMETHYST_BUD_1", Material.SMALL_AMETHYST_BUD, "&f压缩Small Amethyst Bud", "&f8 Small Amethyst Bud", "&f压缩工艺");
    public static final SlimefunItemStack JC_MEDIUM_AMETHYST_BUD_1 = new SlimefunItemStack("JC_MEDIUM_AMETHYST_BUD_1", Material.MEDIUM_AMETHYST_BUD, "&f压缩Medium Amethyst Bud", "&f8 Medium Amethyst Bud", "&f压缩工艺");
    public static final SlimefunItemStack JC_LARGE_AMETHYST_BUD_1 = new SlimefunItemStack("JC_LARGE_AMETHYST_BUD_1", Material.LARGE_AMETHYST_BUD, "&f压缩Large Amethyst Bud", "&f8 Large Amethyst Bud", "&f压缩工艺");
    public static final SlimefunItemStack JC_AMETHYST_CLUSTER_1 = new SlimefunItemStack("JC_AMETHYST_CLUSTER_1", Material.AMETHYST_CLUSTER, "&f压缩Amethyst Cluster", "&f8 Amethyst Cluster", "&f压缩工艺");
    public static final SlimefunItemStack JC_ANDESITE_2 = new SlimefunItemStack("JC_ANDESITE_2", Material.ANDESITE, "&f双重压缩 Andesite", "&f64 Andesite", "&f压缩工艺");
    public static final SlimefunItemStack JC_DIORITE_2 = new SlimefunItemStack("JC_DIORITE_2", Material.DIORITE, "&f双重压缩 Diorite", "&f64 Diorite", "&f压缩工艺");
    public static final SlimefunItemStack JC_GRANITE_2 = new SlimefunItemStack("JC_GRANITE_2", Material.GRANITE, "&f双重压缩 Granite", "&f64 Granite", "&f压缩工艺");
    public static final SlimefunItemStack JC_COBBLED_DEEPSLATE_2 = new SlimefunItemStack("JC_COBBLED_DEEPSLATE_2", Material.COBBLED_DEEPSLATE, "&f双重压缩 Cobbled Deepslate", "&f64 Cobbled Deepslate", "&f压缩工艺");
    public static final SlimefunItemStack JC_DEEPSLATE_2 = new SlimefunItemStack("JC_DEEPSLATE_2", Material.DEEPSLATE, "&f双重压缩 Deepslate", "&f64 Deepslate", "&f压缩工艺");
    public static final SlimefunItemStack JC_FLINT_2 = new SlimefunItemStack("JC_FLINT_2", Material.FLINT, "&f双重压缩 Flint", "&f64 Flint", "&f压缩工艺");
    public static final SlimefunItemStack JC_GRAVEL_2 = new SlimefunItemStack("JC_GRAVEL_2", Material.GRAVEL, "&f双重压缩 Gravel", "&f64 Gravel", "&f压缩工艺");
    public static final SlimefunItemStack JC_DIRT_2 = new SlimefunItemStack("JC_DIRT_2", Material.DIRT, "&f双重压缩 Dirt", "&f64 Dirt", "&f压缩工艺");
    public static final SlimefunItemStack JC_CLAY_BALL_2 = new SlimefunItemStack("JC_CLAY_BALL_2", Material.CLAY_BALL, "&f双重压缩 Clay Ball", "&f64 Clay Ball", "&f压缩工艺");
    public static final SlimefunItemStack JC_CLAY_2 = new SlimefunItemStack("JC_CLAY_2", Material.CLAY, "&f双重压缩 Clay", "&f64 Clay", "&f压缩工艺");
    public static final SlimefunItemStack JC_SNOW_BALL_2 = new SlimefunItemStack("JC_SNOW_BALL_2", Material.SNOWBALL, "&f双重压缩 Snow Ball", "&f64 Snow Ball", "&f压缩工艺");
    public static final SlimefunItemStack JC_SNOW_BLOCK_2 = new SlimefunItemStack("JC_SNOW_BLOCK_2", Material.SNOW_BLOCK, "&f双重压缩 Snow Block", "&f64 Snow Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_OBSIDIAN_2 = new SlimefunItemStack("JC_OBSIDIAN_2", Material.OBSIDIAN, "&f双重压缩 Obsidian", "&f64 Obsidian", "&f压缩工艺");
    public static final SlimefunItemStack JC_CRYING_OBSIDIAN_2 = new SlimefunItemStack("JC_CRYING_OBSIDIAN_2", Material.CRYING_OBSIDIAN, "&f双重压缩 Crying Obsidian", "&f64 Crying Obsidian", "&f压缩工艺");
    public static final SlimefunItemStack JC_CHARCOAL_2 = new SlimefunItemStack("JC_CHARCOAL_2", Material.CHARCOAL, "&f双重压缩 Charcoal", "&f64 Charcoal", "&f压缩工艺");
    public static final SlimefunItemStack JC_COAL_2 = new SlimefunItemStack("JC_COAL_2", Material.COAL, "&f双重压缩 Coal", "&f64 Coal", "&f压缩工艺");
    public static final SlimefunItemStack JC_COAL_BLOCK_2 = new SlimefunItemStack("JC_COAL_BLOCK_2", Material.COAL_BLOCK, "&f双重压缩 Coal Block", "&f64 Coal Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_IRON_NUGGET_2 = new SlimefunItemStack("JC_IRON_NUGGET_2", Material.IRON_NUGGET, "&f双重压缩 Iron Nugget", "&f64 Iron Nugget", "&f压缩工艺");
    public static final SlimefunItemStack JC_IRON_INGOT_2 = new SlimefunItemStack("JC_IRON_INGOT_2", Material.IRON_INGOT, "&f双重压缩 Iron Ingot", "&f64 Iron Ingot", "&f压缩工艺");
    public static final SlimefunItemStack JC_IRON_BLOCk_2 = new SlimefunItemStack("JC_IRON_BLOCK_2", Material.IRON_BLOCK, "&f双重压缩 Iron Block", "&f64 Iron Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_GOLD_NUGGET_2 = new SlimefunItemStack("JC_GOLD_NUGGET_2", Material.GOLD_NUGGET, "&f双重压缩 Gold Nugget", "&f64 Gold Nugget", "&f压缩工艺");
    public static final SlimefunItemStack JC_GOLD_INGOT_2 = new SlimefunItemStack("JC_GOLD_INGOT_2", Material.GOLD_INGOT, "&f双重压缩 Gold Ingot", "&f64 Gold Ingot", "&f压缩工艺");
    public static final SlimefunItemStack JC_GOLD_BLOCK_2 = new SlimefunItemStack("JC_GOLD_BLOCK_2", Material.GOLD_BLOCK, "&f双重压缩 Gold Block", "&f64 Gold Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_REDSTONE_2 = new SlimefunItemStack("JC_REDSTONE_2", Material.REDSTONE, "&f双重压缩 Redstone", "&f64 Redstone", "&f压缩工艺");
    public static final SlimefunItemStack JC_REDSTONE_BLOCK_2 = new SlimefunItemStack("JC_REDSTONE_BLOCK_2", Material.REDSTONE_BLOCK, "&f双重压缩 Redstone Block", "&f64 Redstone Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_LAPIS_LAZULI_2 = new SlimefunItemStack("JC_LAPIS_LAZULI_2", Material.LAPIS_LAZULI, "&f双重压缩 Lapis Lazuli", "&f64 Lapis Lazuli", "&f压缩工艺");
    public static final SlimefunItemStack JC_LAPIS_BLOCK_2 = new SlimefunItemStack("JC_LAPIS_BLOCK_2", Material.LAPIS_BLOCK, "&f双重压缩 Lapis Block", "&f64 Lapis Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_DIAMOND_2 = new SlimefunItemStack("JC_DIAMOND_2", Material.DIAMOND, "&f双重压缩 Diamond", "&f64 Diamond", "&f压缩工艺");
    public static final SlimefunItemStack JC_DIAMOND_BLOCK_2 = new SlimefunItemStack("JC_DIAMOND_BLOCK_2", Material.DIAMOND_BLOCK, "&f双重压缩 Diamond Block", "&f64 Diamond Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_EMERALD_2 = new SlimefunItemStack("JC_EMERALD_2", Material.EMERALD, "&f双重压缩 Emerald", "&f64 Emerald", "&f压缩工艺");
    public static final SlimefunItemStack JC_EMERALD_BLOCK_2 = new SlimefunItemStack("JC_EMERALD_BLOCK_2", Material.EMERALD_BLOCK, "&f双重压缩 Emerald Block", "&f64 Emerald Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_AMETHYST_SHARD_2 = new SlimefunItemStack("JC_AMETHYST_SHARD_2", Material.AMETHYST_SHARD, "&f双重压缩 Amethyst Shard", "&f64 Amethyst Shard", "&f压缩工艺");
    public static final SlimefunItemStack JC_AMETHYST_BLOCK_2 = new SlimefunItemStack("JC_AMETHYST_BLOCK_2", Material.AMETHYST_BLOCK, "&f双重压缩 Amethyst Block", "&f64 Amethyst Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_SMALL_AMETHYST_BUD_2 = new SlimefunItemStack("JC_SMALL_AMETHYST_BUD_2", Material.SMALL_AMETHYST_BUD, "&f双重压缩 Small Amethyst Bud", "&f64 Small Amethyst Bud", "&f压缩工艺");
    public static final SlimefunItemStack JC_MEDIUM_AMETHYST_BUD_2 = new SlimefunItemStack("JC_MEDIUM_AMETHYST_BUD_2", Material.MEDIUM_AMETHYST_BUD, "&f双重压缩 Medium Amethyst Bud", "&f64 Medium Amethyst Bud", "&f压缩工艺");
    public static final SlimefunItemStack JC_LARGE_AMETHYST_BUD_2 = new SlimefunItemStack("JC_LARGE_AMETHYST_BUD_2", Material.LARGE_AMETHYST_BUD, "&f双重压缩 Large Amethyst Bud", "&f64 Large Amethyst Bud", "&f压缩工艺");
    public static final SlimefunItemStack JC_AMETHYST_CLUSTER_2 = new SlimefunItemStack("JC_AMETHYST_CLUSTER_2", Material.AMETHYST_CLUSTER, "&f双重压缩 Amethyst Cluster", "&f64 Amethyst Cluster", "&f压缩工艺");
    public static final SlimefunItemStack JC_ANDESITE_3 = new SlimefunItemStack("JC_ANDESITE_3", Material.ANDESITE, "&f三重压缩 Andesite", "&f512 Andesite", "&f压缩工艺");
    public static final SlimefunItemStack JC_DIORITE_3 = new SlimefunItemStack("JC_DIORITE_3", Material.DIORITE, "&f三重压缩 Diorite", "&f512 Diorite", "&f压缩工艺");
    public static final SlimefunItemStack JC_GRANITE_3 = new SlimefunItemStack("JC_GRANITE_3", Material.GRANITE, "&f三重压缩 Granite", "&f512 Granite", "&f压缩工艺");
    public static final SlimefunItemStack JC_COBBLED_DEEPSLATE_3 = new SlimefunItemStack("JC_COBBLED_DEEPSLATE_3", Material.COBBLED_DEEPSLATE, "&f三重压缩 Cobbled Deepslate", "&f512 Cobbled Deepslate", "&f压缩工艺");
    public static final SlimefunItemStack JC_DEEPSLATE_3 = new SlimefunItemStack("JC_DEEPSLATE_3", Material.DEEPSLATE, "&f三重压缩 Deepslate", "&f512 Deepslate", "&f压缩工艺");
    public static final SlimefunItemStack JC_FLINT_3 = new SlimefunItemStack("JC_FLINT_3", Material.FLINT, "&f三重压缩 Flint", "&f512 Flint", "&f压缩工艺");
    public static final SlimefunItemStack JC_GRAVEL_3 = new SlimefunItemStack("JC_GRAVEL_3", Material.GRAVEL, "&f三重压缩 Gravel", "&f512 Gravel", "&f压缩工艺");
    public static final SlimefunItemStack JC_DIRT_3 = new SlimefunItemStack("JC_DIRT_3", Material.DIRT, "&f三重压缩 Dirt", "&f512 Dirt", "&f压缩工艺");
    public static final SlimefunItemStack JC_CLAY_BALL_3 = new SlimefunItemStack("JC_CLAY_BALL_3", Material.CLAY_BALL, "&f三重压缩 Clay Ball", "&f512 Clay Ball", "&f压缩工艺");
    public static final SlimefunItemStack JC_CLAY_3 = new SlimefunItemStack("JC_CLAY_3", Material.CLAY, "&f三重压缩 Clay", "&f512 Clay", "&f压缩工艺");
    public static final SlimefunItemStack JC_SNOW_BALL_3 = new SlimefunItemStack("JC_SNOW_BALL_3", Material.SNOWBALL, "&f三重压缩 Snow Ball", "&f512 Snow Ball", "&f压缩工艺");
    public static final SlimefunItemStack JC_SNOW_BLOCK_3 = new SlimefunItemStack("JC_SNOW_BLOCK_3", Material.SNOW_BLOCK, "&f三重压缩 Snow Block", "&f512 Snow Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_OBSIDIAN_3 = new SlimefunItemStack("JC_OBSIDIAN_3", Material.OBSIDIAN, "&f三重压缩 Obsidian", "&f512 Obsidian", "&f压缩工艺");
    public static final SlimefunItemStack JC_CRYING_OBSIDIAN_3 = new SlimefunItemStack("JC_CRYING_OBSIDIAN_3", Material.CRYING_OBSIDIAN, "&f三重压缩 Crying Obsidian", "&f512 Crying Obsidian", "&f压缩工艺");
    public static final SlimefunItemStack JC_CHARCOAL_3 = new SlimefunItemStack("JC_CHARCOAL_3", Material.CHARCOAL, "&f三重压缩 Charcoal", "&f512 Charcoal", "&f压缩工艺");
    public static final SlimefunItemStack JC_COAL_3 = new SlimefunItemStack("JC_COAL_3", Material.COAL, "&f三重压缩 Coal", "&f512 Coal", "&f压缩工艺");
    public static final SlimefunItemStack JC_COAL_BLOCK_3 = new SlimefunItemStack("JC_COAL_BLOCK_3", Material.COAL_BLOCK, "&f三重压缩 Coal Block", "&f512 Coal Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_IRON_NUGGET_3 = new SlimefunItemStack("JC_IRON_NUGGET_3", Material.IRON_NUGGET, "&f三重压缩 Iron Nugget", "&f512 Iron Nugget", "&f压缩工艺");
    public static final SlimefunItemStack JC_IRON_INGOT_3 = new SlimefunItemStack("JC_IRON_INGOT_3", Material.IRON_INGOT, "&f三重压缩 Iron Ingot", "&f512 Iron Ingot", "&f压缩工艺");
    public static final SlimefunItemStack JC_IRON_BLOCk_3 = new SlimefunItemStack("JC_IRON_BLOCK_3", Material.IRON_BLOCK, "&f三重压缩 Iron Block", "&f512 Iron Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_GOLD_NUGGET_3 = new SlimefunItemStack("JC_GOLD_NUGGET_3", Material.GOLD_NUGGET, "&f三重压缩 Gold Nugget", "&f512 Gold Nugget", "&f压缩工艺");
    public static final SlimefunItemStack JC_GOLD_INGOT_3 = new SlimefunItemStack("JC_GOLD_INGOT_3", Material.GOLD_INGOT, "&f三重压缩 Gold Ingot", "&f512 Gold Ingot", "&f压缩工艺");
    public static final SlimefunItemStack JC_GOLD_BLOCK_3 = new SlimefunItemStack("JC_GOLD_BLOCK_3", Material.GOLD_BLOCK, "&f三重压缩 Gold Block", "&f512 Gold Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_REDSTONE_3 = new SlimefunItemStack("JC_REDSTONE_3", Material.REDSTONE, "&f三重压缩 Redstone", "&f512 Redstone", "&f压缩工艺");
    public static final SlimefunItemStack JC_REDSTONE_BLOCK_3 = new SlimefunItemStack("JC_REDSTONE_BLOCK_3", Material.REDSTONE_BLOCK, "&f三重压缩 Redstone Block", "&f512 Redstone Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_LAPIS_LAZULI_3 = new SlimefunItemStack("JC_LAPIS_LAZULI_3", Material.LAPIS_LAZULI, "&f三重压缩 Lapis Lazuli", "&f512 Lapis Lazuli", "&f压缩工艺");
    public static final SlimefunItemStack JC_LAPIS_BLOCK_3 = new SlimefunItemStack("JC_LAPIS_BLOCK_3", Material.LAPIS_BLOCK, "&f三重压缩 Lapis Block", "&f512 Lapis Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_DIAMOND_3 = new SlimefunItemStack("JC_DIAMOND_3", Material.DIAMOND, "&f三重压缩 Diamond", "&f512 Diamond", "&f压缩工艺");
    public static final SlimefunItemStack JC_DIAMOND_BLOCK_3 = new SlimefunItemStack("JC_DIAMOND_BLOCK_3", Material.DIAMOND_BLOCK, "&f三重压缩 Diamond Block", "&f512 Diamond Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_EMERALD_3 = new SlimefunItemStack("JC_EMERALD_3", Material.EMERALD, "&f三重压缩 Emerald", "&f512 Emerald", "&f压缩工艺");
    public static final SlimefunItemStack JC_EMERALD_BLOCK_3 = new SlimefunItemStack("JC_EMERALD_BLOCK_3", Material.EMERALD_BLOCK, "&f三重压缩 Emerald Block", "&f512 Emerald Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_AMETHYST_SHARD_3 = new SlimefunItemStack("JC_AMETHYST_SHARD_3", Material.AMETHYST_SHARD, "&f三重压缩 Amethyst Shard", "&f512 Amethyst Shard", "&f压缩工艺");
    public static final SlimefunItemStack JC_AMETHYST_BLOCK_3 = new SlimefunItemStack("JC_AMETHYST_BLOCK_3", Material.AMETHYST_BLOCK, "&f三重压缩 Amethyst Block", "&f512 Amethyst Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_SMALL_AMETHYST_BUD_3 = new SlimefunItemStack("JC_SMALL_AMETHYST_BUD_3", Material.SMALL_AMETHYST_BUD, "&f三重压缩 Small Amethyst Bud", "&f512 Small Amethyst Bud", "&f压缩工艺");
    public static final SlimefunItemStack JC_MEDIUM_AMETHYST_BUD_3 = new SlimefunItemStack("JC_MEDIUM_AMETHYST_BUD_3", Material.MEDIUM_AMETHYST_BUD, "&f三重压缩 Medium Amethyst Bud", "&f512 Medium Amethyst Bud", "&f压缩工艺");
    public static final SlimefunItemStack JC_LARGE_AMETHYST_BUD_3 = new SlimefunItemStack("JC_LARGE_AMETHYST_BUD_3", Material.LARGE_AMETHYST_BUD, "&f三重压缩 Large Amethyst Bud", "&f512 Large Amethyst Bud", "&f压缩工艺");
    public static final SlimefunItemStack JC_AMETHYST_CLUSTER_3 = new SlimefunItemStack("JC_AMETHYST_CLUSTER_3", Material.AMETHYST_CLUSTER, "&f三重压缩 Amethyst Cluster", "&f512 Amethyst Cluster", "&f压缩工艺");
    public static final SlimefunItemStack JC_ANDESITE_4 = new SlimefunItemStack("JC_ANDESITE_4", Material.ANDESITE, "&f四重压缩 Andesite", "&f4096 Andesite", "&f压缩工艺");
    public static final SlimefunItemStack JC_DIORITE_4 = new SlimefunItemStack("JC_DIORITE_4", Material.DIORITE, "&f四重压缩 Diorite", "&f4096 Diorite", "&f压缩工艺");
    public static final SlimefunItemStack JC_GRANITE_4 = new SlimefunItemStack("JC_GRANITE_4", Material.GRANITE, "&f四重压缩 Granite", "&f4096 Granite", "&f压缩工艺");
    public static final SlimefunItemStack JC_COBBLED_DEEPSLATE_4 = new SlimefunItemStack("JC_COBBLED_DEEPSLATE_4", Material.COBBLED_DEEPSLATE, "&f四重压缩 Cobbled Deepslate", "&f4096 Cobbled Deepslate", "&f压缩工艺");
    public static final SlimefunItemStack JC_DEEPSLATE_4 = new SlimefunItemStack("JC_DEEPSLATE_4", Material.DEEPSLATE, "&f四重压缩 Deepslate", "&f4096 Deepslate", "&f压缩工艺");
    public static final SlimefunItemStack JC_FLINT_4 = new SlimefunItemStack("JC_FLINT_4", Material.FLINT, "&f四重压缩 Flint", "&f4096 Flint", "&f压缩工艺");
    public static final SlimefunItemStack JC_GRAVEL_4 = new SlimefunItemStack("JC_GRAVEL_4", Material.GRAVEL, "&f四重压缩 Gravel", "&f4096 Gravel", "&f压缩工艺");
    public static final SlimefunItemStack JC_DIRT_4 = new SlimefunItemStack("JC_DIRT_4", Material.DIRT, "&f四重压缩 Dirt", "&f4096 Dirt", "&f压缩工艺");
    public static final SlimefunItemStack JC_CLAY_BALL_4 = new SlimefunItemStack("JC_CLAY_BALL_4", Material.CLAY_BALL, "&f四重压缩 Clay Ball", "&f4096 Clay Ball", "&f压缩工艺");
    public static final SlimefunItemStack JC_CLAY_4 = new SlimefunItemStack("JC_CLAY_4", Material.CLAY, "&f四重压缩 Clay", "&f4096 Clay", "&f压缩工艺");
    public static final SlimefunItemStack JC_SNOW_BALL_4 = new SlimefunItemStack("JC_SNOW_BALL_4", Material.SNOWBALL, "&f四重压缩 Snow Ball", "&f4096 Snow Ball", "&f压缩工艺");
    public static final SlimefunItemStack JC_SNOW_BLOCK_4 = new SlimefunItemStack("JC_SNOW_BLOCK_4", Material.SNOW_BLOCK, "&f四重压缩 Snow Block", "&f4096 Snow Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_OBSIDIAN_4 = new SlimefunItemStack("JC_OBSIDIAN_4", Material.OBSIDIAN, "&f四重压缩 Obsidian", "&f4096 Obsidian", "&f压缩工艺");
    public static final SlimefunItemStack JC_CRYING_OBSIDIAN_4 = new SlimefunItemStack("JC_CRYING_OBSIDIAN_4", Material.CRYING_OBSIDIAN, "&f四重压缩 Crying Obsidian", "&f4096 Crying Obsidian", "&f压缩工艺");
    public static final SlimefunItemStack JC_CHARCOAL_4 = new SlimefunItemStack("JC_CHARCOAL_4", Material.CHARCOAL, "&f四重压缩 Charcoal", "&f4096 Charcoal", "&f压缩工艺");
    public static final SlimefunItemStack JC_COAL_4 = new SlimefunItemStack("JC_COAL_4", Material.COAL, "&f四重压缩 Coal", "&f4096 Coal", "&f压缩工艺");
    public static final SlimefunItemStack JC_COAL_BLOCK_4 = new SlimefunItemStack("JC_COAL_BLOCK_4", Material.COAL_BLOCK, "&f四重压缩 Coal Block", "&f4096 Coal Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_IRON_NUGGET_4 = new SlimefunItemStack("JC_IRON_NUGGET_4", Material.IRON_NUGGET, "&f四重压缩 Iron Nugget", "&f4096 Iron Nugget", "&f压缩工艺");
    public static final SlimefunItemStack JC_IRON_INGOT_4 = new SlimefunItemStack("JC_IRON_INGOT_4", Material.IRON_INGOT, "&f四重压缩 Iron Ingot", "&f4096 Iron Ingot", "&f压缩工艺");
    public static final SlimefunItemStack JC_IRON_BLOCk_4 = new SlimefunItemStack("JC_IRON_BLOCK_4", Material.IRON_BLOCK, "&f四重压缩 Iron Block", "&f4096 Iron Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_GOLD_NUGGET_4 = new SlimefunItemStack("JC_GOLD_NUGGET_4", Material.GOLD_NUGGET, "&f四重压缩 Gold Nugget", "&f4096 Gold Nugget", "&f压缩工艺");
    public static final SlimefunItemStack JC_GOLD_INGOT_4 = new SlimefunItemStack("JC_GOLD_INGOT_4", Material.GOLD_INGOT, "&f四重压缩 Gold Ingot", "&f4096 Gold Ingot", "&f压缩工艺");
    public static final SlimefunItemStack JC_GOLD_BLOCK_4 = new SlimefunItemStack("JC_GOLD_BLOCK_4", Material.GOLD_BLOCK, "&f四重压缩 Gold Block", "&f4096 Gold Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_REDSTONE_4 = new SlimefunItemStack("JC_REDSTONE_4", Material.REDSTONE, "&f四重压缩 Redstone", "&f4096 Redstone", "&f压缩工艺");
    public static final SlimefunItemStack JC_REDSTONE_BLOCK_4 = new SlimefunItemStack("JC_REDSTONE_BLOCK_4", Material.REDSTONE_BLOCK, "&f四重压缩 Redstone Block", "&f4096 Redstone Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_LAPIS_LAZULI_4 = new SlimefunItemStack("JC_LAPIS_LAZULI_4", Material.LAPIS_LAZULI, "&f四重压缩 Lapis Lazuli", "&f4096 Lapis Lazuli", "&f压缩工艺");
    public static final SlimefunItemStack JC_LAPIS_BLOCK_4 = new SlimefunItemStack("JC_LAPIS_BLOCK_4", Material.LAPIS_BLOCK, "&f四重压缩 Lapis Block", "&f4096 Lapis Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_DIAMOND_4 = new SlimefunItemStack("JC_DIAMOND_4", Material.DIAMOND, "&f四重压缩 Diamond", "&f4096 Diamond", "&f压缩工艺");
    public static final SlimefunItemStack JC_DIAMOND_BLOCK_4 = new SlimefunItemStack("JC_DIAMOND_BLOCK_4", Material.DIAMOND_BLOCK, "&f四重压缩 Diamond Block", "&f4096 Diamond Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_EMERALD_4 = new SlimefunItemStack("JC_EMERALD_4", Material.EMERALD, "&f四重压缩 Emerald", "&f4096 Emerald", "&f压缩工艺");
    public static final SlimefunItemStack JC_EMERALD_BLOCK_4 = new SlimefunItemStack("JC_EMERALD_BLOCK_4", Material.EMERALD_BLOCK, "&f四重压缩 Emerald Block", "&f4096 Emerald Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_AMETHYST_SHARD_4 = new SlimefunItemStack("JC_AMETHYST_SHARD_4", Material.AMETHYST_SHARD, "&f四重压缩 Amethyst Shard", "&f4096 Amethyst Shard", "&f压缩工艺");
    public static final SlimefunItemStack JC_AMETHYST_BLOCK_4 = new SlimefunItemStack("JC_AMETHYST_BLOCK_4", Material.AMETHYST_BLOCK, "&f四重压缩 Amethyst Block", "&f4096 Amethyst Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_SMALL_AMETHYST_BUD_4 = new SlimefunItemStack("JC_SMALL_AMETHYST_BUD_4", Material.SMALL_AMETHYST_BUD, "&f四重压缩 Small Amethyst Bud", "&f4096 Small Amethyst Bud", "&f压缩工艺");
    public static final SlimefunItemStack JC_MEDIUM_AMETHYST_BUD_4 = new SlimefunItemStack("JC_MEDIUM_AMETHYST_BUD_4", Material.MEDIUM_AMETHYST_BUD, "&f四重压缩 Medium Amethyst Bud", "&f4096 Medium Amethyst Bud", "&f压缩工艺");
    public static final SlimefunItemStack JC_LARGE_AMETHYST_BUD_4 = new SlimefunItemStack("JC_LARGE_AMETHYST_BUD_4", Material.LARGE_AMETHYST_BUD, "&f四重压缩 Large Amethyst Bud", "&f4096 Large Amethyst Bud", "&f压缩工艺");
    public static final SlimefunItemStack JC_AMETHYST_CLUSTER_4 = new SlimefunItemStack("JC_AMETHYST_CLUSTER_4", Material.AMETHYST_CLUSTER, "&f四重压缩 Amethyst Cluster", "&f4096 Amethyst Cluster", "&f压缩工艺");
    public static final SlimefunItemStack JC_ANDESITE_5 = new SlimefunItemStack("JC_ANDESITE_5", Material.ANDESITE, "&f五重压缩 Andesite", "&f32768 Andesite", "&f压缩工艺");
    public static final SlimefunItemStack JC_DIORITE_5 = new SlimefunItemStack("JC_DIORITE_5", Material.DIORITE, "&f五重压缩 Diorite", "&f32768 Diorite", "&f压缩工艺");
    public static final SlimefunItemStack JC_GRANITE_5 = new SlimefunItemStack("JC_GRANITE_5", Material.GRANITE, "&f五重压缩 Granite", "&f32768 Granite", "&f压缩工艺");
    public static final SlimefunItemStack JC_COBBLED_DEEPSLATE_5 = new SlimefunItemStack("JC_COBBLED_DEEPSLATE_5", Material.COBBLED_DEEPSLATE, "&f五重压缩 Cobbled Deepslate", "&f32768 Cobbled Deepslate", "&f压缩工艺");
    public static final SlimefunItemStack JC_DEEPSLATE_5 = new SlimefunItemStack("JC_DEEPSLATE_5", Material.DEEPSLATE, "&f五重压缩 Deepslate", "&f32768 Deepslate", "&f压缩工艺");
    public static final SlimefunItemStack JC_FLINT_5 = new SlimefunItemStack("JC_FLINT_5", Material.FLINT, "&f五重压缩 Flint", "&f32768 Flint", "&f压缩工艺");
    public static final SlimefunItemStack JC_GRAVEL_5 = new SlimefunItemStack("JC_GRAVEL_5", Material.GRAVEL, "&f五重压缩 Gravel", "&f32768 Gravel", "&f压缩工艺");
    public static final SlimefunItemStack JC_DIRT_5 = new SlimefunItemStack("JC_DIRT_5", Material.DIRT, "&f五重压缩 Dirt", "&f32768 Dirt", "&f压缩工艺");
    public static final SlimefunItemStack JC_CLAY_BALL_5 = new SlimefunItemStack("JC_CLAY_BALL_5", Material.CLAY_BALL, "&f五重压缩 Clay Ball", "&f32768 Clay Ball", "&f压缩工艺");
    public static final SlimefunItemStack JC_CLAY_5 = new SlimefunItemStack("JC_CLAY_5", Material.CLAY, "&f五重压缩 Clay", "&f32768 Clay", "&f压缩工艺");
    public static final SlimefunItemStack JC_SNOW_BALL_5 = new SlimefunItemStack("JC_SNOW_BALL_5", Material.SNOWBALL, "&f五重压缩 Snow Ball", "&f32768 Snow Ball", "&f压缩工艺");
    public static final SlimefunItemStack JC_SNOW_BLOCK_5 = new SlimefunItemStack("JC_SNOW_BLOCK_5", Material.SNOW_BLOCK, "&f五重压缩 Snow Block", "&f32768 Snow Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_OBSIDIAN_5 = new SlimefunItemStack("JC_OBSIDIAN_5", Material.OBSIDIAN, "&f五重压缩 Obsidian", "&f32768 Obsidian", "&f压缩工艺");
    public static final SlimefunItemStack JC_CRYING_OBSIDIAN_5 = new SlimefunItemStack("JC_CRYING_OBSIDIAN_5", Material.CRYING_OBSIDIAN, "&f五重压缩 Crying Obsidian", "&f32768 Crying Obsidian", "&f压缩工艺");
    public static final SlimefunItemStack JC_CHARCOAL_5 = new SlimefunItemStack("JC_CHARCOAL_5", Material.CHARCOAL, "&f五重压缩 Charcoal", "&f32768 Charcoal", "&f压缩工艺");
    public static final SlimefunItemStack JC_COAL_5 = new SlimefunItemStack("JC_COAL_5", Material.COAL, "&f五重压缩 Coal", "&f32768 Coal", "&f压缩工艺");
    public static final SlimefunItemStack JC_COAL_BLOCK_5 = new SlimefunItemStack("JC_COAL_BLOCK_5", Material.COAL_BLOCK, "&f五重压缩 Coal Block", "&f32768 Coal Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_IRON_NUGGET_5 = new SlimefunItemStack("JC_IRON_NUGGET_5", Material.IRON_NUGGET, "&f五重压缩 Iron Nugget", "&f32768 Iron Nugget", "&f压缩工艺");
    public static final SlimefunItemStack JC_IRON_INGOT_5 = new SlimefunItemStack("JC_IRON_INGOT_5", Material.IRON_INGOT, "&f五重压缩 Iron Ingot", "&f32768 Iron Ingot", "&f压缩工艺");
    public static final SlimefunItemStack JC_IRON_BLOCk_5 = new SlimefunItemStack("JC_IRON_BLOCK_5", Material.IRON_BLOCK, "&f五重压缩 Iron Block", "&f32768 Iron Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_GOLD_NUGGET_5 = new SlimefunItemStack("JC_GOLD_NUGGET_5", Material.GOLD_NUGGET, "&f五重压缩 Gold Nugget", "&f32768 Gold Nugget", "&f压缩工艺");
    public static final SlimefunItemStack JC_GOLD_INGOT_5 = new SlimefunItemStack("JC_GOLD_INGOT_5", Material.GOLD_INGOT, "&f五重压缩 Gold Ingot", "&f32768 Gold Ingot", "&f压缩工艺");
    public static final SlimefunItemStack JC_GOLD_BLOCK_5 = new SlimefunItemStack("JC_GOLD_BLOCK_5", Material.GOLD_BLOCK, "&f五重压缩 Gold Block", "&f32768 Gold Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_REDSTONE_5 = new SlimefunItemStack("JC_REDSTONE_5", Material.REDSTONE, "&f五重压缩 Redstone", "&f32768 Redstone", "&f压缩工艺");
    public static final SlimefunItemStack JC_REDSTONE_BLOCK_5 = new SlimefunItemStack("JC_REDSTONE_BLOCK_5", Material.REDSTONE_BLOCK, "&f五重压缩 Redstone Block", "&f32768 Redstone Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_LAPIS_LAZULI_5 = new SlimefunItemStack("JC_LAPIS_LAZULI_5", Material.LAPIS_LAZULI, "&f五重压缩 Lapis Lazuli", "&f32768 Lapis Lazuli", "&f压缩工艺");
    public static final SlimefunItemStack JC_LAPIS_BLOCK_5 = new SlimefunItemStack("JC_LAPIS_BLOCK_5", Material.LAPIS_BLOCK, "&f五重压缩 Lapis Block", "&f32768 Lapis Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_DIAMOND_5 = new SlimefunItemStack("JC_DIAMOND_5", Material.DIAMOND, "&f五重压缩 Diamond", "&f32768 Diamond", "&f压缩工艺");
    public static final SlimefunItemStack JC_DIAMOND_BLOCK_5 = new SlimefunItemStack("JC_DIAMOND_BLOCK_5", Material.DIAMOND_BLOCK, "&f五重压缩 Diamond Block", "&f32768 Diamond Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_EMERALD_5 = new SlimefunItemStack("JC_EMERALD_5", Material.EMERALD, "&f五重压缩 Emerald", "&f32768 Emerald", "&f压缩工艺");
    public static final SlimefunItemStack JC_EMERALD_BLOCK_5 = new SlimefunItemStack("JC_EMERALD_BLOCK_5", Material.EMERALD_BLOCK, "&f五重压缩 Emerald Block", "&f32768 Emerald Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_AMETHYST_SHARD_5 = new SlimefunItemStack("JC_AMETHYST_SHARD_5", Material.AMETHYST_SHARD, "&f五重压缩 Amethyst Shard", "&f32768 Amethyst Shard", "&f压缩工艺");
    public static final SlimefunItemStack JC_AMETHYST_BLOCK_5 = new SlimefunItemStack("JC_AMETHYST_BLOCK_5", Material.AMETHYST_BLOCK, "&f五重压缩 Amethyst Block", "&f32768 Amethyst Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_SMALL_AMETHYST_BUD_5 = new SlimefunItemStack("JC_SMALL_AMETHYST_BUD_5", Material.SMALL_AMETHYST_BUD, "&f五重压缩 Small Amethyst Bud", "&f32768 Small Amethyst Bud", "&f压缩工艺");
    public static final SlimefunItemStack JC_MEDIUM_AMETHYST_BUD_5 = new SlimefunItemStack("JC_MEDIUM_AMETHYST_BUD_5", Material.MEDIUM_AMETHYST_BUD, "&f五重压缩 Medium Amethyst Bud", "&f32768 Medium Amethyst Bud", "&f压缩工艺");
    public static final SlimefunItemStack JC_LARGE_AMETHYST_BUD_5 = new SlimefunItemStack("JC_LARGE_AMETHYST_BUD_5", Material.LARGE_AMETHYST_BUD, "&f五重压缩 Large Amethyst Bud", "&f32768 Large Amethyst Bud", "&f压缩工艺");
    public static final SlimefunItemStack JC_AMETHYST_CLUSTER_5 = new SlimefunItemStack("JC_AMETHYST_CLUSTER_5", Material.AMETHYST_CLUSTER, "&f五重压缩 Amethyst Cluster", "&f32768 Amethyst Cluster", "&f压缩工艺");
    public static final SlimefunItemStack JC_ANDESITE_6 = new SlimefunItemStack("JC_ANDESITE_6", Material.ANDESITE, "&f六重压缩 Andesite", "&f262144 Andesite", "&f压缩工艺");
    public static final SlimefunItemStack JC_DIORITE_6 = new SlimefunItemStack("JC_DIORITE_6", Material.DIORITE, "&f六重压缩 Diorite", "&f262144 Diorite", "&f压缩工艺");
    public static final SlimefunItemStack JC_GRANITE_6 = new SlimefunItemStack("JC_GRANITE_6", Material.GRANITE, "&f六重压缩 Granite", "&f262144 Granite", "&f压缩工艺");
    public static final SlimefunItemStack JC_COBBLED_DEEPSLATE_6 = new SlimefunItemStack("JC_COBBLED_DEEPSLATE_6", Material.COBBLED_DEEPSLATE, "&f六重压缩 Cobbled Deepslate", "&f262144 Cobbled Deepslate", "&f压缩工艺");
    public static final SlimefunItemStack JC_DEEPSLATE_6 = new SlimefunItemStack("JC_DEEPSLATE_6", Material.DEEPSLATE, "&f六重压缩 Deepslate", "&f262144 Deepslate", "&f压缩工艺");
    public static final SlimefunItemStack JC_FLINT_6 = new SlimefunItemStack("JC_FLINT_6", Material.FLINT, "&f六重压缩 Flint", "&f262144 Flint", "&f压缩工艺");
    public static final SlimefunItemStack JC_GRAVEL_6 = new SlimefunItemStack("JC_GRAVEL_6", Material.GRAVEL, "&f六重压缩 Gravel", "&f262144 Gravel", "&f压缩工艺");
    public static final SlimefunItemStack JC_DIRT_6 = new SlimefunItemStack("JC_DIRT_6", Material.DIRT, "&f六重压缩 Dirt", "&f262144 Dirt", "&f压缩工艺");
    public static final SlimefunItemStack JC_CLAY_BALL_6 = new SlimefunItemStack("JC_CLAY_BALL_6", Material.CLAY_BALL, "&f六重压缩 Clay Ball", "&f262144 Clay Ball", "&f压缩工艺");
    public static final SlimefunItemStack JC_CLAY_6 = new SlimefunItemStack("JC_CLAY_6", Material.CLAY, "&f六重压缩 Clay", "&f262144 Clay", "&f压缩工艺");
    public static final SlimefunItemStack JC_SNOW_BALL_6 = new SlimefunItemStack("JC_SNOW_BALL_6", Material.SNOWBALL, "&f六重压缩 Snow Ball", "&f262144 Snow Ball", "&f压缩工艺");
    public static final SlimefunItemStack JC_SNOW_BLOCK_6 = new SlimefunItemStack("JC_SNOW_BLOCK_6", Material.SNOW_BLOCK, "&f六重压缩 Snow Block", "&f262144 Snow Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_OBSIDIAN_6 = new SlimefunItemStack("JC_OBSIDIAN_6", Material.OBSIDIAN, "&f六重压缩 Obsidian", "&f262144 Obsidian", "&f压缩工艺");
    public static final SlimefunItemStack JC_CRYING_OBSIDIAN_6 = new SlimefunItemStack("JC_CRYING_OBSIDIAN", Material.CRYING_OBSIDIAN, "&f六重压缩 Crying Obsidian", "&f262144 Crying Obsidian", "&f压缩工艺");
    public static final SlimefunItemStack JC_CHARCOAL_6 = new SlimefunItemStack("JC_CHARCOAL_6", Material.CHARCOAL, "&f六重压缩 Charcoal", "&f262144 Charcoal", "&f压缩工艺");
    public static final SlimefunItemStack JC_COAL_6 = new SlimefunItemStack("JC_COAL_6", Material.COAL, "&f六重压缩 Coal", "&f262144 Coal", "&f压缩工艺");
    public static final SlimefunItemStack JC_COAL_BLOCK_6 = new SlimefunItemStack("JC_COAL_BLOCK_6", Material.COAL_BLOCK, "&f六重压缩 Coal Block", "&f262144 Coal Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_IRON_NUGGET_6 = new SlimefunItemStack("JC_IRON_NUGGET_6", Material.IRON_NUGGET, "&f六重压缩 Iron Nugget", "&f262144 Iron Nugget", "&f压缩工艺");
    public static final SlimefunItemStack JC_IRON_INGOT_6 = new SlimefunItemStack("JC_IRON_INGOT_6", Material.IRON_INGOT, "&f六重压缩 Iron Ingot", "&f262144 Iron Ingot", "&f压缩工艺");
    public static final SlimefunItemStack JC_IRON_BLOCk_6 = new SlimefunItemStack("JC_IRON_BLOCK_6", Material.IRON_BLOCK, "&f六重压缩 Iron Block", "&f262144 Iron Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_GOLD_NUGGET_6 = new SlimefunItemStack("JC_GOLD_NUGGET_6", Material.GOLD_NUGGET, "&f六重压缩 Gold Nugget", "&f262144 Gold Nugget", "&f压缩工艺");
    public static final SlimefunItemStack JC_GOLD_INGOT_6 = new SlimefunItemStack("JC_GOLD_INGOT_6", Material.GOLD_INGOT, "&f六重压缩 Gold Ingot", "&f262144 Gold Ingot", "&f压缩工艺");
    public static final SlimefunItemStack JC_GOLD_BLOCK_6 = new SlimefunItemStack("JC_GOLD_BLOCK_6", Material.GOLD_BLOCK, "&f六重压缩 Gold Block", "&f262144 Gold Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_REDSTONE_6 = new SlimefunItemStack("JC_REDSTONE_6", Material.REDSTONE, "&f六重压缩 Redstone", "&f262144 Redstone", "&f压缩工艺");
    public static final SlimefunItemStack JC_REDSTONE_BLOCK_6 = new SlimefunItemStack("JC_REDSTONE_BLOCK_6", Material.REDSTONE_BLOCK, "&f六重压缩 Redstone Block", "&f262144 Redstone Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_LAPIS_LAZULI_6 = new SlimefunItemStack("JC_LAPIS_LAZULI_6", Material.LAPIS_LAZULI, "&f六重压缩 Lapis Lazuli", "&f262144 Lapis Lazuli", "&f压缩工艺");
    public static final SlimefunItemStack JC_LAPIS_BLOCK_6 = new SlimefunItemStack("JC_LAPIS_BLOCK_6", Material.LAPIS_BLOCK, "&f六重压缩 Lapis Block", "&f262144 Lapis Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_DIAMOND_6 = new SlimefunItemStack("JC_DIAMOND_6", Material.DIAMOND, "&f六重压缩 Diamond", "&f262144 Diamond", "&f压缩工艺");
    public static final SlimefunItemStack JC_DIAMOND_BLOCK_6 = new SlimefunItemStack("JC_DIAMOND_BLOCK_6", Material.DIAMOND_BLOCK, "&f六重压缩 Diamond Block", "&f262144 Diamond Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_EMERALD_6 = new SlimefunItemStack("JC_EMERALD_6", Material.EMERALD, "&f六重压缩 Emerald", "&f262144 Emerald", "&f压缩工艺");
    public static final SlimefunItemStack JC_EMERALD_BLOCK_6 = new SlimefunItemStack("JC_EMERALD_BLOCK_6", Material.EMERALD_BLOCK, "&f六重压缩 Emerald Block", "&f262144 Emerald Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_AMETHYST_SHARD_6 = new SlimefunItemStack("JC_AMETHYST_SHARD_6", Material.AMETHYST_SHARD, "&f六重压缩 Amethyst Shard", "&f262144 Amethyst Shard", "&f压缩工艺");
    public static final SlimefunItemStack JC_AMETHYST_BLOCK_6 = new SlimefunItemStack("JC_AMETHYST_BLOCK_6", Material.AMETHYST_BLOCK, "&f六重压缩 Amethyst Block", "&f262144 Amethyst Block", "&f压缩工艺");
    public static final SlimefunItemStack JC_SMALL_AMETHYST_BUD_6 = new SlimefunItemStack("JC_SMALL_AMETHYST_BUD_6", Material.SMALL_AMETHYST_BUD, "&f六重压缩 Small Amethyst Bud", "&f262144 Small Amethyst Bud", "&f压缩工艺");
    public static final SlimefunItemStack JC_MEDIUM_AMETHYST_BUD_6 = new SlimefunItemStack("JC_MEDIUM_AMETHYST_BUD_6", Material.MEDIUM_AMETHYST_BUD, "&f六重压缩 Medium Amethyst Bud", "&f262144 Medium Amethyst Bud", "&f压缩工艺");
    public static final SlimefunItemStack JC_LARGE_AMETHYST_BUD_6 = new SlimefunItemStack("JC_LARGE_AMETHYST_BUD_6", Material.LARGE_AMETHYST_BUD, "&f六重压缩 Large Amethyst Bud", "&f262144 Large Amethyst Bud", "&f压缩工艺");
    public static final SlimefunItemStack JC_AMETHYST_CLUSTER_6 = new SlimefunItemStack("JC_AMETHYST_CLUSTER_6", Material.AMETHYST_CLUSTER, "&f六重压缩 Amethyst Cluster", "&f262144 Amethyst Cluster", "&f压缩工艺");



    //CC2

    public static final SlimefunItemStack JC_OAK_LOG_1 = new SlimefunItemStack("JC_OAK_LOG_1", Material.OAK_LOG, "&fCompressed Oak Log", "&f8 Oak Log", "&fCompressionCraft");
    public static final SlimefunItemStack JC_OAK_LOG_2 = new SlimefunItemStack("JC_OAK_LOG_2", Material.OAK_LOG, "&Double Compressed Oak Log", "&f64 Oak Log", "&fCompressionCraft");
    public static final SlimefunItemStack JC_OAK_LOG_3 = new SlimefunItemStack("JC_OAK_LOG_3", Material.OAK_LOG, "&fTriple Compressed Oak Log", "&f512 Oak Log", "&fCompressionCraft");
    public static final SlimefunItemStack JC_OAK_LOG_4 = new SlimefunItemStack("JC_OAK_LOG_4", Material.OAK_LOG, "&fQuadruple Compressed Oak Log", "&f4096 Oak Log", "&fCompressionCraft");
    public static final SlimefunItemStack JC_OAK_LOG_5 = new SlimefunItemStack("JC_OAK_LOG_5", Material.OAK_LOG, "&fQuintuple Compressed Oak Log", "&f32768 Oak Log", "&fCompressionCraft");
    public static final SlimefunItemStack JC_OAK_LOG_6 = new SlimefunItemStack("JC_OAK_LOG_6", Material.OAK_LOG, "&fSextuple Compressed Oak Log", "&f262144 Oak Log", "&fCompressionCraft");

    public static final SlimefunItemStack JC_BIRCH_LOG_1 = new SlimefunItemStack("JC_BIRCH_LOG_1", Material.BIRCH_LOG, "&fCompressed Birch Log", "&f8 Birch Log", "&fCompressionCraft");
    public static final SlimefunItemStack JC_BIRCH_LOG_2 = new SlimefunItemStack("JC_BIRCH_LOG_2", Material.BIRCH_LOG, "&Double Compressed Birch Log", "&f64 Birch Log", "&fCompressionCraft");
    public static final SlimefunItemStack JC_BIRCH_LOG_3 = new SlimefunItemStack("JC_BIRCH_LOG_3", Material.BIRCH_LOG, "&fTriple Compressed Birch Log", "&f512 Birch Log", "&fCompressionCraft");
    public static final SlimefunItemStack JC_BIRCH_LOG_4 = new SlimefunItemStack("JC_BIRCH_LOG_4", Material.BIRCH_LOG, "&fQuadruple Compressed Birch Log", "&f4096 Birch Log", "&fCompressionCraft");
    public static final SlimefunItemStack JC_BIRCH_LOG_5 = new SlimefunItemStack("JC_BIRCH_LOG_5", Material.BIRCH_LOG, "&fQuintuple Compressed Birch Log", "&f32768 Birch Log", "&fCompressionCraft");
    public static final SlimefunItemStack JC_BIRCH_LOG_6 = new SlimefunItemStack("JC_BIRCH_LOG_6", Material.BIRCH_LOG, "&fSextuple Compressed Birch Log", "&f262144 Birch Log", "&fCompressionCraft");

    public static final SlimefunItemStack JC_SPRUCE_LOG_1 = new SlimefunItemStack("JC_SPRUCE_LOG_1", Material.SPRUCE_LOG, "&fCompressed Spruce Log", "&f8 Spruce Log", "&fCompressionCraft");
    public static final SlimefunItemStack JC_SPRUCE_LOG_2 = new SlimefunItemStack("JC_SPRUCE_LOG_2", Material.SPRUCE_LOG, "&Double Compressed Spruce Log", "&f64 Spruce Log", "&fCompressionCraft");
    public static final SlimefunItemStack JC_SPRUCE_LOG_3 = new SlimefunItemStack("JC_SPRUCE_LOG_3", Material.SPRUCE_LOG, "&fTriple Compressed Spruce Log", "&f512 Spruce Log", "&fCompressionCraft");
    public static final SlimefunItemStack JC_SPRUCE_LOG_4 = new SlimefunItemStack("JC_SPRUCE_LOG_4", Material.SPRUCE_LOG, "&fQuadruple Compressed Spruce Log", "&f4096 Spruce Log", "&fCompressionCraft");
    public static final SlimefunItemStack JC_SPRUCE_LOG_5 = new SlimefunItemStack("JC_SPRUCE_LOG_5", Material.SPRUCE_LOG, "&fQuintuple Compressed Spruce Log", "&f32768 Spruce Log", "&fCompressionCraft");
    public static final SlimefunItemStack JC_SPRUCE_LOG_6 = new SlimefunItemStack("JC_SPRUCE_LOG_6", Material.SPRUCE_LOG, "&fSextuple Compressed Spruce Log", "&f262144 Spruce Log", "&fCompressionCraft");

    public static final SlimefunItemStack JC_DARK_OAK_LOG_1 = new SlimefunItemStack("JC_DARK_OAK_LOG_1", Material.DARK_OAK_LOG, "&fCompressed Dark Oak Log", "&f8 Dark oak Log", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DARK_OAK_LOG_2 = new SlimefunItemStack("JC_DARK_OAK_LOG_2", Material.DARK_OAK_LOG, "&Double Compressed Dark Oak Log", "&f64 Dark oak Log", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DARK_OAK_LOG_3 = new SlimefunItemStack("JC_DARK_OAK_LOG_3", Material.DARK_OAK_LOG, "&fTriple Compressed Dark Oak Log", "&f512 Dark oak Log", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DARK_OAK_LOG_4 = new SlimefunItemStack("JC_DARK_OAK_LOG_4", Material.DARK_OAK_LOG, "&fQuadruple Compressed Dark Oak Log", "&f4096 Dark oak Log", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DARK_OAK_LOG_5 = new SlimefunItemStack("JC_DARK_OAK_LOG_5", Material.DARK_OAK_LOG, "&fQuintuple Compressed Dark Oak Log", "&f32768 Dark oak Log", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DARK_OAK_LOG_6 = new SlimefunItemStack("JC_DARK_OAK_LOG_6", Material.DARK_OAK_LOG, "&fSextuple Compressed Dark Oak Log", "&f262144 Dark oak Log", "&fCompressionCraft");

    public static final SlimefunItemStack JC_JUNGLE_LOG_1 = new SlimefunItemStack("JC_JUNGLE_LOG_1", Material.JUNGLE_LOG, "&fCompressed Jungle Log", "&f8 Jungle Log", "&fCompressionCraft");
    public static final SlimefunItemStack JC_JUNGLE_LOG_2 = new SlimefunItemStack("JC_JUNGLE_LOG_2", Material.JUNGLE_LOG, "&Double Compressed Jungle Log", "&f64 Jungle Log", "&fCompressionCraft");
    public static final SlimefunItemStack JC_JUNGLE_LOG_3 = new SlimefunItemStack("JC_JUNGLE_LOG_3", Material.JUNGLE_LOG, "&fTriple Compressed Jungle Log", "&f512 Jungle Log", "&fCompressionCraft");
    public static final SlimefunItemStack JC_JUNGLE_LOG_4 = new SlimefunItemStack("JC_JUNGLE_LOG_4", Material.JUNGLE_LOG, "&fQuadruple Compressed Jungle Log", "&f4096 Jungle Log", "&fCompressionCraft");
    public static final SlimefunItemStack JC_JUNGLE_LOG_5 = new SlimefunItemStack("JC_JUNGLE_LOG_5", Material.JUNGLE_LOG, "&fQuintuple Compressed Jungle Log", "&f32768 Jungle Log", "&fCompressionCraft");
    public static final SlimefunItemStack JC_JUNGLE_LOG_6 = new SlimefunItemStack("JC_JUNGLE_LOG_6", Material.JUNGLE_LOG, "&fSextuple Compressed Jungle Log", "&f262144 Jungle Log", "&fCompressionCraft");

    public static final SlimefunItemStack JC_ACACIA_LOG_1 = new SlimefunItemStack("JC_ACACIA_LOG_1", Material.ACACIA_LOG, "&fCompressed Acacia Log", "&f8 Acacia Log", "&fCompressionCraft");
    public static final SlimefunItemStack JC_ACACIA_LOG_2 = new SlimefunItemStack("JC_ACACIA_LOG_2", Material.ACACIA_LOG, "&Double Compressed Acacia Log", "&f64 Acacia Log", "&fCompressionCraft");
    public static final SlimefunItemStack JC_ACACIA_LOG_3 = new SlimefunItemStack("JC_ACACIA_LOG_3", Material.ACACIA_LOG, "&fTriple Compressed Acacia Log", "&f512 Acacia Log", "&fCompressionCraft");
    public static final SlimefunItemStack JC_ACACIA_LOG_4 = new SlimefunItemStack("JC_ACACIA_LOG_4", Material.ACACIA_LOG, "&fQuadruple Compressed Acacia Log", "&f4096 Acacia Log", "&fCompressionCraft");
    public static final SlimefunItemStack JC_ACACIA_LOG_5 = new SlimefunItemStack("JC_ACACIA_LOG_5", Material.ACACIA_LOG, "&fQuintuple Compressed Acacia Log", "&f32768 Acacia Log", "&fCompressionCraft");
    public static final SlimefunItemStack JC_ACACIA_LOG_6 = new SlimefunItemStack("JC_ACACIA_LOG_6", Material.ACACIA_LOG, "&fSextuple Compressed Acacia Log", "&f262144 Acacia Log", "&fCompressionCraft");

    public static final SlimefunItemStack JC_OAK_PLANKS_1 = new SlimefunItemStack("JC_OAK_PLANKS_1", Material.OAK_PLANKS, "&fCompressed Oak Planks", "&f8 Oak Planks", "&fCompressionCraft");
    public static final SlimefunItemStack JC_OAK_PLANKS_2 = new SlimefunItemStack("JC_OAK_PLANKS_2", Material.OAK_PLANKS, "&Double Compressed Oak Planks", "&f64 Oak Planks", "&fCompressionCraft");
    public static final SlimefunItemStack JC_OAK_PLANKS_3 = new SlimefunItemStack("JC_OAK_PLANKS_3", Material.OAK_PLANKS, "&fTriple Compressed Oak Planks", "&f512 Oak Planks", "&fCompressionCraft");
    public static final SlimefunItemStack JC_OAK_PLANKS_4 = new SlimefunItemStack("JC_OAK_PLANKS_4", Material.OAK_PLANKS, "&fQuadruple Compressed Oak Planks", "&f4096 Oak Planks", "&fCompressionCraft");
    public static final SlimefunItemStack JC_OAK_PLANKS_5 = new SlimefunItemStack("JC_OAK_PLANKS_5", Material.OAK_PLANKS, "&fQuintuple Compressed Oak Planks", "&f32768 Oak Planks", "&fCompressionCraft");
    public static final SlimefunItemStack JC_OAK_PLANKS_6 = new SlimefunItemStack("JC_OAK_PLANKS_6", Material.OAK_PLANKS, "&fSextuple Compressed Oak Planks", "&f262144 Oak Planks", "&fCompressionCraft");

    public static final SlimefunItemStack JC_BIRCH_PLANKS_1 = new SlimefunItemStack("JC_BIRCH_PLANKS_1", Material.BIRCH_PLANKS, "&fCompressed Birch Planks", "&f8 Birch Planks", "&fCompressionCraft");
    public static final SlimefunItemStack JC_BIRCH_PLANKS_2 = new SlimefunItemStack("JC_BIRCH_PLANKS_2", Material.BIRCH_PLANKS, "&Double Compressed Birch Planks", "&f64 Birch Planks", "&fCompressionCraft");
    public static final SlimefunItemStack JC_BIRCH_PLANKS_3 = new SlimefunItemStack("JC_BIRCH_PLANKS_3", Material.BIRCH_PLANKS, "&fTriple Compressed Birch Planks", "&f512 Birch Planks", "&fCompressionCraft");
    public static final SlimefunItemStack JC_BIRCH_PLANKS_4 = new SlimefunItemStack("JC_BIRCH_PLANKS_4", Material.BIRCH_PLANKS, "&fQuadruple Compressed Birch Planks", "&f4096 Birch Planks", "&fCompressionCraft");
    public static final SlimefunItemStack JC_BIRCH_PLANKS_5 = new SlimefunItemStack("JC_BIRCH_PLANKS_5", Material.BIRCH_PLANKS, "&fQuintuple Compressed Birch Planks", "&f32768 Birch Planks", "&fCompressionCraft");
    public static final SlimefunItemStack JC_BIRCH_PLANKS_6 = new SlimefunItemStack("JC_BIRCH_PLANKS_6", Material.BIRCH_PLANKS, "&fSextuple Compressed Birch Planks", "&f262144 Birch Planks", "&fCompressionCraft");

    public static final SlimefunItemStack JC_SPRUCE_PLANKS_1 = new SlimefunItemStack("JC_SPRUCE_PLANKS_1", Material.SPRUCE_PLANKS, "&fCompressed Spruce Planks", "&f8 Spruce Planks", "&fCompressionCraft");
    public static final SlimefunItemStack JC_SPRUCE_PLANKS_2 = new SlimefunItemStack("JC_SPRUCE_PLANKS_2", Material.SPRUCE_PLANKS, "&Double Compressed Spruce Planks", "&f64 Spruce Planks", "&fCompressionCraft");
    public static final SlimefunItemStack JC_SPRUCE_PLANKS_3 = new SlimefunItemStack("JC_SPRUCE_PLANKS_3", Material.SPRUCE_PLANKS, "&fTriple Compressed Spruce Planks", "&f512 Spruce Planks", "&fCompressionCraft");
    public static final SlimefunItemStack JC_SPRUCE_PLANKS_4 = new SlimefunItemStack("JC_SPRUCE_PLANKS_4", Material.SPRUCE_PLANKS, "&fQuadruple Compressed Spruce Planks", "&f4096 Spruce Planks", "&fCompressionCraft");
    public static final SlimefunItemStack JC_SPRUCE_PLANKS_5 = new SlimefunItemStack("JC_SPRUCE_PLANKS_5", Material.SPRUCE_PLANKS, "&fQuintuple Compressed Spruce Planks", "&f32768 Spruce Planks", "&fCompressionCraft");
    public static final SlimefunItemStack JC_SPRUCE_PLANKS_6 = new SlimefunItemStack("JC_SPRUCE_PLANKS_6", Material.SPRUCE_PLANKS, "&fSextuple Compressed Spruce Planks", "&f262144 Spruce Planks", "&fCompressionCraft");

    public static final SlimefunItemStack JC_DARK_OAK_PLANKS_1 = new SlimefunItemStack("JC_DARK_OAK_PLANKS_1", Material.DARK_OAK_PLANKS, "&fCompressed Dark Oak Planks", "&f8 Dark oak Planks", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DARK_OAK_PLANKS_2 = new SlimefunItemStack("JC_DARK_OAK_PLANKS_2", Material.DARK_OAK_PLANKS, "&Double Compressed Dark Oak Planks", "&f64 Dark oak Planks", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DARK_OAK_PLANKS_3 = new SlimefunItemStack("JC_DARK_OAK_PLANKS_3", Material.DARK_OAK_PLANKS, "&fTriple Compressed Dark Oak Planks", "&f512 Dark oak Planks", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DARK_OAK_PLANKS_4 = new SlimefunItemStack("JC_DARK_OAK_PLANKS_4", Material.DARK_OAK_PLANKS, "&fQuadruple Compressed Dark Oak Planks", "&f4096 Dark oak Planks", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DARK_OAK_PLANKS_5 = new SlimefunItemStack("JC_DARK_OAK_PLANKS_5", Material.DARK_OAK_PLANKS, "&fQuintuple Compressed Dark Oak Planks", "&f32768 Dark oak Planks", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DARK_OAK_PLANKS_6 = new SlimefunItemStack("JC_DARK_OAK_PLANKS_6", Material.DARK_OAK_PLANKS, "&fSextuple Compressed Dark Oak Planks", "&f262144 Dark oak Planks", "&fCompressionCraft");

    public static final SlimefunItemStack JC_JUNGLE_PLANKS_1 = new SlimefunItemStack("JC_JUNGLE_PLANKS_1", Material.JUNGLE_PLANKS, "&fCompressed Jungle Planks", "&f8 Jungle Planks", "&fCompressionCraft");
    public static final SlimefunItemStack JC_JUNGLE_PLANKS_2 = new SlimefunItemStack("JC_JUNGLE_PLANKS_2", Material.JUNGLE_PLANKS, "&Double Compressed Jungle Planks", "&f64 Jungle Planks", "&fCompressionCraft");
    public static final SlimefunItemStack JC_JUNGLE_PLANKS_3 = new SlimefunItemStack("JC_JUNGLE_PLANKS_3", Material.JUNGLE_PLANKS, "&fTriple Compressed Jungle Planks", "&f512 Jungle Planks", "&fCompressionCraft");
    public static final SlimefunItemStack JC_JUNGLE_PLANKS_4 = new SlimefunItemStack("JC_JUNGLE_PLANKS_4", Material.JUNGLE_PLANKS, "&fQuadruple Compressed Jungle Planks", "&f4096 Jungle Planks", "&fCompressionCraft");
    public static final SlimefunItemStack JC_JUNGLE_PLANKS_5 = new SlimefunItemStack("JC_JUNGLE_PLANKS_5", Material.JUNGLE_PLANKS, "&fQuintuple Compressed Jungle Planks", "&f32768 Jungle Planks", "&fCompressionCraft");
    public static final SlimefunItemStack JC_JUNGLE_PLANKS_6 = new SlimefunItemStack("JC_JUNGLE_PLANKS_6", Material.JUNGLE_PLANKS, "&fSextuple Compressed Jungle Planks", "&f262144 Jungle Planks", "&fCompressionCraft");

    public static final SlimefunItemStack JC_ACACIA_PLANKS_1 = new SlimefunItemStack("JC_ACACIA_PLANKS_1", Material.ACACIA_PLANKS, "&fCompressed Acacia Planks", "&f8 Acacia Planks", "&fCompressionCraft");
    public static final SlimefunItemStack JC_ACACIA_PLANKS_2 = new SlimefunItemStack("JC_ACACIA_PLANKS_2", Material.ACACIA_PLANKS, "&Double Compressed Acacia Planks", "&f64 Acacia Planks", "&fCompressionCraft");
    public static final SlimefunItemStack JC_ACACIA_PLANKS_3 = new SlimefunItemStack("JC_ACACIA_PLANKS_3", Material.ACACIA_PLANKS, "&fTriple Compressed Acacia Planks", "&f512 Acacia Planks", "&fCompressionCraft");
    public static final SlimefunItemStack JC_ACACIA_PLANKS_4 = new SlimefunItemStack("JC_ACACIA_PLANKS_4", Material.ACACIA_PLANKS, "&fQuadruple Compressed Acacia Planks", "&f4096 Acacia Planks", "&fCompressionCraft");
    public static final SlimefunItemStack JC_ACACIA_PLANKS_5 = new SlimefunItemStack("JC_ACACIA_PLANKS_5", Material.ACACIA_PLANKS, "&fQuintuple Compressed Acacia Planks", "&f32768 Acacia Planks", "&fCompressionCraft");
    public static final SlimefunItemStack JC_ACACIA_PLANKS_6 = new SlimefunItemStack("JC_ACACIA_PLANKS_6", Material.ACACIA_PLANKS, "&fSextuple Compressed Acacia Planks", "&f262144 Acacia Planks", "&fCompressionCraft");
    //Item Groups
    public static final NestedItemGroup JC_CC_GENERAL = new NestedItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "JC_CC_GENERAL"), new CustomItemStack(Material.PISTON, "&b压缩工艺"));
    public static final SubItemGroup JC_CC_ITEM_COMPRESSION =
        new SubItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "JC_CC_ITEM_COMPRESSION"), JC_CC_GENERAL,
            new CustomItemStack(Material.PISTON, "&b压缩物品"));
    public static final SubItemGroup JC_CC_MACHINES =
        new SubItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "JC_CC_MACHINES"), JC_CC_GENERAL,
            new CustomItemStack(Material.BLAST_FURNACE, "&b机器"));
}

