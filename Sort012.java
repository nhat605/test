package Func;

public class Sort012 {
    // Cách 1: Đếm số lượng 0,1,2 rồi ghi lại mảng
    public static void sort012Method1(int[] arr) {
        int count0 = 0, count1 = 0, count2 = 0;

        // Đếm số lượng 0,1,2
        for (int num : arr) {
            if (num == 0) count0++;
            else if (num == 1) count1++;
            else if (num == 2) count2++;
        }

        // Ghi lại mảng theo thứ tự
        int index = 0;
        for (int i = 0; i < count0; i++) arr[index++] = 0;
        for (int i = 0; i < count1; i++) arr[index++] = 1;
        for (int i = 0; i < count2; i++) arr[index++] = 2;

        // In kết quả
        System.out.print("Output (method 1): ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }

    // Cách 2: Dùng 3 con trỏ (Dutch National Flag Algorithm)
    public static void sort012Method2(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else { // arr[mid] == 2
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }

        // In kết quả
        System.out.print("Output (method 2): ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }

    // Hàm ví dụ sẵn để gọi từ Main
    public static void sort012Example() {
        int[] arr = {0, 2, 1, 0, 1, 2, 1, 0};

        System.out.print("Input array: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();

        sort012Method1(arr.clone()); // Cách 1
        sort012Method2(arr);         // Cách 2
    }
}
