
package org.usfirst.frc.team4635.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 * The main autonomous command to pickup and deliver the
 * soda to the box.
 */
public class LanzarTodo extends CommandGroup {
    public LanzarTodo() {
    	addParallel(new Lanzar());
    	addSequential(new ServoDelay());
    	addSequential(new ServoSubir());
    	addSequential(new ServoBajar());
    	
    }
}
