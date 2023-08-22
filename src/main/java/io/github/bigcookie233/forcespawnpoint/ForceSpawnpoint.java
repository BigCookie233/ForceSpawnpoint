package io.github.bigcookie233.forcespawnpoint;

import org.bukkit.plugin.java.JavaPlugin;

public class ForceSpawnpoint extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new onEvents(), this);
    }
}
