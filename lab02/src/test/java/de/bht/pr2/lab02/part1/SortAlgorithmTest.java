package de.bht.pr2.lab02.part1;

import de.bht.pr2.lab02.part2.BubbleSort;
import de.bht.pr2.lab02.part2.InsertionSort;
import de.bht.pr2.lab02.part2.QuickSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortAlgorithmTest {

    int[][] testArray = {{1, 2, 3, 4, 5, 6, 8},{3,8,2,5,6,4,1}};

    int[][] testArray2 = {{3    , 5, 6, 8, 9},{8,3,5,9,6}};




    @Test
    void testBubbleSort() {
        Assertions.assertArrayEquals(testArray[0], BubbleSort.sort(testArray[1]));
        assertArrayEquals(testArray2[0], BubbleSort.sort(testArray2[1]));
    }

    @Test void testInsertionSort() {
        Assertions.assertArrayEquals(testArray[0], InsertionSort.sort(testArray[1]));
        assertArrayEquals(testArray2[0], InsertionSort.sort(testArray2[1]));
    }

    @Test
    void testQuickSort() {
         Assertions.assertArrayEquals(testArray[0], QuickSort.sort(testArray[1]));
         assertArrayEquals(testArray2[0], QuickSort.sort(testArray2[1]));
    }

    @Test
    void testArray1() {
        assertArrayEquals(testArray[0], BubbleSort.sort(testArray[1]));
        assertArrayEquals(testArray[0], InsertionSort.sort(testArray[1]));
        assertArrayEquals(testArray[0], QuickSort.sort(testArray[1]));

        assertArrayEquals(testArray2[0], BubbleSort.sort(testArray2[1]));
        assertArrayEquals(testArray2[0], InsertionSort.sort(testArray2[1]));
        assertArrayEquals(testArray2[0], QuickSort.sort(testArray2[1]));
    }

}
