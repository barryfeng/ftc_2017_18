package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;

public class Shooter extends robotTeleop {
    private static Shooter instance_ = new Shooter();
    public static Shooter getInstance()
    {
        return instance_;
    }
    private boolean trigger;
    private DcMotor shootMotor;
    public void operateShooter()
    {
        if (trigger)
        {
            shootMotor.setPower(1);
        }
        else
        {
            shootMotor.setPower(0);
        }
    }
    public void getJoystickValues()
    {
        trigger = gamepad1.a;
    }
}
