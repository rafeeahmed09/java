package AFunctional;

interface calculate {

    int sum(int a, int b);

}

class Addition implements calculate{
    public  int sum(int a, int b) {
        return a+b;
    }
}

/*public class interfaces{
    public static void main(String[] args) {
        calculate obj = new Addition();
        int result = obj.sum(10,29);
        System.out.println("sum is: "+result);


    }
}*/


// functional interface Business salaries.

interface Business{
    double calculateslary(double  salary);
}

class Employee implements Business{
    @Override
    public double calculateslary(double salary){
        return salary + (0.2*salary); // 20% bonus
    }
}
class Manager implements Business{
    public double calculateslary(double  salary){
        return salary + (0.5*salary); // 50% bonus
    }
}
public class interfaces{
    public static void main(String[] args) {
        Business emp = new Employee();
        double empSalary = emp.calculateslary(50000);
        System.out.println("Employee salary with bonus: "+empSalary);

        Business mgr = new Manager();
        double mgrSalary = mgr.calculateslary(50000);
        System.out.println("Manager salary with bonus: "+mgrSalary);
    }
}        
