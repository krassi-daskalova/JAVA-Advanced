package StackQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String currentPage = scanner.nextLine();
        ArrayDeque<String> stackBack = new ArrayDeque<>();
        ArrayDeque<String> stackForward = new ArrayDeque<>();

        while(!"Home".equals(currentPage)){
            if(!"back".equals(currentPage) && !"forward".equals(currentPage)){
                stackBack.push(currentPage);
                System.out.println(currentPage);
            } else if ("back".equals(currentPage)){
                if(stackBack.isEmpty()){
                    System.out.println("no previous URLs");
                }else{
                    String backPage = stackBack.pop();
                    System.out.println(stackBack.peek());
                    stackForward.push(backPage);
                }
            } else if ("forward".equals(currentPage)){
                if(stackForward.isEmpty()){
                    System.out.println("no next URLs");
                } else {
                    System.out.println(stackForward.pop());
                }
            }
            currentPage = scanner.nextLine();
        }
    }
}
