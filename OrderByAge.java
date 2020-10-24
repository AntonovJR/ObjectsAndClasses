import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {
    public static class Person{
        String name;

        public Person(String name, Integer ID, Integer age) {
            this.name = name;
            this.ID = ID;
            this.age = age;
        }

        Integer ID;
        Integer age;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Person> personList = new ArrayList<>();
        while(!"End".equals(input)){
            String[] data = input.split(" ");
            String name = data[0];
            int ID = Integer.parseInt(data[1]);
            int age = Integer.parseInt(data[2]);
            Person person = new Person(name,ID,age);
            personList.add(person);
            input= scanner.nextLine();
        }
        personList.stream().sorted((a1,a2)->Integer.compare(a1.age,a2.age)).forEach(person -> System.out.printf("%s with ID: %d is %d years old.%n",person.name,person.ID,person.age));
    }
}
