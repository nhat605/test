package Func;

public class divideArray {
    // Cách 1: Tạo mảng mới, chèn các phần tử khác 0 trước, 0 sau
    public static void moveZerosToEndMethod1(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int index = 0;

        // Chèn các phần tử khác 0
        for (int j : arr) {
            if (j != 0) {
                result[index++] = j;
            }
        }

        // In kết quả
        System.out.print("Output (method 1): ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Cách 2: Di chuyển trong mảng gốc, swap khi gặp số khác 0
    public static void moveZerosToEndMethod2(int[] arr) {
        int n = arr.length;
        int index = 0; // vị trí để đặt số khác 0

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }

        // In kết quả
        System.out.print("Output (method 2): ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Hàm chính để thử ví dụ sẵn
    public static void divideArrayExample() {
        int[] arr = {4, 8, 0, 0, 2, 0, 1, 0};

        System.out.print("Input array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Gọi hai phương pháp
        moveZerosToEndMethod1(arr.clone());
        moveZerosToEndMethod2(arr);
    }
}
