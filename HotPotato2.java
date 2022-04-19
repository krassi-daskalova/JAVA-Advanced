package StackQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputNames = scanner.nextLine().split(" ");
        int num = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> names = new ArrayDeque<>();
        for (String name : inputNames) {
            names.push(name);
        }

    }
}
