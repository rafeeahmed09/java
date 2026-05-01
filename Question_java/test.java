package Question_java;
import java.util.Scanner;

class emp{
    private int id;
    private String name;

    public emp(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void input(Scanner SC){
        System.out.println("Enter emp id");
        id = SC.nextInt();
        SC.nextLine();
        System.out.println("Enter emp name");
        name = SC.nextLine();

    }
    void display(){
        System.out.println("Employee id : " + id);
        System.out.println("Employee name : " + name);
    }
}

class manager extends emp{
    private String derp;
    public manager(int id, String name, String derp){
        super(id,name);
        this.derp = derp;
    }
}

public class test {
}
