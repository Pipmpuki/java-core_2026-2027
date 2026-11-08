package lr1;

import java.util.Scanner;

public class Example10 {
     static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your year of birth: ");
        int birthYear = in.nextInt();

        int age = 2026 - birthYear;

        System.out.printf("Your age: %d", age);
        in.close();
    }
}