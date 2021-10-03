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
        int countForConsonant = 0;
        int iForConsonant = 0;
        while (matcherConsonant.find(iForConsonant)) {
            countForConsonant++;
            iForConsonant = matcherConsonant.start() + 1;
        }
        System.out.print("Найдено согласных букв: " + countForConsonant);
    }

    private static void findVowelLetters(String word, Pattern vowelLettersPattern) {
        Matcher matcherVowel = vowelLettersPattern.matcher(word);
        int countForVowel = 0;
        int iForVowel = 0;
        while (matcherVowel.find(iForVowel)) {
            countForVowel++;
            iForVowel = matcherVowel.start() + 1;
        }
        System.out.println("Найдено гласных букв: " + countForVowel);
    }

    private static void doubleVowelLetters (String word, Pattern vowelLettersPattern) {
        Matcher matcherDoubleVowel = vowelLettersPattern.matcher(word);
        while (matcherDoubleVowel.find()) {
            StringBuilder sb = new StringBuilder(matcherDoubleVowel.group());
            sb.append(sb);
            System.out.print(sb.toString().toLowerCase(Locale.ROOT));
        }
    }



}