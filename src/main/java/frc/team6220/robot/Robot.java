package frc.team6220.robot;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.team6220.robot.commands.*;
import frc.team6220.robot.subsystems.*;

public class Robot extends TimedRobot {

    Command defaultPneumatics;
    Command teleopDriveTrain;
    Command teleopElevator;
    Command teleopCargoIntake;
    Command teleopCargoWrist;

    public static Pneumatics pneumatics;
    public static DriveTrain driveTrain;
    public static Elevator elevator;
    public static CargoIntake cargoIntake;
    public static CargoWrist cargoWrist;
    public static OI oi;

    @Override
    public void robotInit() {
        pneumatics = new Pneumatics();
        driveTrain = new DriveTrain();
        elevator = new Elevator();
        cargoIntake = new CargoIntake();
        cargoWrist = new CargoWrist();
        oi = new OI();

        defaultPneumatics = new DefaultPneumatics();
        teleopDriveTrain = new TeleopDriveTrain();
        teleopElevator = new TeleopElevator();
        teleopCargoIntake = new TeleopCargoIntake();
        teleopCargoWrist = new TeleopCargoWrist();


        SmartDashboard.putData(pneumatics);
        SmartDashboard.putData(driveTrain);
        SmartDashboard.putData(elevator);
        SmartDashboard.putData(cargoIntake);
        SmartDashboard.putData(cargoWrist);

        CameraServer.getInstance().startAutomaticCapture();
    }

    @Override
    public void autonomousInit() {

    }

    @Override
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
        LiveWindow.updateValues();
    }

    @Override
    public void teleopInit() {

    }

    @Override
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void testInit() {

    }

    @Override
    public void testPeriodic() {
        LiveWindow.updateValues();
    }

    @Override
    public void disabledInit() {

    }

    @Override
    public void disabledPeriodic() {

    }
}
