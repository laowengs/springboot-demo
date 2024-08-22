package io.github.laowengs.springbootdemo.sort;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * 选择排序
 * @author wengjp
 */
@Slf4j
public class SelectSort<T extends Comparable<T>> implements ISort<T>{

    @Override
    public void sort(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //获取列表剩余元素中的最小值
            T minElement = arr[i];
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] != null && less(minElement, arr[j])){
                    minElement = arr[j];
                    minIndex = j;
//                    System.out.println("minElement changed to:"+minElement+",index :"+minIndex);
                }
            }
            //交换元素位置
            if(i != minIndex){
                exchange(arr,i,minIndex);
            }
            show(arr);
        }
    }

    @Override
    public void show(T[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    @Override
    public boolean isSorted(T[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if(i < arr.length-2 && less(arr[i],arr[i+1])){
                return false;
            }
        }
        return true;
    }

    @Override
    public void exchange(T[] arr, int i, int j) {
        System.out.println("exchange "+i+" and "+j+",elements are "+arr[i]+" and "+arr[j]);
        T comparable = arr[i];
        arr[i] = arr[j];
        arr[j] = comparable;
    }

    @Override
    public boolean less(T v, T w) {
        return v.compareTo(w)>0;
    }
}
