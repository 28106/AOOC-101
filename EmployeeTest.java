
import java.util.Scanner;

class Employee{
    String fname;
    String lname;
    double msal,ysal,inc;

    Employee()
    {
        fname = " ";
        lname = " ";
        msal =0.0;
        ysal = 0.0;
    }
    void getter()
    {
        Scanner sc=new Scanner (System.in);
        // sc=next();
        // sc=nextInt();
        System.out.println("Enter first name:");
        fname = sc.nextLine();
        System.out.println("Enter last name:");
        lname = sc.nextLine();
        System.out.println("Enter monthly salary:");
        msal = sc.nextDouble();
        if(msal<0)
        {
            msal=0.0;
        }
        ysal = msal*12;
      

    }
    void setter()
    {
         System.out.println(" first name is:" + fname);
        System.out.println(" last name is:" + lname);
        System.out.println(" monthly salary is:" + msal);
        System.out.println(" yearly salary is:" + ysal);
    }
    void raise()
    {
        inc = ysal *0.10;
        ysal = ysal+inc;
        System.out.println("Salary raised by:" + inc);
    }
}
class EmployeeTest{
    public static void main(String args[])
    {

    Employee ob1 = new Employee();
    ob1.getter();
    ob1.setter();
    ob1.raise();
    Employee ob2 = new Employee();
    ob2.getter();
    ob2.setter();
    ob2.raise();
    }
}