package pr14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String text = "Пример текста со списками цен: 25.98 USD, 1000 RUB, 5.99 EUR, 44 ERR, 0.004 EU.";

        // Регулярные выражения для поиска цен в разных валютах
        String usdPattern = "\\b(\\d+\\.\\d+) USD\\b";
        String rubPattern = "\\b(\\d+) RUB\\b";
        String eurPattern = "\\b(\\d+\\.\\d+) EUR\\b";

        Pattern usdRegex = Pattern.compile(usdPattern);
        Pattern rubRegex = Pattern.compile(rubPattern);
        Pattern eurRegex = Pattern.compile(eurPattern);

        Matcher usdMatcher = usdRegex.matcher(text);
        Matcher rubMatcher = rubRegex.matcher(text);
        Matcher eurMatcher = eurRegex.matcher(text);

        while (usdMatcher.find()) {
            System.out.println("USD Price: " + usdMatcher.group(1));
        }

        while (rubMatcher.find()) {
            System.out.println("RUB Price: " + rubMatcher.group(1));
        }

        while (eurMatcher.find()) {
            System.out.println("EUR Price: " + eurMatcher.group(1));
        }
    }
}
