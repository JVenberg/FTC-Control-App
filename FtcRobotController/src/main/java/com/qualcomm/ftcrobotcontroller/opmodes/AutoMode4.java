package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

/**
 * Created by DKrakauer on 2/8/16.
 */
public class AutoMode4 extends AutoMode{

    @Override
    public void runOpMode() throws InterruptedException{
        super.runOpMode();
        waitForStart();

        motorRightBack.setTargetPosition(100);

        /*
        checkEverything();
        moveForward(300);
        turnRight(100);
        startSpinner();
        moveForward(4000);
        turnLeft(700);
        moveForward(4000);
        stopSpinner();
        turnLeft(700);
        moveForward(2000);
        turnLeft(350);
        moveForward(500);
    */


    }




}
