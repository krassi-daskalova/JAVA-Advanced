package StackQueue;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCommands = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 1; i <= numCommands; i++) {
            String command = scanner.nextLine();
            int x = Integer.parseInt(command.split(" ")[0]);
            if (x == 1) {
                int toPush = Integer.parseInt(command.split(" ")[1]);
                stack.push(toPush);
            } else if (command.equals("2")){
                stack.pop();
            } else if (command.equals("3")){
                System.out.println(Collections.max(stack));
            }
        }
    }
}

