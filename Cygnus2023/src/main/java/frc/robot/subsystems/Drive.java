package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drive extends SubsystemBase {

    //-----------------------características---------------------//
    //Hardware
    TalonSRX Rmotor1;
    TalonSRX Rmotor2;
    TalonSRX Lmotor3;
    TalonSRX Lmotor4;
    
    //Variables de logica
    double velocidad;

    double rightSpeed;
    double leftSpeed;

    double realRightSpeed;
    double realLeftSpeed;
    //INPUTS

    //OUTPUTS
// lol esperemos funcione 
    //-----------------------características---------------------//

    // constructor que se ejecuta una vez
    public Drive(){
        Rmotor1 = new TalonSRX(Constants.MotorFR);
        Rmotor2 = new TalonSRX(Constants.MotorBR);
        Lmotor3 = new TalonSRX(Constants.MotorFL);
        Lmotor4 = new TalonSRX(Constants.MotorBL);
        //cosas que iniciamos
        velocidad=0;
        realLeftSpeed=0;
        realRightSpeed=0;
    }

    //------------------------funciones del subsystem---------------//
    public void avanzar(double yInput,double xInput){
        if(yInput<0){
            rightSpeed = yInput+xInput;
            leftSpeed = yInput-xInput;
        }else{
            rightSpeed = yInput-xInput;
            leftSpeed = yInput+xInput;
        }

        realLeftSpeed = leftSpeed;
        realRightSpeed = rightSpeed;

        Rmotor1.set(ControlMode.PercentOutput,realRightSpeed);
        Rmotor2.set(ControlMode.PercentOutput,realRightSpeed);
        Lmotor3.set(ControlMode.PercentOutput,-realLeftSpeed);
        Lmotor4.set(ControlMode.PercentOutput,-realLeftSpeed);
    }

    public void stop(){
        velocidad=0;
    }

    //------------------------funciones del subsystema---------------//
}