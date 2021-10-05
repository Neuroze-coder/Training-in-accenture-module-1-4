import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValidator {

    /**
     * На вход подается строка, необходимо проверить , соот-ет ли строка номеру телефона
     * * Номер начинается с о знака "+" и имеет 11 цифр ( вид +7-920-681-45-78)
     * * При выводе на экран возращаем номер по оператору свзяи
     * * (920) - Мегафон
     * * (903) - Билайн
     * * (910) - МТС
     * * (904) - Теле2
     * *
     * * если оператор не определен то выводим фразу : "оператор неизвестен"
     *
     * @param phoneNumber
     * @return
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String phoneNumber = scan.nextLine();
        System.out.println(getPhoneOperator(phoneNumber));

    }


    public static String getPhoneOperator(String phoneNumber) {
        Pattern phoneNumberPattern = Pattern.compile("...\\d{3}.\\d{3}.\\d{2}.\\d{2}");
        Matcher identifyFormatNumber = phoneNumberPattern.matcher(phoneNumber);
        boolean found = identifyFormatNumber.matches();
        if (found) {
            Pattern phoneOperatorPattern = Pattern.compile("(903)|(904)|(910)|(920)");
            Matcher operatorMather = phoneOperatorPattern.matcher(phoneNumber);

            String megafon = "920";
            String beeline = "903";
            String mts = "910";
            String tele2 = "904";

            while (operatorMather.find()) {
                if (operatorMather.group().equals(megafon)) {
                    return "Megafon";
                } else if (operatorMather.group().equals(beeline)) {
                    return "Beeline";
                } else if (operatorMather.group().equals(mts)) {
                    return "MTS";
                } else if (operatorMather.group().equals(tele2)) {
                    return "TELE2";
                } else {
                    return "Operator unknown";
                }
            }
            return "Operator unknown";
        } else {
            throw new IllegalArgumentException();
        }
    }
}
