package frc.team6220.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team6220.robot.RobotMap;
import frc.team6220.robot.commands.TeleopElevator;

public class Elevator extends Subsystem {

    private VictorSPX e1 = new VictorSPX(RobotMap.Elevator1);
    private VictorSPX e2 = new VictorSPX(RobotMap.Elevator2);

    public Elevator (){
        e1.setNeutralMode(NeutralMode.Coast);
        e2.setNeutralMode(NeutralMode.Coast);
    }

    protected void initDefaultCommand(){
        setDefaultCommand(new TeleopElevator());
    }

    public void set(ControlMode mode, double speed){
        e1.set(mode, speed);
        e2.set(mode, speed);
    }

    public void stop(){
        set(ControlMode.PercentOutput, 0);
    }
}
