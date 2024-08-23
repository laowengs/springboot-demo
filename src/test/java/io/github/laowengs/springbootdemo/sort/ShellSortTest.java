package io.github.laowengs.springbootdemo.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ShellSortTest {
    ShellSort<Integer> selectSort = new ShellSort<>();
    Integer[] arr = {5, 2, 8, 3, 9, 1, 7, 6, 4, 0, 10};
    @Test
    void name() {
        selectSort.sort(arr);
        assertTrue(selectSort.isSorted(arr));
    }
}