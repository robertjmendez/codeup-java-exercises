package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Jimbo");
        student1.addGrade(75);
        student1.addGrade(60);
        student1.addGrade(70);

        Student student2 = new Student("Paul");
        student2.addGrade(70);
        student2.addGrade(78);

        Student student3 = new Student("Sally");
        student3.addGrade(60);
        student3.addGrade(70);

        System.out.println("student1.getGradeAverage() = " + student1.getGradeAverage());
        System.out.println("student1.getName() = " + student1.getName());
    }
}
