package starter;

import java.util.Scanner;

class man {
    public static void main(String[] args) {
        //Get the number of hours worked
        System.out.println("Enter the number og hours employee worked: ");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //Get the hourly rate
        System.out.println("Enter the employee's pay rate");
        double rate = scanner.nextDouble();
        scanner.close();

        //Multiply hours and pay rate
        double grossPay = rate * hours;

        //display 
        System.out.println("The employee's gross pay is $"+grossPay);
        
    }
}