package lr1;

import java.util.Scanner;

public class Example8 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input day: ");
        String day = in.nextLine();

        System.out.println("Input month: ");
        String month = in.nextLine();

        System.out.println("Input date: ");
        int date = in.nextInt();

        System.out.printf("Today: %s, %s %d \n", day, month, date);
        in.close();
    }
}
