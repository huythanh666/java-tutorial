
public class Main{
    public static void main(String[] args) throws InterruptedException {
        Car car1 = new Car("Ford","Black");
        Car car2 = new Car("Mustang","Red");
        Car car3 = new Car("Mayback","Blue");
      Car[] cars = {car1,car2,car3};
//        Car[] cars = {
//                 new Car("Ford","Black"),
//                 new Car("Mustang","Red"),
//                 new Car("Mayback","Blue")
//        };
        for(Car car: cars){
            car.drive();
        }
        Car.showCar();
    }
}