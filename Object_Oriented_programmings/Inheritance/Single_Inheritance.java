package Object_Oriented_programmings.Inheritance;

class student {
    public  String Name;
    private int age;
    public int Rollno;

    public student(String Name, int age, int Rollno) {
        this.Name = Name;
        this.age = age;
        this.Rollno = Rollno;
    }
    
    public void setAge(int x){
        if( x < 0){
            System.out.println("Age cannot be negative");
        }else{
            age = x;
        }
    }
    public int getAge() {
        return age;
       
    }
    public String getName(){
        return Name;
    }
    public int getRollno(){
        return Rollno;
    }
    
    public void display(){
        System.out.println("Name: " + Name);
        System.out.println("Age:" + age);
        System.out.println("Roll No: " + Rollno);
    }
}
class Teacher extends student {
    
    private double salary;
    public  String Depaertment;
    public  double  Phone_number;

    public Teacher(String name, int age, int Rollno, double salary, String depaertment, double Phone_number){
        super(name, age, Rollno);
        this.salary = salary;
        this.Depaertment = Depaertment;
        this.Phone_number = Phone_number;

    }
    public double getsalary(){
        return salary;
    }
    public void setPhone_number(double p){
        if(p < 0 && p > 9999999999L){
            System.out.println("Phone not ");
        }else{
            Phone_number = p;
        }
    }
    public String getDepaertment(){
        return Depaertment;
    }
    public void setsalary(double s){
        if(s < 0){
            System.out.println("Salary cannot be negative");
        }else{
            salary = s;
        }
    }

    public void display(){
        super.display();
        System.err.println("Salary: " + salary);
        System.err.println("Department: " + Depaertment);
        System.err.println("Phone Number: " + Phone_number);
    }
}

public class Single_Inheritance {
   public static void main(String[] args) {
      Teacher t1 = new Teacher("rafee", 12, 2, 23000, "Computer", 8700200199L);
        t1.display();
   }
}
