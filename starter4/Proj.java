package starter4;

import java.util.Scanner;

public class Proj {
    public static void main(String args[]){
        System.out.println("enter your letter grade: ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        String message;
        switch(grade){
            case "A":
                message = "excellent";
                break;
            case "B":
                message = "Great";
                break;
            case "C":
                message = "good";
                break;
            case "D":
                message = "work harder";
                break;
            case "F":
                message = "failed";
                break;
            default:
                message="Invalid input";
                break;   
        }
        scanner.close();
        System.out.println(message);
    }    
}


