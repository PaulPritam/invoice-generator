public class InvoiceGenerator {
    private static final double MinimumCostPerKM = 10;
    private static final int CostPerMinute = 1;
    private static final double MinimumFare = 5;


    public double calculateFare(double distance, int time) {
        double totalFare = distance * MinimumCostPerKM + time * CostPerMinute;
        if(totalFare<MinimumFare)
        {
            return MinimumFare;
        }
        return totalFare;

    }
    public InvoiceSummary calculateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides)
        {
            totalFare = totalFare + this.calculateFare(ride.distance, ride.time);
        }
        return new InvoiceSummary(rides.length, totalFare);
    }
}
