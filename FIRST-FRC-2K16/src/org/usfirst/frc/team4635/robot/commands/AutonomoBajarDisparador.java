package org.usfirst.frc.team4635.robot.commands;

import org.usfirst.frc.team4635.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class AutonomoBajarDisparador extends Command {
	
	public AutonomoBajarDisparador() {
		requires(Robot.ventana);
		setTimeout(0.67);
	}
	
	protected void initialize() {
		// TODO Auto-generated method stub
		//Robot.ventana.setMotorVentana(.25);

	}

	protected void execute() {
		// TODO Auto-generated method stub
		Robot.ventana.setMotorVentana(1.0);

	}

	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return isTimedOut();
		//return false;
	}

	protected void end() {
		// TODO Auto-generated method stub
		Robot.ventana.setMotorVentana(0.0);
	}

	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
