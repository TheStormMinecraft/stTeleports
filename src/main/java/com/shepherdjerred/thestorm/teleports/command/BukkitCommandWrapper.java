package com.shepherdjerred.thestorm.teleports.command;

import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;

public class BukkitCommandWrapper extends BukkitCommand {

  private final Command command;

  public BukkitCommandWrapper(Command command) {
    super(command.getName());
    this.command = command;
  }

  @Override
  public boolean execute(CommandSender commandSender, String s, String[] strings) {
    command.getTask().invoke(commandSender);
    // TODO get status
    return true;
  }
}
