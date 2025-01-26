import java.util.Scanner;

public class YearlyMaintenanceCost {
    double springMaintenanceCost;
    double summerMaintenanceCost;
    double fallMaintenanceCost;
    double winterMaintenanceCost;
    double totalYearlyMaintenanceCost;

    public void getMaintenanceCost(){
        //Create Scanner class
        Scanner scn = new Scanner(System.in);

        //Get Maintenance Cost
        System.out.print("What is the maintenance cost for the spring($): ");
        springMaintenanceCost = scn.nextDouble();
        System.out.print("What is the maintenance cost for the summer($): ");
        summerMaintenanceCost = scn.nextDouble();
        System.out.print("What is the maintenance cost for the fall($): ");
        fallMaintenanceCost = scn.nextDouble();
        System.out.print("What is the maintenance cost for the winter($): ");
        winterMaintenanceCost = scn.nextDouble();

        totalYearlyMaintenanceCost = springMaintenanceCost + summerMaintenanceCost + fallMaintenanceCost + winterMaintenanceCost;

        System.out.println("The home with a spring maintenance cost of $" + springMaintenanceCost + ", a summer maintenance cost of $" + summerMaintenanceCost + ", a fall maintenance cost of $" + fallMaintenanceCost + ", and a winter maintenance cost of $" + winterMaintenanceCost + " has a total yearly maintenance cost of $" + totalYearlyMaintenanceCost + ".");

    }

}
