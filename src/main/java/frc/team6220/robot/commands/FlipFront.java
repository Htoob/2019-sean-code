package frc.team6220.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import static frc.team6220.robot.Robot.driveTrain;

public class FlipFront extends Command {

    private  boolean isFinished;

    public FlipFront(){
        requires(driveTrain);
    }

    protected void initialize(){
        isFinished = false;
    }

    protected void execute(){
        if(driveTrain.flipped ){
            driveTrain.flipped = false;
        }
        else{
            driveTrain.flipped = true;
        }
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
