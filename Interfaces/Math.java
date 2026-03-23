package Interfaces;

public class Math {
   public static void main(String[] args) {
       Math1 m = new Math2();
       m.vale(2 , 4);
    }

}

interface Math1{
      void vale(int a, int b);


}

class Math2 implements Math1{
    public void  vale(int a, int b){
        int sum =  a + b;
        System.out.println("This sum is : " + sum);

    }

}