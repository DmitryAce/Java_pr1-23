package pr2.pr2_9;

import java.util.*;

public class Poker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");
        int numberOfPlayers = scanner.nextInt();

        if (numberOfPlayers <= 0) {
            System.out.println("Некорректное количество игроков.");
            return;
        }

        // Создаем колоду из 52 карт
        List<String> deck = createDeck();

        // Перетасовываем колоду
        Collections.shuffle(deck);

        // Раздаем карты игрокам
        for (int player = 1; player < numberOfPlayers; player++) {
            System.out.println("Игрок " + (player) + ":");
            for (int cardIndex = 0; cardIndex < 5; cardIndex++) {
                String card = deck.remove(0);
                System.out.println(card);
            }
            System.out.println(); // Пустая строка между игроками
        }

        scanner.close();
    }

    private static List<String> createDeck() {
        List<String> deck = new ArrayList<>();
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "В", "Д", "K", "Т"};
        String[] suits = {"Черви", "Пики", "Буби", "Трефы"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " " + suit);
            }
        }

        return deck;
    }
}
