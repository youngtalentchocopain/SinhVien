package Hoangthithuy;

import java.util.ArrayList;
import java.util.Scanner;

public class ToanHoc {
    private int m;
    public void nhapDL() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhap so nguyen duong  m (2 <= m <= 100): ");
            m = scanner.nextInt();
            if (m < 2 || m > 100) {
                throw new Exception("So m khong nam trong khoang cho phep!");
            }
        } catch (Exception e) {
            System.out.println("Loi: " + e.getMessage());
            nhapDL();
        }
    }
    public void hienThiSoChinhPhuong() {
        ArrayList<Integer> dsSoChinhPhuong = new ArrayList<Integer>();

        for (int i = 1; i * i <= m; i++) {
            dsSoChinhPhuong.add(i * i);
        }
        System.out.println("Danh sach cac so chinh phuong nho hon hoac bang " + m + ":");
        System.out.println(dsSoChinhPhuong);
    }
}

