public class InvoiceGenerator {
    private double MinimumCostPerKM = 10;
    private int CostPerMinute = 1;

    public double calculateFare(double distance, int time) {
        return distance * MinimumCostPerKM + time * CostPerMinute;

    }
}
