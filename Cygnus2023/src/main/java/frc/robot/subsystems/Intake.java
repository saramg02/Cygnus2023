package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class intake extends SubsystemBase {
    
    //---------------características-----------------//
    //Hardware
    TalonSRX motorIntake1;

    //variables de logica
    double intakeSpeed;
    
    
    //---------------características-----------------//
    
    //constructor
    public intake(){
        intakeSpeed=0;
        motorIntake1 =  new TalonSRX(0);
    }

    //-------------funciones------------------------//
    public void activarIntake(/*argumentos de la funcion*/){
        intakeSpeed=-0.8;
        motorIntake1.set(ControlMode.PercentOutput, -0.8);
    }

    //-------------funciones------------------------//
}
