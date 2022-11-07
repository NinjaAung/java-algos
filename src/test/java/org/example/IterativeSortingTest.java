package org.example;

import org.junit.*;
import static org.junit.Assert.*;

import org.example.IterativeSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IterativeSortingTest {

    IterativeSorting iterativeSorting = new IterativeSorting();

    @Test
    public void isSorted_SortedIntegerts_True() {
        assertTrue("Input: isSorted(new ArraysList<Integer>(Arrays.asList()))   []",
                iterativeSorting.isSorted(new ArrayList<Integer>()));
        assertTrue("Input: isSorted(new ArraysList<Integer>(Arrays.asList(10))   [10] )",
                iterativeSorting.isSorted(new ArrayList<Integer>(Arrays.asList(10))));
        assertTrue("Input: isSorted(new ArraysList<Integer>(Arrays.asList(10,21)) )   [10,21]",
                iterativeSorting.isSorted(new ArrayList<Integer>(Arrays.asList(10, 21))));
        assertTrue("Input: isSorted(new ArraysList<Integer>(Arrays.asList(10,21,30)) ) [10,21,30]",
                iterativeSorting.isSorted(new ArrayList<Integer>(Arrays.asList(10, 21, 30))));
        assertTrue("Input: isSorted(new ArraysList<Integer>(Arrays.asList(10,21,30,41)) )   [10,21,30,41]",
                iterativeSorting.isSorted(new ArrayList<Integer>(Arrays.asList(10, 21, 30, 41))));
    }

    @Test
    public void isSorted_UnSortedIntegers_False() {
        assertFalse("Input isSorted(new ArrayList<Integer>(Arrays.asList(8, 3)))    [8,3]",
                iterativeSorting.isSorted(new ArrayList<Integer>(Arrays.asList(8, 3))));
        assertFalse("Input isSorted(new ArrayList<Integer>(Arrays.asList(3, 8, 2)))    [3,8,2]",
                iterativeSorting.isSorted(new ArrayList<Integer>(Arrays.asList(3, 8, 2))));
        assertFalse("Input isSorted(new ArrayList<Integer>(Arrays.asList(10, 5, 3)))    [10,5,3]",
                iterativeSorting.isSorted(new ArrayList<Integer>(Arrays.asList(10, 5, 3))));
    }

    @Test
    public void bubbleSort() {
        Integer[] test1 = testArray(10, 1, 20);
        Integer[] test2 = testArray(20, 1, 50);
        Integer[] test3 = testArray(30, 1, 100);

        String failure = compareArrayLists(Arrays.asList(test1.clone()),
                iterativeSorting.bubbleSort(Arrays.asList(test1)));
        if (failure != null) {
            fail(failure);
        }
        failure = compareArrayLists(Arrays.asList(test2.clone()), iterativeSorting.bubbleSort(Arrays.asList(test2)));
        if (failure != null) {
            fail(failure);
        }

        failure = compareArrayLists(Arrays.asList(test3.clone()), iterativeSorting.bubbleSort(Arrays.asList(test3)));
        if (failure != null) {
            fail(failure);
        }
    }

    @Test
    public void selectionSort() {
        Integer[] test1 = testArray(10, 1, 20);
        Integer[] test2 = testArray(20, 1, 50);
        Integer[] test3 = testArray(30, 1, 100);

        String failure = compareArrayLists(Arrays.asList(test1.clone()),
                iterativeSorting.selectionSort(Arrays.asList(test1)));
        if (failure != null) {
            fail(failure);
        }
        failure = compareArrayLists(Arrays.asList(test2.clone()), iterativeSorting.selectionSort(Arrays.asList(test2)));
        if (failure != null) {
            fail(failure);
        }
        failure = compareArrayLists(Arrays.asList(test3.clone()), iterativeSorting.selectionSort(Arrays.asList(test3)));
        if (failure != null) {
            fail(failure);
        }
    }

    @Test
    public void insertionSort() {
        Integer[] test1 = testArray(10, 1, 20);
        Integer[] test2 = testArray(20, 1, 50);
        Integer[] test3 = testArray(30, 1, 100);

        String failure = compareArrayLists(Arrays.asList(test1.clone()),
                iterativeSorting.insertionSort(Arrays.asList(test1)));
        if (failure != null) {
            fail(failure);
        }

        failure = compareArrayLists(Arrays.asList(test2.clone()), iterativeSorting.insertionSort(Arrays.asList(test2)));
        if (failure != null) {
            fail(failure);
        }
        failure = compareArrayLists(Arrays.asList(test3.clone()), iterativeSorting.insertionSort(Arrays.asList(test3)));
        if (failure != null) {
            fail(failure);
        }
    }

    private Integer[] testArray(int size, int min, int max) {
        Integer[] testArray = new Integer[size];
        for (int i = 0; i < size; i++) {
            Integer randomInt = min + (int) (Math.random() * ((max - min) + 1));
            testArray[i] = randomInt;
        }
        return testArray;
    }

    /*
     * Compares two ArrayLists, and returns a null failure message if the lists are
     * equal.
     * Otherwise, if the lists are not equal, returns a failure message explaining
     * why.
     * Note, method returns with failure message on the first problem.
     *
     * Comparisons:
     * Neither String ArrayList may be null.
     * Both String ArrayLists must be the same length,
     * and the strings must be in the same order.
     */
    private String compareArrayLists(List<?> expectedList, List<?> actualList) {
        expectedList.sort(null);
        String failureMessage = null;
        if ((expectedList == null) || (actualList == null)) {
            failureMessage = expectedList == null ? "expectedList is null " : "";
            failureMessage = actualList == null ? "actualList is null" : "";
            return failureMessage.trim();
        }
        if (expectedList.size() != actualList.size()) {
            failureMessage = "array lengths differ, expected=" + expectedList.size() + " actual="
                    + actualList.size();
            return failureMessage;
        }
        int i = 0;
        for (Object expectedString : expectedList) {
            if (!expectedString.equals(actualList.get(i))) {
                failureMessage = "array elements at index " + i + " differ, expected:<" + expectedString + "> but was:<"
                        + actualList.get(i) + ">";
                return failureMessage;
            }
            i++;
        }
        return failureMessage;
    }

}