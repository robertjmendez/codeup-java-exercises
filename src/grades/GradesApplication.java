package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Alice");
        students.put("aliceincodeland", student1);
        student1.addGrade(90);
        student1.addGrade(87);
        student1.addGrade(78);


        Student student2 = new Student("Bob");
        students.put("bobbinarybuilder", student2);
        student2.addGrade(99);
        student2.addGrade(83);
        student2.addGrade(70);


        Student student3 = new Student("Charlie");
        students.put("charliedatacruncher", student3);
        student3.addGrade(76);
        student3.addGrade(81);
        student3.addGrade(95);


        Student student4 = new Student("David");
        students.put("daviddebugger", student4);
        student4.addGrade(70);
        student4.addGrade(75);
        student4.addGrade(80);

        Input input = new Input();
        runProgram(students, input);
    }

    public static void runProgram(HashMap<String, Student> students, Input input) {
        System.out.println("Welcome!\n");
        System.out.println("Here are the GitHub usernames of our students:\n");

        for (String username : students.keySet()) {
            System.out.printf("|%s| ",username);
        }
        System.out.println();

        do {
            System.out.println("\nWhat student would you like to see more information on? ");
            String userInput = input.getString();

            if (students.containsKey(userInput.toLowerCase())) {
                Student s = students.get(userInput.toLowerCase());
                System.out.printf("%nName: %s - GitHub Username: %s%n", s.getName(), userInput);
                System.out.printf("Current Average: %.1f%n%n", s.getGradeAverage());
            }
            else {
                System.out.printf("Sorry, no student found with the GitHub username of \"%s\".%n%n", userInput);
            }

            System.out.println("Would you like to see another student?");
        } while(input.yesNo());

        System.out.println("Goodbye, and have a wonderful day!");
    }

}
