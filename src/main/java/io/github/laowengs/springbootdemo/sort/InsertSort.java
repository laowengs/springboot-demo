package io.github.laowengs.springbootdemo.sort;

import java.util.Arrays;

/**
 * 插入排序
 *
 * @param <T>
 * @author laowengs
 */
public class InsertSort<T extends Comparable<T>> implements ISort<T> {
    @Override
    public void sort(T[] arr) {
        // 第一个数不需要排序，直接从第二个开始
        for (int i = 1; i < arr.length; i++) {
            //从已排序的位置（i-1到0），找到第一个比arr[i]小的数
            for (int j = i; j > 0; j--) {
                if (less(arr[j], arr[j - 1])) {
                    exchange(arr, j, j - 1);//TIPS:从后往前比较，找到第一个比arr[i]小的数，并交换位置
                    // 交换后，arr[j-1]后面的所有元素都需要重新排序
                }
                show(arr);
            }
        }
    }

    @Override
    public void show(T[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    @Override
    public boolean isSorted(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (i < arr.length - 2 && less(arr[i], arr[i + 1])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void exchange(T[] arr, int i, int j) {
        System.out.println("exchange " + i + " and " + j + ",elements are " + arr[i] + " and " + arr[j]);
        T comparable = arr[i];
        arr[i] = arr[j];
        arr[j] = comparable;
    }

    @Override
    public boolean less(T v, T w) {
        return v.compareTo(w) < 0;
    }
}
