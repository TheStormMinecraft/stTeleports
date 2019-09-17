package com.shepherdjerred.thestorm.teleports.command.tasks;

import com.shepherdjerred.thestorm.teleports.data.DataStore;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class SetHomeTask {
  public void invoke(Player player, Location location, DataStore dataStore) {
    dataStore.setHomeLocation(player, location);
  }
}
