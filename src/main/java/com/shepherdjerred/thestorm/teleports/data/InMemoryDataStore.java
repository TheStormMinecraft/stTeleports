package com.shepherdjerred.thestorm.teleports.data;

import java.util.HashMap;
import java.util.Map;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class InMemoryDataStore implements DataStore {

  private final Map<Player, Location> homeLocations = new HashMap<>();

  @Override
  public Location getHomeLocation(Player player) {
    return homeLocations.get(player);
  }

  @Override
  public void setHomeLocation(Player player, Location location) {
    homeLocations.put(player, location);
  }
}
