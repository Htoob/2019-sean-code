package frc.team6220.robot.commands;

import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.command.Command;
import frc.team6220.robot.Robot;

import static frc.team6220.robot.Robot.cargoIntake;

public class TeleopCargoIntake extends Command {

    public TeleopCargoIntake(){
        requires(cargoIntake);
    }

    protected void initialize(){

    }

    protected void execute() {
        if (Robot.oi.rxbox.getBButton()) {
            cargoIntake.succ(ControlMode.PercentOutput, 0.4);
        } else if (Robot.oi.rxbox.getYButton()) {
            cargoIntake.yeet(ControlMode.PercentOutput, 1);
        } else if (Robot.oi.lxbox.getAButton()) {
            cargoIntake.succ(ControlMode.PercentOutput, 0.4);
        } else if (Robot.oi.lxbox.getYButton()) {
            cargoIntake.yeet(ControlMode.PercentOutput, 1);
        } else {
            cargoIntake.stop();
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
