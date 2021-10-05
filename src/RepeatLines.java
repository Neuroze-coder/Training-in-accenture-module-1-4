import java.util.Scanner;

/**
 * Считать с клавиатуры 7 строк и заполнить ими массив strings
 * Удалить повторяющиеся сроки из массива
 * Заменить удаленные строки на null
 */

public class RepeatLines {

    public static void main(String[] args) {
        String[] strings = new String[7];


        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            strings[i] = scan.nextLine();
        }
        for (int i = 0; i < strings.length; i++) {
            String currentStrings = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (currentStrings == null) {
                    break;
                }
                if (currentStrings.equals(strings[j])) {
                    strings[j] = null;
                    strings[i] = null;
                }
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
