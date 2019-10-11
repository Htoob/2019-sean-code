package frc.team6220.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team6220.robot.RobotMap;
import frc.team6220.robot.commands.DefaultPneumatics;

public class Pneumatics extends Subsystem {

    public static Compressor compressor = new Compressor(RobotMap.Compressor);
    //public static Solenoid elesol = new Solenoid(RobotMap.ElevatorSol);
    public static Solenoid hatchsol = new Solenoid(RobotMap.HatchSol);

    public Pneumatics(){
        compressor.setClosedLoopControl(true);
        //elesol.set(false);
        hatchsol.set(false);
    }

    protected void initDefaultCommand(){
        setDefaultCommand(new DefaultPneumatics());
    }

}
