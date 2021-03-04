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

//        PeopleCalculator peopleCalculator = ?

        if (adultWomen == 3 ) {
            System.out.println(adultWomen + " is a correct number of women, bravo!");
        } else {
            System.out.println(adultWomen + " - this is not correct number of women");
        }

    }

    //TODO Below you have the code that represents old-fashioned external iteration.
    // a) Fix the bugs in loop.
    // b) Replace loop with streams.
    // c) In main create anonymous class of PeopleCalculator which will include this method. (In sum() use sumWomen()).
    // d) Refactor anonymous class to lambda expression.
    // Every step should be visible in code - comment previous ones - don't delete, just duplicate and correct!
    // (or commit each step).
    public int sumWomen(List<Person> people) {
        int sum = 0;
        for (int i=1; i<=people.size(); i++) {
            Person person = people.get(i);
            if (person.age() >= 18 && person.gender().equals(Person.Gender.FEMALE)) {
                sum += sum;
            }
        }
        return sum;
    }
}
