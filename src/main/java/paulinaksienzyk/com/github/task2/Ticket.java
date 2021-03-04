package paulinaksienzyk.com.github.task2;

class Ticket {

    private double price;

    Ticket(double price) {
        this.price = price;
    }

    void calculatePriceWithDiscount(double discount) {
        price -= (price * discount);
    }

    static double calculateDiscount(DiscountType discountType) {
        double discount;
        switch (discountType) {
            case CHILD -> discount = 0.2;
            case SENIOR -> discount = 0.3;
            case DISABLED -> discount = 0.5;
            default -> discount = 0.0;
        }
        return discount;
    }

    public double price() {
        return price;
    }

    enum DiscountType {
        CHILD,
        SENIOR,
        DISABLED
    }

}
