package pr2.pr2_9;

import java.util.*;

public class Poker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("������� ���������� �������: ");
        int numberOfPlayers = scanner.nextInt();

        if (numberOfPlayers <= 0) {
            System.out.println("������������ ���������� �������.");
            return;
        }

        // ������� ������ �� 52 ����
        List<String> deck = createDeck();

        // �������������� ������
        Collections.shuffle(deck);

        // ������� ����� �������
        for (int player = 1; player < numberOfPlayers; player++) {
            System.out.println("����� " + (player) + ":");
            for (int cardIndex = 0; cardIndex < 5; cardIndex++) {
                String card = deck.remove(0);
                System.out.println(card);
            }
            System.out.println(); // ������ ������ ����� ��������
        }

        scanner.close();
    }

    private static List<String> createDeck() {
        List<String> deck = new ArrayList<>();
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "�", "�", "K", "�"};
        String[] suits = {"�����", "����", "����", "�����"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " " + suit);
            }
        }

        return deck;
    }
}
