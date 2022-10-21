package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class App {


    public static void oneMonthCalendar(int day, int x) {
        int count = 0;
        int Week = 7 - x;

        for (int i = 0; i < x - 1; i++) {
            System.out.print("   ");
        }
        for (int i = 0; i < day; i++) {
            System.out.printf(String.format("%2d", (i + 1)) + " ");

            if (i == Week) {
                count = 7;
            }
            if (count % 7 == 0 && count >= 7) {
                System.out.println();
            }
            if (i + 1 == day && count % 7 != 0) {
                System.out.println();
            }
            count++;
        }
    }

    public static long[] lcg(long seed) {
        long[] array = new long[10];
        long x;
        long t = (long) Math.pow(2, 31);
        int b = 12345;
        long a = 1103515245;

        for (int y = 0; y < array.length; y++) {
            if (y == 0) {
                x = seed;
            } else {
                x = array[y - 1];
            }
            array[y] = (a * x + b) % t;
        }
        return array;
    }

    public static void guessingGame(int numberToGuess) {
        int x = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 1; ; i++) {
            System.out.print("Guess number " + i + ": ");
            x = sc.nextInt();

            if (i == 10) {
                System.out.println("You lost! Have you ever heard of divide & conquer?");
                break;
            }
            if (x > numberToGuess) {
                System.out.println("The number AI picked is lower than your guess.");

            } else if (x < numberToGuess) {
                System.out.println("The number AI picked is higher than your guess.");

            } else if (x == numberToGuess) {
                System.out.println("You won wisenheimer!");
                break;
            }
        }
    }

    public static int randomNumberBetweenOneAndHundred(){
        return new Random().nextInt(100)+1;
    }

    public static boolean swapArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length)
            return false;

        for (int i = 0; i < array1.length; i++) {
            array1[i] += array2[i];
            array2[i] = array1[i] - array2[i];
            array1[i] = array1[i] - array2[i];
        }
        return true;
    }

    public static String camelCase(String txt) {
        char[] charArray = txt.toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < charArray.length; i++) {
            if ((i == 0 && charArray[i] != ' ') || (charArray[i] != ' ' && charArray[i - 1] == ' ')) {
                if (charArray[i] >= 'a' && charArray[i] <= 'z') {
                    result.append((char) (charArray[i] - 'a' + 'A'));
                } else {
                    result.append(charArray[i]);
                }
            } else if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
                result.append((char) (charArray[i] + 'a' - 'A'));
            } else if (charArray[i] >= 'a' && charArray[i] <= 'z') {
                result.append(charArray[i]);
            }
        }
        return result.toString();
    }

    public static int checkDigit(int [] code){
        int x= 0;
        for(int i = 0; i < code.length; i++) {
            x = x + code[i] * (i+2) ;
        }
        int y = 11 - x % 11;
        if(y == 11){
            y= 5;
        }else if (y == 10){
            y = 0;
        }
        return y;
    }
}