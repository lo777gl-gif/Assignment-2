package models;

public abstract class Person implements Payable, Comparable<Person> {
    private static int id_gen = 0;
    private final int id;
    private String name;
    private String surname;

    public Person() {
        id = id_gen++;
    }

    public Person(String name, String surname) {
        this();
        setName(name);
        setSurname(surname);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public abstract String getPosition();

    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }

    @Override
    public int compareTo(Person other) {
        if (other.getPaymentAmount() > this.getPaymentAmount()) {
            return (int)other.getPaymentAmount();
        }
        return (int)this.getPaymentAmount();
    }
}