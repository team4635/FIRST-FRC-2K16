package org.usfirst.frc.team4635.robot.commands;

import edu.wpi.first.wpilibj.AnalogGyro;

import org.usfirst.frc.team4635.robot.OI;
import org.usfirst.frc.team4635.robot.Robot;
import org.usfirst.frc.team4635.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj.Timer;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

public class Autonomo60 extends Command {
	//final int gyroChannel = 1; //analog input
    //double angleSetpoint = 240.0;
    double angleSetpoint = 240.0;
    final double pGain = .006; //propotional turning constant
    final double voltsPerDegreePerSecond = .0128; 
    AnalogGyro gyro;

	
	public Autonomo60() {
		requires(Robot.drivetrain);
		setTimeout(2.0);
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
        double turningValue =  (angleSetpoint - gyro.getAngle());
		//Robot.drivetrain.driveAuto(0.6, turningValue);
        if(turningValue!=0){
        	Robot.drivetrain.drive(0.6,-0.6);
        }
        Timer.delay(0.004);				

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
