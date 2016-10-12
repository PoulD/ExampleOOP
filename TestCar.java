
package testcar;

import testcar.Automobiles.LandVehicle;
import testcar.Automobiles.TestCars.LuAZ;
import testcar.Automobiles.TestCars.MercedesVito;
import testcar.Automobiles.TestCars.ToyotaPrius;
import testcar.VehicleTypes.Bus;
import testcar.VehicleTypes.PassengerCar;
import testcar.VehicleTypes.SpecialCar;
import testcar.VehicleTypes.Taxi;
import testcar.VehicleTypes.Truck;
import testcar.Сomparison.CarСomparison;
import testcar.Сomparison.SimpleComparison;

/**
 *
 * @author Dubyna P.V.
 */
public class TestCar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MercedesVito vito = new MercedesVito();
        vito.drivePassenger();
        vito.runCar();
        // Exception. Private and protected methods available
        // vito.controllFactor1(); 
        // vito.controllFactor4();
      
        /**
         * ToyotaPrius is a LandVehicle
         * But not always the LandVehicle is a ToyotaPrius
         * Now prius is downcasting to LandVehicle
         */
        LandVehicle prius = new ToyotaPrius();
        
         /**
         * Now prius is downcasting to Taxi and implements all Taxi and
         * Passenger car methods, because Taxi extends PassengerCar interface
         */
        if(prius instanceof Taxi){
            ((Taxi)prius).counterOn(); //Taxi method
            ((Taxi)prius).counterOff(); //Taxi method            
            ((Taxi)prius).runCar(); //PassengerCar metod
            ((Taxi)prius).stopCar(); ////PassengerCar metod
        }
       
        /**
         * Different behavior of objects supported by a common interface
         * 
         */
        Bus vitoBus = new MercedesVito();
        Bus luAZ = new LuAZ();
        vitoBus.ticketPunch();
        luAZ.ticketPunch();
        vitoBus.runCar();
        luAZ.runCar();
        
        /**
         * Work client code with the interface without knowing the actual use
         * of a class implements this interface
         */
        SpecialCar police = new ToyotaPrius();
        PassengerCar mercedes = new MercedesVito();
        Truck vitoTruck = new MercedesVito();
        Taxi mercedesTaxi = new MercedesVito();
        Taxi priusTaxi = new ToyotaPrius();
        
        CarСomparison comparison = new SimpleComparison();
        comparison.whoFaster(mercedes, police);
        comparison.whoHeavier(luAZ, priusTaxi);
    }
    
}
