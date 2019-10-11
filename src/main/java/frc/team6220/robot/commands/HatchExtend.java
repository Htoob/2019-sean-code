package frc.team6220.robot.commands;

import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.command.Command;
import frc.team6220.robot.Robot;

public class HatchExtend extends Command {

    private boolean isFinished;
    private static boolean state = false;

    public HatchExtend(){
        requires(Robot.pneumatics);
    }

    protected void initialize(){
        isFinished = true;
        state = Robot.pneumatics.hatchsol.get();
    }

    protected void execute(){
        if(isFinished) {
            Robot.pneumatics.hatchsol.set(true);
            NetworkTableInstance.getDefault().getTable("limelight-yanna").getEntry("ledMode").setNumber(3);
        }
        isFinished = false;
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
