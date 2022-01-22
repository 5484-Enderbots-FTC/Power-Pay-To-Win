package org.firstinspires.ftc.teamcode.frieght_frenzy_code;
import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.drive.FFMecanumDrive;
public class autoTrajectories {

    Pose2d startPoseRC = new Pose2d(-31, -65.75);
    Pose2d startPoseRW = new Pose2d(10, 10);
    Pose2d startPoseBC = new Pose2d(10, 10);
    Pose2d startPoseBW = new Pose2d(10, 10);

    Vector2d toParkPos1 = new Vector2d(12, -67);
    Vector2d toParkPos2 = new Vector2d(40, -67);

}
