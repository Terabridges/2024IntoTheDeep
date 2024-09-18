package org.firstinspires.ftc.teamcode;
import org.firstinspires.ftc.robotcontroller.external.samples.SensorColor;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

import com.acmerobotics.roadrunner.Line;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.NormalizedColorSensor;
import com.qualcomm.robotcore.hardware.Servo;
@TeleOp(name = "ClawTest")

public class ClawTest extends LinearOpMode {
    NormalizedColorSensor colorSensor;
    public double distance;
    public boolean hasMoved = false;
    static final double MAX_POS     =  1.0;     // Maximum rotational position
    static final double MIN_POS     =  0.0;     // Minimum rotational position
    Servo   servo;
    double  position = (MAX_POS - MIN_POS) / 2; // Start at halfway position

    @Override public void runOpMode(){
        servo = hardwareMap.get(Servo.class, "left_hand");
        colorSensor = hardwareMap.get(NormalizedColorSensor.class, "sensor_color");
        waitForStart();
        while (opModeIsActive()) {
            distance = (((DistanceSensor) colorSensor).getDistance(DistanceUnit.CM));
            telemetry.addData("Distance (cm)", "%.3f", distance);
            telemetry.update();
            if (distance < 1.0){
                servo.setPosition(1.0);
            }
        }
    }
}
