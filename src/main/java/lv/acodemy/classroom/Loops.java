package lv.acodemy.classroom;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class Loops {
    public static void main(String[] args) {

        //for; foreach, do while, while;

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!");
        }

        String[] fruits = {"apple", "banana", "kiwi", "orange", "pear"};

        //fruits[0] = apple
        //fruits[1] = banana
        //....

        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
            if (fruits[i].equals("kiwi")) {
                System.out.println("I found kiwi!");
                break;
            }
        }

        // enhanced for (for each)
        for (String fruit : fruits) {
            System.out.println("fruit = " + fruit);
        }

//        Print the numbers from 20 to 40.
//        Calculate the sum of all even numbers between 1 and 100.
//        Print the multiplication table of a given number.


        for (int i = 20; i <= 40; i++) {
            System.out.println(i);
        }


        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum of even numbers: " + sum);


        // Print the multiplication table of a given number

        //6;

        int number = 6;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i * number + " ");
        }

        System.out.println();

        // TODO: Multiplication table 10;

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }

        // WHILE LOOP
        int i = 10;
        while (i > 0) {
            System.out.println("Hello World!");
            i--;
        }

        int j = 0;
        while (j < 10) {
            System.out.println("Hello World");
            j++;
        }

        int k = 0;
        do {
            System.out.println("MLK");
            k++;
        } while (k < 10);


        Scanner myScanner = new Scanner(System.in);
        Random randomizer = new Random();
        int randomNumber = randomizer.nextInt(5);

        boolean isGuessed = false;
        while (!isGuessed) {
            System.out.println("Please enter number I guessed:");
            int inputNumber = myScanner.nextInt();
            if (randomNumber == inputNumber) {
                System.out.println("You guessed the number!");
                isGuessed = true;
            } else {
                System.out.println("Try again!");
            }
        }

        // TODO: Limit guess with 3 times;
        Stream.of(fruits).filter(s -> s.equals("kiwi")).forEach(System.out::println);

        String name = "Nikita";
        String reversed = "";
        for (int l = name.length() - 1; l >= 0; l--) {
            reversed = reversed + name.charAt(l);
        }
        System.out.println(reversed);
    }
}
