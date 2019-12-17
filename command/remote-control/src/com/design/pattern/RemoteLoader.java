package com.design.pattern;

import com.design.pattern.command.*;
import com.design.pattern.model.CeilingFan;
import com.design.pattern.model.Light;
import com.design.pattern.model.Stereo;
import com.design.pattern.remote.RemoteControl;
import com.design.pattern.remote.RemoteControlWithUndo;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        System.out.println();

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

        System.out.println("===============================================================================\r\n");

        RemoteControlWithUndo remoteUndo = new RemoteControlWithUndo();

        Light roomLight = new Light("Living Room");

        LightOnCommand onCommand = new LightOnCommand(roomLight);
        LightOffCommand offCommand = new LightOffCommand(roomLight);

        remoteUndo.setCommand(0, onCommand, offCommand);

        remoteUndo.onButtonWasPushed(0);
        remoteUndo.offButtonWasPushed(0);
        System.out.println(remoteUndo);
        remoteUndo.undoButtonWasPushed();
        remoteUndo.onButtonWasPushed(0);
        remoteUndo.undoButtonWasPushed();

        System.out.println("===============================================================================\r\n");

        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        remoteUndo.setCommand(1, ceilingFanMedium, ceilingFanOff);
        remoteUndo.setCommand(2, ceilingFanHigh, ceilingFanOff);

        remoteUndo.onButtonWasPushed(1);
        remoteUndo.offButtonWasPushed(1);
        System.out.println(remoteUndo);
        remoteUndo.undoButtonWasPushed();

        System.out.println();
        remoteUndo.onButtonWasPushed(2);
        System.out.println(remoteUndo);

        System.out.println("===============================================================================\r\n");

        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(new Stereo("Living Room"));
        Command[] partyOn = {livingRoomLightOn, kitchenLightOn, stereoOn};
        Command[] partyOff = {livingRoomLightOff, kitchenLightOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        RemoteControlWithUndo macroControl = new RemoteControlWithUndo();
        macroControl.setCommand(0, partyOnMacro, partyOffMacro);
        macroControl.setCommand(1, new MacroCommand(new Command[]{kitchenLightOn, livingRoomLightOn}), new MacroCommand(new Command[]{kitchenLightOff, livingRoomLightOff}));
        macroControl.onButtonWasPushed(0);
        System.out.println();
        macroControl.onButtonWasPushed(1);
        System.out.println();
        System.out.println("undo : ");
        macroControl.undoButtonWasPushed();
    }
}
