package io.github.bigcookie233.forcespawnpoint;

import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class onEvents implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        ForceSpawnpoint instance = ForceSpawnpoint.getInstance();
        FileConfiguration config = instance.config;

        player.teleport(new Location(instance.getServer().getWorld(config.getString("world")),
                config.getDouble("x"),
                config.getDouble("y"),
                config.getDouble("z"),
                (float) config.getDouble("yaw"),
                (float) config.getDouble("pitch"))
        );
    }
}
