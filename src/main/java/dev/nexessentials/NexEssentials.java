
package dev.nexessentials;

import org.bukkit.plugin.java.JavaPlugin;

public final class NexEssentials extends JavaPlugin {

    private static NexEssentials instance;

    @Override
    public void onEnable() {
        instance = this;

        saveDefaultConfig();

        getLogger().info("NexEssentials has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("NexEssentials has been disabled!");

        instance = null;
    }

    public static NexEssentials getInstance() {
        return instance;
    }
}
