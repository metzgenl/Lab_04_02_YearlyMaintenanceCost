public class YearlyMaintenanceCost {
    double springMaintenanceCost;
    double summerMaintenanceCost;
    double fallMaintenanceCost;
    double winterMaintenanceCost;
    double totalYearlyMaintenanceCost;

    public void getMaintenanceCost(){

        //Get Maintenance Cost
        springMaintenanceCost = 100.00;
        summerMaintenanceCost = 200.00;
        fallMaintenanceCost = 300.00;
        winterMaintenanceCost = 400.00;

        totalYearlyMaintenanceCost = springMaintenanceCost + summerMaintenanceCost + fallMaintenanceCost + winterMaintenanceCost;

        System.out.println("The home with a spring maintenance cost of $" + springMaintenanceCost + ", a summer maintenance cost of $" + summerMaintenanceCost + ", a fall maintenance cost of $" + fallMaintenanceCost + ", and a winter maintenance cost of $" + winterMaintenanceCost + " has a total yearly maintenance cost of $" + totalYearlyMaintenanceCost + ".");

    }

}
