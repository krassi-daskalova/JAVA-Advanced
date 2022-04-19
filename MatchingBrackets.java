package StackQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();

        String input = scanner.nextLine();
        for (int position = 0; position < input.length(); position++){
            char current = input.charAt(position);
            if(current == '('){
                stack.push(String.valueOf(position));
            } else if(current == ')'){
                int start = Integer.parseInt(stack.pop());
                System.out.println(input.substring(start, position + 1));
            }
        }
    }
}
