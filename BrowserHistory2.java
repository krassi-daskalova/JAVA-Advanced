package StackQueue;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> browser = new ArrayDeque<>();
        String currentURL = scanner.nextLine();

        while (!"Home".equals(currentURL)){
            if(!"back".equals(currentURL)){
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
            currentURL = scanner.nextLine();
        }
    }
}
