
package testcar.Transmission.Automatic;

import testcar.Transmission.CarTransmission;

/**
 *
 * @author Dubyna P.V.
 */
public class AutomaticTransmission implements CarTransmission{

    @Override
    public void changeGearUp() {
        if(automaticTransmissionFactor1()) {
            //some method logic
            System.out.println("Gear up");            
        } else {
            //some method logic
            System.out.println("Transmission is not switched");
        }
    }

    @Override
    public void changeGearDown() {
        if(automaticTransmissionFactor2()) {
            //some method logic
            System.out.println("Gear down");            
        } else {
            //some method logic
            System.out.println("Transmission is not switched");
        }
    }

    @Override
    public void changeGearNeutral() {
        if(automaticTransmissionFactor3()) {
            //some method logic
            System.out.println("Neutral gear engaged");            
        } else {
            //some method logic
            System.out.println("Transmission is not switched");
        }
    }

    @Override
    public void changeGearReverse() {
        if(automaticTransmissionFactor4()) {
            //some method logic
            System.out.println("Reverse gear engaged");            
        } else {
            //some method logic
            System.out.println("Transmission is not switched");
        }
    }
    
    private boolean automaticTransmissionFactor1(){
        //some method logic
        return true;
    }
    
    private boolean automaticTransmissionFactor2(){
        //some method logic
        return true;
    }
    
    protected boolean automaticTransmissionFactor3(){
        //some method logic
        return true;
    }
    
    protected boolean automaticTransmissionFactor4(){
        //some method logic
        return true;
    }
    
}
