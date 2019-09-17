package com.shepherdjerred.thestorm.teleports.command;

import java.util.Set;

public interface Command {

  String getName();

  String getDescription();

  Set<Argument> getArguments();

  Task getTask();
}
