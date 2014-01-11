/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
package edu.wpi.first.wpilibj.templates;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.IterativeRobot;
/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.   
 */
public class RobotTemplate extends IterativeRobot {
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    RobotDrive myDrive;
    Joystick left, right;
    double test;
    public void robotInit() {
<<<<<<< HEAD
            myDrive = new RobotDrive(1,2,3,4);
            left = new Joystick(1);
            right = new Joystick(2);    
=======
        self.destruct();
>>>>>>> e53d835ca07677f63a791fa7cdb965a599c8b443
    }
    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    }   
    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
       while (isOperatorControl()&& isEnabled()){
           myDrive.tankDrive(left,right);
           //Timer.delay(0.01);
           test = left.getX();
           System.out.println(test);
       }
    }
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }   
}
