package frc.team6220.robot.commands;

import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.command.Command;
import frc.team6220.robot.Robot;

public class HatchRetract extends Command {
    private boolean isFinished;
    private static boolean state = false;

    public HatchRetract(){
        requires(Robot.pneumatics);
    }

    protected void initialize(){
        isFinished = false;
        state = Robot.pneumatics.hatchsol.get();
    }

    protected void execute(){
        Robot.pneumatics.hatchsol.set(false);
        NetworkTableInstance.getDefault().getTable("limelight-yanna").getEntry("ledMode").setNumber(1);
        isFinished = true;
    }

    protected boolean isFinished(){
        return isFinished;
    }

    protected void end(){

    }

    protected void interrupted(){
        end();
    }
}
