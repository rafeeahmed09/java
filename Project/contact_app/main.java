package contact_app;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ContactManager cm = new ContactManager();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n [1] Add \n [2] Search \n [3] Delete \n [4] view All \n [5] updata \n [6] exit");
            System.err.println("Selection option");
            String choice = sc.nextLine();
            if (choice.equals("6")) {
                break;
            }
            switch (choice) {
                case "1":
                    System.err.println("Enter you name : ");
                    String name = sc.nextLine();
                    System.err.println("Enter you Phone : ");
                    String Phone = sc.nextLine();
                    System.out.println("Enter you  PersonalEmail");
                    String personalEmail = sc.nextLine();
                    System.out.println("Enter you workEmail: ");
                    String workEmail = sc.nextLine();
                    System.out.println("Enter you addess");
                    String address = sc.nextLine();
                    cm.add(name, Phone, personalEmail, workEmail, address);
                    break;

                case "2":
                    System.out.println("Enter name  to search");
                    cm.search(sc.nextLine());

                    break;

                case "3":
                    System.out.print("Enter name to delete: ");
                    cm.delete(sc.nextLine());
                    break;

                case "4":
                    cm.viewAll();
                    break;
                case "5":
                    System.out.println("Enter name to update");
                    String nametoupdata = sc.nextLine();
                    // cm.update(sc.nextLine());

                default:
                    System.out.println("Invalid  input");
            }
        }
        sc.close();
    }
}
