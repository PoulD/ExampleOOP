
package testcar.Automobiles.TestCars;

import testcar.Engine.CarEngine;
import testcar.Engine.DieselEngine;
import testcar.Transmission.CarTransmission;
import testcar.VehicleTypes.Bus;
import testcar.Automobiles.LandVehicle;
import testcar.Transmission.HandChange.SixStepHandChangeTransmission;

/**
 *
 * @author Dubyna P.V.
 */
public class LuAZ extends LandVehicle implements Bus{

    public LuAZ() {
        super.model = (String) "Luaz";
        super.speed = (Integer) 140;
        super.weight = (Double) 3200.0;
        super.colour = (String) "Yellow";
        super.seats = (Integer) 50;
        super.carTransmission = (CarTransmission) new SixStepHandChangeTransmission();
        super.carEngine = (CarEngine) new DieselEngine();
    }
    
    
    @Override
    public void drivePassenger() {
        //some metod logic
        System.out.println("Drive passengers in " + this.getModel());
    }

    @Override
    public void ticketPunch() {
        //some method logic
        System.out.println("Ticket panched on " + this.getModel());
    }

    @Override
    public void declareMessageSpeakerphone() {
        //some metod logic
        System.out.println("Next sattion .................");
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
