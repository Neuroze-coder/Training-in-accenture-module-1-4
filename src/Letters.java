import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Буквы
 * Напишите программу , которая вводит с клавиатуры текст.
 * Программа должна вывести на экран:
 * 1. количество гласных и согласных букв - вывести "количество гласных ", "количество согласных"
 * 2. удвоить все гласные буквы - вывести текст
 * 3. @param toUpperCase вывести на экране введенную строку в верхнем регистре
 */

public class Letters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter something");
        String word = scan.nextLine();
        Pattern vowelLetters = Pattern.compile("[ауоыиэяюеё]");
        Pattern consonantLetters = Pattern.compile("[бвгджзйклмнпрстфхцчшщьъ]");

    }

    public static void chekReg(Pattern pattern, String word) {
        Matcher matcher = pattern.matcher(word);
        System.out.println(matcher.matches());
    }

}