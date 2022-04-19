package StackQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> browser = new ArrayDeque<>();
        String currentURL;

        while (!"Home".equalsIgnoreCase(currentURL = scanner.nextLine())){
            if(!"back".equalsIgnoreCase(currentURL)){
                browser.push(currentURL);
                System.out.println(currentURL);
            } else {
                if(browser.size() > 1){
                    browser.pop();
                    System.out.println(browser.peek());
                } else {
                    System.out.println("no previous URLs");
                }
            }
        }
    }
}
