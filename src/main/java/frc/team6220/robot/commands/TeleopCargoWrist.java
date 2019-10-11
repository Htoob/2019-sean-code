package frc.team6220.robot.commands;

import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.command.Command;
import frc.team6220.robot.Robot;

import static frc.team6220.robot.Robot.cargoWrist;

/*public class TeleopCargoWrist extends Command {

    public TeleopCargoWrist(){
        requires(cargoWrist);
    }

    protected void initialize(){

    }

    protected void execute(){
        if(Robot.oi.rxbox.getBumper(GenericHID.Hand.kLeft)) {
            cargoWrist.set(ControlMode.PercentOutput, Robot.oi.rxbox.getY(GenericHID.Hand.kLeft) * 0.65);
        }
        else if(Robot.oi.lxbox.getBumper(GenericHID.Hand.kRight)) {
            cargoWrist.set(ControlMode.PercentOutput, -Robot.oi.lxbox.getY(GenericHID.Hand.kLeft) * 0.65);
        }
        else{
            cargoWrist.stop();
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
*/
