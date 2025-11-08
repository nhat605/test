package Func;
import java.util.HashSet;

public class CheckPairSum {

    // Cách 1: Dùng HashSet để kiểm tra complement
    public static boolean hasPairWithSumMethod1(int[] arr, int goalSum) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(goalSum - num)) {
                System.out.println("Pair found: (" + num + ", " + (goalSum - num) + ")");
                return true;
            }
            set.add(num);
        }
        return false;
    }

//    // Cách 2: Dùng 2 vòng lặp (O(n^2))
//    public static boolean hasPairWithSumMethod2(int[] arr, int goalSum) {
//        int n = arr.length;
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (arr[i] + arr[j] == goalSum) {
//                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    // Hàm ví dụ sẵn để gọi từ Main
    public static void checkPairSumExample() {
        int[] arr = {-5, 1, -40, 20, 6, 8, 7};
        int goalSum = 15;

        System.out.print("Input array: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println("\nGoal sum: " + goalSum);

        boolean result = hasPairWithSumMethod1(arr, goalSum);
        System.out.println("Result: " + result);

    }
}

