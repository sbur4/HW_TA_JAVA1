package com.epam;

import com.epam.FiboNums.FiboEvenOdd;
import com.epam.NumsInterval.SumEvenOdd;

/**
 * @author sburch
 * @mentor Roman Mysiuk
 */

/**
 * Write program, which will pass requirements using OOP: User enter the
 * interval (for example: [1;100]); Program prints the sum of odd and even
 * numbers; Program build Fibonacci numbers: F1 will be the biggest odd number
 * and F2 the biggest even number, user can enter the size of set (N); Program
 * prints percentage of odd and even Fibonacci numbers.
 */

public class Main {
    public static void main(String[] args) {
        SumEvenOdd.main(args);
        FiboEvenOdd.main(args);
    }
}
