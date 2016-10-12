
package testcar.Transmission.HandChange;

/**
 *
 * @author Dubyna P.V.
 */
public class FourStepHandChangeTransmission extends HandChangeTransmission{

    @Override
    public void changeGearUp() {
        if(handChangeTransmissionFactor4()) {
            //some method logic
            System.out.println("Gear up");            
        } else {
            //some method logic
            System.out.println("Transmission is not switched");
        }
    }

    @Override
    protected boolean handChangeTransmissionFactor4() {
        if (handChangeTransmissionFactor5() && handChangeTransmissionFactor3()){
            //some method logic
            return true; 
        } else {
            return false;
        }
    }
    
    private boolean handChangeTransmissionFactor5(){
        //some method logic
        return true;    
    }
    
   
    
}
