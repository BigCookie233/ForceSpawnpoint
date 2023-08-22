package io.github.bigcookie233.forcespawnpoint;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class ForceSpawnpoint extends JavaPlugin {
    public static ForceSpawnpoint instance;
    public FileConfiguration config;

    @Override
    public void onEnable() {
        instance = this;
        this.saveDefaultConfig();
        this.config = this.getConfig();

        this.getServer().getPluginManager().registerEvents(new onEvents(), this);
        this.getCommand("forcespawnpoint").setExecutor(new onCommand());
    }

    public static ForceSpawnpoint getInstance() {
        return instance;
    }
}
