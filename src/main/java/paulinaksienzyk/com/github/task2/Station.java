package paulinaksienzyk.com.github.task2;

import java.util.ArrayList;
import java.util.List;

public class Station {

    public static void main(String[] args) {

        List<Double> prices = List.of(12.0, 14.5, 16.0);
        List<Ticket> tickets = new ArrayList<>();

        //TODO 1. change code below - use streams and CONSTRUCTOR reference.
        for (double price : prices) {
            tickets.add(new Ticket(price));
        }

        //TODO 2. calculate value of the discount using static method reference.
        // What do you need to do that? Maybe some functional interface;-)
        Ticket.DiscountType discountType = Ticket.DiscountType.SENIOR;
        double discount = Ticket.calculateDiscount(discountType);
        System.out.println("Seniors have got " + discount + " discount");

        //TODO 3. change tickets price taking into account a discount - use non-static method reference.
        for (Ticket ticket : tickets) {
            ticket.calculatePriceWithDiscount(discount);
        }

        System.out.println("============================");
        for (Ticket ticket : tickets) {
            System.out.println(ticket);
        }

    }
}
