
package testcar.Transmission.HandChange;

/**
 *
 * @author Dubyna P.V.
 */
public class FiveStepHandChangeTransmission extends FourStepHandChangeTransmission{

    @Override
    public void changeGearReverse() {
        if(handChangeTransmissionFactor4() && handChangeTransmissionFactor6()) {
            //some method logic
            System.out.println("Reverse gear engaged");            
        } else {
            //some method logic
            System.out.println("Transmission is not switched");
        }
    }
    
    
    private boolean handChangeTransmissionFactor6(){
        //some method logic
        return true;
    }
}
