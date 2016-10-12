
package testcar.Automobiles;

/**
 *
 * @author Dubyna P.V.
 */
abstract class Vehicle{
	
        protected Object model;
	protected Object colour;
	protected Number weight;
	protected Number seats;
	protected Number speed;

    public Object getModel() {
        return model;
    }

    public void setModel(Object model) {
        this.model = model;
    }
        
    public Object getColour() {
        return colour;
    }

    public void setColour(Object colour) {
        this.colour = colour;
    }

    public Number getWeight() {
        return weight;
    }

    public void setWeight(Number weight) {
        this.weight = weight;
    }

    public Number getSeats() {
        return seats;
    }

    public void setSeats(Number seats) {
        this.seats = seats;
    }

    public Number getSpeed() {
        return speed;
    }

    public void setSpeed(Number speed) {
        this.speed = speed;
    }



}