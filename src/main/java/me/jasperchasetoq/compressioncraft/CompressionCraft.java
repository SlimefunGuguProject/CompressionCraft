package me.jasperchasetoq.compressioncraft;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import me.jasperchasetoq.compressioncraft.setup.CompressionCraftItemsSetup;
import net.guizhanss.guizhanlib.updater.GuizhanBuildsUpdater;
import org.bukkit.plugin.java.JavaPlugin;

import javax.annotation.Nonnull;
import java.io.File;

public class CompressionCraft extends JavaPlugin implements SlimefunAddon {


    @Override
    public void onEnable() {

        Config cfg = new Config(this);

        CompressionCraftItemsSetup.setup(this);
        if (!new File(getDataFolder(), "config.yml").exists()) {
            saveDefaultConfig();
        }

        if (getConfig().getBoolean("options.auto-update") && getDescription().getVersion().startsWith("Build")) {
            new GuizhanBuildsUpdater(this, getFile(), "SlimefunGuguProject", "CompressionCraft", "master", false, "zh-CN").start();
        }
    }
    @Override
    public void onDisable() {
        // Logic for disabling the plugin...
    }

    @Override
    public String getBugTrackerURL() {
        // You can return a link to your Bug Tracker instead of null here
        return null;
    }

    @Nonnull
    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    private static CompressionCraft instance;

  public CompressionCraft() {
            instance = this;
        }

        public static CompressionCraft getInstance() {
            return instance;
        }
    }

