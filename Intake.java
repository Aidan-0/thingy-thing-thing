/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2526.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
//Testing Testing 123
/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Intake extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	WPI_TalonSRX talon1;//Left
	WPI_TalonSRX talon2;//Right
	public Intake(int id1,int id2) {
		talon1 = new WPI_TalonSRX(4);
		talon2 = new WPI_TalonSRX(5);
	//	talon2.follow(talon1);
	}
	public void intakeIn() {
		talon1.set(.7);
		talon2.set(-.7);
	}
	public void intakeStop() {
		talon1.set(0);
		talon2.set(0);
	}
	public void intakeOut() {
		talon1.set(-1);
		talon2.set(1);
	}
	public void intakeOutSlow() {
		talon1.set(-.7);
		talon2.set(.7);
	}
	public void intakeAdjustOut() {
		talon1.set(.9);
		talon2.set(.9);
	}
	public void adjustCube() {
		talon1.set(-1);
		talon2.set(-1);
	}
	public void adjustCubeRight() {
		talon1.set(-.9);
		talon2.set(-.7);
	}
	public void adjustCubeLeft() {
		talon1.set(.7);
		talon2.set(.9);
	}
	public void intakeStack() {
		talon1.set(-.4);
		talon2.set(.4);
	}
	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}
