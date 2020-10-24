import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2 {

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
            String[] studentParameters = input.split(" ");
            Student s = new Student(studentParameters[0], studentParameters[1], Integer.parseInt(studentParameters[2]), studentParameters[3]);
            int findIndex = findExistingStudent(students, s.getFirstName(), s.getLastName());
            if (findIndex != -1) {
                students.get(findIndex).setHomeTown(s.homeTown);
                students.get(findIndex).setAge(s.age);
            } else {
                students.add(s);
            }

            input = scanner.nextLine();
        }

        String townName = scanner.nextLine();
        for (Student student : students) {
            if (student.getHomeTown().equals(townName)) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }

    private static int findExistingStudent(List<Student> students, String firstName, String lastName) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getFirstName().equals(firstName) && students.get(i).getLastName().equals(lastName)) {
                return i;
            }
        }
        return -1;
    }
}
