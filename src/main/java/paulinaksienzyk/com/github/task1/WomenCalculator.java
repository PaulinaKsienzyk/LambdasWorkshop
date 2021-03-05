package paulinaksienzyk.com.github.task1;

import paulinaksienzyk.com.github.task2.Station;

import java.util.List;

/**
 *  In {@link WomenCalculator#sumWomen} you have the code that represents old-fashioned external iteration. TODO:
 *   <li>Fix the bugs in a loop.</li>
 *   <li>Replace the loop with streams.</li>
 *   <li>In main, create anonymous class of {@link PeopleCalculator} which will include this method. Use {@code sumWomen()} in {@code sum()}).</li>
 *   <li>Refactor anonymous class to lambda expression.</li>
 *   <p>
 *   Every step should be visible in code - comment previous ones out - don't delete, just duplicate and correct!
 *   (or commit each step).
 * </p><br/>
 * Your next task is task 2, start with {@code Station} class.
 * @see PeopleCalculator
 * @see Station
 */
public class WomenCalculator {

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

//      TODO: anonymous class  PeopleCalculator peopleCalculator = ?

        if (adultWomen == 3 ) {
            System.out.println(adultWomen + " is a correct number of women, bravo!");
        } else {
            System.out.println(adultWomen + " - this is not correct number of women");
        }

    }

    /**
     * TODO: iteration problems to fix and rework in streams
     * @param people list of poeple to iterate on
     * @return number of adult women in the given list
     */
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
