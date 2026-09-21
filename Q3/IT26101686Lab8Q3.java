import java.util.Scanner;

public class IT26101686Lab8Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[6];
        int count = 0;

        System.out.println("Enter 6 positive numbers:");

        while (count < 6) {
            System.out.print("Number " + (count + 1) + ": ");
            int num = input.nextInt();

            if (num > 0) {
                numbers[count] = num;
                count++;
            } else {
                System.out.println("Error! Please enter a positive number.");
            }
        }

        // Find maximum number
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("\nMaximum number = " + max);

        input.close();
    }
}