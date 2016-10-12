
package testcar.Automobiles.TestCars;

import testcar.Engine.CarEngine;
import testcar.Engine.DieselEngine;
import testcar.Transmission.CarTransmission;
import testcar.Automobiles.LandVehicle;
import testcar.Transmission.Automatic.SixStepAutomaticTransmission;
import testcar.VehicleTypes.Bus;
import testcar.VehicleTypes.Taxi;
import testcar.VehicleTypes.Truck;

/**
 *
 * @author Dubyna P.V.
 */
public class MercedesVito extends LandVehicle implements Truck, Taxi, Bus{

    public MercedesVito() {
        super.model = (String) "Mercedes Vito";
        super.speed = (Integer) 230;
        super.weight = (Double) 2500.226;
        super.colour = (String) "Black";
        super.seats = (Integer) 7;
        super.carTransmission = (CarTransmission) new SixStepAutomaticTransmission();
        super.carEngine = (CarEngine) new DieselEngine();
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
    public void drivePassenger() {
        System.out.println("Drive passengesr in " + this.getModel());
    }

    @Override
    public void loadingCargo() {
        System.out.println("Loading cargo in  " + this.getModel());
    }

    @Override
    public void unloadingCargo() {
        System.out.println("Unloading of cargo from the " + this.getModel());
    }

    @Override
    public void counterOn() {
        System.out.println(this.getModel() + " counter is On");
    }

    @Override
    public void counterOff() {
        System.out.println( this.getModel() + " counter is Off");
    }
    
    @Override
    protected boolean controllFactor2() {
        if (controllFactor5()){
            // some method logic
            return true;
        } else {
            // some method logic
            return false;
        }
    }
    
    private boolean controllFactor5(){
        //some method logic
        return true;
    }
    
}