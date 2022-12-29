package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i;
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите операцию: "); //добавить, показать, удалить
            i = sc.nextInt();
            switch (i) {
                case 1 -> {
                    System.out.println("Какую покупку хотите добавить?");
                    sc.nextLine();
                    String purchase = sc.nextLine();
                    arrayList.add(purchase);
                    System.out.println(String.format("Итого в списке покупок: %d", arrayList.size()));
                }
                case 2 -> {
                    System.out.println("Список покупок:");
                    for (int z = 0; z < arrayList.size(); z++) {
                        System.out.println(String.format("%d. %s", z + 1, arrayList.get(z)));
                    }
                }
                case 3 -> {
                    System.out.println("Список покупок:");
                    for (int z = 0; z < arrayList.size(); z++) {
                        System.out.println(String.format("%d. %s", z + 1, arrayList.get(z)));
                    }
                    System.out.println("Какую хотите удалить? Введите номер или название");
                    sc.nextLine();
                    String removedProduct;
                    if (sc.hasNextInt()) {
                        int index = sc.nextInt();
                        removedProduct = arrayList.get(index - 1);
                        arrayList.remove(index - 1);
                    } else {
                        removedProduct = sc.nextLine();
                        arrayList.remove(removedProduct);
                    }
                    System.out.println(String.format("покупка %s удалена, список покупок:", removedProduct));
                    for (int z = 0; z < arrayList.size(); z++) {
                        System.out.println(String.format("%d. %s", z + 1, arrayList.get(z)));
                    }
                }
            }
        }
    }
}