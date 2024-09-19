package org.firstinspires.ftc.teamcode.Main;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.robotcontroller.external.samples.RobotHardware;
import org.firstinspires.ftc.teamcode.Utility.RobotClass;

@TeleOp(name="MainTeleOp", group="Main")
public class MainTeleOp extends LinearOpMode {
    RobotClass robot = new RobotClass(this);

    @Override
    public void runOpMode(){
        robot.init();
        
        waitForStart();

    }
}
