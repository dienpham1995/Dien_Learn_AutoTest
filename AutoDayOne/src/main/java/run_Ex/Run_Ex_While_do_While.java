package run_Ex;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Run_Ex_While_do_While {
        /**
         * Bài 1. Xử dụng while tính tong cac so le tu 1 den 100
         */
        public static void tongSoLe (){
                System.out.println("1. Viết chương trình Java sử dụng vòng lặp while để tính tổng các số lẻ từ 1 đến 100");
                Scanner scanner = new Scanner(System.in);
                // 1, Viết chương trình tính tổng các số lẻ  từ 1 đến 100.
                int sum = 0;
                int i1 = 0;
                while (i1 <= 100){
                        if(i1 % 2 != 0) {
                                // Check dieu kien neu i1 la so le thi i1 chia cho 2 có số dư khác 0
                                // Gan gia tri sum = giá tri sum cũ + gía trị i1
                                sum = sum + i1;
                        }
                        // Tăng giá trị i1 lên 1 đơn vị sau mỗi lần chạy
                        i1++;
                }
                System.out.println("KQ1 - Tong cac so le tu 1 den 100: " + sum);
        }

        /**
         * Bài 2.  nhập dữ liệu từ bàn phím và in ra màn hình
         */
        public static void inputNumberAndPrint() {
                System.out.println("2. Viết chương trình Java sử dụng vòng lặp do-while để cho phép người dùng nhập số từ bàn phím và in ra số đó.");
                Scanner scanner = new Scanner(System.in);
                int number = 0;
                do{
                        System.out.print("So can nhap la: ");
                        number = scanner.nextInt();
                        System.out.println("KQ - Gia tri so vua nhap la: " + number);
                } while (number <= 100);
        }

        /**
         * Bài 3. Method reversed number from keyboard
         */
        public static void reversedNumber() {
                System.out.println("3. Viết chương trình Java sử dụng vòng lặp while để đảo ngược một số nguyên nhập từ bàn phím và in ra kết quả.");
                Scanner scanner = new Scanner(System.in);
                System.out.print("So can nhap la: ");
                int number = scanner.nextInt();
                int reversed = 0;
                while(number != 0) {
                        int digit = number % 10;
                        reversed = reversed * 10 + digit;
                        number /= 10;
                }
                System.out.println("So sau khi dao nguoc la: " + reversed);
        }

        /**
         * Bài 4. Xử dụng while tính tong cac so chan tu 1 den 100
         */
        public static void tongSoChan () {
                System.out.println("5. Viết chương trình Java sử dụng vòng lặp do-while để in ra các số chẵn từ 2 đến 100.");
                Scanner scanner = new Scanner(System.in);
                int i1 = 1;
                System.out.print("KQ - Cac so chan tu 1 den 100: ");
                do{
                        if(i1 % 2 == 0) {
                                // Check dieu kien neu i1 la so le thi i1 chia cho 2 có số dư = 0
                                System.out.print(" " + i1);
                        }
                        // Tăng giá trị i1 lên 1 đơn vị sau mỗi lần chạy
                        i1++;
                } while (i1 <= 100);

        }
        public static void main(String[] args) {
                tongSoLe ();
                tongSoChan ();
                inputNumberAndPrint();
                reversedNumber();
    }
}

