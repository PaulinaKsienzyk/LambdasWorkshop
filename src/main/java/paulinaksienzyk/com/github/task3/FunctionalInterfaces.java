package paulinaksienzyk.com.github.task3;

import java.util.List;
import java.util.function.Supplier;

public class FunctionalInterfaces {

    public static void main(String[] args) {
        composeSuppliers();
        System.out.println("You can compose suppliers, bravo!");
    }

    //TODO Change this method to create a simple rhyme together.
    // a) List partsOfRhyme should include references to the kitty's methods.
    // b) Then compose the whole as one Supplier.
    private static void composeSuppliers() {
        WlazlKotek kitty = new WlazlKotek();
        List<Supplier<String>> partsOfRhyme = List.of();

        Supplier<String> wholeRhyme = () -> "correct me";
        String result = wholeRhyme.get();

        if (!("Włazł kotek na płotek i mruga, ładna to piosenka niedługa.\nNie długa, nie krótka, lecz w sam raz, " +
                "zaśpiewaj koteczku jeszcze raz.").equals(result)) {
            throw new RuntimeException("Result is incorrect!");
        }
    }

}
