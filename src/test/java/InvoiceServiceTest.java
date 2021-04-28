/********************************************
 * Purpose : Program is written for generating test cases for a invoice generator program
 *
 * Activity : Practicing pair programming
 *
 * @author Sanketh Chigurupalli, Pritam, Rushikesh Tayade
 * @version 1.0
 * @since 27-04-2021
 *
 *******************************************/

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceServiceTest {

    /**
     * Test Case written by Sanketh
     * this test case tests if fare calculation matches expectation
     */
    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assertions.assertEquals(25, fare, 0.0);
    }

    /**
     * Test Case written by Sanketh
     * this test case tests if given params are minimal if it return the standard minimum fare
     */
    @Test
    public void givenMinimumDistanceOrTime_ShouldReturnMinimumFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 0.1;
        int time = 1;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assertions.assertEquals(5, fare, 0.0);
    }

    /**
     * Test case written by Rushikesh and Refactored by Sanketh
     * this test case tests if program gives the no.of rides, total fare, average fare as per expectation
     */
    @Test
    public void givenMultipleRides_ShouldReturnInvoiceSummary() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        Ride[] rides = {new Ride(2.0, 5),
                new Ride(0.1, 1)
        };
        InvoiceSummary summary = invoiceGenerator.calculateFare(rides);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30.0);
        Assertions.assertEquals(expectedInvoiceSummary, summary);
    }
}
