package InputStreams_outputStreams.ByteStrams;

import java.io.*;

class emp implements Serializable{
    private int rolls;
    private String name;

    public emp(int rolls, String name) {
        this.rolls = rolls;
        this.name = name;
    }

    public int getRolls() {
        return rolls;
    }

    public void setRolls(int rolls) {
        this.rolls = rolls;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class serill {

    public static void main(String[] args) {

        emp em = new emp(101, "Jack Work");

        try (
                FileOutputStream fi = new FileOutputStream(
                        "C:\\Users\\abdul\\OneDrive\\Desktop\\Code\\java git\\InputStreams_outputStreams\\ByteStrams\\First.txt"
                );
                ObjectOutputStream ob = new ObjectOutputStream(fi)
        ) {

            ob.writeObject(em);
            System.out.println("Object serialized successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try(
                FileInputStream fis = new FileInputStream(
                        "C:\\Users\\abdul\\OneDrive\\Desktop\\Code\\java git\\InputStreams_outputStreams\\ByteStrams\\First.txt"
                );
                ObjectInputStream oos = new ObjectInputStream(fis);
                ){

            emp s = (emp) oos.readObject();
            fis.close();
            oos.close();

            System.out.println(s.getRolls() + " " +  s.getName());

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
