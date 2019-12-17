package com.design.pattern.command;

import com.design.pattern.model.Light;

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.on();
    }

    @Override
    public String toString() {
        return "LightOnCommand{" +
                "light=" + light +
                '}';
    }
}
