package lr2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input num: ");
        int num = in.nextInt();

        boolean Five = num % 5 == 2;
        boolean Seven = num % 7 == 1;

        if (Five && Seven) {
            System.out.println("The num " + num
                    + " satisfies both conditions");
        } else {
            System.out.println("The number " + num
                    + " does not satisfy both conditions");
            System.out.println("Remainder of division by 5: "
                    + num % 5 + " (needs 2)");
            System.out.println("Remainder of division by 7: "
                    + num % 7 + " (needs 1)");
        }

        in.close();
    }
}
