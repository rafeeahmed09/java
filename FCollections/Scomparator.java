package FCollections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
// comparator Integer.
class MYcomparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return Integer.compare(o1, o2); // ascending order
    }
}

public class Scomparator {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);

        numbers.sort(new MYcomparator());
        System.out.println(numbers);
    }
}

// Comparator a String.

class StringLengthComparator implements Comparator<String> {
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}

public class Scomparator {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana", "apple", "date");
        words.sort(new StringLengthComparator());
        System.out.println(words);
    }
}

// Student Comparator.

class Student {
    private String name;
    public double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getname() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }
}

public class Scomparator {
    public static void main(String[] args) {
        List<Student> Students = new ArrayList<>();
        Students.add(new Student("Alice", 3.5));
        Students.add(new Student("Bob", 3.7));
        Students.add(new Student("Charlie", 3.5));
        Students.add(new Student("Akshit", 3.9));

        // using a lambda Functional
        /*
         * Students.sort((o1, o2) -> {
         * if(o2.getGpa() - o1.getGpa() > 0){
         * return 1;
         * }else if(o2.getGpa() - o1.getGpa() < 0){
         * return -1;
         * }else{
         * return 0;
         * }
         * });
         */

        // using java 8 comparator

        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed()
                .thenComparing(Student::getname);
        Students.sort(comparator);
        // print using en loops.

        for (Student s : Students) {
            System.out.println(s.getname() + ":" + s.getGpa());
        }

    }
}