import java.util.Scanner;

public class Opgave223 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalCost = 0;

        System.out.print("Enter the driving distance: ");
        double distance = sc.nextDouble();

        System.out.print("Enter miles pr gallon: ");
        double milesPerGallon = sc.nextDouble();

        System.out.print("Enter price per gallon: ");
        double price = sc.nextDouble();

        totalCost = distance / milesPerGallon;
        totalCost = totalCost * price;


        System.out.println("The cost of driving is $" + totalCost);


    }
}
