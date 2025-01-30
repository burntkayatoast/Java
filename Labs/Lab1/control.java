/* 
Control: the purpose of this class is to run the content of the Car.java
Author: Renée Low
Date: 30/01/25
*/

public class Control {
    //main method
    public static void main (String [] args) {
        //creates owner 1 oject
        Car owner_1 = new Car("John Doe", 21);
        //prints owner 1 object
        System.out.println(owner_1.toString()); 


        //creates owner 2 object
        Car owner_2 = new Car("Jane Doe", 5001, 100, "black", 4);
        //prints owner 2 object
        System.out.println(owner_2.toString()); 

    }
}
