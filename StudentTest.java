import java.util.Scanner;

class Student {
    private int rollNo;

    void getRollNo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll no:");
        rollNo = sc.nextInt();
    }

    void setRollNo() {
        System.out.println("Roll no is: " + rollNo);
    }
}

class Test extends Student {
    int sub1;
    int sub2;

    void getMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for sub 1 and sub2:");
        sub1 = sc.nextInt();
        sub2 = sc.nextInt();
    }

    void setMarks() {
        System.out.println("Marks of sub1 is:" + sub1 + " Marks for sub2 is: " + sub2);
    }
}

interface Sports {
    int sMarks = 0;

    void setSportsMarks();
}

class Result extends Test implements Sports {
    private int sportsMarks;

    public void getSportsMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of sports:");
        sportsMarks = sc.nextInt();
    }

    public void setSportsMarks() {
        System.out.println("Marks obtained in sports are: " + sportsMarks);
    }

    public void displayResult() {
        setRollNo();
        setMarks();
        setSportsMarks();
    }
}

public class StudentTest {
    public static void main(String args[]) {
        Result r = new Result();
        r.getRollNo();
        r.getMarks();
        r.getSportsMarks();
        r.displayResult();
    }
}
