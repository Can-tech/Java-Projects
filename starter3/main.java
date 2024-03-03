package starter3;

import java.util.Scanner;


public class main {
public static void main2(String[] args) {
    int quota = 10;

    System.out.println("enter the number of sales you made this week:");
    Scanner scanner = new Scanner(System.in);
    int sales = scanner.nextInt();
    scanner.close();
    if(sales >= quota){
        System.out.println("You have met your quota!");
    }else{
        int salesShort = quota -sales;
        System.out.println("failed You were, "+ salesShort+"sales short.");
    }

}
}
