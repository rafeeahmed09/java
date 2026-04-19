package Interfaces;


import java.util.Scanner;



 interface Student {
    void inputdata();
    void outputdata();

 }
class Stduent1 implements Student{
    int roll;
    String name;
    Float marks;

    Scanner sc = new Scanner(System.in);


    @Override
    public void inputdata() {
        System.out.print("Enter ID: ");
        roll = sc.nextInt();
        sc.nextLine(); //

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks = sc.nextFloat();

    }

    @Override
    public void outputdata() {
        System.out.println("\n--- Student Details ---");
        System.out.println("ID: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
class Teacher implements Student{

    String designation;
    double Salary;

    Scanner Sc = new Scanner(System.in);

    @Override
    public void inputdata() {
        System.out.println("Enter Designation: ");
        designation = Sc.nextLine();
        Sc.nextLine();
        System.out.println("Enter Salary:");
        Salary = Sc.nextByte();
        Sc.nextLine();
    }
    public void outputdata(){
        System.out.println("Designation: " + designation);
        System.out.println("Salary : " + Salary);

    }
}
public class Student3{
    static void main(String[] args) {
        Student s = new Teacher();
        s.inputdata();
        s.outputdata();
    }
}

