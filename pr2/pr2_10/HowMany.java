package pr2.pr2_10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¬ведите текст:");
        String inputText = scanner.nextLine();

        // –аздел€ем введенный текст на слова с использованием пробелов в качестве разделителей
        String[] words = inputText.split("\\s+");

        // ѕодсчитываем количество слов
        int wordCount = words.length;

        System.out.println(" оличество слов в тексте: " + wordCount);

        scanner.close();
    }
}

/*
¬ этом коде \\s+ - это регул€рное выражение, которое соответствует одному или более пробелам
(или другим пробельным символам, таким как табул€ци€ или перевод строки). “аким образом,
текст будет разделен на слова, и даже если введены несколько пробелов подр€д,
они будут считатьс€ одним разделителем.
 */