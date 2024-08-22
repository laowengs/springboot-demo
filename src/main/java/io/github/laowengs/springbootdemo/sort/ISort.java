package io.github.laowengs.springbootdemo.sort;

public interface ISort<T extends Comparable<T>> {

    /**
     * 排序
     * @param arr
     * @return
     */
    void sort(T[] arr);

    /**
     * 打印数组
     * @param arr
     */
    void show(T[] arr);

    /**
     * 是否已经排序完成
     * @param arr
     * @return
     */
    boolean isSorted(T[] arr);

    /**
     * 交换数组元素
     * @param arr
     * @param i
     * @param j
     */
    void exchange(T[] arr, int i, int j);

    /**
     * 比较两个对象大小 v是否小于w
     * @param v
     * @param w
     * @return
     */
    boolean less(T v,T w);
}
