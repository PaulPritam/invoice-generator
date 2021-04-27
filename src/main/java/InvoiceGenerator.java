public class InvoiceGenerator {
    private double MinimumCostPerKM = 10;
    private int CostPerMinute = 1;
    private double MinimumFare = 5;

    public double calculateFare(double distance, int time) {
        double totalFare = distance * MinimumCostPerKM + time * CostPerMinute;
        if(totalFare<MinimumFare)
        {
            return MinimumFare;
        }
        return totalFare;
    }

    public double calculateFare(Ride[] rides) {

        return 0;
    }

}
