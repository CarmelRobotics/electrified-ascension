// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.pathplanner.lib.PathConstraints;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public final class DriveConstants {
        public static final int FRONTRIGHT_MODULE_DRIVE_CAN = 6;
        public static final int FRONTRIGHT_MODULE_STEER_CAN = 2; 
        public static final int FRONTRIGHT_MODULE_ENCODER = 2; 
        public static final double FRONTRIGHT_MODULE_OFFSET = 0.77;

        public static final int FRONTLEFT_MODULE_DRIVE_CAN = 4;
        public static final int FRONTLEFT_MODULE_STEER_CAN = 9; 
        public static final int FRONTLEFT_MODULE_ENCODER = 0; 
        public static final double FRONTLEFT_MODULE_OFFSET = 0.18;

        public static final int BACKRIGHT_MODULE_DRIVE_CAN = 8;
        public static final int BACKRIGHT_MODULE_STEER_CAN = 5; 
        public static final int BACKRIGHT_MODULE_ENCODER = 3; 
        public static final double BACKRIGHT_MODULE_OFFSET = 0.69; 

        public static final int BACKLEFT_MODULE_DRIVE_CAN = 10;
        public static final int BACKLEFT_MODULE_STEER_CAN = 1; 
        public static final int BACKLEFT_MODULE_ENCODER = 1; 
        public static final double BACKLEFT_MODULE_OFFSET = 0.8; 


        public static final double MAX_SPEED = 1.0;
        public static final double CREEP_SPEED = 0.15;
        public static final double CHASSIS_WIDTH = 0.508;
        public static final double CHASSIS_LENGTH = 0.6223;
        
        public static final double P = 0.007;
        public static final double I = 0.0;
        public static final double D = 0.00005;

        public static final double ENCODER_PER_INCH = 0.72;

        public static final double FORWARD_SPEED = 0.5;
    }
    public static final class TrajectoryConstants{
        public static final double MAX_TRAJECORY_VELOCITY_METERS_PER_SECOND = 4;
        public static final double MAX_TRAJETORY_ACCELERATION_PETERS_PER_SECOND_SQUARED = 3;
        public static final PathConstraints TrajectoryConstraints = new PathConstraints(MAX_TRAJECORY_VELOCITY_METERS_PER_SECOND, MAX_TRAJETORY_ACCELERATION_PETERS_PER_SECOND_SQUARED);
    }
    public final class ClawConstants {
        public static final int ENCODER_TICKS = 42;
        public static final int WRIST_CAN = 5;
        public static final double CONST_SPEED = 0.3;
    }
    public final class ButtonConstants {
        public static final int BUTTON_WRIST = 2;
        public static final int BUTTON_ARMFORWARD = 6;
        public static final int BUTTON_ARMBACKWARD = 4;
        public static final int BUTTON_ARMUP = 5;
        public static final int BUTTON_ARMDOWN = 3;
        public static final int BUTTON_HAND_LETGO = 2;
        public static final int BUTTON_HAND_HOLD = 1;
        public static final int BUTTON_HAND_OPEN = 10;
        public static final int BUTTON_HAND_CLOSE = 12;
        public static final int BUTTON_BRAKE = 7;
        public static final int BUTTON_SETGROUND = 11;

        public static final int BUTTON_DRIVE_FORWARD = 9;
        public static final int BUTTON_INTAKE_UP = 5;
        public static final int BUTTON_INTAKE_DOWN = 3;
        public static final int BUTTON_INTAKE_IN = 6;
        public static final int BUTTON_INTAKE_OUT = 4;
        public static final int BUTTON_ARMUP_GUITAR = 9;
        public static final int BUTTON_ARMDOWN_GUITAR = 8;
        public static final int BUTTON_INTAKE_GUITAR = 9; 
        public static final int BUTTON_OUTTAKE_GUITAR = 8;
        public static final int BUTTON_ARM_EXTEND_GUITAR = 1;
        public static final int BUTTON_ARM_RETRACT_GUITAR = 2;
        public static final int BUTTON_HAND_HOLD_GUITAR = 3;
        public static final int BUTTON_HAND_LETGO_GUITAR = 5;
        public static final int BUTTON_HAND_LETGO_HIGH_GUITAR = 4;
        public static final int BUTTON_RESETFOD = 1;
        


        // public static final int BUTTON_ARM_EXTEND = 1; 
        // public static final int BUTTON_ARM_RETRACT = 2; 
        public static final int BUTTON_POSITION = 2;

        public static final boolean CONTROL_TWOJOYSTICKS = true;
    }
   
    public final class ArmConstants {
        public static final int EXTEND_MOTOR_CAN = 11;
        public static final int BRAKE_1 = 0;
        public static final int BRAKE_2 = 4;
        public static final int ARM_PWM = 0;
        public static final int PIVOT_CAN = 12;
        public static final int LIMIT_SWITCH_DIO = 4;
        public static final double ARM_SPEED = 0.25;
        public static final boolean LOW_GEAR = true;

    }
    public final class HandConstants {
        public static final int HAND_MOTOR_CAN = 11;
        
        public static final int HAND_CYLINDER_UP = 1;
        public static final int HAND_CYLINDER_DOWN = 2;
    }
    public final class RollerConstants {
        public static final int ROLLER_MOTOR_CAN = 12;
    }
    


}  
