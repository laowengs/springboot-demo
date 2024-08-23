package io.github.laowengs.springbootdemo.sort;

import java.util.Arrays;

/**
 * 希尔排序
 *
 * @param <T>
 * @author laowengs
 */
public class ShellSort<T extends Comparable<T>> implements ISort<T> {
    @Override
    public void sort(T[] arr) {
        int n = arr.length;
        int h = 1;
        while (h < n / 3) {
            h = 3 * h + 1;// 1, 4, 13, 40, 121, 364, ...
        }
        while (h >= 1) {
            System.out.println("h=" + h);
            for (int i = h; i < n; i++) {
                System.out.println("i=" + i);
                for (int j = i; j >= h && less(arr[j - h], arr[j]); j -= h) {//从没组第2个元素(第1个元素默认有序)开始排序，向前比较，如果比前面的小，则交换
                    System.out.println(j + " " + (j - h));
                    exchange(arr, j, j - h);
                    show(arr);
                }
            }
            h = h / 3;
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
        return v.compareTo(w) > 0;
    }
}
