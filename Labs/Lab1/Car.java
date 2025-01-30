/*
Program description: 
    - contains Car class
    - contains attrs for owner name, registration number, max speed, colour, automatic/manual, no. of wheels.
    - a constructor that sets uup the owner name w a value and a regristration with a value
Author: Renée Low
Date: 30/01/25
*/

public class Car {
    // class variables
    private String ownerName;
    private int regNum;
    private int maxSpeed;
    private String colour;
    private int wheelNum;

    // constructor for car's owner and registration number
    public Car(String ownerName, int regNum) {
        this.ownerName = ownerName;
        this.regNum = regNum;
    }

    // 2nd constructor to set up all the attrs with values
    public Car(String ownerName, int regNum, int speed, String colour, int wheels) {
        this.ownerName = ownerName;
        this.regNum = regNum;
        maxSpeed = speed;
        this.colour = colour;
        wheelNum = wheels;
    }

    // constructor to print out the information of each owner and their car details
    public String toString() {
        return "This car has owner name " + ownerName + ", has a registration plate of " + regNum + ", is of colour " + colour + " with a max speed of " + maxSpeed + "km/h, and " + wheelNum + " wheels";
    }
}
