package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.Range;

public class Drive extends robotTeleop {
    private static Drive instance_ = new Drive();
    public static Drive getInstance()
    {
        return instance_;
    }
    private DcMotor driveLeft,driveRight;
    private float left, right;
    public void initialise()
    {
        driveLeft = hardwareMap.dcMotor.get("driveLeft");
        driveRight = hardwareMap.dcMotor.get("driveRight");
        driveLeft.setDirection(DcMotorSimple.Direction.REVERSE);
    }
    public void drive()
    {
        driveLeft.setPower(Range.clip(left, -1, 1));
        driveRight.setPower(Range.clip(right, -1, 1));
    }
    public void getJoystickValues()
    {
        float left, right;
        double deadzone = 0.2;
        left = gamepad1.left_stick_y;
        right = gamepad1.right_stick_y;
        if(Math.abs(left)<deadzone) left = 0;
        if(Math.abs(right)<deadzone) right = 0;
    }

}
