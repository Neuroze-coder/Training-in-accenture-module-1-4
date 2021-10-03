import java.util.Locale;
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
        System.out.println("You entered: " + word.toUpperCase(Locale.ROOT));

        Pattern vowelLettersPattern = Pattern.compile("[ауоыиэяюеёАУОЫИЭЯЮЕЁ]");
        Pattern consonantLettersPattern = Pattern.compile("[бвгджзйклмнпрстфхцчшщьъБВГДЖЗЁКЛМНПРСТФХЦЧШЩЬЪ]");
        
        findVowelLetters(word, vowelLettersPattern);
        findConsonantLetters(word, consonantLettersPattern);
        System.out.println(" ");
        doubleVowelLetters(word, vowelLettersPattern);
    }

    private static void findConsonantLetters(String word, Pattern consonantLettersPattern) {
        Matcher matcherConsonant = consonantLettersPattern.matcher(word);
        int count1 = 0;
        int i1 = 0;
        while (matcherConsonant.find(i1)) {
            count1++;
            i1 = matcherConsonant.start() + 1;
        }
        System.out.print("Найдено согласных букв: " + count1);
    }

    private static void findVowelLetters(String word, Pattern vowelLettersPattern) {
        Matcher matcherVowel = vowelLettersPattern.matcher(word);
        int count = 0;
        int i = 0;
        while (matcherVowel.find(i)) {
            count++;
            i = matcherVowel.start() + 1;
        }
        System.out.println("Найдено гласных букв: " + count);
    }

    private static void doubleVowelLetters (String word, Pattern vowelLettersPattern) {
        Matcher matcherDoubleVowel = vowelLettersPattern.matcher(word);
        while (matcherDoubleVowel.find()) {
            StringBuilder sb = new StringBuilder(matcherDoubleVowel.group());
            sb.append(sb);
            System.out.print(sb);
        }
    }



}