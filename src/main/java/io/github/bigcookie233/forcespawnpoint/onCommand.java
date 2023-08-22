package io.github.bigcookie233.forcespawnpoint;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.ArrayList;
import java.util.List;

public class onCommand implements CommandExecutor, TabCompleter {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (strings.length > 1) {
            return false;
        }

        if (strings.length == 1 && strings[0].equals("reload")) {
            commandSender.sendMessage(ChatColor.GREEN + "Reloading");
            ForceSpawnpoint.getInstance().reloadConfig();
            return true;
        }

        commandSender.sendMessage(ChatColor.GREEN + "ForceSpawnpoint 1.1 by Bigcookie233");

        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
        if (strings.length == 1) {
            return List.of(new String[]{"reload"});
        }
        return new ArrayList<>();
    }
}
