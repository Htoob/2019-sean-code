package frc.team6220.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team6220.robot.RobotMap;
import frc.team6220.robot.commands.TeleopDriveTrain;

public class DriveTrain extends Subsystem {

    private VictorSPX L1 = new VictorSPX(RobotMap.Ldrive1);
    private VictorSPX L2 = new VictorSPX(RobotMap.Ldrive2);
    private VictorSPX R1 = new VictorSPX(RobotMap.Rdrive1);
    private VictorSPX R2 = new VictorSPX(RobotMap.Rdrive2);

    public boolean flipped = true;

    public DriveTrain(){
        L1.setNeutralMode(NeutralMode.Coast);
        L2.setNeutralMode(NeutralMode.Coast);
        R1.setNeutralMode(NeutralMode.Coast);
        R2.setNeutralMode(NeutralMode.Coast);
    }

    protected void initDefaultCommand(){
        setDefaultCommand(new TeleopDriveTrain());
    }

    public void set(ControlMode mode, double leftSpeed, double rightSpeed){

        L1.set(mode, leftSpeed);
        L2.set(mode, -leftSpeed);
        R1.set(mode, rightSpeed);
        R2.set(mode, -rightSpeed);
    }

    public void antiset(ControlMode mode, double leftSpeed, double rightSpeed){

        L1.set(mode, -rightSpeed);
        L2.set(mode, rightSpeed);
        R1.set(mode, -leftSpeed);
        R2.set(mode, leftSpeed);
    }

    public void stop(){
        set(ControlMode.PercentOutput, 0, 0);
    }
}
