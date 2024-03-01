import java.util.Scanner;

public class App {
    public static void main( String[] args) throws Exception {
        int salary = 1000;
        int bonus = 250;

        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if(sales > 10){
            salary = salary + bonus;
        }
    }
}
