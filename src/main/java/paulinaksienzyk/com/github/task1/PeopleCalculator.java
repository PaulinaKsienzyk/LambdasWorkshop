package paulinaksienzyk.com.github.task1;

import java.util.List;

/**
 * Works on a list of people summarizing those that meet certain criteria.
 */
@FunctionalInterface
public interface PeopleCalculator {

    int sum(List<Person> people);
}
