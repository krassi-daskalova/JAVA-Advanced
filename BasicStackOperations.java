package StackQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

import static java.util.Collections.min;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int popElements = Integer.parseInt(input[1]);
        int searchElement = Integer.parseInt(input[2]);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        String[] stackElements = scanner.nextLine().split(" ");
        for (String stackElement : stackElements) {
            int number = Integer.parseInt(stackElement);
            stack.push(number);
        }
        for (int i = 0; i < popElements; i++) {
            stack.pop();
        }
        if (stack.contains(searchElement)) System.out.println("true");
        else if (stack.size() > 1){
            int smallest;
            smallest = min(stack);
            System.out.println(smallest);
        }
        if(stack.isEmpty()){
            System.out.println(0);
        }
    }
}

