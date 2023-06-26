package lv.acodemy.classroom;

import java.util.Arrays;

public class ArraysIfs {
    public static void main(String[] args) {

        // int Array

        int[] numbers = {1, 5, 9, 10, 20, 30, 50};
        System.out.println(numbers[3]); // print 10

        //numbers[0] = 1
        //numbers[1] = 5
        //numbers[2] = 9
        //numbers[....] = 50

//        System.out.println(numbers[7]); - has exception - out of bounds

        int[] ages = new int[10];
        ages[0] = 18;
        ages[3] = 24;

        System.out.println(Arrays.toString(ages));
        System.out.println(ages);

        // String array

        String[] names = {"John", "Andrew", "Mary", "Angelica"};
        System.out.println(Arrays.toString(names));
        System.out.println(names[3]); // print Angelica

        // Logical Statements

        /*

        if(condition) {

        }

        condition = boolean (true or false)

         */

        if (5 < 10) {
            System.out.println("Yes, this is correct!");
        }

        boolean isSummer = false;
        if (isSummer) {
            System.out.println("Yes, this is summer and its quite hot in here!");
        }

//    If Statement
//    Check if a given number is positive or negative. - done
//    Check if a number is divisible by 2.
//    Check if a character is a vowel or consonant. (aeiou) / aeiouAEIOU ***


        int x = 11;

        if (x > 0) {
            System.out.println("Number is positive:" + x);
        }

        if (x < 0) {
            System.out.println("Number is negative:" + x);
        }

        if (x % 2 == 0) {
            System.out.println("This number can be divided: " + x);
        }


        /*

        if(true) {
        do something if true
        } else {
        do something another if false
        }

       */

        if (x > 0) {
            System.out.println("Number is positive:" + x);
        } else {
            System.out.println("Number is negative: " + x);
        }

//    If-Else Statement:
//    Check if a given number is even or odd.
//    Check if a person is eligible to vote (based on their age).


        if (x % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        x = 18;

        // <= (less or equals)
        // >= (more or equals)
        // == (compare)

        if (x < 18) {
            System.out.println("Person is not eligible for voting");
        } else {
            System.out.println("Person can go vote");
        }

        isSummer = false;
        boolean isWinter = false;
        boolean isAutumn = false;

        if (isSummer) {
            System.out.println("Right, this is summer!");
        } else if (isWinter) {
            System.out.println("Right, this is winter!");
        } else if (isAutumn) {
            System.out.println("Right, this is autumn!");
        } else {
            System.out.println("Not sure, but it can be spring!");
        }

//        Determine the grade based on a student's score (using a grading scale).


        int grade = 0;

        if (grade == 1) {
            System.out.println("Unsatisfactory");
        } else if (grade == 2) {
            System.out.println("Unsatisfactory");
        } else if (grade == 3) {
            System.out.println("Unsatisfactory");
        } else if (grade == 4) {
            System.out.println("Almost satisfactory");
        } else if (grade == 5) {
            System.out.println("Almost satisfactory");
        } else if (grade == 6) {
            System.out.println("Almost good");
        } else if (grade == 7) {
            System.out.println("Good");
        } else if (grade == 8) {
            System.out.println("Very good");
        } else if (grade == 9) {
            System.out.println("Excellent");
        } else if (grade == 10) {
            System.out.println("Perfect");
        } else {
            System.out.println("Incorrect grade provided");
        }

// Classify a given angle as acute, right, obtuse, or straight.
//    Acute angle > 0 && < 90 (ostr)
//    Right angle 90 (prm)
//    Obtuse >90 && < 180
//    Straight 180 (razv)

        int angle = 90;

        if (angle > 0 && angle < 90) {
            System.out.println("acute ang.");
        } else if (angle == 90) {
            System.out.println("right ang.");
        } else if (angle > 90 && angle < 180) {
            System.out.println("obtuse ang.");
        } else if (angle == 180) {
            System.out.println("straight");
        } else {
            System.out.println("provided angle is not supported");
        }

//    Determine the largest of three given numbers.

        int[] numberArray = {5, 7, 10, 3, 4, 10, 50, 20, 30, 20, 10};
        // numberArray[0] = 5
        // numberArray[1] = 7
        // numberArray[2] = 10

        int max = 0;


        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] > max) {
                max = numberArray[i];
            }
        }
        System.out.println("maximum is: " + max);
    }
}