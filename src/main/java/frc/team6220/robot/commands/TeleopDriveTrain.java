package frc.team6220.robot.commands;

import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.command.Command;
import frc.team6220.robot.Robot;

import static frc.team6220.robot.Robot.driveTrain;

public class TeleopDriveTrain extends Command {

    public static double multiplier;
    public TeleopDriveTrain(){
        requires(driveTrain);
    }
    
    protected void initialize(){
        multiplier = 0.45;
    }

    protected void execute(){
        if(Robot.oi.rjoy.getRawButton(5)){
            multiplier = 1.0;
        }
        else{
            multiplier = 0.45;
        }
        if(driveTrain.flipped) {
            if (Robot.oi.ljoy.getTrigger() && Robot.oi.rjoy.getTrigger()) {
                driveTrain.set(ControlMode.PercentOutput, Robot.oi.ljoy.getY() * -(Robot.oi.ljoy.getThrottle() - 1) * multiplier, Robot.oi.rjoy.getY() * -(Robot.oi.rjoy.getThrottle() - 1) * multiplier);
            } else if (Robot.oi.ljoy.getTrigger()) {
                driveTrain.set(ControlMode.PercentOutput, Robot.oi.ljoy.getY() * -(Robot.oi.ljoy.getThrottle() - 1) * multiplier, 0);
            } else if (Robot.oi.rjoy.getTrigger()) {
                driveTrain.set(ControlMode.PercentOutput, 0, Robot.oi.rjoy.getY() * -(Robot.oi.rjoy.getThrottle() - 1) * multiplier);
            } else {
                driveTrain.stop();
            }
        }
        else{
            if (Robot.oi.ljoy.getTrigger() && Robot.oi.rjoy.getTrigger()) {
                driveTrain.antiset(ControlMode.PercentOutput, Robot.oi.ljoy.getY() * -(Robot.oi.ljoy.getThrottle() - 1) * multiplier, Robot.oi.rjoy.getY() * -(Robot.oi.rjoy.getThrottle() - 1) * multiplier);
            } else if (Robot.oi.ljoy.getTrigger()) {
                driveTrain.antiset(ControlMode.PercentOutput, Robot.oi.ljoy.getY() * -(Robot.oi.ljoy.getThrottle() - 1) * multiplier, 0);
            } else if (Robot.oi.rjoy.getTrigger()) {
                driveTrain.antiset(ControlMode.PercentOutput, 0, Robot.oi.rjoy.getY() * -(Robot.oi.rjoy.getThrottle() - 1) * multiplier);
            } else {
                driveTrain.stop();
            }
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
