
package testcar.Automobiles.TestCars;

import testcar.Engine.CarEngine;
import testcar.Engine.GasEngine;
import testcar.Transmission.CarTransmission;
import testcar.Automobiles.LandVehicle;
import testcar.Transmission.Automatic.FiveStepAutomaticTransmission;
import testcar.VehicleTypes.SpecialCar;
import testcar.VehicleTypes.Taxi;

/**
 *
 * @author Dubyna P.V.
 */
public class ToyotaPrius extends LandVehicle implements SpecialCar, Taxi{

    public ToyotaPrius(){
        super.model = (String) "Toyota Prius";
        super.speed = (Integer) 255;
        super.weight = (Double) 2125.2;
        super.colour = (String) "White police car";
        super.seats = (Integer) 5;
        super.carTransmission = (CarTransmission) new FiveStepAutomaticTransmission();
        super.carEngine = (CarEngine) new GasEngine();
    }
     
    @Override
    public void drivePassenger() {
        System.out.println("Drive passengesr in " + this.getModel());
    }

    @Override
    public void specialSignalOn() {
        // some method logic
        System.out.println("Special signal is On");
        System.out.println("Beep Beep.....");
    }

    @Override
    public void specialSignalOff() {
         System.out.println("Special signal is Off");
    }

    @Override
    public void counterOn() {
        System.out.println("Counter in " + this.getModel() + " is On");
    }

    @Override
    public void counterOff() {
        System.out.println("Counter in " + this.getModel() + " is Off");
    }
    
    @Override
    protected boolean controllFactor3() {
        if (controllFactor4()){
            // some method logic
            return true;
        } else {
            // some method logic
            return false;
        }
    }
    
    private boolean controllFactor4(){
        //some method logic
        return true;
    }
      
}
