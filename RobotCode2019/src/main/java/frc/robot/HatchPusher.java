/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Solenoid;

/**
 * Code for the hatch pusher which sets the hatch pusher out or in based on the pressing of button LB.
 */
public class HatchPusher {

    private final static Solenoid hatchPusherPiston = new Solenoid(Constants.HATCH_PUSHER_PISTON_PORT); //Declaring the Cargo Intake solenoid.

    static {

        

    }

    public static void init() {

       

    }

    public static void run(boolean pusherInput) {
     
        hatchPusherPiston.set(pusherInput);//setting hatchpusherPiston to true(out) or false(in)

    }


}
