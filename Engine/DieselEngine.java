
package testcar.Engine;

/**
 *
 * @author Dubyna P.V.
 */
public class DieselEngine implements CarEngine{

    @Override
    public void startEngine() {
        if (dieselEngineFactor1()){
            //some method logic
            System.out.println("Diesel engine start");
        } else {
            //some method logic
            System.out.println("Check Diesel engine");
        }
    }

    @Override
    public void stopEngine() {
        if (dieselEngineFactor2()){
            //some method logic
            System.out.println("Diesel engine stop");
        } else {
            //some method logic
            System.out.println("Diesel engine is already stop");
        }
    }
    
    @Override
    public void increaseEngineSpeed() {
        if (dieselEngineFactor3()){
            System.out.println("Diesel engine speed increased");
        } else {
            System.out.println("Error in  dieselEngineFactor3()");
        }
    }

    @Override
    public void reduceEngineSpeed(){
        if (dieselEngineFactor2()){
            System.out.println("Diesel engine speed reduce");
        } else {
            System.out.println("Error in  dieselEngineFactor2()");
        }
    }
    
    private boolean dieselEngineFactor1(){
        //some method logic
        return true;
    }
    
    private boolean dieselEngineFactor2(){
        if(dieselEngineFactor1()){
            // some method logic
            return true;
        } else {
            System.out.println("Error in  dieselEngineFactor1()");
            return false;
        }
    }
    
    private boolean dieselEngineFactor3(){
        if(dieselEngineFactor2()){
            //some method logic
            return true;
        } else {
            System.out.println("Error in  dieselEngineFactor2()");
            return false;
        }
    }
     
}
