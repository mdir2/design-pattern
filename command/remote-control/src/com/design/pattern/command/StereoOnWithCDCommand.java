package com.design.pattern.command;

import com.design.pattern.model.Stereo;

public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.on();
    }

    @Override
    public String toString() {
        return "StereoOnWithCDCommand{" +
                "stereo=" + stereo +
                '}';
    }
}
