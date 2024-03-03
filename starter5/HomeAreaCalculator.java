package starter5;

import java.util.Scanner;

public class HomeAreaCalculator {
public static void main(String args[]){
    HomeAreaCalculator calculator = new HomeAreaCalculator();
    Rectangle kitchen = calculator.getRoom();
    Rectangle bathroom = calculator.getRoom();

    double area = calculateTotalArea(kitchen, bathroom);

}    
public Rectangle getRoom(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the length of your room: ");
    double length = scanner.nextDouble();

    System.out.println("Enter the width of your room: ");
    double width = scanner.nextDouble();

    scanner.close();
    
    return Rectangle(length, width);

}
public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){

    return rectangle1.calculateArea()+rectangle2.calculateArea();

}
}
