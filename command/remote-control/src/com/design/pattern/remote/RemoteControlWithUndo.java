package com.design.pattern.remote;

import com.design.pattern.command.Command;
import com.design.pattern.command.NoCommand;

import java.util.Arrays;

public class RemoteControlWithUndo {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        int undo = slot - 1 <= 0 ? 0 : slot - 1;
        undoCommand = onCommands[undo];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        int undo = slot - 1 <= 0 ? 0 : slot - 1;
        undoCommand = offCommands[undo];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        return "RemoteControlWithUndo{" +
                "onCommands=" + Arrays.toString(onCommands) +
                ", offCommands=" + Arrays.toString(offCommands) +
                ", undoCommand=" + undoCommand +
                '}';
    }
}
