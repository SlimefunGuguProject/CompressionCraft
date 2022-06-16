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
    public static final NestedItemGroup CC_GENERAL = new NestedItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "CC_GENERAL"), new CustomItemStack(Material.PISTON, "&b压缩工艺"));
    public static final SubItemGroup CC_COMPRESSED_ITEMS = new SubItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "CC_COMPRESSED_ITEMS"), CC_GENERAL, new CustomItemStack(Material.PISTON, "&b压缩物品"));
    public static final SubItemGroup CC_ITEM_COMPRESSION = new SubItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "CC_ITEM_COMPRESSION"), CC_GENERAL, new CustomItemStack(Material.PISTON, "&b压缩机 & 解压机"));
    public static final SubItemGroup CC_MISC = new SubItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "CC_MISC"), CC_GENERAL, new CustomItemStack(Material.PISTON, "&b杂项"));
    public static final SubItemGroup CC_INFO = new SubItemGroup(new NamespacedKey(CompressionCraft.getInstance(), "CC_INFO"), CC_GENERAL, new CustomItemStack(Material.BOOK, "&b附属信息"));



    //machines Compressors
    //main
    public static final SlimefunItemStack CC_COMPRESSOR_1 = new SlimefunItemStack("CC_COMPRESSOR_1", Material.PISTON, "&e一阶CC压缩机", "&f用于压缩方块", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerPerSecond(50));
    public static final SlimefunItemStack CC_COMPRESSOR_2 = new SlimefunItemStack("CC_COMPRESSOR_2", Material.PISTON, "&6二阶CC压缩机", "&f用于压缩方块", LoreBuilder.machine(MachineTier.AVERAGE, MachineType.MACHINE), LoreBuilder.speed(2), LoreBuilder.powerPerSecond(100));
    public static final SlimefunItemStack CC_COMPRESSOR_3 = new SlimefunItemStack("CC_COMPRESSOR_3", Material.PISTON, "&a三阶CC压缩机", "&f用于压缩方块",LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerPerSecond(150));
    public static final SlimefunItemStack CC_COMPRESSOR_4 = new SlimefunItemStack("CC_COMPRESSOR_4", Material.PISTON, "&2四阶CC压缩机", "&f用于压缩方块", LoreBuilder.machine(MachineTier.GOOD, MachineType.MACHINE), LoreBuilder.speed(4), LoreBuilder.powerPerSecond(200));
    public static final SlimefunItemStack CC_COMPRESSOR_5 = new SlimefunItemStack("CC_COMPRESSOR_5", Material.PISTON, "&6五阶CC压缩机", "&f用于压缩方块", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(5), LoreBuilder.powerPerSecond(250));
    public static final SlimefunItemStack CC_COMPRESSOR_6 = new SlimefunItemStack("CC_COMPRESSOR_6", Material.PISTON, "&4六阶CC压缩机", "&f用于压缩方块", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(6), LoreBuilder.powerPerSecond(300));
    //Machines Decompressors
    public static final SlimefunItemStack CC_DECOMPRESSOR_1 = new SlimefunItemStack("CC_DECOMPRESSOR_1", Material.PISTON, "&e一阶CC解压机", "&f用于解压方块", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerPerSecond(50));
    public static final SlimefunItemStack CC_DECOMPRESSOR_2 = new SlimefunItemStack("CC_DECOMPRESSOR_2", Material.PISTON, "&6二阶CC解压机", "&f用于解压方块", LoreBuilder.machine(MachineTier.AVERAGE, MachineType.MACHINE), LoreBuilder.speed(2), LoreBuilder.powerPerSecond(100));
    public static final SlimefunItemStack CC_DECOMPRESSOR_3 = new SlimefunItemStack("CC_DECOMPRESSOR_3", Material.PISTON, "&a三阶CC解压机", "&f用于解压方块", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.speed(3), LoreBuilder.powerPerSecond(150));
    public static final SlimefunItemStack CC_DECOMPRESSOR_4 = new SlimefunItemStack("CC_DECOMPRESSOR_4", Material.PISTON, "&2四阶CC解压机", "&f用于解压方块", LoreBuilder.machine(MachineTier.GOOD, MachineType.MACHINE), LoreBuilder.speed(4), LoreBuilder.powerPerSecond(200));
    public static final SlimefunItemStack CC_DECOMPRESSOR_5 = new SlimefunItemStack("CC_DECOMPRESSOR_5", Material.PISTON, "&6五阶CC解压机", "&f用于解压方块", LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(5), LoreBuilder.powerPerSecond(250));
    public static final SlimefunItemStack CC_DECOMPRESSOR_6 = new SlimefunItemStack("CC_DECOMPRESSOR_6", Material.PISTON, "&4六阶CC解压机", "&f用于解压方块", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(6), LoreBuilder.powerPerSecond(300));
    //Specialty Compressors
    public static final SlimefunItemStack CC_GEM_COMPRESSOR = new SlimefunItemStack("CC_GEM_COMPRESSOR", Material.AMETHYST_BLOCK, "&4CC宝石压缩机", "&f用于压缩宝石", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(25), LoreBuilder.powerPerSecond(500), LoreBuilder.powerBuffer(25000));
    public static final SlimefunItemStack CC_GEM_DECOMPRESSOR = new SlimefunItemStack("CC_GEM_DECOMPRESSOR", Material.AMETHYST_BLOCK, "&4CC宝石解压机", "&f用于解压宝石", LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(25), LoreBuilder.powerPerSecond(500), LoreBuilder.powerBuffer(25000));

    //misc
    public static final SlimefunItemStack CC_ELECTRIC_SF_COMPRESSOR = new SlimefunItemStack("CC_ELECTRIC_SF_COMPRESSOR", Material.PISTON, "&dCC粘液压缩机", "&f用于压缩粘液科技物品", LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), LoreBuilder.speed(1), LoreBuilder.powerPerSecond(150));

  
    //blocks

    public static final SlimefunItemStack CC_COBBLESTONE_1 = new SlimefunItemStack("CC_COBBLESTONE_1", Material.COBBLESTONE, "&d压缩圆石", "", "&f8 圆石", "");
    public static final SlimefunItemStack CC_STONE_1 = new SlimefunItemStack("CC_STONE_1", Material.STONE, "&d压缩石头", "", "&f8 石头", "");
    public static final SlimefunItemStack CC_FLINT_1 = new SlimefunItemStack("CC_FLINT_1", Material.FLINT, "&d压缩燧石", "", "&f8 燧石", "");
    public static final SlimefunItemStack CC_GRAVEL_1 = new SlimefunItemStack("CC_GRAVEL_1", Material.GRAVEL, "&d压缩沙砾", "", "&f8 沙砾", "");
    public static final SlimefunItemStack CC_CLAY_1 = new SlimefunItemStack("CC_CLAY_1", Material.CLAY, "&d压缩粘土", "", "&f8 粘土", "");
    public static final SlimefunItemStack CC_COAL_1 = new SlimefunItemStack("CC_COAL_1", Material.COAL, "&d压缩煤炭", "", "&f8 煤炭", "");
    public static final SlimefunItemStack CC_COAL_BLOCK_1 = new SlimefunItemStack("CC_COAL_BLOCK_1", Material.COAL_BLOCK, "&d压缩煤炭块", "", "&f8 煤炭块", "");
    public static final SlimefunItemStack CC_IRON_NUGGET_1 = new SlimefunItemStack("CC_IRON_NUGGET_1", Material.IRON_NUGGET, "&d压缩铁粒", "", "&f8 铁粒", "");
    public static final SlimefunItemStack CC_IRON_INGOT_1 = new SlimefunItemStack("CC_IRON_INGOT_1", Material.IRON_INGOT, "&d压缩铁锭", "", "&f8 铁锭", "");
    public static final SlimefunItemStack CC_IRON_BLOCk_1 = new SlimefunItemStack("CC_IRON_BLOCK_1", Material.IRON_BLOCK, "&d压缩铁块", "", "&f8 铁块", "");
    public static final SlimefunItemStack CC_GOLD_NUGGET_1 = new SlimefunItemStack("CC_GOLD_NUGGET_1", Material.GOLD_NUGGET, "&d压缩金粒", "", "&f8 金粒", "");
    public static final SlimefunItemStack CC_GOLD_INGOT_1 = new SlimefunItemStack("CC_GOLD_INGOT_1", Material.GOLD_INGOT, "&d压缩金锭", "", "&f8 金锭", "");
    public static final SlimefunItemStack CC_GOLD_BLOCK_1 = new SlimefunItemStack("CC_GOLD_BLOCK_1", Material.GOLD_BLOCK, "&d压缩金块", "", "&f8 金块", "");
    public static final SlimefunItemStack CC_REDSTONE_1 = new SlimefunItemStack("CC_REDSTONE_1", Material.REDSTONE, "&d压缩红石粉", "", "&f8 红石粉", "");
    public static final SlimefunItemStack CC_REDSTONE_BLOCK_1 = new SlimefunItemStack("CC_REDSTONE_BLOCK_1", Material.REDSTONE_BLOCK, "&d压缩红石块", "", "&f8 红石块", "");
    public static final SlimefunItemStack CC_LAPIS_LAZULI_1 = new SlimefunItemStack("CC_LAPIS_LAZULI_1", Material.LAPIS_LAZULI, "&d压缩青金石", "", "&f8 青金石", "");
    public static final SlimefunItemStack CC_LAPIS_BLOCK_1 = new SlimefunItemStack("CC_LAPIS_BLOCK_1", Material.LAPIS_BLOCK, "&d压缩青金石块", "", "&f8 青金石块", "");
    public static final SlimefunItemStack CC_DIAMOND_1 = new SlimefunItemStack("CC_DIAMOND_1", Material.DIAMOND, "&d压缩钻石", "", "&f8 钻石", "");
    public static final SlimefunItemStack CC_DIAMOND_BLOCK_1 = new SlimefunItemStack("CC_DIAMOND_BLOCK_1", Material.DIAMOND_BLOCK, "&d压缩钻石块", "", "&f8 钻石块", "");
    public static final SlimefunItemStack CC_EMERALD_1 = new SlimefunItemStack("CC_EMERALD_1", Material.EMERALD, "&d压缩绿宝石", "", "&f8 绿宝石", "");
    public static final SlimefunItemStack CC_EMERALD_BLOCK_1 = new SlimefunItemStack("CC_EMERALD_BLOCK_1", Material.EMERALD_BLOCK, "&d压缩绿宝石块", "", "&f8 绿宝石块", "");
    public static final SlimefunItemStack CC_AMETHYST_SHARD_1 = new SlimefunItemStack("CC_AMETHYST_SHARD_1", Material.AMETHYST_SHARD, "&d压缩紫水晶碎片", "", "&f8 紫水晶碎片", "");
    public static final SlimefunItemStack CC_AMETHYST_BLOCK_1 = new SlimefunItemStack("CC_AMETHYST_BLOCK_1", Material.AMETHYST_BLOCK, "&d压缩紫水晶块", "", "&f8 紫水晶块", "");
    public static final SlimefunItemStack CC_SMALL_AMETHYST_BUD_1 = new SlimefunItemStack("CC_SMALL_AMETHYST_BUD_1", Material.SMALL_AMETHYST_BUD, "&d压缩小型紫晶芽", "", "&f8 小型紫晶芽", "");
    public static final SlimefunItemStack CC_MEDIUM_AMETHYST_BUD_1 = new SlimefunItemStack("CC_MEDIUM_AMETHYST_BUD_1", Material.MEDIUM_AMETHYST_BUD, "&d压缩中型紫晶芽", "", "&f8 中型紫晶芽", "");
    public static final SlimefunItemStack CC_LARGE_AMETHYST_BUD_1 = new SlimefunItemStack("CC_LARGE_AMETHYST_BUD_1", Material.LARGE_AMETHYST_BUD, "&d压缩大型紫晶芽", "", "&f8 大型紫晶芽", "");
    public static final SlimefunItemStack CC_AMETHYST_CLUSTER_1 = new SlimefunItemStack("CC_AMETHYST_CLUSTER_1", Material.AMETHYST_CLUSTER, "&d压缩紫水晶簇", "", "&f8 紫水晶簇", "");
}
