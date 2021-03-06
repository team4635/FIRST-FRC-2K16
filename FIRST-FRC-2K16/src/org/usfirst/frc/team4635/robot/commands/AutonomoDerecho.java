package org.usfirst.frc.team4635.robot.commands;

import edu.wpi.first.wpilibj.AnalogGyro;

import org.usfirst.frc.team4635.robot.OI;
import org.usfirst.frc.team4635.robot.Robot;
import org.usfirst.frc.team4635.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj.Timer;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

public class AutonomoDerecho extends Command {
	//final int gyroChannel = 1; //analog input
    double angleSetpoint = 0.0;
    final double pGain = .006; //propotional turning constant
    final double voltsPerDegreePerSecond = .0128; 
    AnalogGyro gyro;

	
	public AutonomoDerecho() {
		requires(Robot.drivetrain);
		setTimeout(1.3);
		//gyro = Robot.oi.getGyro();
		gyro=Robot.oi.gyro;

	}
	
	protected void initialize() {
		// TODO Auto-generated method stub
		gyro.reset();
		double turningValue;
		gyro.setSensitivity(voltsPerDegreePerSecond); //calibrates gyro values to equal degrees
		
	}

	protected void execute() {
		// TODO Auto-generated method stub
        double turningValue =  (angleSetpoint - gyro.getAngle())*pGain;
		//Robot.drivetrain.driveAuto(-0.5, turningValue);
		Robot.drivetrain.driveAuto(-0.5, turningValue);
        //Timer.delay(0.004);				

	}

	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return isTimedOut();
	}

	protected void end() {
		// TODO Auto-generated method stub
		Robot.drivetrain.driveAuto(0.0, 0.0);
	}

	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
