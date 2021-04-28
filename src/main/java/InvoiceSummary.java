/********************************************
 * Purpose : Program is written for generating a invoice summary for cab service
 *
 * Activity : Practicing pair programming
 *
 * @author Sanketh Chigurupalli, Pritam, Rushikesh Tayade
 * @version 1.0
 * @since 27-04-2021
 *
 *******************************************/

public class InvoiceSummary {
    private final int NUMBER_OF_RIDES;
    private final double TOTAL_FARE;
    private final double AVERAGE_FARE;

    /**
     *
     * @param NUMBER_OF_RIDES
     * @param TOTAL_FARE
     * Creating construtor
     */
    public InvoiceSummary(int NUMBER_OF_RIDES, double TOTAL_FARE) {
        this.NUMBER_OF_RIDES = NUMBER_OF_RIDES;
        this.TOTAL_FARE = TOTAL_FARE;
        this.AVERAGE_FARE = this.TOTAL_FARE / this.NUMBER_OF_RIDES;
    }

    /**
     *
     * @param object
     * @return
     * Equals method to check the noOfRides and total fare for the passed arguments through test case
     */
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        InvoiceSummary that = (InvoiceSummary) object;
        return NUMBER_OF_RIDES == that.NUMBER_OF_RIDES &&
                Double.compare(that.TOTAL_FARE, TOTAL_FARE) == 0 &&
                Double.compare(that.AVERAGE_FARE, AVERAGE_FARE) == 0;
    }
}

