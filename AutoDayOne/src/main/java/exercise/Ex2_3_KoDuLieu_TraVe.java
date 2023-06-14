package exercise;

import java.util.Scanner;

public class Ex2_3_KoDuLieu_TraVe {

    public static void main(String[] args) {
        Scanner bai2 = new Scanner(System.in);//nhập liệu đầu vào

        System.out.print("Nhập vào số nguyên a : ");
        int a = bai2.nextInt();
        System.out.print("Nhập vào số nguyên b : ");
        int b = bai2.nextInt();
        System.out.print("Nhập vào số thực c : ");
        double c = bai2.nextDouble();
        //Tong 2 số nguyên a,b
        tong(a, b);
        tong2(a,c);
        bai2.close();
    }
    public static void tong(int a, int b) {
        //in ra kết quả các phép tính cộng 2 số nguyên
        System.out.println("Tổng của 2 số nguyên " + a + " và " + b + " là : " + (a + b));

    }
    public static void tong2(int a, double c) {
        //in ra kết quả các phép tính cộng 2 số (nguyên + thực)
        System.out.println("Tổng của 2 số  " + a + " và " + c + " là : " + (a + c));

    }
}
