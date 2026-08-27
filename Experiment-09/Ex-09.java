import java.util.ArrayList;
import java.util.Scanner;

public class lan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

       
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            list.add(sc.nextLine());
        }


        System.out.println("\nStrings in ArrayList:");
        for (String s : list) {
            System.out.println(s);
        }

       
        System.out.println("\nString Operations:");

        for (String s : list) {
            System.out.println("\nString: " + s);
            System.out.println("Length: " + s.length());
            System.out.println("Uppercase: " + s.toUpperCase());
            System.out.println("Lowercase: " + s.toLowerCase());
        }

    
        System.out.print("\nEnter a string to search: ");
        String search = sc.nextLine();

        if (list.contains(search)) {
            System.out.println(search + " is found in the ArrayList.");
        } else {
            System.out.println(search + " is not found in the ArrayList.");
        }

        System.out.print("\nEnter a string to remove: ");
        String remove = sc.nextLine();

        if (list.remove(remove)) {
            System.out.println(remove + " removed successfully.");
        } else {
            System.out.println(remove + " not found.");
        }

        
        System.out.println("\nFinal ArrayList:");
        System.out.println(list);

        sc.close();
    }
}
