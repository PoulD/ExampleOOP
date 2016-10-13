
package testcar.Automobiles;

import testcar.Engine.CarEngine;
import testcar.Transmission.CarTransmission;
import testcar.VehicleTypes.PassengerCar;

/**
 *
 * @author Dubyna P.V.
 */
public class LandVehicle extends Vehicle implements PassengerCar{
	
    protected CarTransmission carTransmission; 
    protected CarEngine carEngine; 
   

    public CarTransmission getCarTransmission() {
        return carTransmission;
    }

    public void setCarTransmission(CarTransmission carTransmission) {
        this.carTransmission = carTransmission;
    }

    public CarEngine getCarEngine() {
        return carEngine;
    }

    public void setCarEngine(CarEngine carEngine) {
        this.carEngine = carEngine;
    }

    @Override
    public void runCar() {
        if (controllFactor3()){
            chekRunCar(carTransmission, carEngine);
            System.out.println(this.getModel() + " run");
        } 
    }

    @Override
    public void stopCar() {
        if (controllFactor2()){
            chekStopCar(carTransmission, carEngine);
            System.out.println(this.getModel() + " stop");
        }
    }

    @Override
    public void drivePassenger() {
    }

    protected void chekRunCar(CarTransmission carTransmission, CarEngine carEngine) {
        try { 
            carTransmission.changeGearNeutral();
            carEngine.startEngine();
            carTransmission.changeGearUp();
            carEngine.increaseEngineSpeed();
        } catch (Exception e){
            System.out.println(e);
            System.out.println("We have some problem");
        }
       
    }

    protected void chekStopCar(CarTransmission carTransmission, CarEngine carEngine) {
        try {
            carTransmission.changeGearNeutral();
            carEngine.reduceEngineSpeed();
            carEngine.stopEngine();
        } catch (Exception e){
            System.out.println(e);
            System.out.println("We have some problem");
        }
    }

    protected boolean controllFactor2(){
        if (controllFactor1()){
            // some method logic
            return true;
        } else {
            // some method logic
            return false;
        }
    }
    
    protected boolean controllFactor3(){
        if (controllFactor2()){
            // some method logic
            return true;
        } else {
            // some method logic
            return false;
        }
    }
	
    private boolean controllFactor1(){
        // some method logic
        return true;
    }
}
