public class Car {
    static int numberOfCar;
    String model;
    String color;
    Car(String model, String color){
        this.model = model;
        this.color= color;
        numberOfCar++;
    }
    void drive(){
        System.out.println("You drive the " + this.color + " " + this.model);
    }
    static void showCar(){
        System.out.println("You have " + numberOfCar + " car");
    }
}
