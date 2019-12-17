package com.design.pattern.command;

import com.design.pattern.model.Light;

public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.off();
    }

    @Override
    public String toString() {
        return "LightOffCommand{" +
                "light=" + light +
                '}';
    }
}
