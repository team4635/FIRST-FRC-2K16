package org.usfirst.frc.team4635.robot.commands;

import org.usfirst.frc.team4635.robot.OI;
import org.usfirst.frc.team4635.robot.Robot;
import org.usfirst.frc.team4635.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
//import edu.wpi.first.wpilibj.Timer;


public class ServoEmpujar extends Command {
	
	public ServoEmpujar() {
		requires(Robot.servoL);
		setTimeout(2.4);

	}
	
	protected void initialize() {
		// TODO Auto-generated method stub
		Robot.servoL.lanzarVex(0.3);

	}

	protected void execute() {
		// TODO Auto-generated method stub
		//Robot.servoL.lanzarVex(0.3);

	}

	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return isTimedOut();
	}

	protected void end() {
		// TODO Auto-generated method stub
		//Robot.servoL.lanzarServo(60);

	}

	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
