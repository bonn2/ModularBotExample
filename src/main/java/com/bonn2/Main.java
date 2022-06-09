package com.bonn2;

import com.bonn2.modules.Module;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;

public class Main extends Module {

    public Main() {
        name = "External";
        version = "v1.0";
        priority = Priority.POST_JDA_LOW;
    }

    @Override
    public void registerSettings() {

    }

    @Override
    public void load() {

    }

    @Override
    public CommandData[] getCommands() {
        return new CommandData[0];
    }
}