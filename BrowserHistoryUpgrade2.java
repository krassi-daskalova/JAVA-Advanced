package StackQueue;

import java.sql.SQLOutput;
import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.SortedMap;

public class BrowserHistoryUpgrade2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String currentPage = scanner.nextLine();
        ArrayDeque<String> qForward = new ArrayDeque<>();
        ArrayDeque<String> sBack = new ArrayDeque<>();

        while (!"Home".equals(currentPage)){
            if(!"back".equals(currentPage) && !"forward".equals(currentPage)){
                sBack.push(currentPage);
                System.out.println(currentPage);
            } else if ("back".equals(currentPage)){
                if (sBack.size() > 1){
                    String backPage = sBack.pop();
                    qForward.offer(backPage);
                } else {
                    System.out.println("no previous URLs");
                }
            } else if("forward".equals(currentPage)){
                if(qForward.size() > 1){
                    String forward = qForward.poll();
                    sBack.push(forward);
                    System.out.println(forward);
                } else {
                    System.out.println("no next URLs");
                }
            } else{
                if(!qForward.isEmpty()){
                    qForward.clear();
                }
            }
            currentPage = scanner.nextLine();
        }

    }
}
