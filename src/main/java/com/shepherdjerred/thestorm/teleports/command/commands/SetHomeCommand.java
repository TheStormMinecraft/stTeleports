package com.shepherdjerred.thestorm.teleports.command.commands;

import com.shepherdjerred.thestorm.teleports.command.Argument;
import com.shepherdjerred.thestorm.teleports.command.Command;
import com.shepherdjerred.thestorm.teleports.command.Task;
import com.shepherdjerred.thestorm.teleports.command.tasks.SetHomeTask;
import com.shepherdjerred.thestorm.teleports.data.DataStore;
import java.util.HashSet;
import java.util.Set;
import lombok.Getter;

public class SetHomeCommand implements Command {

  @Getter
  private final String name = "sethome";
  @Getter
  private final String description = "";
  @Getter
  private final Set<Argument> arguments = new HashSet<>();
  @Getter
  private final Task task;

  public SetHomeCommand(DataStore dataStore) {
    task = (sender) -> {
      var player = sender.getServer().getPlayer(sender.getName());
      var location = player.getLocation();
      new SetHomeTask().invoke(player, location, dataStore);
    };
  }
}
