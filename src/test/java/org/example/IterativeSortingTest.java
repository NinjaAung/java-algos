package org.example;

import org.junit.*;
import static org.junit.Assert.*;

import org.example.IterativeSorting;

import java.util.ArrayList;
import java.util.Arrays;

class IterativeSortingTest {

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
}