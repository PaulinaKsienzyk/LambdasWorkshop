package paulinaksienzyk.com.github.task2;

import java.util.ArrayList;
import java.util.List;

/**
 * When you finish
 * @see paulinaksienzyk.com.github.task3.FunctionalInterfaces
 */
public class Station {

    public static void main(String[] args) {

        List<Double> prices = List.of(12.0, 14.5, 16.0);
        List<Ticket> tickets = new ArrayList<>();

        //TODO 1. change code below - use streams and CONSTRUCTOR reference.
        for (double price : prices) {
            tickets.add(new Ticket(price));
        }

        //TODO 2. calculate value of the discount using static method reference.
        // What do you need to do that? Maybe some functional interface...
        // Maybe Function?;-)
        Ticket.DiscountType discountType = Ticket.DiscountType.SENIOR;
        double discount = Ticket.calculateDiscount(discountType); // <- change this

        System.out.println("Seniors have got " + discount + " discount");
        tickets.forEach(t -> t.calculatePriceWithDiscount(discount));

        //TODO 3. display prices for all tickets - use streams and non-static method reference.
        System.out.println("Tickets prices after the discount granted:");
    }
}
