/*package frc.team6220.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team6220.robot.Robot;
import frc.team6220.robot.subsystems.Pneumatics;

public class ElevatorTilt extends Command {

    private boolean isFinished;
    private boolean state = false;

    public ElevatorTilt(){
        requires(Robot.pneumatics);
    }

    protected void initialize(){
        isFinished = false;
        state = Pneumatics.elesol.get();
    }

    protected void execute(){
        if(state){
            Pneumatics.elesol.set(false);
        }
        else{
            Pneumatics.elesol.set(true);
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
*/
