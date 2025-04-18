import java.util.Scanner;
class Student {
    int rollNo;
    public Student(int rollNo) {
        this.rollNo = rollNo;
    }
    public void displayRollNo() {
        System.out.println("Roll Number: " + rollNo);
    }
}
class Test extends Student {
    int subject1, subject2;
    public Test(int rollNo, int subject1, int subject2) {
        super(rollNo);
        this.subject1 = subject1;
        this.subject2 = subject2;
    }
    public void displayMarks() {
        System.out.println("Marks in Subject 1: " + subject1);
        System.out.println("Marks in Subject 2: " + subject2);
    }
}
class Result extends Test {
    int totalMarks;
    public Result(int rollNo, int subject1, int subject2) {
        super(rollNo, subject1, subject2); 
        totalMarks = subject1 + subject2;
    }
    public void displayResult() {
        displayRollNo();  
        displayMarks();   
        System.out.println("Total Marks: " + totalMarks);
    }
}
public class StudentInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        int rollNo = scanner.nextInt();
        System.out.print("Enter Marks in Subject 1: ");
        int subject1 = scanner.nextInt();
        System.out.print("Enter Marks in Subject 2: ");
        int subject2 = scanner.nextInt();
        Result result = new Result(rollNo, subject1, subject2);
        result.displayResult();
    }
}
