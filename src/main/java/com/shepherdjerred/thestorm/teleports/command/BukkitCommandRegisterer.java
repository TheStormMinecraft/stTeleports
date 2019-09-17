package com.shepherdjerred.thestorm.teleports.command;

import java.lang.reflect.Field;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandMap;

public class BukkitCommandRegisterer {

  final Field bukkitCommandMap;

  public BukkitCommandRegisterer() throws NoSuchFieldException {
    bukkitCommandMap = Bukkit.getServer().getClass().getDeclaredField("commandMap");
    bukkitCommandMap.setAccessible(true);
  }

  public void register(Command command) throws IllegalAccessException {
    var wrappedCommand = new BukkitCommandWrapper(command);
    CommandMap commandMap = null;
    commandMap = (CommandMap) bukkitCommandMap.get(Bukkit.getServer());
    commandMap.register(command.getName(), wrappedCommand);
  }
}
