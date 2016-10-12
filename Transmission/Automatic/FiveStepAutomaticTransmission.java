
package testcar.Transmission.Automatic;

/**
 *
 * @author Dubyna P.V.
 */
public class FiveStepAutomaticTransmission extends FourStepAutomaticTransmission{

    @Override
    public void changeGearNeutral() {
        if(automaticTransmissionFactor5()) {
            //some method logic
            System.out.println("Neutral gear engaged");            
        } else {
            //some method logic
            System.out.println("Transmission is not switched");
        }
    }
    
    @Override
    protected boolean automaticTransmissionFactor5() {
        if (automaticTransmissionFactor6() && automaticTransmissionFactor4()){
            //some method logic
            return true;
        } else {
            return false;
        }
    }
    
    private boolean automaticTransmissionFactor6(){
        if(automaticTransmissionFactor3()){
            //some method logic
            return true;
        } else {
            return false;
        }
    }
    
    
}
