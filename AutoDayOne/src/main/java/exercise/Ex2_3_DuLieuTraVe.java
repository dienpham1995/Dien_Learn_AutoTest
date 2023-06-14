package exercise;

import java.util.Scanner;

public class Ex2_3_DuLieuTraVe {
    //Scanner là một lớp được xác định trước giúp chúng ta lấy đầu vào từ người dùng.
    public static void main(String[] args) {
        Scanner bai2 = new Scanner(System.in);//nhập liệu đầu vào

        System.out.print("Nhập vào số nguyên a : ");
        int a = bai2.nextInt();
        System.out.print("Nhập vào số nguyên b : ");
        int b = bai2.nextInt();
        System.out.print("Nhập vào số thực c : ");
        double c = bai2.nextDouble();
        //Tong 2 số nguyên a,b
        int tong = tinhTong(a, b);
        //Tong 2 số nguyen a + thực c
        int kq1 = tong1(a, c);
        double kq2 = tong2(a, c);
        //in ra kết quả các phép tính
        System.out.println("Tổng của 2 số nguyên " + a + " và " + b + " là : " + tong);
        System.out.println("Tổng của 2 số nguyên  " + a + " và số thực " + c + " là : " + kq1);
        System.out.println("Tổng của 2 số thực " + c + " và số nguyên " + a + " là : " + kq2);

        bai2.close();
    }

    //function tính tổng 2 số nguyên
    public static int tinhTong(int a, int b) {
        return a + b;

    }

    //function tính tổng 2 số nguyên + thực theo lấy kết qủa theo int
    public static int tong1(int a, double c) {
        return a + (int)c;
    }

    //function tính tổng 2 số nguyên + thực theo lấy kết qủa theo double
    public static double tong2(int a, double c) {
        return a + c;
    }


}
