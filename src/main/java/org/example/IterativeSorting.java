package org.example;

import java.util.List;

public class IterativeSorting {

    /*
     * given an array of Integers, return a boolean if the array is in sorted order
     * isSorted([1,2,3,4]) -> true
     * isSorted([4,1,2,3]) -> false
     * Running time: ???
     * Memory Usage: ???
     */
    public boolean isSorted(List<Integer> numbers) {
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) > numbers.get(i)) {
                return false;
            }
        }
        return true;
    }

    /*
     * Sort given array of numbers by swapping adjacent items that are out of order
     * and repeat until all items are sorted
     * Running time: ???
     * Memory usage: ???
     */
    public List<Integer> bubbleSort(List<Integer> numbers) {

        return null;
    }

    /*
     * Sort given array of numbers by finding the smallest number and swapping
     * and repeating until all items are in order.
     * Running time: ???
     * Memory Usage: ???
     */
    public List<Integer> selectionSort(List<Integer> numbers) {
        return null;
    }

    /*
     * Sort given array of numbers by taking first unsorted number, inserting it in
     * sorted order
     * in fornt of items, and repeating until all items are in order.
     * Running time: ???
     * Memory Usage: ???
     */
    public List<Integer> insertionSort(List<Integer> numbers) {
        return null;
    }

}
