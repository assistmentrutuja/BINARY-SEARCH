package com.rutuja;

public class OrderAgnostic {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        int ans = orderAgnostic(arr, target);
        System.out.println(ans);

    }

    static int orderAgnostic(int[] arr1, int target) {
        int start = 0;
        int end = arr1.length - 1;

        boolean isAsc;
        if (arr1[start] < arr1[end]) {
            isAsc = true;
        } else {
            isAsc = false;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr1[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr1[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr1[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
