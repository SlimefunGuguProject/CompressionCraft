package me.jasperchasetoq.compressioncraft;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
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

    //groups
    public static final NestedItemGroup JC_CC_GENERAL = new NestedItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "JC_CC_GENERAL"), new CustomItemStack(Material.PISTON, "&bCompressionCraft"));
    public static final SubItemGroup JC_CC_ITEM_COMPRESSION = new SubItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "JC_CC_ITEM_COMPRESSION"), JC_CC_GENERAL, new CustomItemStack(Material.PISTON, "&bCompressed Items"));
    public static final SubItemGroup JC_CC_MACHINES = new SubItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "JC_CC_MACHINES"), JC_CC_GENERAL, new CustomItemStack(Material.FURNACE, "&bMachines"));
    public static final SubItemGroup JC_CC_INFO = new SubItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "JC_CC_INFO"), JC_CC_GENERAL, new CustomItemStack(Material.BOOK, "&bAddon Info"));

    public static final ItemGroup CompressionCraftGeneral = new ItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "CompressionCraft"),
            new CustomItemStack(Material.PISTON, "&bCompressionCraft"));



    //machines Old
    public static final SlimefunItemStack CC_COMPRESSOR_1 = new SlimefunItemStack("CC_COMPRESSOR_1", Material.PISTON, "&eCompressor", "","&7Compresses blocks","",LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.powerPerSecond(50), LoreBuilder.speed(1), LoreBuilder.powerBuffer(250), "&eCompressionCraft");
    public static final SlimefunItemStack CC_COMPRESSOR_2 = new SlimefunItemStack("CC_COMPRESSOR_2", Material.PISTON, "&6Compressor", "","&7Compresses blocks","",LoreBuilder.machine(MachineTier.AVERAGE, MachineType.MACHINE), LoreBuilder.powerPerSecond(100), LoreBuilder.speed(2), LoreBuilder.powerBuffer(500), "&6CompressionCraft");
    public static final SlimefunItemStack CC_COMPRESSOR_3 = new SlimefunItemStack("CC_COMPRESSOR_3", Material.PISTON, "&aCompressor", "","&7Compresses blocks","",LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.powerPerSecond(150), LoreBuilder.speed(3), LoreBuilder.powerBuffer(750), "&aCompressionCraft");
    public static final SlimefunItemStack CC_COMPRESSOR_4 = new SlimefunItemStack("CC_COMPRESSOR_4", Material.PISTON, "&2Compressor", "","&7Compresses blocks","",LoreBuilder.machine(MachineTier.GOOD, MachineType.MACHINE), LoreBuilder.powerPerSecond(200), LoreBuilder.speed(4), LoreBuilder.powerBuffer(1000), "&2CompressionCraft");
    public static final SlimefunItemStack CC_COMPRESSOR_5 = new SlimefunItemStack("CC_COMPRESSOR_5", Material.PISTON, "&6Compressor", "","&7Compresses blocks","",LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.powerPerSecond(250), LoreBuilder.speed(5), LoreBuilder.powerBuffer(1250), "&6CompressionCraft");
    public static final SlimefunItemStack CC_COMPRESSOR_6 = new SlimefunItemStack("CC_COMPRESSOR_6", Material.PISTON, "&4Compressor", "","&7Compresses blocks","",LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.powerPerSecond(300), LoreBuilder.speed(6), LoreBuilder.powerBuffer(1500), "&4CompressionCraft");
    public static final SlimefunItemStack CC_DECOMPRESSOR_1 = new SlimefunItemStack("CC_DECOMPRESSOR_1", Material.PISTON, "&eDecompressor", "", "&7Decompresses blocks", "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.powerPerSecond(50), LoreBuilder.speed(1), LoreBuilder.powerBuffer(250), "&eCompressionCraft");
    public static final SlimefunItemStack CC_DECOMPRESSOR_2 = new SlimefunItemStack("CC_DECOMPRESSOR_2", Material.PISTON, "&6Decompressor", "", "&7Decompresses blocks", "", LoreBuilder.machine(MachineTier.AVERAGE, MachineType.MACHINE), LoreBuilder.powerPerSecond(100), LoreBuilder.speed(2), LoreBuilder.powerBuffer(500), "&6CompressionCraft");
    public static final SlimefunItemStack CC_DECOMPRESSOR_3 = new SlimefunItemStack("CC_DECOMPRESSOR_3", Material.PISTON, "&aDecompressor", "", "&7Decompresses blocks", "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.powerPerSecond(150), LoreBuilder.speed(3), LoreBuilder.powerBuffer(750), "&aCompressionCraft");
    public static final SlimefunItemStack CC_DECOMPRESSOR_4 = new SlimefunItemStack("CC_DECOMPRESSOR_4", Material.PISTON, "&2Decompressor", "", "&7Decompresses blocks", "", LoreBuilder.machine(MachineTier.GOOD, MachineType.MACHINE), LoreBuilder.powerPerSecond(200), LoreBuilder.speed(4), LoreBuilder.powerBuffer(1000), "&2CompressionCraft");
    public static final SlimefunItemStack CC_DECOMPRESSOR_5 = new SlimefunItemStack("CC_DECOMPRESSOR_5", Material.PISTON, "&6Decompressor", "", "&7Decompresses blocks", "",LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.powerPerSecond(250), LoreBuilder.speed(5), LoreBuilder.powerBuffer(1250), "&6CompressionCraft");
    public static final SlimefunItemStack CC_DECOMPRESSOR_6 = new SlimefunItemStack("CC_DECOMPRESSOR_6", Material.PISTON, "&4Decompressor", "", "&7Decompresses blocks", "",LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.powerPerSecond(300), LoreBuilder.speed(6), LoreBuilder.powerBuffer(1500), "&4CompressionCraft");
    //New Machines
    public static final SlimefunItemStack JC_COMPRESSOR_1 = new SlimefunItemStack("JC_COMPRESSOR_1", Material.PISTON, "&eCompressor", "","&7Compresses blocks","",LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.powerPerSecond(50), LoreBuilder.speed(1), LoreBuilder.powerBuffer(250), "&eCompressionCraft");
    public static final SlimefunItemStack JC_COMPRESSOR_2 = new SlimefunItemStack("JC_COMPRESSOR_2", Material.PISTON, "&6Compressor", "","&7Compresses blocks","",LoreBuilder.machine(MachineTier.AVERAGE, MachineType.MACHINE), LoreBuilder.powerPerSecond(100), LoreBuilder.speed(2), LoreBuilder.powerBuffer(500), "&6CompressionCraft");
    public static final SlimefunItemStack JC_COMPRESSOR_3 = new SlimefunItemStack("JC_COMPRESSOR_3", Material.PISTON, "&aCompressor", "","&7Compresses blocks","",LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.powerPerSecond(150), LoreBuilder.speed(3), LoreBuilder.powerBuffer(750), "&aCompressionCraft");
    public static final SlimefunItemStack JC_COMPRESSOR_4 = new SlimefunItemStack("JC_COMPRESSOR_4", Material.PISTON, "&2Compressor", "","&7Compresses blocks","",LoreBuilder.machine(MachineTier.GOOD, MachineType.MACHINE), LoreBuilder.powerPerSecond(200), LoreBuilder.speed(4), LoreBuilder.powerBuffer(1000), "&2CompressionCraft");
    public static final SlimefunItemStack JC_COMPRESSOR_5 = new SlimefunItemStack("JC_COMPRESSOR_5", Material.PISTON, "&6Compressor", "","&7Compresses blocks","",LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.powerPerSecond(250), LoreBuilder.speed(5), LoreBuilder.powerBuffer(1250), "&6CompressionCraft");
    public static final SlimefunItemStack JC_COMPRESSOR_6 = new SlimefunItemStack("JC_COMPRESSOR_6", Material.PISTON, "&4Compressor", "","&7Compresses blocks","",LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.powerPerSecond(300), LoreBuilder.speed(6), LoreBuilder.powerBuffer(1500), "&4CompressionCraft");
    public static final SlimefunItemStack JC_DECOMPRESSOR_1 = new SlimefunItemStack("JC_DECOMPRESSOR_1", Material.PISTON, "&eDecompressor", "", "&7Decompresses blocks", "", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.powerPerSecond(50), LoreBuilder.speed(1), LoreBuilder.powerBuffer(250), "&eCompressionCraft");
    public static final SlimefunItemStack JC_DECOMPRESSOR_2 = new SlimefunItemStack("JC_DECOMPRESSOR_2", Material.PISTON, "&6Decompressor", "", "&7Decompresses blocks", "", LoreBuilder.machine(MachineTier.AVERAGE, MachineType.MACHINE), LoreBuilder.powerPerSecond(100), LoreBuilder.speed(2), LoreBuilder.powerBuffer(500), "&6CompressionCraft");
    public static final SlimefunItemStack JC_DECOMPRESSOR_3 = new SlimefunItemStack("JC_DECOMPRESSOR_3", Material.PISTON, "&aDecompressor", "", "&7Decompresses blocks", "", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.powerPerSecond(150), LoreBuilder.speed(3), LoreBuilder.powerBuffer(750), "&aCompressionCraft");
    public static final SlimefunItemStack JC_DECOMPRESSOR_4 = new SlimefunItemStack("JC_DECOMPRESSOR_4", Material.PISTON, "&2Decompressor", "", "&7Decompresses blocks", "", LoreBuilder.machine(MachineTier.GOOD, MachineType.MACHINE), LoreBuilder.powerPerSecond(200), LoreBuilder.speed(4), LoreBuilder.powerBuffer(1000), "&2CompressionCraft");
    public static final SlimefunItemStack JC_DECOMPRESSOR_5 = new SlimefunItemStack("JC_DECOMPRESSOR_5", Material.PISTON, "&6Decompressor", "", "&7Decompresses blocks", "",LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.powerPerSecond(250), LoreBuilder.speed(5), LoreBuilder.powerBuffer(1250), "&6CompressionCraft");
    public static final SlimefunItemStack JC_DECOMPRESSOR_6 = new SlimefunItemStack("JC_DECOMPRESSOR_6", Material.PISTON, "&4Decompressor", "", "&7Decompresses blocks", "",LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.powerPerSecond(300), LoreBuilder.speed(6), LoreBuilder.powerBuffer(1500), "&4CompressionCraft");


    public static final SlimefunItemStack CC_JC_LORE_REFRESHER = new SlimefunItemStack("CC_LORE_REFRESHER", Material.BOOKSHELF, "&fLore Refresher", "&fRefreshes CompressionCraft item lore", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerPerSecond(10),"&fCompressionCraft");


    //Compressed Items (Old)

    public static final SlimefunItemStack CC_COBBLESTONE_1 = new SlimefunItemStack("CC_COBBLESTONE_1", Material.COBBLESTONE, "&fCompressed Cobblestone",  "&f8 Cobblestone", "&fCompressionCraft");
    public static final SlimefunItemStack CC_STONE_1 = new SlimefunItemStack("CC_STONE_1", Material.STONE, "&fCompressed Stone",  "&f8 Stone", "&fCompressionCraft");
    public static final SlimefunItemStack CC_ANDESITE_1 = new SlimefunItemStack("CC_ANDESITE_1", Material.ANDESITE, "&fCompressed Andesite",  "&f8 Andesite", "&fCompressionCraft");
    public static final SlimefunItemStack CC_DIORITE_1 = new SlimefunItemStack("CC_DIORITE_1", Material.DIORITE, "&fCompressed Diorite",  "&f8 Diorite", "&fCompressionCraft");
    public static final SlimefunItemStack CC_GRANITE_1 = new SlimefunItemStack("CC_GRANITE_1", Material.GRANITE, "&fCompressed Granite",  "&f8 Granite", "&fCompressionCraft");
    public static final SlimefunItemStack CC_COBBLED_DEEPSLATE_1 = new SlimefunItemStack("CC_COBBLED_DEEPSLATE_1", Material.COBBLED_DEEPSLATE, "&fCompressed Cobbled Deepslate",  "&f8 Cobbled Deepslate", "&fCompressionCraft");
    public static final SlimefunItemStack CC_DEEPSLATE_1 = new SlimefunItemStack("CC_DEEPSLATE_1", Material.DEEPSLATE, "&fCompressed Deepslate",  "&f8 Deepslate", "&fCompressionCraft");
    public static final SlimefunItemStack CC_FLINT_1 = new SlimefunItemStack("CC_FLINT_1", Material.FLINT, "&fCompressed Flint",  "&f8 Flint", "&fCompressionCraft");
    public static final SlimefunItemStack CC_GRAVEL_1 = new SlimefunItemStack("CC_GRAVEL_1", Material.GRAVEL, "&fCompressed Gravel",  "&f8 Gravel", "&fCompressionCraft");
    public static final SlimefunItemStack CC_DIRT_1 = new SlimefunItemStack("CC_DIRT_1", Material.DIRT, "&fCompressed Dirt",  "&f8 Dirt", "&fCompressionCraft");
    public static final SlimefunItemStack CC_CLAY_BALL_1 = new SlimefunItemStack("CC_CLAY_BALL_1", Material.CLAY_BALL, "&fCompressed Clay Ball",  "&f8 Clay Ball", "&fCompressionCraft");
    public static final SlimefunItemStack CC_CLAY_1 = new SlimefunItemStack("CC_CLAY_1", Material.CLAY, "&fCompressed Clay",  "&f8 Clay", "&fCompressionCraft");
    public static final SlimefunItemStack CC_COAL_1 = new SlimefunItemStack("CC_COAL_1", Material.COAL, "&fCompressed Coal",  "&f8 Coal", "&fCompressionCraft");
    public static final SlimefunItemStack CC_COAL_BLOCK_1 = new SlimefunItemStack("CC_COAL_BLOCK_1", Material.COAL_BLOCK, "&fCompressed Coal Block",  "&f8 Coal Block", "&fCompressionCraft");
    public static final SlimefunItemStack CC_IRON_NUGGET_1 = new SlimefunItemStack("CC_IRON_NUGGET_1", Material.IRON_NUGGET, "&fCompressed Iron Nugget",  "&f8 Iron Nugget", "&fCompressionCraft");
    public static final SlimefunItemStack CC_IRON_INGOT_1 = new SlimefunItemStack("CC_IRON_INGOT_1", Material.IRON_INGOT, "&fCompressed Iron Ingot",  "&f8 Iron Ingot", "&fCompressionCraft");
    public static final SlimefunItemStack CC_IRON_BLOCk_1 = new SlimefunItemStack("CC_IRON_BLOCK_1", Material.IRON_BLOCK, "&fCompressed Iron Block",  "&f8 Iron Block", "&fCompressionCraft");
    public static final SlimefunItemStack CC_GOLD_NUGGET_1 = new SlimefunItemStack("CC_GOLD_NUGGET_1", Material.GOLD_NUGGET, "&fCompressed Gold Nugget",  "&f8 Gold Nugget", "&fCompressionCraft");
    public static final SlimefunItemStack CC_GOLD_INGOT_1 = new SlimefunItemStack("CC_GOLD_INGOT_1", Material.GOLD_INGOT, "&fCompressed Gold Ingot",  "&f8 Gold Ingot", "&fCompressionCraft");
    public static final SlimefunItemStack CC_GOLD_BLOCK_1 = new SlimefunItemStack("CC_GOLD_BLOCK_1", Material.GOLD_BLOCK, "&fCompressed Gold Block",  "&f8 Gold Block", "&fCompressionCraft");
    public static final SlimefunItemStack CC_REDSTONE_1 = new SlimefunItemStack("CC_REDSTONE_1", Material.REDSTONE, "&fCompressed Redstone",  "&f8 Redstone", "&fCompressionCraft");
    public static final SlimefunItemStack CC_REDSTONE_BLOCK_1 = new SlimefunItemStack("CC_REDSTONE_BLOCK_1", Material.REDSTONE_BLOCK, "&fCompressed Redstone Block",  "&f8 Redstone Block", "&fCompressionCraft");
    public static final SlimefunItemStack CC_LAPIS_LAZULI_1 = new SlimefunItemStack("CC_LAPIS_LAZULI_1", Material.LAPIS_LAZULI, "&fCompressed Lapis Lazuli",  "&f8 Lapis Lazuli", "&fCompressionCraft");
    public static final SlimefunItemStack CC_LAPIS_BLOCK_1 = new SlimefunItemStack("CC_LAPIS_BLOCK_1", Material.LAPIS_BLOCK, "&fCompressed Lapis Block",  "&f8 Lapis Block", "&fCompressionCraft");
    public static final SlimefunItemStack CC_DIAMOND_1 = new SlimefunItemStack("CC_DIAMOND_1", Material.DIAMOND, "&fCompressed Diamond",  "&f8 Diamond", "&fCompressionCraft");
    public static final SlimefunItemStack CC_DIAMOND_BLOCK_1 = new SlimefunItemStack("CC_DIAMOND_BLOCK_1", Material.DIAMOND_BLOCK, "&fCompressed Diamond Block",  "&f8 Diamond Block", "&fCompressionCraft");
    public static final SlimefunItemStack CC_EMERALD_1 = new SlimefunItemStack("CC_EMERALD_1", Material.EMERALD, "&fCompressed Emerald",  "&f8 Emerald", "&fCompressionCraft");
    public static final SlimefunItemStack CC_EMERALD_BLOCK_1 = new SlimefunItemStack("CC_EMERALD_BLOCK_1", Material.EMERALD_BLOCK, "&fCompressed Emerald Block",  "&f8 Emerald Block", "&fCompressionCraft");
    public static final SlimefunItemStack CC_AMETHYST_SHARD_1 = new SlimefunItemStack("CC_AMETHYST_SHARD_1", Material.AMETHYST_SHARD, "&fCompressed Amethyst Shard",  "&f8 Amethyst Shard", "&fCompressionCraft");
    public static final SlimefunItemStack CC_AMETHYST_BLOCK_1 = new SlimefunItemStack("CC_AMETHYST_BLOCK_1", Material.AMETHYST_BLOCK, "&fCompressed Amethyst Block",  "&f8 Amethyst Block", "&fCompressionCraft");
    public static final SlimefunItemStack CC_SMALL_AMETHYST_BUD_1 = new SlimefunItemStack("CC_SMALL_AMETHYST_BUD_1", Material.SMALL_AMETHYST_BUD, "&fCompressed Small Amethyst Bud",  "&f8 Small Amethyst Bud", "&fCompressionCraft");
    public static final SlimefunItemStack CC_MEDIUM_AMETHYST_BUD_1 = new SlimefunItemStack("CC_MEDIUM_AMETHYST_BUD_1", Material.MEDIUM_AMETHYST_BUD, "&fCompressed Medium Amethyst Bud",  "&f8 Medium Amethyst Bud", "&fCompressionCraft");
    public static final SlimefunItemStack CC_LARGE_AMETHYST_BUD_1 = new SlimefunItemStack("CC_LARGE_AMETHYST_BUD_1", Material.LARGE_AMETHYST_BUD, "&fCompressed Large Amethyst Bud",  "&f8 Large Amethyst Bud", "&fCompressionCraft");
    public static final SlimefunItemStack CC_AMETHYST_CLUSTER_1 = new SlimefunItemStack("CC_AMETHYST_CLUSTER_1", Material.AMETHYST_CLUSTER, "&fCompressed Amethyst Cluster",  "&f8 Amethyst Cluster", "&fCompressionCraft");
    public static final SlimefunItemStack CC_COBBLESTONE_2 = new SlimefunItemStack("CC_COBBLESTONE_2", Material.COBBLESTONE, "&fDouble Compressed Cobblestone",  "&f64 Cobblestone", "&fCompressionCraft");
    public static final SlimefunItemStack CC_COBBLESTONE_3 = new SlimefunItemStack("CC_COBBLESTONE_3", Material.COBBLESTONE, "&fTriple Compressed Cobblestone",  "&f512 Cobblestone", "&fCompressionCraft");
    public static final SlimefunItemStack CC_COBBLESTONE_4 = new SlimefunItemStack("CC_COBBLESTONE_4", Material.COBBLESTONE, "&fQuadruple Compressed Cobblestone",  "&f4096 Cobblestone", "&fCompressionCraft");
    public static final SlimefunItemStack CC_COBBLESTONE_5 = new SlimefunItemStack("CC_COBBLESTONE_5", Material.COBBLESTONE, "&fQuintuple Compressed Cobblestone",  "&f32768 Cobblestone", "&fCompressionCraft");
    public static final SlimefunItemStack CC_COBBLESTONE_6 = new SlimefunItemStack("CC_COBBLESTONE_6", Material.COBBLESTONE, "&fSextuple Compressed Cobblestone",  "&f262144 Cobblestone", "&fCompressionCraft");

    //Compressed Items (New)

    public static final SlimefunItemStack JC_COBBLESTONE_1 = new SlimefunItemStack("JC_COBBLESTONE_1", Material.COBBLESTONE, "&fCompressed Cobblestone",  "&f8 Cobblestone", "&fCompressionCraft");
    public static final SlimefunItemStack JC_STONE_1 = new SlimefunItemStack("JC_STONE_1", Material.STONE, "&fCompressed Stone",  "&f8 Stone", "&fCompressionCraft");
    public static final SlimefunItemStack JC_ANDESITE_1 = new SlimefunItemStack("JC_ANDESITE_1", Material.ANDESITE, "&fCompressed Andesite",  "&f8 Andesite", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DIORITE_1 = new SlimefunItemStack("JC_DIORITE_1", Material.DIORITE, "&fCompressed Diorite",  "&f8 Diorite", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GRANITE_1 = new SlimefunItemStack("JC_GRANITE_1", Material.GRANITE, "&fCompressed Granite",  "&f8 Granite", "&fCompressionCraft");
    public static final SlimefunItemStack JC_COBBLED_DEEPSLATE_1 = new SlimefunItemStack("JC_COBBLED_DEEPSLATE_1", Material.COBBLED_DEEPSLATE, "&fCompressed Cobbled Deepslate",  "&f8 Cobbled Deepslate", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DEEPSLATE_1 = new SlimefunItemStack("JC_DEEPSLATE_1", Material.DEEPSLATE, "&fCompressed Deepslate",  "&f8 Deepslate", "&fCompressionCraft");
    public static final SlimefunItemStack JC_FLINT_1 = new SlimefunItemStack("JC_FLINT_1", Material.FLINT, "&fCompressed Flint",  "&f8 Flint", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GRAVEL_1 = new SlimefunItemStack("JC_GRAVEL_1", Material.GRAVEL, "&fCompressed Gravel",  "&f8 Gravel", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DIRT_1 = new SlimefunItemStack("JC_DIRT_1", Material.DIRT, "&fCompressed Dirt",  "&f8 Dirt", "&fCompressionCraft");
    public static final SlimefunItemStack JC_CLAY_BALL_1 = new SlimefunItemStack("JC_CLAY_BALL_1", Material.CLAY_BALL, "&fCompressed Clay Ball",  "&f8 Clay Ball", "&fCompressionCraft");
    public static final SlimefunItemStack JC_CLAY_1 = new SlimefunItemStack("JC_CLAY_1", Material.CLAY, "&fCompressed Clay",  "&f8 Clay", "&fCompressionCraft");
    public static final SlimefunItemStack JC_SNOW_BALL_1 = new SlimefunItemStack("JC_SNOW_BALL_1", Material.SNOWBALL, "&fCompressed Snow Ball",  "&f8 Snow Ball", "&fCompressionCraft");
    public static final SlimefunItemStack JC_SNOW_BLOCK_1 = new SlimefunItemStack("JC_SNOW_BLOCK_1", Material.SNOW_BLOCK, "&fCompressed Snow Block",  "&f8 Snow Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_COAL_1 = new SlimefunItemStack("JC_COAL_1", Material.COAL, "&fCompressed Coal",  "&f8 Coal", "&fCompressionCraft");
    public static final SlimefunItemStack JC_COAL_BLOCK_1 = new SlimefunItemStack("JC_COAL_BLOCK_1", Material.COAL_BLOCK, "&fCompressed Coal Block",  "&f8 Coal Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_IRON_NUGGET_1 = new SlimefunItemStack("JC_IRON_NUGGET_1", Material.IRON_NUGGET, "&fCompressed Iron Nugget",  "&f8 Iron Nugget", "&fCompressionCraft");
    public static final SlimefunItemStack JC_IRON_INGOT_1 = new SlimefunItemStack("JC_IRON_INGOT_1", Material.IRON_INGOT, "&fCompressed Iron Ingot",  "&f8 Iron Ingot", "&fCompressionCraft");
    public static final SlimefunItemStack JC_IRON_BLOCk_1 = new SlimefunItemStack("JC_IRON_BLOCK_1", Material.IRON_BLOCK, "&fCompressed Iron Block",  "&f8 Iron Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GOLD_NUGGET_1 = new SlimefunItemStack("JC_GOLD_NUGGET_1", Material.GOLD_NUGGET, "&fCompressed Gold Nugget",  "&f8 Gold Nugget", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GOLD_INGOT_1 = new SlimefunItemStack("JC_GOLD_INGOT_1", Material.GOLD_INGOT, "&fCompressed Gold Ingot",  "&f8 Gold Ingot", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GOLD_BLOCK_1 = new SlimefunItemStack("JC_GOLD_BLOCK_1", Material.GOLD_BLOCK, "&fCompressed Gold Block",  "&f8 Gold Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_REDSTONE_1 = new SlimefunItemStack("JC_REDSTONE_1", Material.REDSTONE, "&fCompressed Redstone",  "&f8 Redstone", "&fCompressionCraft");
    public static final SlimefunItemStack JC_REDSTONE_BLOCK_1 = new SlimefunItemStack("JC_REDSTONE_BLOCK_1", Material.REDSTONE_BLOCK, "&fCompressed Redstone Block",  "&f8 Redstone Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_LAPIS_LAZULI_1 = new SlimefunItemStack("JC_LAPIS_LAZULI_1", Material.LAPIS_LAZULI, "&fCompressed Lapis Lazuli",  "&f8 Lapis Lazuli", "&fCompressionCraft");
    public static final SlimefunItemStack JC_LAPIS_BLOCK_1 = new SlimefunItemStack("JC_LAPIS_BLOCK_1", Material.LAPIS_BLOCK, "&fCompressed Lapis Block",  "&f8 Lapis Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DIAMOND_1 = new SlimefunItemStack("JC_DIAMOND_1", Material.DIAMOND, "&fCompressed Diamond",  "&f8 Diamond", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DIAMOND_BLOCK_1 = new SlimefunItemStack("JC_DIAMOND_BLOCK_1", Material.DIAMOND_BLOCK, "&fCompressed Diamond Block",  "&f8 Diamond Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_EMERALD_1 = new SlimefunItemStack("JC_EMERALD_1", Material.EMERALD, "&fCompressed Emerald",  "&f8 Emerald", "&fCompressionCraft");
    public static final SlimefunItemStack JC_EMERALD_BLOCK_1 = new SlimefunItemStack("JC_EMERALD_BLOCK_1", Material.EMERALD_BLOCK, "&fCompressed Emerald Block",  "&f8 Emerald Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_AMETHYST_SHARD_1 = new SlimefunItemStack("JC_AMETHYST_SHARD_1", Material.AMETHYST_SHARD, "&fCompressed Amethyst Shard",  "&f8 Amethyst Shard", "&fCompressionCraft");
    public static final SlimefunItemStack JC_AMETHYST_BLOCK_1 = new SlimefunItemStack("JC_AMETHYST_BLOCK_1", Material.AMETHYST_BLOCK, "&fCompressed Amethyst Block",  "&f8 Amethyst Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_SMALL_AMETHYST_BUD_1 = new SlimefunItemStack("JC_SMALL_AMETHYST_BUD_1", Material.SMALL_AMETHYST_BUD, "&fCompressed Small Amethyst Bud",  "&f8 Small Amethyst Bud", "&fCompressionCraft");
    public static final SlimefunItemStack JC_MEDIUM_AMETHYST_BUD_1 = new SlimefunItemStack("JC_MEDIUM_AMETHYST_BUD_1", Material.MEDIUM_AMETHYST_BUD, "&fCompressed Medium Amethyst Bud",  "&f8 Medium Amethyst Bud", "&fCompressionCraft");
    public static final SlimefunItemStack JC_LARGE_AMETHYST_BUD_1 = new SlimefunItemStack("JC_LARGE_AMETHYST_BUD_1", Material.LARGE_AMETHYST_BUD, "&fCompressed Large Amethyst Bud",  "&f8 Large Amethyst Bud", "&fCompressionCraft");
    public static final SlimefunItemStack JC_AMETHYST_CLUSTER_1 = new SlimefunItemStack("JC_AMETHYST_CLUSTER_1", Material.AMETHYST_CLUSTER, "&fCompressed Amethyst Cluster",  "&f8 Amethyst Cluster", "&fCompressionCraft");
    public static final SlimefunItemStack JC_COBBLESTONE_2 = new SlimefunItemStack("JC_COBBLESTONE_2", Material.COBBLESTONE, "&fDouble Compressed Cobblestone",  "&f64 Cobblestone", "&fCompressionCraft");
    public static final SlimefunItemStack JC_STONE_2 = new SlimefunItemStack("JC_STONE_2", Material.STONE, "&fDouble Compressed Stone",  "&f64 Stone", "&fCompressionCraft");
    public static final SlimefunItemStack JC_ANDESITE_2 = new SlimefunItemStack("JC_ANDESITE_2", Material.ANDESITE, "&fDouble Compressed Andesite",  "&f64 Andesite", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DIORITE_2 = new SlimefunItemStack("JC_DIORITE_2", Material.DIORITE, "&fDouble Compressed Diorite",  "&f64 Diorite", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GRANITE_2 = new SlimefunItemStack("JC_GRANITE_2", Material.GRANITE, "&fDouble Compressed Granite",  "&f64 Granite", "&fCompressionCraft");
    public static final SlimefunItemStack JC_COBBLED_DEEPSLATE_2 = new SlimefunItemStack("JC_COBBLED_DEEPSLATE_2", Material.COBBLED_DEEPSLATE, "&fDouble Compressed Cobbled Deepslate",  "&f64 Cobbled Deepslate", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DEEPSLATE_2 = new SlimefunItemStack("JC_DEEPSLATE_2", Material.DEEPSLATE, "&fDouble Compressed Deepslate",  "&f64 Deepslate", "&fCompressionCraft");
    public static final SlimefunItemStack JC_FLINT_2 = new SlimefunItemStack("JC_FLINT_2", Material.FLINT, "&fDouble Compressed Flint",  "&f64 Flint", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GRAVEL_2 = new SlimefunItemStack("JC_GRAVEL_2", Material.GRAVEL, "&fDouble Compressed Gravel",  "&f64 Gravel", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DIRT_2 = new SlimefunItemStack("JC_DIRT_2", Material.DIRT, "&fDouble Compressed Dirt",  "&f64 Dirt", "&fCompressionCraft");
    public static final SlimefunItemStack JC_CLAY_BALL_2 = new SlimefunItemStack("JC_CLAY_BALL_2", Material.CLAY_BALL, "&fDouble Compressed Clay Ball",  "&f64 Clay Ball", "&fCompressionCraft");
    public static final SlimefunItemStack JC_CLAY_2 = new SlimefunItemStack("JC_CLAY_2", Material.CLAY, "&fDouble Compressed Clay",  "&f64 Clay", "&fCompressionCraft");
    public static final SlimefunItemStack JC_SNOW_BALL_2 = new SlimefunItemStack("JC_SNOW_BALL_2", Material.SNOWBALL, "&fDouble Compressed Snow Ball",  "&f64 Snow Ball", "&fCompressionCraft");
    public static final SlimefunItemStack JC_SNOW_BLOCK_2 = new SlimefunItemStack("JC_SNOW_BLOCK_2", Material.SNOW_BLOCK, "&fDouble Compressed Snow Block",  "&f64 Snow Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_COAL_2 = new SlimefunItemStack("JC_COAL_2", Material.COAL, "&fDouble Compressed Coal",  "&f64 Coal", "&fCompressionCraft");
    public static final SlimefunItemStack JC_COAL_BLOCK_2 = new SlimefunItemStack("JC_COAL_BLOCK_2", Material.COAL_BLOCK, "&fDouble Compressed Coal Block",  "&f64 Coal Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_IRON_NUGGET_2 = new SlimefunItemStack("JC_IRON_NUGGET_2", Material.IRON_NUGGET, "&fDouble Compressed Iron Nugget",  "&f64 Iron Nugget", "&fCompressionCraft");
    public static final SlimefunItemStack JC_IRON_INGOT_2 = new SlimefunItemStack("JC_IRON_INGOT_2", Material.IRON_INGOT, "&fDouble Compressed Iron Ingot",  "&f64 Iron Ingot", "&fCompressionCraft");
    public static final SlimefunItemStack JC_IRON_BLOCk_2 = new SlimefunItemStack("JC_IRON_BLOCK_2", Material.IRON_BLOCK, "&fDouble Compressed Iron Block",  "&f64 Iron Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GOLD_NUGGET_2 = new SlimefunItemStack("JC_GOLD_NUGGET_2", Material.GOLD_NUGGET, "&fDouble Compressed Gold Nugget",  "&f64 Gold Nugget", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GOLD_INGOT_2 = new SlimefunItemStack("JC_GOLD_INGOT_2", Material.GOLD_INGOT, "&fDouble Compressed Gold Ingot",  "&f64 Gold Ingot", "&fCompressionCraft");
    public static final SlimefunItemStack JC_GOLD_BLOCK_2 = new SlimefunItemStack("JC_GOLD_BLOCK_2", Material.GOLD_BLOCK, "&fDouble Compressed Gold Block",  "&f64 Gold Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_REDSTONE_2 = new SlimefunItemStack("JC_REDSTONE_2", Material.REDSTONE, "&fDouble Compressed Redstone",  "&f64 Redstone", "&fCompressionCraft");
    public static final SlimefunItemStack JC_REDSTONE_BLOCK_2 = new SlimefunItemStack("JC_REDSTONE_BLOCK_2", Material.REDSTONE_BLOCK, "&fDouble Compressed Redstone Block",  "&f64 Redstone Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_LAPIS_LAZULI_2 = new SlimefunItemStack("JC_LAPIS_LAZULI_2", Material.LAPIS_LAZULI, "&fDouble Compressed Lapis Lazuli",  "&f64 Lapis Lazuli", "&fCompressionCraft");
    public static final SlimefunItemStack JC_LAPIS_BLOCK_2 = new SlimefunItemStack("JC_LAPIS_BLOCK_2", Material.LAPIS_BLOCK, "&fDouble Compressed Lapis Block",  "&f64 Lapis Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DIAMOND_2 = new SlimefunItemStack("JC_DIAMOND_2", Material.DIAMOND, "&fDouble Compressed Diamond",  "&f64 Diamond", "&fCompressionCraft");
    public static final SlimefunItemStack JC_DIAMOND_BLOCK_2 = new SlimefunItemStack("JC_DIAMOND_BLOCK_2", Material.DIAMOND_BLOCK, "&fDouble Compressed Diamond Block",  "&f64 Diamond Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_EMERALD_2 = new SlimefunItemStack("JC_EMERALD_2", Material.EMERALD, "&fDouble Compressed Emerald",  "&f64 Emerald", "&fCompressionCraft");
    public static final SlimefunItemStack JC_EMERALD_BLOCK_2 = new SlimefunItemStack("JC_EMERALD_BLOCK_2", Material.EMERALD_BLOCK, "&fDouble Compressed Emerald Block",  "&f64 Emerald Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_AMETHYST_SHARD_2 = new SlimefunItemStack("JC_AMETHYST_SHARD_2", Material.AMETHYST_SHARD, "&fDouble Compressed Amethyst Shard",  "&f64 Amethyst Shard", "&fCompressionCraft");
    public static final SlimefunItemStack JC_AMETHYST_BLOCK_2 = new SlimefunItemStack("JC_AMETHYST_BLOCK_2", Material.AMETHYST_BLOCK, "&fDouble Compressed Amethyst Block",  "&f64 Amethyst Block", "&fCompressionCraft");
    public static final SlimefunItemStack JC_SMALL_AMETHYST_BUD_2 = new SlimefunItemStack("JC_SMALL_AMETHYST_BUD_2", Material.SMALL_AMETHYST_BUD, "&fDouble Compressed Small Amethyst Bud",  "&f64 Small Amethyst Bud", "&fCompressionCraft");
    public static final SlimefunItemStack JC_MEDIUM_AMETHYST_BUD_2 = new SlimefunItemStack("JC_MEDIUM_AMETHYST_BUD_2", Material.MEDIUM_AMETHYST_BUD, "&fDouble Compressed Medium Amethyst Bud",  "&f64 Medium Amethyst Bud", "&fCompressionCraft");
    public static final SlimefunItemStack JC_LARGE_AMETHYST_BUD_2 = new SlimefunItemStack("JC_LARGE_AMETHYST_BUD_2", Material.LARGE_AMETHYST_BUD, "&fDouble Compressed Large Amethyst Bud",  "&f64 Large Amethyst Bud", "&fCompressionCraft");
    public static final SlimefunItemStack JC_AMETHYST_CLUSTER_2 = new SlimefunItemStack("JC_AMETHYST_CLUSTER_2", Material.AMETHYST_CLUSTER, "&fDouble Compressed Amethyst Cluster",  "&f64 Amethyst Cluster", "&fCompressionCraft");
    public static final SlimefunItemStack JC_COBBLESTONE_3 = new SlimefunItemStack("JC_COBBLESTONE_3", Material.COBBLESTONE, "&fTriple Compressed Cobblestone",  "&f512 Cobblestone", "&fCompressionCraft");
    public static final SlimefunItemStack JC_COBBLESTONE_4 = new SlimefunItemStack("JC_COBBLESTONE_4", Material.COBBLESTONE, "&fQuadruple Compressed Cobblestone",  "&f4096 Cobblestone", "&fCompressionCraft");
    public static final SlimefunItemStack JC_COBBLESTONE_5 = new SlimefunItemStack("JC_COBBLESTONE_5", Material.COBBLESTONE, "&fQuintuple Compressed Cobblestone",  "&f32768 Cobblestone", "&fCompressionCraft");
    public static final SlimefunItemStack JC_COBBLESTONE_6 = new SlimefunItemStack("JC_COBBLESTONE_6", Material.COBBLESTONE, "&fSextuple Compressed Cobblestone",  "&f262144 Cobblestone", "&fCompressionCraft");



    //addon info
    public static final SlimefunItemStack JC_CC_MC_VERSION = new SlimefunItemStack("JC_CC_MC_VERSION", Material.BOOK, "&fMinecraft Version",  "&fWorks on versions 1.17x-1.19x");
    public static final SlimefunItemStack JC_CC_JAVA_VERSION = new SlimefunItemStack("JC_CC_JAVA_VERSION", Material.BOOK, "&fJava Version",  "&fCompressionCraft requires Java 16+ to work");
    public static final SlimefunItemStack JC_CC_SF_BUILD = new SlimefunItemStack("JC_CC_SF_BUILD", Material.BOOK, "&fSlimefun Build",  "&fCompressionCraft was built on slimefun version: RC-32");
    public static final SlimefunItemStack JC_CC_PREFIX = new SlimefunItemStack("JC_CC_PREFIX", Material.BOOK, "&fPrefixs (for devs)",  "&fCompressioncraft currently uses the follow prefixs for item registraction","CC","JC");
    public static final SlimefunItemStack JC_CC_VERSION = new SlimefunItemStack("JC_CC_VERSION", Material.BOOK, "&fCompressioncraft Verison",  "&fCompressioncraft Info",
            "&f" + CompressionCraft.getInstance().getName() + " " + CompressionCraft.getInstance().getPluginVersion());
    //Credit and the source for the CC_VERSION goes to https://github.com/Sfiguz7/TranscEndence/blob/master/src/main/java/me/sfiguz7/transcendence/lists/TEItems.java
}
