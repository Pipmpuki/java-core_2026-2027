package lr1;

import java.util.Scanner;

public class Example9 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input month: ");
        String month = in.nextLine();

        System.out.println("Input the number of days: ");
        int days = in.nextInt();

        System.out.println("Mounth " + month + " contains " + days + " day.");
        in.close();
    }
}






