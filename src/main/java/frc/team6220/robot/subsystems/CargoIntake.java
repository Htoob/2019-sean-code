package frc.team6220.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team6220.robot.RobotMap;
import frc.team6220.robot.commands.TeleopCargoIntake;

public class CargoIntake extends Subsystem {

    private TalonSRX lint = new TalonSRX(RobotMap.LCargoIntake);
    //private TalonSRX rint = new TalonSRX(RobotMap.RCargoIntake);

    public CargoIntake(){
        lint.setNeutralMode(NeutralMode.Coast);
        //rint.setNeutralMode(NeutralMode.Coast);
    }

    protected void initDefaultCommand(){
        setDefaultCommand(new TeleopCargoIntake());
    }

    public void succ(ControlMode mode, double speed){
        lint.set(mode, speed);
        //rint.set(mode, -speed);
    }

    public void yeet(ControlMode mode, double speed){
        lint.set(mode, -speed);
        //rint.set(mode, speed);
    }

    public void stop(){
        succ(ControlMode.PercentOutput, 0);
    }
}
