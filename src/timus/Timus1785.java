package timus;

import java.util.Scanner;

public class Timus1785 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int monsters = in.nextInt();

        String word;
        if (monsters <= 4) {
            word = "few";
        } else if (monsters <= 9) {
            word = "several";
        } else if (monsters <= 19) {
            word = "pack";
        } else if (monsters <= 49) {
            word = "lots";
        } else if (monsters <= 99) {
            word = "horde";
        } else if (monsters <= 249) {
            word = "throng";
        } else if (monsters <= 499) {
            word = "swarm";
        } else if (monsters <= 999) {
            word = "zounds";
        } else {
            word = "legion";
        }

        System.out.println(word);
    }
}
