package run_Ex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Run_Ex6_Array {
    public static void main(String[] args) {
        //Khai báo các phần tử trong mảng
        int[] a = {1, 2, 3, 4, 5, 6, 8, 12, 456, 2323};
        System.out.print("Giá trị của mảng là: ");
        //lethg la độ dài của mảng
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

//                //Cách 2
//                Scanner scanner = new Scanner(System.in);
//                System.out.print("\nNhập vào giá trị độ dài của mảng là: ");
//                int doDai = scanner.nextInt();
//                // Khai bao mảng với độ dài nhâp từ bàn phím
//                int [] mangNHapTuBanPhim = new int[doDai];
//                // Nhập vào giá trj rong mảng
//                for (int i = 0; i < doDai; i++) {
//                        System.out.print("Giá trị của phần tử thứ " + i + " là : ");
//                        mangNHapTuBanPhim[i]  = scanner.nextInt();
//                }
//                // in ra giá trị trong mảng
//                for (int i = 0; i < doDai ; i++) {
//                        System.out.print(mangNHapTuBanPhim[i] + " ");
//                }

//        }
//
//        }
//
//                int sum = 0;
//                for (int i = 0; i < doDai; i++) {
//                        sum = sum + mangNHapTuBanPhim[i];
//                }
//                System.out.println("\nTotal = " + sum);

