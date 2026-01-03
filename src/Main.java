import models.Person;
import models.Employee;
import models.Student;
import java.lang.Iterable;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> peopleList = new ArrayList<>();
        peopleList.add(new Student("Erzhan", "Kubishew", 3.34));
        peopleList.add(new Student("Emanuel", "Lionheart", 1.80));
        peopleList.add(new Employee("Somir", "Hamidi", "Vibe Coder", 1000000));
        peopleList.add(new Employee("Randel", "Noel", "Back-end developer", 100000));

        Collections.sort(peopleList);

        printData(peopleList);

        System.out.println("\nComparing Student Erzhan and Employee Somir: ");
        System.out.println("Somir earns more: " +  peopleList.get(0).compareTo(peopleList.get(2)));
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person + " earns " + person.getPaymentAmount() + " tenge");
        }
    }
}