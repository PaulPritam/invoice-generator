/********************************************
 * Purpose : Program is written for creating ride class and constructor for cab service
 *
 * Activity : Practicing pair programming
 *
 * @author Sanketh Chigurupalli, Pritam, Rushikesh Tayade
 * @version 1.0
 * @since 27-04-2021
 *
 *******************************************/

public class Ride {
    public double distance;
    public int time;

    /**
     *
     * @param distance
     * @param time
     * Creating a constructor
     */
    public Ride(double distance, int time) {
        this.distance = distance;
        this.time = time;
    }
}
