
package testcar.Transmission.HandChange;

/**
 *
 * @author Dubyna P.V.
 */
public class SixStepHandChangeTransmission extends FiveStepHandChangeTransmission{

    @Override
    public void changeGearUp() {
        if(handChangeTransmissionFactor7() && handChangeTransmissionFactor8()) {
            //some method logic
            System.out.println("Gear up");            
        } else {
            //some method logic
            System.out.println("Transmission is not switched");
        }
    }
    
    private boolean handChangeTransmissionFactor7(){
        //some method logic
        return true;
    }
    private boolean handChangeTransmissionFactor8(){
        //some method logic
        return true;
    }
    
}
