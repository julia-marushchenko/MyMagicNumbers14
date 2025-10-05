// Java program to find numbers dividable by 3

package com.numbers;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating collection to store numbers
        Queue <Integer> queue = new LinkedList<>();

        // Adding numbers from 0 to 99 to a queue
        for (int index = 0; index < 100; index++) {
            queue.add(index);
        }

        // Printing out numbers with result
        // Creating iterator
        Iterator it = queue.iterator();

        // Condition that next value exists
        while (it.hasNext()) {

            // Creating helping value
            int tmp = (int)it.next();

            // Printing result to console
            // Condition of division by 3
            if (tmp % 3 == 0) {

                // Printing the result to console
                System.out.println(tmp + " is dividable by 3.");
            } else {

                // Printing the result to console
                System.out.println(tmp + " is not dividable by 3.");
            }
        }
    }
}
