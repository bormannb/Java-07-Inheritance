public class Car extends Vehicle  {

    public Car(String brand, int kilometers) {
        super(brand, kilometers);
        
    }



    @Override
    public String doStuff() {  
        return "I am " + this.getBrand() + " and I go zoom zoom zoom!";  
    }


    /*
    Inside Car and Boat add an implementation of the body of the method doStuff(). 
    For Car, you will need to refer back to: "I am {brand} and I go zoom zoom zoom!" 
    and for Boat: "I am {brand} and I go glug glug!".
    */

}