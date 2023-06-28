package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Alice");
        students.put("aliceincodeland", student1);
        ArrayList<Integer> grades1 = new ArrayList<>();
        grades1.add(90);
        grades1.add(87);
        grades1.add(78);

        for(Integer grade : grades1){
            student1.addGrade(grade);
        }

        Student student2 = new Student("Bob");
        students.put("bobbinarybuilder", student2);
        ArrayList<Integer> grades2 = new ArrayList<>();
        grades2.add(99);
        grades2.add(83);
        grades2.add(70);

        for(Integer grade : grades2) {
            student2.addGrade(grade);
        }

        Student student3 = new Student("Charlie");
        students.put("charliedatacruncher", student3);
        ArrayList<Integer> grades3 = new ArrayList<>();
        grades3.add(76);
        grades3.add(81);
        grades3.add(95);

        for(Integer grade : grades3) {
            student3.addGrade(grade);
        }

        Student student4 = new Student("David");
        students.put("daviddebugger", student4);
        ArrayList<Integer> grades4 = new ArrayList<>();
        grades4.add(70);
        grades4.add(75);
        grades4.add(80);

        for(Integer grade : grades4) {
            student4.addGrade(grade);
        }

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
