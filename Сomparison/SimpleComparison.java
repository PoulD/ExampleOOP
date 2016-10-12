
package testcar.Сomparison;

import testcar.VehicleTypes.PassengerCar;

/**
 *
 * @author Dubyna P.V.
 */
public class SimpleComparison implements CarСomparison{

    private Number firstVehicleParametr;
    private Number secondVehicleParametr;
    private Object model;
    
    @Override
    public void whoFaster(PassengerCar firstVehicle, PassengerCar secondVehicle) {
        firstVehicleParametr = firstVehicle.getSpeed();
        secondVehicleParametr = secondVehicle.getSpeed();
        System.out.println((String)returnLargeParameter(firstVehicle,
                secondVehicle).getModel() +" " + "Faster");
    }

    @Override
    public void whoHeavier(PassengerCar firstVehicle, PassengerCar secondVehicle) {
        firstVehicleParametr = firstVehicle.getWeight();
        secondVehicleParametr = secondVehicle.getWeight();
        System.out.println((String)returnLargeParameter(firstVehicle,
                secondVehicle).getModel() +" " + "Heavier");
    }
    
    private PassengerCar returnLargeParameter
        (PassengerCar firstVehicle, PassengerCar secondVehicle){
        if (firstVehicleParametr.doubleValue() > secondVehicleParametr.doubleValue()){
            return firstVehicle;             
        } else {
            return secondVehicle;
        }
    }

}

  

