
package testcar.Transmission.Automatic;

/**
 *
 * @author Dubyna P.V.
 */
public class FourStepAutomaticTransmission extends AutomaticTransmission {
    
    @Override
    public void changeGearUp() {
        if(automaticTransmissionFactor5() && automaticTransmissionFactor4()){
          System.out.println("Gear up");        
        } else { 
            System.out.println("Transmission is not switched");
        }
    }
    
    protected boolean automaticTransmissionFactor5(){
        //some method logic
        if(automaticTransmissionFactor3()){
        return true;
        } else {
        return false;
        }
    }
 
}
