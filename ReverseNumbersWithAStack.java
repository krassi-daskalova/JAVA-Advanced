package StackQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> regularStack = new ArrayDeque<>();

        String[] inputNums = scanner.nextLine().split(" ");
        for (String num : inputNums) {
            regularStack.push(Integer.parseInt(num));
        }
        while (!regularStack.isEmpty()) {
            System.out.print(regularStack.pop() + " ");
        }
    }
}
