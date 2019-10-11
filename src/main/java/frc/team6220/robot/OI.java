package frc.team6220.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
//import frc.team6220.robot.commands.EjectHatch;
//import frc.team6220.robot.commands.ElevatorTilt;
import frc.team6220.robot.commands.FlipFront;
import frc.team6220.robot.commands.HatchToggle;

public class OI {

    public Joystick rjoy = new Joystick(RobotMap.Rjoy);
    public Joystick ljoy = new Joystick(RobotMap.Ljoy);
    public XboxController rxbox = new XboxController(RobotMap.Rxbox);
    public XboxController lxbox = new XboxController(RobotMap.Lxbox);

    public Button tiltbutton = new JoystickButton(lxbox, 3);
    public Button hatchbutton = new JoystickButton(lxbox, 2);
    public Button flipbutton = new JoystickButton(rjoy, 6);

    public OI (){
        //tiltbutton.whenPressed(new ElevatorTilt());
        hatchbutton.whenPressed(new HatchToggle());
        flipbutton.whenPressed(new FlipFront());
    }
}
