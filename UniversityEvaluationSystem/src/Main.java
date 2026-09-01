// Task 1 - University Evaluation System
// Abstract Class & Abstract Methods
// All classes in one file

// Abstract Class
abstract class StudentEvaluation {

    protected String studentName;
    protected int rollNumber;
    protected double totalMarks;

    // Constructor
    public StudentEvaluation(String studentName, int rollNumber) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
    }

    // Concrete Method
    public void displayStudentDetails() {
        System.out.println("----------------------------------------");
        System.out.println("Student Name : " + studentName);
        System.out.println("Roll Number  : " + rollNumber);
    }

    // Abstract Methods
    abstract void calculateTotalMarks();

    abstract void displayGrade();
}

// UG Course
class UGCourseEvaluation extends StudentEvaluation {

    private int internalMarks;
    private int externalMarks;

    public UGCourseEvaluation(String studentName, int rollNumber,
                              int internalMarks, int externalMarks) {
        super(studentName, rollNumber);
        this.internalMarks = internalMarks;
        this.externalMarks = externalMarks;
    }

    @Override
    void calculateTotalMarks() {
        totalMarks = internalMarks + externalMarks;
        System.out.println("Course       : UG");
        System.out.println("Total Marks  : " + totalMarks);
    }

    @Override
    void displayGrade() {

        if (totalMarks >= 90)
            System.out.println("Grade        : A+");
        else if (totalMarks >= 80)
            System.out.println("Grade        : A");
        else if (totalMarks >= 70)
            System.out.println("Grade        : B");
        else if (totalMarks >= 60)
            System.out.println("Grade        : C");
        else
            System.out.println("Grade        : Fail");
    }
}

// PG Course
class PGCourseEvaluation extends StudentEvaluation {

    private int assignment;
    private int seminar;
    private int exam;

    public PGCourseEvaluation(String studentName, int rollNumber,
                              int assignment, int seminar, int exam) {
        super(studentName, rollNumber);
        this.assignment = assignment;
        this.seminar = seminar;
        this.exam = exam;
    }

    @Override
    void calculateTotalMarks() {
        totalMarks = assignment + seminar + exam;
        System.out.println("Course       : PG");
        System.out.println("Total Marks  : " + totalMarks);
    }

    @Override
    void displayGrade() {

        if (totalMarks >= 90)
            System.out.println("Grade        : A+");
        else if (totalMarks >= 80)
            System.out.println("Grade        : A");
        else if (totalMarks >= 70)
            System.out.println("Grade        : B");
        else if (totalMarks >= 60)
            System.out.println("Grade        : C");
        else
            System.out.println("Grade        : Fail");
    }
}

// Certificate Course
class CertificateCourseEvaluation extends StudentEvaluation {

    private int theory;
    private int practical;

    public CertificateCourseEvaluation(String studentName,
                                       int rollNumber,
                                       int theory,
                                       int practical) {
        super(studentName, rollNumber);
        this.theory = theory;
        this.practical = practical;
    }

    @Override
    void calculateTotalMarks() {
        totalMarks = theory + practical;
        System.out.println("Course       : Certificate");
        System.out.println("Total Marks  : " + totalMarks);
    }

    @Override
    void displayGrade() {

        if (totalMarks >= 90)
            System.out.println("Grade        : A+");
        else if (totalMarks >= 80)
            System.out.println("Grade        : A");
        else if (totalMarks >= 70)
            System.out.println("Grade        : B");
        else if (totalMarks >= 60)
            System.out.println("Grade        : C");
        else
            System.out.println("Grade        : Fail");
    }
}

// New Course Type
class DiplomaCourseEvaluation extends StudentEvaluation {

    private int project;
    private int viva;
    private int theory;

    public DiplomaCourseEvaluation(String studentName,
                                   int rollNumber,
                                   int project,
                                   int viva,
                                   int theory) {
        super(studentName, rollNumber);
        this.project = project;
        this.viva = viva;
        this.theory = theory;
    }

    @Override
    void calculateTotalMarks() {
        totalMarks = project + viva + theory;
        System.out.println("Course       : Diploma");
        System.out.println("Total Marks  : " + totalMarks);
    }

    @Override
    void displayGrade() {

        if (totalMarks >= 90)
            System.out.println("Grade        : A+");
        else if (totalMarks >= 80)
            System.out.println("Grade        : A");
        else if (totalMarks >= 70)
            System.out.println("Grade        : B");
        else if (totalMarks >= 60)
            System.out.println("Grade        : C");
        else
            System.out.println("Grade        : Fail");
    }
}

// Main Class
public class Main {

    public static void main(String[] args) {

        // Array of abstract class references
        StudentEvaluation[] students = {

                new UGCourseEvaluation("Alphin", 101, 35, 55),

                new PGCourseEvaluation("Rahul", 102, 18, 19, 55),

                new CertificateCourseEvaluation("Anu", 103, 45, 40),

                new UGCourseEvaluation("Megha", 104, 38, 58),

                new DiplomaCourseEvaluation("Arjun", 105, 30, 28, 35)

        };

        System.out.println("========================================");
        System.out.println("     UNIVERSITY EVALUATION SYSTEM");
        System.out.println("========================================");

        // Display details of all students
        for (StudentEvaluation s : students) {

            s.displayStudentDetails();
            s.calculateTotalMarks();
            s.displayGrade();

            System.out.println();
        }
    }
}