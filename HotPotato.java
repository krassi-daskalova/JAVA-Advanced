package StackQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> queueOfNames = new ArrayDeque<>();
        String[] names = scanner.nextLine().split(" ");

        for (String name : names) {
            queueOfNames.offer(name);
        }
        int num = Integer.parseInt(scanner.nextLine());

        while (queueOfNames.size() > 1){
            for (int i = 1; i < num; i++){
                String rearrangeName = queueOfNames.poll();
                queueOfNames.offer(rearrangeName);
            }
            System.out.println("Removed "+ queueOfNames.poll());
        }
        System.out.println("Last is "+ queueOfNames.peek());
    }
}
