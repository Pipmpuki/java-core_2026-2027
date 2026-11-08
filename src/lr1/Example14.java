package lr1;

import java.util.Scanner;

public class Example14 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input num: ");
        int num = in.nextInt();

        int num1 = num - 1;
        int num2 = num;
        int num3 = num + 1;

        int num4 = (num1 + num2 + num3) * (num1 + num2 + num3);

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("num3: " + num3);
        System.out.println("num4: " + num4);
        in.close();
    }
}






