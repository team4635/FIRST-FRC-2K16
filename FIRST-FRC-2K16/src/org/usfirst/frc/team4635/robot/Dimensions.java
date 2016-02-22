package org.usfirst.frc.team4635.robot;

public abstract class Dimensions {
	// 1ft = 12 inches 
	// all numbers in inches
	public final static double 
			H_UPPER_HOLE = 24, 
			W_UPPER_HOLE = 16,
			H_TAPE = 14,
			W_TAPE = 20,
			UPPER_HOLE_TO_CARPET = 85,
			W_FIELD = 319, 
			H_FIELD = 649,
			W_COURTYARD = 266, 
			H_COURTYARD = 0;
	
	
	public static double INtoM(double in){
		double  m = 0.254*in;
		return m;
	}
	
}
