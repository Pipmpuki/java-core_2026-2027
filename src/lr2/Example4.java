package lr2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input num: ");
        int num = in.nextInt();

        if (num >= 5 && num <= 10) {
            System.out.println("The num " + num
                    + " is in the range from 5 to 10");
        }
        else {
            System.out.println("The num " + num
                    + " is out of the range from 5 to 10");
        }

        in.close();
    }
}
