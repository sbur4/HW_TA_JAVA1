package com.epam.FiboNums;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sburch
 * @mentor Roman Mysiuk
 */

public class FiboEvenOdd {

    public static int[] fiboArr;
    private static double evenPer;
    private static double oddPer;

    private static int even;
    private static int odd;

    static int maxEvenFibo(Integer[] fiboArr2) {

        int maxEven = Integer.MIN_VALUE;

        for (int maxE : fiboArr2)
            if (maxE % 2 == 0) {
                if (maxE > maxEven) {
                    maxEven = maxE;
                }
            }
        System.out.println("\n");
        System.out.println(maxEven);
        return maxEven;
    }

    static int maxOddFibo(Integer[] fiboArr2) {

        int maxOdd = Integer.MIN_VALUE;

        for (int maxO : fiboArr2)
            if (maxO % 2 == 1) {
                if (maxO > maxOdd) {
                    maxOdd = maxO;
                }
            }
        System.out.println("\n");
        System.out.println(maxOdd);
        return maxOdd;
    }

    static void percentFibo(Integer[] fiboArr2) {

        double arrL = fiboArr2.length;

        for (int j = 0; j < fiboArr2.length; j++) {
            if (fiboArr2[j] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("\n");
        // System.out.println(even);
        // System.out.println(odd);
        evenPer = (even / arrL) * 100;
        System.out.println(evenPer);
        oddPer = (odd / arrL) * 100;
        System.out.println(oddPer);
    }

    public static void main(String[] args) {
        try {

            int n = Integer.parseInt("10");

            int fiboFirst = 0;
            int fiboNext = 1;
            int fiboSum;
            List<Integer> fiboList = new ArrayList<Integer>();

            for (int i = 1; i <= n; i++) {
                fiboSum = fiboFirst + fiboNext;
                fiboFirst = fiboNext;
                fiboNext = fiboSum;
                fiboList.add(fiboSum);
                System.out.print(fiboSum + " ");
            }

            Integer[] fiboArr = fiboList.toArray(new Integer[fiboList.size()]);
            /*
             * for (Integer fibo : fiboArr) { System.out.println(fibo + " "); }
             */

            maxEvenFibo(fiboArr);
            maxOddFibo(fiboArr);
            percentFibo(fiboArr);

        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormatException: " + nfe.getMessage());
        }
    }

}
