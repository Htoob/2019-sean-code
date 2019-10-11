package frc.team6220.robot.commands;

import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.command.Command;
import frc.team6220.robot.Robot;

import static frc.team6220.robot.Robot.elevator;

public class TeleopElevator extends Command {

    public TeleopElevator(){
        requires(elevator);
    }

    protected void initialize(){

    }

    protected void execute(){
        if(Robot.oi.lxbox.getBumper(GenericHID.Hand.kLeft)) {
            elevator.set(ControlMode.PercentOutput, -Robot.oi.lxbox.getY(GenericHID.Hand.kLeft) * 0.75);
        }
        else{
            elevator.stop();
        }
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
