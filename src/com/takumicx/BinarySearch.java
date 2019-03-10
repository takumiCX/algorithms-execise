package com.takumicx;

/**
 * @author: takumiCX
 * @create: 2019-03-07
 * @email: takumicx@zju.edu.cn
 **/
public class BinarySearch {


    public static void main(String[] args) {

//        int i = binarySearchFirst(new int[]{1,2,3,3,3,3,4,4}, 4);
//        int i=binarySearchLast(new int[]{1,2,3,4,4,4,5,5,6,7},5);
//        int i = binarySearchFirstBiggerOrEqual(new int[]{1, 2, 3, 4, 5, 5, 6, 6, 6, 7, 7, 9}, 11);
        int i=binarySearchLastLessOrEqualThan(new int[]{1,2,3,4,4,5,6,6,6,7,8},6);
        System.out.println(i);

        Integer integer = new Integer(0);

    }


    /**
     * 查找最后一个小于等于给定值的元素
     * @param arr
     * @param n
     * @return
     */
    public static int binarySearchLastLessOrEqualThan(int[] arr, int n) {

        int index = -1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) >> 1;
            if (arr[mid] > n) {
                high = mid - 1;
            } else if (arr[mid] <= n) {
                if (mid == arr.length - 1 || arr[mid + 1] > n) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return index;
    }


    /**
     * 查找第一个大于等于给定值的元素
     *
     * @param arr
     * @param n
     * @return
     */
    public static int binarySearchFirstBiggerOrEqual(int[] arr, int n) {

        int index = -1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) >> 1;
            if (arr[mid] < n) {
                low = mid + 1;
            } else if (arr[mid] >= n) {
                if (mid == 0 || arr[mid - 1] < n) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
        }
        return index;

    }

    /**
     * 查找最后一个值等于给定值的元素
     *
     * @param arr
     * @param n
     * @return
     */
    public static int binarySearchLast(int[] arr, int n) {
        int index = -1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) >> 1;
            if (arr[mid] > n) {
                high = mid - 1;
            } else if (arr[mid] < n) {
                low = mid + 1;
            } else if (mid == arr.length - 1 || arr[mid + 1] != n) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return index;
    }


    /**
     * 查找第一个值等于给定值的元素
     *
     * @param arr
     * @param n
     * @return 元素在数组中的下标, 若不存在则返回-1
     */
    public static int binarySearchFirst(int[] arr, int n) {
        int index = -1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < n) {
                low = mid + 1;
            } else if (arr[mid] > n) {
                high = mid - 1;
            } else if (mid == 0 || arr[mid - 1] != arr[mid]) {
                return mid;
            } else {
                high = mid - 1;
            }
        }
        return index;

    }


    /**
     * 二分查找
     *
     * @param arr
     * @param n
     * @return
     */
    public static int binarySearch(int[] arr, int n) {

        int index = -1;
        if (arr != null && arr.length != 0) {
            int low = 0;
            int high = arr.length - 1;
            while (low <= high) {
                int mid = (low + high) >> 1;
                if (arr[mid] == n) {
                    return mid;
                } else if (arr[mid] > n) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return index;
    }
}