/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4635.robot;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.networktables.NetworkTable;

import org.usfirst.frc.team4635.robot.commands.Autonomous;
import org.usfirst.frc.team4635.robot.commands.ControlPWM;
import org.usfirst.frc.team4635.robot.subsystems.DriveTrain;
import org.usfirst.frc.team4635.robot.subsystems.ServoL;
//import org.usfirst.frc.team4635.robot.subsystems.Lanzamiento;
import org.usfirst.frc.team4635.robot.subsystems.SuccionLanzamiento;
import org.usfirst.frc.team4635.robot.subsystems.Ventana;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	Command autonomousCommand;
    CameraServer server1;
    NetworkTable table; 
    
    
    public static DriveTrain drivetrain;
    public static SuccionLanzamiento succion;
    public static Ventana ventana;
    public static ServoL servoL;
    public static OI oi;
    
    public Robot(){
    	table = NetworkTable.getTable("GRIP/myContoursReport");
    }
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
        // Initialize all subsystems
        drivetrain = new DriveTrain();
        succion = new SuccionLanzamiento();
        ventana = new Ventana();
        servoL = new ServoL();
        oi = new OI();
        
        server1 = CameraServer.getInstance();
        server1.setQuality(30);
        server1.startAutomaticCapture("cam3"); 
        

       
        
        // instantiate the command used for the autonomous period
        
        
        autonomousCommand = new Autonomous();

        // Show what command your subsystem is running on the SmartDashboard
        //SmartDashboard.putData(drivetrain);
        //SmartDashboard.putData(elevator);
        //SmartDashboard.putData(wrist);
        //SmartDashboard.putData(claw);
    }

    public void autonomousInit() {
        autonomousCommand.start(); // schedule the autonomous command (example)
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
        log();
    }

    public void teleopInit() {
    	// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        autonomousCommand.cancel();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        log();
      //llenar tabla del Reporte de Contour
        double [] defaultValue = new double[0];
        	double [] areas = table.getNumberArray("area", defaultValue);
        	System.out.println("Length: "+areas.length);
        	System.out.println("areas: " );
        	for (double area : areas) {
        		System.out.print(area + " ");
        		//SmartDashboard.putNumber("areas", area);
        	}
        	System.out.println();
        	//Timer.delay(.03);
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
        
    }

	/**
	 * The log method puts interesting information to the SmartDashboard.
	 */
    private void log() {
    	
        //wrist.log();
        //elevator.log();
        //drivetrain.log();
        //claw.log();
    }
}
