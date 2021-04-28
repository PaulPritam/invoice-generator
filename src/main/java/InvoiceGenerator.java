/********************************************
 * Purpose : Program is written for generating a invoice for cab service
 *
 * Activity : Practicing pair programming
 *
 * @author Sanketh Chigurupalli, Pritam Paul, Rushikesh Tayade
 * @version 1.0
 * @since 27-04-2021
 *
 *******************************************/

public class InvoiceGenerator {
    private double MINIMUM_COST_PER_KM = 10;
    private int COST_PER_MINUTE = 1;
    private double MINIMUM_FARE = 5;

    /**
     * implemented by Rushikesh and Pritam
     * @param distance
     * @param time
     * @return
     *
     * method calculates the fare taking params distance and time
     * checks if fare is less than minimum fare, if so then returns MINIMUM_FARE
     */
    public double calculateFare(double distance, int time) {
        double totalFare =  distance * MINIMUM_COST_PER_KM + time * COST_PER_MINUTE;
        if (totalFare < MINIMUM_FARE) {
            return MINIMUM_FARE;
        }
        return totalFare;
    }

    /**
     * implemented by Rushikesh and Sanketh
     * @param rides
     * @return
     *
     * Taking the param as array and iterates over the array and calculates fare and keeps adding
     * and returns total fare
     */
    public InvoiceSummary calculateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride:rides) {
            totalFare += this.calculateFare(ride.distance, ride.time);
        }
        return new InvoiceSummary(rides.length, totalFare);
    }
}


