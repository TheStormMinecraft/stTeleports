package com.shepherdjerred.thestorm.teleports.data;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public interface DataStore {

  Location getHomeLocation(Player player);

  void setHomeLocation(Player player, Location location);
}
