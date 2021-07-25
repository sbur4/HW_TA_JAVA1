package com.epam.NumsInterval;

/**
 * @author sburch
 * @mentor Roman Mysiuk
 */

public class SumEvenOdd {

    static int sumEven, sumOdd;
    static int firstNum, secondNum;

    static void findEvenOdd(int firstNum, int secondNum) {

        for (int i = firstNum; i < secondNum + 1; i++) {
            if ((i % 2) == 0)
                sumEven += i;
            else
                sumOdd += i;
        }
        System.out.println(sumEven);
        System.out.println(sumOdd);
        System.out.println("\n");
    }

    public static void main(String[] args) {
        try {

            int firstNum = Integer.parseInt("1");
            int secondNum = Integer.parseInt("100");

            findEvenOdd(firstNum, secondNum);

        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormatException: " + nfe.getMessage());
        }
    }
}
