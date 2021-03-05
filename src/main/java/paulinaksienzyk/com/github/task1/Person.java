package paulinaksienzyk.com.github.task1;

class Person {

    private final Gender gender;
    private int age;

    public Person(int age, Gender gender) {
        this.age = age;
        this.gender = gender;
    }

    enum Gender{
        MALE, FEMALE
    }

    public Gender gender() {
        return gender;
    }

    public int age() {
        return age;
    }
}
