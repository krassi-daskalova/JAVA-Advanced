package StackQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

import static java.util.Collections.max;

public class MaximumElement2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numOfCommands = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < numOfCommands; i++) {
            String command = scanner.nextLine();
            if(command.equals("2")){
                stack.pop();
            } else if(command.equals("3")){
                int maximum = max(stack);
                System.out.println(maximum);
            } else {
                String[] commandLine = command.split(" ");
                int first = Integer.parseInt(commandLine[0]);
                int second = Integer.parseInt(commandLine[1]);
                stack.push(second);
            }
        }
    }
}
