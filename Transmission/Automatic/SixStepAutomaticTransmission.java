
package testcar.Transmission.Automatic;

/**
 *
 * @author Dubyna P.V.
 */
public class SixStepAutomaticTransmission extends FiveStepAutomaticTransmission{

    @Override
    public void changeGearReverse() {
        if(automaticTransmissionFactor7()) {
            //some method logic
            System.out.println("Reverse gear engaged");            
        } else {
            //some method logic
            System.out.println("Transmission is not switched");
        }
    }
    
    protected boolean automaticTransmissionFactor7(){
        //some method logic
        return true;
        
    }

}
