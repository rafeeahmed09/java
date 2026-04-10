package FCollections.List;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class comparable {
     public static void main(String[] args) {
        List<Student> St = new ArrayList<>();
        St.add(new Student("Bob", 85));
        St.add(new Student("Sam", 90));
        St.add(new Student("John", 85));

         // comparable a marks
        /* Collections.sort(St);
         for(Student s : St){
             System.out.println(s.getName() + " = " + s.getMark());
         } */

         // Comparable a name

         Collections.sort(St);
         for(Student s : St){
             System.out.println(s.getName() + " = " + s.getMark());
         }

    }


}

class Student implements Comparable<Student> {
    private String name;
    private int mark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public  int compareTo(Student ob){
       //  return ob.mark - this.mark;
        if (this.mark != ob.mark){
            return  this.mark - ob.mark;
        }else {
            return this.name.compareTo(ob.name);
        }
    }
}

/*
  this.mark - ob.mark;
  < 0  this.mark - ob.mark;
  > 0 ob.mark - this.mark;
 */
