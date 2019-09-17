package com.shepherdjerred.thestorm.teleports.command.tasks;

import com.shepherdjerred.thestorm.teleports.data.DataStore;
import org.bukkit.entity.Player;

public class HomeTask {
  public void invoke(Player player, DataStore dataStore) {
    player.teleport(dataStore.getHomeLocation(player));
  }
}
