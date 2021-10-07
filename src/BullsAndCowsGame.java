import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class BullsAndCowsGame {
    public static void main(String[] args) {
        System.out.println("Введите уровень сложности от 3 до 5");
        Scanner scanner = new Scanner(System.in);
        int level = scanner.nextInt();
        if (level == 3){
            Random gen = new Random();
            int target;

            while (hasDupes(target = (gen.nextInt(900) + 100))) ;
            String targetStr = target + "";
            boolean guessed = false;
            Scanner input = new Scanner(System.in);

            int attempts = 0;
            do {
                int bulls = 0;
                int cows = 0;
                System.out.print("Угадай число из 3 не повторяющихся чисел: ");
                int attempt;
                try {
                    attempt = input.nextInt();
                    if (hasDupes(attempt) || attempt < 100)
                        continue;
                } catch (InputMismatchException e) {
                    System.out.println("Неверное число");
                    continue;
                }
                attempts++;
                String attemptString = attempt + "";
                for (int i = 0; i < 3; i++) {
                    if (attemptString.charAt(i) == targetStr.charAt(i)) {
                        bulls++;
                    } else if (targetStr.contains(attemptString.charAt(i) + "")) {
                        cows++;
                    }
                }
                if (bulls == 3) {
                    guessed = true;
                } else {
                    System.out.println(cows + " Коров и " + bulls + " быков.");
                }
            } while (!guessed);
            System.out.println("Ты выиграл используя " + attempts + " попыток!");

        }else if (level == 4) {
            Random gen = new Random();
            int target;

            while (hasDupes(target = (gen.nextInt(9000) + 1000))) ;
            String targetStr = target + "";
            boolean guessed = false;
            Scanner input = new Scanner(System.in);

            int attempts = 0;
            do {
                int bulls = 0;
                int cows = 0;
                System.out.print("Угадай число из 4 не повторяющихся чисел: ");
                int attempt;
                try {
                    attempt = input.nextInt();
                    if (hasDupes(attempt) || attempt < 1000)
                        continue;
                } catch (InputMismatchException e) {
                    System.out.println("Неверное число");
                    continue;
                }
                attempts++;
                String attemptString = attempt + "";
                for (int i = 0; i < 4; i++) {
                    if (attemptString.charAt(i) == targetStr.charAt(i)) {
                        bulls++;
                    } else if (targetStr.contains(attemptString.charAt(i) + "")) {
                        cows++;
                    }
                }
                if (bulls == 4) {
                    guessed = true;
                } else {
                    System.out.println(cows + " Коров и " + bulls + " быков.");
                }
            } while (!guessed);
            System.out.println("Ты выиграл используя " + attempts + " попыток!");
        } else if (level ==5 ) {
            Random gen = new Random();
            int target;

            while (hasDupes(target = (gen.nextInt(90000) + 10000))) ;
            String targetStr = target + "";
            boolean guessed = false;
            Scanner input = new Scanner(System.in);

            int attempts = 0;
            do {
                int bulls = 0;
                int cows = 0;
                System.out.print("Угадай число из 5 не повторяющихся чисел: ");
                int attempt;
                try {
                    attempt = input.nextInt();
                    if (hasDupes(attempt) || attempt < 10000)
                        continue;
                } catch (InputMismatchException e) {
                    System.out.println("Неверное число");
                    continue;
                }
                attempts++;
                String attemptString = attempt + "";
                for (int i = 0; i < 5; i++) {
                    if (attemptString.charAt(i) == targetStr.charAt(i)) {
                        bulls++;
                    } else if (targetStr.contains(attemptString.charAt(i) + "")) {
                        cows++;
                    }
                }
                if (bulls == 5) {
                    guessed = true;
                } else {
                    System.out.println(cows + " Коров и " + bulls + " быков.");
                }
            } while (!guessed);
            System.out.println("Ты выиграл используя " + attempts + " попыток!");
        } else {
            System.out.println("Введен не верный уровень сложности игры");
        }

    }
    public static boolean hasDupes(int num) {
        boolean[] digs = new boolean[10];
        while (num > 0) {
            if (digs[num % 10]) return true;
            digs[num % 10] = true;
            num /= 10;
        }
        return false;
    }
}
