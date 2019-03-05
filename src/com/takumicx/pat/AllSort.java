package com.takumicx.pat;

import java.util.Random;

/**
 * @author: takumiCX
 * @create: 2019-03-02
 * @email: takumicx@zju.edu.cn
 **/
public class AllSort {

    public static void main(String[] args) {

        int[] a = new int[100];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
//        bubbleSort(a);
//        selectSort(a);
//        insertSort(a);
//        quickSort(a, 0, a.length - 1);
        mergeSort(a,0,a.length-1);

        if (a.length > 2) {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) throw new RuntimeException("排序错误!");
            }
        }
//        for(int i=0;i<a.length;i++){
//            System.out.print(a[i]+" ");
//        }
    }

    //冒泡排序
    public static void bubbleSort(int[] a) {

        if (a == null || a.length < 2) return;
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }


    //选择排序
    public static void selectSort(int[] a) {
        if (a == null || a.length < 2) return;
        for (int i = 0; i < a.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
    }


    //插入排序
    public static void insertSort(int[] a) {

        if (a == null || a.length < 2) return;
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j = i - 1;
            while (a[j] > temp && j >= 0) {
                a[j + 1] = a[j];
                if (j == 0) break;
                j--;
            }
            a[j] = temp;
        }

    }

    //快速排序
    public static void quickSort(int[] a, int left, int right) {
        if (left >= right) return;
        int pivot = partition(a, left, right);
        quickSort(a, left, pivot - 1);
        quickSort(a, pivot + 1, right);
    }

    private static int partition(int[] a, int left, int right) {
        int temp = left;
        int i = left;
        int j = right;
        while (i < j) {
            while (i < j && a[j] > temp) {
                j--;
            }
            if (i < j) {
                a[i] = a[j];
            }
            while (i < j && a[i] <= temp) {
                i++;
            }
            if (i < j) {
                a[j] = a[i];
            }
        }
        a[j] = temp;
        return j;
    }


    //归并排序
    public static void mergeSort(int[] a, int i, int j) {
        if (i >= j) return;
        int mid = (i + j) / 2;
        mergeSort(a, i, mid);
        mergeSort(a, mid + 1, j);
        merge(a, i, mid, j);

    }

    private static void merge(int[] a, int i, int mid, int j) {
        int[] temp = new int[j - i + 1];
        int k = i-1;
        int first = i;
        int second = mid + 1;
        while (first <= mid && second <= j) {
            if (a[first] <= a[second]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }
        while (first < mid) {
            temp[k++] = a[first++];
        }
        while (second<j){
            temp[k++]=a[second++];
        }
    }

}
