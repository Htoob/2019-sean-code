/*package frc.team6220.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team6220.robot.RobotMap;
import frc.team6220.robot.commands.TeleopCargoIntake;
import frc.team6220.robot.commands.TeleopCargoWrist;

public class CargoWrist extends Subsystem {

    private TalonSRX lwrist = new TalonSRX(RobotMap.LCargoWrist);

    private TalonSRX rwrist = new TalonSRX(RobotMap.RCargoWrist);

    public CargoWrist(){
        lwrist.setNeutralMode(NeutralMode.Coast);
        rwrist.setNeutralMode(NeutralMode.Coast);
    }
    protected void initDefaultCommand(){
        setDefaultCommand(new TeleopCargoWrist());
    }

    public void set(ControlMode mode, double speed){
        lwrist.set(mode, speed);
        rwrist.set(mode, speed);
    }

    public void stop(){
        set(ControlMode.PercentOutput, 0);
    }
}
*/