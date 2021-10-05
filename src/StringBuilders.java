import java.util.Scanner;

/**
 * Считать с клавиатуры строку
 * Добавьте к основной строке 50 новых подстрок , используя класс String
 * реализуйте решение с помощью класса StringBuilder
 */

public class StringBuilders {
    public static void main(String[] args) {
        System.out.println("Для красивой истории, введи букву - Я");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        StringBuilder lineBuilder = new StringBuilder(line);
        lineBuilder.append(" п");
        lineBuilder.append("о");
        lineBuilder.append("м");
        lineBuilder.append("н");
        lineBuilder.append("ю");
        lineBuilder.append(" чу");
        lineBuilder.append("дно");
        lineBuilder.append("е");
        lineBuilder.append(" м");
        lineBuilder.append("гн");
        lineBuilder.append("о");
        lineBuilder.append("ве");
        lineBuilder.append("нь");
        lineBuilder.append("е:");
        lineBuilder.append(" Пер");
        lineBuilder.append("е");
        lineBuilder.append("до");
        lineBuilder.append(" мной");
        lineBuilder.append(" яви");
        lineBuilder.append("ла");
        lineBuilder.append("сь");
        lineBuilder.append(" т");
        lineBuilder.append("ы");
        lineBuilder.append(",");
        lineBuilder.append(" К");
        lineBuilder.append("ак");
        lineBuilder.append(" м");
        lineBuilder.append("имо");
        lineBuilder.append("летн");
        lineBuilder.append("ое");
        lineBuilder.append(" в");
        lineBuilder.append("и");
        lineBuilder.append("д");
        lineBuilder.append("е");
        lineBuilder.append("н");
        lineBuilder.append("ь");
        lineBuilder.append("е");
        lineBuilder.append(",");
        lineBuilder.append(" К");
        lineBuilder.append("ак");
        lineBuilder.append(" г");
        lineBuilder.append("е");
        lineBuilder.append("н");
        lineBuilder.append("и");
        lineBuilder.append("й");
        lineBuilder.append(" ");
        lineBuilder.append("ч");
        lineBuilder.append("ис");
        lineBuilder.append("той");
        lineBuilder.append(" ");
        lineBuilder.append("красоты.");

        System.out.println(lineBuilder);

    }
}