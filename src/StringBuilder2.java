/**
 * Используя StringBuilder необходимо реализвать два метода :
 * 1. метод  addTo ( String? String[] ) добавляет к строке, полученной первым параметром,
 * все строки по порядку, полученные из массива строк полученные вторым параметром  и возвращает объект типа StringBuilder на основе этой строк
 * 2. метод replace(String, String, int, int) заменяет часть строки, полученной первым параметром, начиная с индекса, полученного третьим параметром,
 * и заканчивая индексом, полученным четвертым параметром, на строку, полученную вторым параметром, и возвращает объект типа StringBuilder на основе этой строки.
 * Добавление нового значения к существующему объекту типа StringBuilder вызываем  append(String)
 * Для замены части значения объекта - вызываем replace (int, int, String)  в который передаем начальную и к онечную позицию для замены
 */

public class StringBuilder2 {
    public static void main(String[] args) {
        String string = "Я помню чудное мгновенье:";

        System.out.println(addTo(string, new String[]{" Передо ", "мной ", "явилась ", "ты!"}));
        System.out.println(replace(string, "не помню", 2, 7));
    }

    public static StringBuilder addTo (String string, String[] strings) {
        StringBuilder refrag = new StringBuilder();
        refrag.append(string);
        for (int i = 0; i < strings.length; i++) {
            StringBuilder sb = refrag.append(strings[i]);
        }
        return refrag;
    }

    public static StringBuilder replace (String string, String str, int start, int end) {
        StringBuilder refrag = new StringBuilder(string);
        refrag.replace(start,end,str);
        return refrag;
    }
}
