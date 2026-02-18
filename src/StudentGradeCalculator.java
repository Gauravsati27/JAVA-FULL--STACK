import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Student Marks: ");
        int marks = sc.nextInt();
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks! Please enter marks between 0-100.");
            return;
        }
        Student student = new Student(name, marks);
        StudentGrade studentGrade = CalculateStudentGrade.calculateGrade(student);
        System.out.println(studentGrade);

        sc.close();
    }
}
class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name;
    }
}
class StudentGrade{
    private Student student;
    private char studentGrade;

    public StudentGrade(Student student, char studentGrade) {
        this.student=student;
        this.studentGrade=studentGrade;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public char getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(char studentGrade) {
        this.studentGrade = studentGrade;
    }
    public String toString() {
        return "[The Student " + student + " has '" + studentGrade + "' Grade]";
    }
}
class CalculateStudentGrade{
    public static StudentGrade calculateGrade(Student student) {
        int marks = student.getMarks();
        char grade;

        if (marks > 90) {
            grade = 'A';
        } else if (marks >= 75) {
            grade = 'B';
        } else if (marks >= 60) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        return new StudentGrade(student, grade);
    }
}