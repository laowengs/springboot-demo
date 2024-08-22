package io.github.laowengs.springbootdemo.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectSortTest {

    @Test
    void name() {
        SelectSort<Integer> selectSort = new SelectSort<Integer>();
        Integer[] arr = {5, 2, 8, 3, 9, 1, 7};
        selectSort.sort(arr);
    }
}