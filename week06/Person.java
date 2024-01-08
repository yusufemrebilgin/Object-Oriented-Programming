package week06;

class Person {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private static int counter = 0;

    Person(int id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    Person(String firstName, String lastName) {
        this(counter++, firstName, lastName, 0);
    }

    Person(int id) {
        this(id, null, null, 0);
    }

    Person() {
        this(counter++, null, null, 0);
    }
}
