/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc.team4635.robot.subsystems;

import org.usfirst.frc.team4635.robot.commands.PararSuccion;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

public class ServoL extends Subsystem {
	private Servo servoLanzar;
	private Servo servoLanzar2;
	private SpeedController VictorVex;

    public ServoL() {
        super();
        servoLanzar=new Servo(7);
        servoLanzar2= new Servo(8);
        VictorVex = new Victor(9);
        }

    public void initDefaultCommand() {

    }
    public void log() {}

    public void lanzarServo(int angulo){
    	servoLanzar.setAngle(angulo);
    	servoLanzar2.setAngle(-angulo);
    } 
    public void lanzarVex(double velocidad){
    	VictorVex.set(velocidad);
    }
}
