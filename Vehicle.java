public abstract class Vehicle {
         
    private String brand;
    private int kilometers; 

    

    // 3.) Create a constructor to initialise brand and kilometers.
    
    public Vehicle(String brand, int kilometers) {
        this.brand = brand;
        this.kilometers = kilometers;
    }


    // 4.) Add getters and setters for all attributes, 
    // while also respecting the syntax conventions.
    
    // Getter
    public String getBrand() {
        return this.brand;

    }
    // Setter Brand
    public void setBrand (String newBrand) {
        this.brand = newBrand;
    }

    // Getter kilometer
    public int getKilometers() {
        return kilometers;

    }

    //Setter Kilometer
    public void setKilometers (int newkilometers) {
        this.kilometers = newkilometers;

    }

    // 7.) Inside Vehicle add the abstract method public
    //     String doStuff().

    public abstract String doStuff();

}
    