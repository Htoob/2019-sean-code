package frc.team6220.robot.commands;

import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.command.Command;
import frc.team6220.robot.Robot;

public class HatchToggle extends Command {
    private boolean isFinished;
    private static boolean state = false;

    public HatchToggle(){
        requires(Robot.pneumatics);
    }

    protected void initialize(){
        isFinished = false;
        state = Robot.pneumatics.hatchsol.get();
    }

    /*protected void execute(){
        if(state){
            Robot.pneumatics.hatchsol.set(false);
            NetworkTableInstance.getDefault().getTable("limelight-yanna").getEntry("ledMode").setNumber(1);
        }
        else{
            Robot.pneumatics.hatchsol.set(true);
            NetworkTableInstance.getDefault().getTable("limelight-yanna").getEntry("ledMode").setNumber(3);
        }
        isFinished = true;
    }
    */

    protected boolean isFinished(){
        return isFinished;
    }

    protected void end(){

    }

    protected void interrupted(){
        end();
    }
}
