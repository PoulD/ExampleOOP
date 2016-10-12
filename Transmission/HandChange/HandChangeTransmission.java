
package testcar.Transmission.HandChange;

import testcar.Transmission.CarTransmission;

/**
 *
 * @author Dubyna P.V.
 */
public class HandChangeTransmission implements CarTransmission{

 @Override
    public void changeGearUp() {
        if(handChangeTransmissionFactor1()) {
            //some method logic
            System.out.println("Gear up");            
        } else {
            //some method logic
            System.out.println("Transmission is not switched");
        }
    }

    @Override
    public void changeGearDown() {
        if(handChangeTransmissionFactor2()) {
            //some method logic
            System.out.println("Gear down");            
        } else {
            //some method logic
            System.out.println("Transmission is not switched");
        }
    }

    @Override
    public void changeGearNeutral() {
        if(handChangeTransmissionFactor3()) {
            //some method logic
            System.out.println("Neutral gear engaged");            
        } else {
            //some method logic
            System.out.println("Transmission is not switched");
        }
    }

    @Override
    public void changeGearReverse() {
        if(handChangeTransmissionFactor4()) {
            //some method logic
            System.out.println("Reverse gear engaged");            
        } else {
            //some method logic
            System.out.println("Transmission is not switched");
        }
    }
    
    private boolean handChangeTransmissionFactor1(){
        //some method logic
        return true;
    }
    
    private boolean handChangeTransmissionFactor2(){
        //some method logic
        return true;
    }
    
    protected boolean handChangeTransmissionFactor3(){
        //some method logic
        return true;
    }
    
    protected boolean handChangeTransmissionFactor4(){
        //some method logic
        return true;
    }
    
}
