package paulinaksienzyk.com.github.task1;

import java.util.List;

/**
 * When you finish
 * @see paulinaksienzyk.com.github.task2.Station
 */
public class WomenCalculator{

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person(21, Person.Gender.FEMALE),
                new Person(13, Person.Gender.MALE),
                new Person(15, Person.Gender.FEMALE),
                new Person(21, Person.Gender.MALE),
                new Person(30, Person.Gender.MALE),
                new Person(43, Person.Gender.FEMALE),
                new Person(60, Person.Gender.FEMALE)
        );

        WomenCalculator calculator = new WomenCalculator();
        int adultWomen = calculator.sumWomen(people);

        PeopleCalculator peopleCalculator = new PeopleCalculator() {
            @Override
            public int sum(List<Person> people) {
                return calculator.sumWomen(people);
            }
        };

        adultWomen = peopleCalculator.sum(people);

        peopleCalculator = p -> calculator.sumWomen(people);
        adultWomen = peopleCalculator.sum(people);

        if (adultWomen == 3 ) {
            System.out.println(adultWomen + " is a correct number of women, bravo!");
        } else {
            System.out.println(adultWomen + " - this is not correct number of women");
        }

    }

    //TODO Below you have the code that represents old-fashioned external iteration.
    // a) Fix the bugs.
    // b) Replace loop with streams.
    // c) In main create anonymous class of PeopleCalculator which will include this method. (Override sum() with sumWomen()).
    // d) Refactor anonymous class to lambda expression.
    // Every step should be visible in code - comment previous ones - don't duplicate, just duplicate and correct!
    // (or commit each step).
//    public int sumWomen(List<Person> people) {
//        int sum = 0;
//        for (int i=0; i<people.size(); i++) {
//            Person person = people.get(i);
//            if (person.age() >= 18 && person.gender().equals(Person.Gender.FEMALE)) {
//                sum++;
//            }
//        }
//        return sum;
//    }

    public int sumWomen(List<Person> people) {
        return (int) people.stream()
                .filter(p -> p.age() >= 18)
                .filter(p -> p.gender().equals(Person.Gender.FEMALE))
                .count();
    }
}
