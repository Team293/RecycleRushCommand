package org.usfirst.frc.team293.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
	Talon leftMotor=new Talon(0);
	Talon rightMotor=new Talon(1);
    RobotDrive robotDrive=new RobotDrive(leftMotor,rightMotor);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void takeJoystickInputs (Joystick left, Joystick right){
   	
    	
    }
}

