package com.shepherdjerred.thestorm.teleports;

import com.shepherdjerred.thestorm.teleports.command.BukkitCommandRegisterer;
import com.shepherdjerred.thestorm.teleports.command.commands.HomeCommand;
import com.shepherdjerred.thestorm.teleports.command.commands.SetHomeCommand;
import com.shepherdjerred.thestorm.teleports.data.DataStore;
import com.shepherdjerred.thestorm.teleports.data.InMemoryDataStore;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

  private final DataStore dataStore = new InMemoryDataStore();

  @Override
  public void onEnable() {
    try {
      registerCommands();
    } catch (NoSuchFieldException | IllegalAccessException e) {
      e.printStackTrace();
    }
  }

  private void registerCommands() throws NoSuchFieldException, IllegalAccessException {
    var registerer = new BukkitCommandRegisterer();
    var setHomeCommand = new SetHomeCommand(dataStore);
    var homeCommand = new HomeCommand(dataStore);
    registerer.register(setHomeCommand);
    registerer.register(homeCommand);
  }
}
