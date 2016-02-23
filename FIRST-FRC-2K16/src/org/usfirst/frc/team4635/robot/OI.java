
package org.usfirst.frc.team4635.robot;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team4635.robot.commands.*;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    private Joystick joy = new Joystick(0);
    private Joystick joyCopiloto = new Joystick(1);
    public AnalogGyro gyro = new AnalogGyro(1);
    public OI() {
    	// Put Some buttons on the SmartDashboard
       
        
        //SmartDashboard.putData("Deliver Soda", new Autonomous());
        
        // Create some buttons

        //JoystickButton xXbox = new JoystickButton(joy, 3);
        JoystickButton btnAPiloto = new JoystickButton(joyCopiloto, 1);
        JoystickButton btnBPiloto = new JoystickButton(joyCopiloto, 2);
        JoystickButton btnYPiloto = new JoystickButton(joyCopiloto, 4);
        JoystickButton btnXPiloto = new JoystickButton(joyCopiloto, 3);
        JoystickButton btnBumperIzqPiloto = new JoystickButton(joy, 5);
        JoystickButton btnBumperDerPiloto = new JoystickButton(joy, 6);
        //JoystickButton btnStartPiloto = new JoystickButton(joy, 8);

        // Connect the buttons to commands
    
        
       // xXbox.whenReleased(new gira90());
        
        
        btnAPiloto.whenPressed(new Succionar());
        btnAPiloto.whenReleased(new PararSuccion());
        btnBPiloto.whenPressed(new LevantarVentana());
        btnBPiloto.whenReleased(new PararVentana());
        btnXPiloto.whenPressed(new BajarVentana());
        btnXPiloto.whenReleased(new PararVentana());
        
        btnYPiloto.whenPressed(new Lanzar());
        btnYPiloto.whenPressed(new ServoEmpujar());
        btnBumperIzqPiloto.whileHeld(new RotarIzquierda());
        btnBumperDerPiloto.whileHeld(new RotarDerecha());
    }
    
    public Joystick getJoystick() {
        return joy;
    }
    public Joystick getJoystickCopiloto() {
    	return joyCopiloto;
    }
    /*public AnalogGyro getGyro() {
    	return gyro;
    }*/
}

