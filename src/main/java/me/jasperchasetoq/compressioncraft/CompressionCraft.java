package me.jasperchasetoq.compressioncraft;

import io.github.mooy1.infinitylib.core.AbstractAddon;
import io.github.mooy1.infinitylib.metrics.bukkit.Metrics;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import me.jasperchasetoq.compressioncraft.setup.CompressionCraftItemSetup;
import net.guizhanss.guizhanlibplugin.updater.GuizhanUpdater;

import java.io.File;
import java.util.logging.Level;

public class CompressionCraft extends AbstractAddon {

    private static CompressionCraft instance;

    public CompressionCraft() {
        super("SlimefunGuguProject", "CompressionCraft", "master", "options.auto-update");
    }
    @Override
    public void enable() {

        instance = this;

        if (!getServer().getPluginManager().isPluginEnabled("GuizhanLibPlugin")) {
            getLogger().log(Level.SEVERE, "本插件需要 鬼斩前置库插件(GuizhanLibPlugin) 才能运行!");
            getLogger().log(Level.SEVERE, "从此处下载: https://50l.cc/gzlib");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }

        Metrics metrics = new Metrics(this, 15648);

        Config cfg = new Config(this);

        CompressionCraftItemSetup.setup(this);
        if (!new File(getDataFolder(), "config.yml").exists()) {
            saveDefaultConfig();
        }

        if (getConfig().getBoolean("options.auto-update") && getDescription().getVersion().startsWith("Build")) {
            GuizhanUpdater.start(this, getFile(), "SlimefunGuguProject", "CompressionCraft", "master",
                false);
        }
    }
    @Override
    public void disable() {
        instance = null;
    }
    public static CompressionCraft getInstance() {
            return instance;
        }

}

