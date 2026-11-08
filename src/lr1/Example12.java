package lr1;

import java.util.Scanner;

public class Example12 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input age: ");
        int age = in.nextInt();

        int birthYear = 2026 - age;

        System.out.println("Your year of birth: " + birthYear);
        in.close();
    }
}






