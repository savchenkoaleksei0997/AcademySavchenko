package by.academy.homework.homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Deal {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число игроков : ");
        int numberOfPlayers = scanner.nextInt();
        String[] deck = {"Король буба", "Король чирва", "Король креста", "Король пика",
                "Дама буба", "Дама чирва", "Дама креста", "Дама пика",
                "Туз буба", "Туз чирва", "Туз креста", "Туз пика",
                "Валет буба", "Валет чирва", "Валет креста", "Валет пика",
                "6 буба", "6 чирва", "6 креста", "6 пика",
                "7 буба", "7 чирва", "7 креста", "7 пика",
                "8 буба", "8 чирва", "8 креста", "8 пика",
                "9 буба", "9 чирва", "9 креста", "9 пика",
                "10 буба", "10 чирва", "10 креста", "10 пика"};
        String[][] players = new String[numberOfPlayers][5];

        String[] newArray = new String[deck.length];
        List<Integer> indexes = new ArrayList<>(deck.length);

        int count = 0;

        // Перетусовку карт копировал, не могу понять до конца как работает.   if (!indexes.contains(var)) {
        //                                                                         indexes.add(var);
        while (true) {
            int var = random.nextInt(deck.length);
            if (!indexes.contains(var)) {
                indexes.add(var);
                newArray[var] = deck[count++];
            }
            if (count == deck.length) {
                break;
            }
        }

        count = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < numberOfPlayers; j++) {
                players[j][i] = newArray[count];
                count++;
            }
        }
        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println();
            System.out.print("Карты игрока " + (i + 1) + " : ");
            for (int j = 0; j < 5; j++) {
                System.out.print(players[i][j] + " ");
            }
        }
    }
}
