package Func;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ThreeSum {

    // Hàm tìm tất cả triplets có tổng = 0
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sắp xếp mảng để dễ tránh trùng lặp
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // tránh trùng lặp với i trước

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    // Tránh trùng lặp
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }

    // Hàm ví dụ sẵn
    public static void threeSumExample() {
        int[] arr = {-1, 0, 1, 2, -1, -4};

        System.out.print("Input array: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();

        List<List<Integer>> triplets = threeSum(arr);

        System.out.println("Triplets with sum 0: ");
        for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }
    }
}

