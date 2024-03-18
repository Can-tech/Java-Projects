package starter7_car_class;

public class App {
    public static void main(String[] args){
        Car car1 = new Car();
        Car car2 = new Car();
        car1.set_name("Walkswagen Tiguan 2.0");
        car2.set_name("Walkswagen Tiguan 2.0");
        System.out.println(car1.get_name());

        System.out.println(car1.equals(car2));
    }
}
