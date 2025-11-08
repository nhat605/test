package Func;

public class MaxProduct {
    public static int maxProduct(int[] arr) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax) {
                secondMax = num;
            }
        }
        return firstMax * secondMax;
    }

    // Hàm ví dụ sẵn để gọi từ Main
    public static void maxProductExample() {
        int[] arr = {3, 4, 5, 2};

        System.out.print("Input array: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();

        int result = maxProduct(arr);
        System.out.println("Maximum product: " + result);
    }
}
