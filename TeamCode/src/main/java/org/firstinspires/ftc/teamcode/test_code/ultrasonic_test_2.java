package org.firstinspires.ftc.teamcode.test_code;

import com.qualcomm.hardware.modernrobotics.ModernRoboticsI2cRangeSensor;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;
import org.firstinspires.ftc.teamcode.frieght_frenzy_code.hardwareFF;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import org.firstinspires.ftc.teamcode.ultimate_goal_code.hardwareUltimateGoal;

@Disabled
@TeleOp(name = "ultrasonic 2 electric boogaloo", group = "testing")
//@Disabled

public class ultrasonic_test_2 extends LinearOpMode {
    ElapsedTime runtime = new ElapsedTime();
    ElapsedTime timer = new ElapsedTime();

    hardwareFF robot = new hardwareFF();
    ModernRoboticsI2cRangeSensor rangeSensor;

    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(hardwareMap);
        //robot.initShooterPID(hardwareMap);

        /**
         * - I2C port
         * - needs level shifter
         * - ultrasonic used for accurate far distances up to 255cm
         * - switches to optical distance sensor for distances accurate between 1cm and 7cm
         */
        //telemetry = new MultipleTelemetry(telemetry, FtcDashboard.getInstance().getTelemetry());
        telemetry.addData("Status", "Initialized");
        telemetry.addData("Status", "Run Time: " + runtime.toString());
        telemetry.update();

        waitForStart();

        while (!isStopRequested() && opModeIsActive()) {

            //robot.updateDrive(gamepad1.left_stick_y,gamepad1.left_stick_x,gamepad1.right_stick_x);

            telemetry.addData("raw ultrasonic", robot.backRange.rawUltrasonic());
            telemetry.addData("raw optical", robot.backRange.rawOptical());
            telemetry.addData("cm", "%.2f cm", robot.backRange.getDistance(DistanceUnit.CM));
            telemetry.update();
        }

    }

}


















