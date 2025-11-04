public class Car { 
    private String make;
    private String model;
    private double carSize;
    private double price;
    private String carPlate;

   public Car(){

    }
    public Car(String make, String model){
        this.make = make;
        this.model = model;

    }
    public Car(double carSize, double price, String carPlate){
        this.carSize = carSize;
        this.price=price;
        this.carPlate = carPlate;
    }
    
}
 class Vehicle extends Car{

}
