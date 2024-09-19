package org.firstinspires.ftc.teamcode.Utility;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;
import org.firstinspires.ftc.robotcontroller.external.samples.RobotHardware;
public class RobotClass{
    private LinearOpMode myOpMode = null;

    //Wheel Motors
    private DcMotor frontLeftDrive   = null;
    private DcMotor frontRightDrive  = null;
    private DcMotor backLeftDrive = null;
    private DcMotor backRightDrive = null;

    //Other Motors
    private DcMotor armMotor = null;

    //Servos
    private Servo leftHand = null;
    private Servo   rightHand = null;

    //Other Variables
    public static final double MID_SERVO       =  0.5 ;
    public static final double HAND_SPEED      =  0.02 ;  // sets rate to move servo
    public static final double ARM_UP_POWER    =  0.45 ;
    public static final double ARM_DOWN_POWER  = -0.45 ;

    // Define a constructor that allows the OpMode to pass a reference to itself.
    public RobotClass (LinearOpMode opmode) {
        myOpMode = opmode;
    }

    //Methods
    public void init()    {

        //Wheel Motors
        frontLeftDrive  = myOpMode.hardwareMap.get(DcMotor.class, "frontLeftDrive");
        frontRightDrive = myOpMode.hardwareMap.get(DcMotor.class, "frontRightDrive");
        backLeftDrive   = myOpMode.hardwareMap.get(DcMotor.class, "backLeftDrive");
        backRightDrive  = myOpMode.hardwareMap.get(DcMotor.class, "backRightDrive");

        //Wheel Directions
        frontLeftDrive.setDirection(DcMotor.Direction.REVERSE);
        frontRightDrive.setDirection(DcMotor.Direction.FORWARD);

        //Other Motors
        armMotor = myOpMode.hardwareMap.get(DcMotor.class, "arm");

        //Servos
        leftHand = myOpMode.hardwareMap.get(Servo.class, "left_hand");
        rightHand = myOpMode.hardwareMap.get(Servo.class, "right_hand");
        leftHand.setPosition(MID_SERVO);
        rightHand.setPosition(MID_SERVO);
    }
}
