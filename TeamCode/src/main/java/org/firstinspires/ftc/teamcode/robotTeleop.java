package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@com.qualcomm.robotcore.eventloop.opmode.TeleOp(name = "Default Drive", group = "TeleOp")
public class robotTeleop extends LinearOpMode
{
    //Subsystems
    Drive subDrive = Drive.getInstance();
    Shooter subShoot = Shooter.getInstance();
    @Override
    public void runOpMode() throws InterruptedException
    {
        subDrive.initialise();
        waitForStart();
        while(opModeIsActive())
        {
            if (!gamepad1.atRest())
            {
                subDrive.drive();
            }
            if (!gamepad1.a)
            {
                subShoot.operateShooter();
            }
        }
    }

}

