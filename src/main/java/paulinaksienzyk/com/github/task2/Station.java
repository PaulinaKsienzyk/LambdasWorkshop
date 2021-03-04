package paulinaksienzyk.com.github.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * When you finish
 * @see paulinaksienzyk.com.github.task3.FunctionalInterfaces
 */
public class Station {

    public static void main(String[] args) {

        List<Double> prices = List.of(12.0, 14.5, 16.0);
        List<Ticket> tickets = new ArrayList<>();

        //TODO 1. change code below - use streams and CONSTRUCTOR reference.
        prices.stream()
                .map(Ticket::new)
                .forEach(tickets::add);

        //TODO 2. calculate value of the discount using static method reference.
        // What do you need to do that? Maybe some functional interface;-)
        Ticket.DiscountType discountType = Ticket.DiscountType.SENIOR;
//        double discount = Ticket.calculateDiscount(discountType);

        Function<Ticket.DiscountType, Double> discountFunction = Ticket::calculateDiscount;
        double discount = discountFunction.apply(discountType);
        System.out.println("Seniors have got " + discount + " discount");

        //TODO 3. change tickets price taking into account a discount - use non-static method reference.
        tickets.forEach(t -> t.calculatePriceWithDiscount(discount));
        tickets.stream()
                .map(Ticket::price)
                .forEach(System.out::println);

    }
}
