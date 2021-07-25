package com.epam.FiboNums;

import java.util.ArrayList;
import java.util.List;

public class SimpleCode {

    private static int fiboFirst = 0;
    private static int fiboNext = 1;
    private static int n;
    private static int fiboSum;

    private static int even = 0;
    private static int odd = 0;
    private static double evenPer;
    private static double oddPer;

    public static void main(String[] args) {

        n = Integer.parseInt("5");

        List<Integer> fiboList = new ArrayList<Integer>();

        for (int i = 1; i <= n; i++) {
            fiboSum = fiboFirst + fiboNext;
            fiboFirst = fiboNext;
            fiboNext = fiboSum;
            fiboList.add(fiboSum);
        }
        // System.out.println(fiboList);
        // System.out.println("\n");

        Integer[] fiboArr = fiboList.toArray(new Integer[fiboList.size()]);
        for (Integer fibo : fiboArr) {
            // System.out.println(fibo + " ");
        }
        // System.out.println("\n");

        int maxEven = Integer.MIN_VALUE;
        for (int maxE : fiboArr)
            if (maxE % 2 == 0) {
                if (maxE > maxEven) {
                    maxEven = maxE;
                }
            }
        System.out.println(maxEven);
        // System.out.println("\n");

        int maxOdd = Integer.MIN_VALUE;
        for (int maxO : fiboArr)
            if (maxO % 2 == 1) {
                if (maxO > maxOdd) {
                    maxOdd = maxO;
                }
            }
        System.out.println(maxOdd);
        // System.out.println("\n");

        double arrL = fiboArr.length;
        for (int j = 0; j < fiboArr.length; j++) {
            if (fiboArr[j] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        // System.out.println(even);
        // System.out.println(odd);
        evenPer = (even / arrL) * 100;
        // System.out.println(evenPer);
        oddPer = (odd / arrL) * 100;
        // System.out.println(oddPer);

    }
}
