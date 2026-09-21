import java.util.Scanner;

public class IT26101686Lab8Q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] studentsArray = new int[8];
        int count = 0;

        // Input 8 valid Student IDs
        System.out.println("Enter Student IDs for 8 students:");

        while (count < 8) {
            System.out.print("Student ID " + (count + 1) + ": ");
            int id = input.nextInt();

            if (id > 0) {
                studentsArray[count] = id;
                count++;
            } else {
                System.out.println("Error! Student ID must be a positive number.");
            }
        }

        // Search for a Student ID
        System.out.print("\nEnter a Student ID to search: ");
        int searchID = input.nextInt();

        boolean found = false;

        for (int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i] == searchID) {
                found = true;
                break;
            }
        }

        // Display result
        if (found) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }

        input.close();
    }
}