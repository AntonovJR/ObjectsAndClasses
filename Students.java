import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {

    public static class Student {
        public Student(String firstName, String lastName, int age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getHomeTown() {
            return homeTown;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }

        private String firstName;
        private String lastName;
        private int age;
        private String homeTown;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        String input = scanner.nextLine();

        while (!"end".equals(input)) {
            String[] tokens = input.split("\\s+");
            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String homeTown = tokens[3];

            Student student = new Student(firstName, lastName, age, homeTown);
            students.add(student);
            input = scanner.nextLine();

        }
        String filterCity = scanner.nextLine();
        for(Student student: students){
            if(student.getHomeTown().equals(filterCity)){
                System.out.printf("%s %s is %d years old\n",student.getFirstName(),student.getLastName(),student.getAge());
            }
        }
    }
}
