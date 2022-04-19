package StackQueue;

import java.util.*;

public class Cooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] liquids = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] ingredients = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> queueLiquids = new ArrayDeque<>();
        ArrayDeque<Integer> stackIngredients = new ArrayDeque<>();
        Map<String, Integer> finalCooking = new TreeMap<>();

        for (int i = 0; i < liquids.length; i++) {
            queueLiquids.offer(liquids[i]);
        }
        for (int i = 0; i < ingredients.length; i++) {
            stackIngredients.push(ingredients[i]);
        }
        while (queueLiquids.size() > 0 || stackIngredients.size() > 0) {
            if (queueLiquids.size() > 0 && stackIngredients.size() > 0) {
                int total = queueLiquids.getFirst() + stackIngredients.getFirst();
                if (total == 25) {
                    queueLiquids.poll();
                    stackIngredients.pop();
                    finalCooking.putIfAbsent("Bread", 0);
                    finalCooking.put("Bread", finalCooking.get("Bread") + 1);
                } else if (total == 50) {
                    queueLiquids.poll();
                    stackIngredients.pop();
                    finalCooking.putIfAbsent("Cake", 0);
                    finalCooking.put("Cake", finalCooking.get("Cake") + 1);
                } else if (total == 75) {
                    queueLiquids.poll();
                    stackIngredients.pop();
                    finalCooking.putIfAbsent("Pastry", 0);
                    finalCooking.put("Pastry", finalCooking.get("Pastry") + 1);
                } else if (total == 100) {
                    queueLiquids.poll();
                    stackIngredients.pop();
                    finalCooking.putIfAbsent("Fruit Pie", 0);
                    finalCooking.put("Fruit Pie", finalCooking.get("Fruit Pie") + 1);
                } else {
                    int newIngr = stackIngredients.peek() + 3;
                    stackIngredients.pop();
                    stackIngredients.push(newIngr);
                }
            } else {
                break;
            }
        }
        if (finalCooking.keySet().size() == 4) {
            System.out.println("Wohoo! You succeeded in cooking all the food!");
        } else {
            System.out.println("Ugh, what a pity! You didn't have enough materials to cook everything.");
        }
        if (queueLiquids.isEmpty()) {
            System.out.println("Liquids left: none");
        } else {
            System.out.print("Liquids left: ");
            System.out.print(queueLiquids.poll() + ", ");
            System.out.print(", " + queueLiquids.peek());
        }

        if (stackIngredients.isEmpty()) {
            System.out.println("Ingredients left: none");
        } else {
            System.out.print("Ingredients left: ");
            System.out.print(stackIngredients.pop() + ", ");
            System.out.print(", " + stackIngredients.peek());
        }

    }

}


