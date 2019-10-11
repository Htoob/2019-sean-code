package frc.team6220.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import static frc.team6220.robot.Robot.pneumatics;

public class DefaultPneumatics extends Command {

    public DefaultPneumatics(){
        requires(pneumatics);
    }

    protected void initialize(){

    }

    protected void execute(){

    }

    protected boolean isFinished(){
        return false;
    }

    protected void end(){

    }

    protected void interrupted(){
        end();
    }
}
