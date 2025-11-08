import Func.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            // In menu
            System.out.println("===== MENU =====");
            System.out.println("1. Move zeros to end in an array");
            System.out.println("2. Sort 0, 1, 2 in an array");
            System.out.println("3. Kiểm tra cặp có tổng bằng goalSum");
            System.out.println("4. Tìm cặp có tích lớn nhất trong mảng");
            System.out.println("5. Tìm các triplet có tổng bằng 0");
            System.out.println("6. Thoát");
            System.out.print("Chọn chức năng: ");

            // Đọc lựa chọn
            choice = sc.nextInt();

            // Xử lý lựa chọn
            switch (choice) {
                case 1:
                    System.out.println("Bạn đã chọn chức năng Move zeros to end");
                    divideArray.divideArrayExample(); // Gọi hàm từ class divideArray
                    break;
                case 2:
                    System.out.println("Bạn đã chọn chức năng Sắp xếp mảng 0,1,2");
                    Sort012.sort012Example(); // Gọi hàm từ class Sort012
                    break;
                case 3:
                    System.out.println("Bạn đã chọn chức năng Kiểm tra cặp có tổng bằng goalSum");
                    CheckPairSum.checkPairSumExample(); // Gọi hàm từ class CheckPairSum
                    break;
                case 4:
                    System.out.println("Bạn đã chọn chức năng Tìm tích lớn nhất của hai phần tử");
                    MaxProduct.maxProductExample(); // Gọi hàm từ class MaxProduct
                    break;
                case 5:
                    System.out.println("Bạn đã chọn chức năng Tìm các triplet có tổng = 0");
                    ThreeSum.threeSumExample(); // Gọi hàm từ class ThreeSum
                    break;
                case 6:
                    System.out.println("Thoát chương trình...");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại!");
            }
            System.out.println(); // Xuống dòng cho dễ nhìn
        } while (choice != 6);

        sc.close();

    }
}