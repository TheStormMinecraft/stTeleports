package com.shepherdjerred.thestorm.teleports.command.commands;

import com.shepherdjerred.thestorm.teleports.command.Argument;
import com.shepherdjerred.thestorm.teleports.command.Command;
import com.shepherdjerred.thestorm.teleports.command.Task;
import com.shepherdjerred.thestorm.teleports.command.tasks.HomeTask;
import com.shepherdjerred.thestorm.teleports.data.DataStore;
import java.util.HashSet;
import java.util.Set;
import lombok.Getter;

public class HomeCommand implements Command {

  @Getter
  private final String name = "home";
  @Getter
  private final String description = "";
  @Getter
  private final Set<Argument> arguments = new HashSet<>();
  @Getter
  private final Task task;

  public HomeCommand(DataStore dataStore) {
    task = (sender) -> {
      var player = sender.getServer().getPlayer(sender.getName());
      new HomeTask().invoke(player, dataStore);
    };
  }
}
