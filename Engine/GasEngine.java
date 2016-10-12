
package testcar.Engine;

/**
 *
 * @author Dubyna P.V.
 */
public class GasEngine implements CarEngine{

    @Override
    public void startEngine() {
        if (gasEngineFactor1()){
            //some method logic
            System.out.println("Gas engine start");
        } else {
            //some method logic
            System.out.println("Check gas engine");
        }
    }

    @Override
    public void stopEngine() {
        if (gasEngineFactor3()){
            //some method logic
            System.out.println("Gas engine stop");
        } else {
            //some method logic
            System.out.println("Gas engine is already stop");
        }
    }
   
    @Override
    public void increaseEngineSpeed() {
        if (gasEngineFactor3()){
            System.out.println("Gas engine speed increased");
        } else {
            System.out.println("Error in  gasEngineFactor3()");
        }
    }

    @Override
    public void reduceEngineSpeed(){
        if (gasEngineFactor4() && gasEngineFactor2()){
            System.out.println("Gas Engine speed reduce");
        } else {
            System.out.println("Error in  gasEngineFactor2()");
        }
    }
    
    private boolean gasEngineFactor1(){
        //some metod logic
        return true;
    }
    
    private boolean gasEngineFactor2(){
        if(gasEngineFactor1()){
            // some method logic
            return true;
        } else {
            System.out.println("Error in  gasEngineFactor1()");
            return false;
        }
    }
    
    private boolean gasEngineFactor3(){
        if(gasEngineFactor2()){
            // some method logic
            return true;
        } else {
            System.out.println("Error in  gasEngineFactor2()");
            return false;
        }
    }
    
    private boolean gasEngineFactor4(){
        // some method logic
        return true;
       
    }
   
}
