package macvanhuan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QL_SinhVien {
    private ArrayList<SinhVien> dsSinhVien;

    public QL_SinhVien() {
        dsSinhVien = new ArrayList<>();
    }
    public void nhapDanhSach() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ ký tự '\n' sau khi nhập số lượng
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            SinhVien sv = new SinhVien();
            sv.nhapTT();
            dsSinhVien.add(sv);
        }
    }
    public void hienThiDanhSach() {
        if (dsSinhVien.size() == 0) {
            System.out.println("Danh sach sinh vien rong");
            return;
        }
        // Sắp xếp danh sách sinh viên theo thứ tự giảm dần điểm trung bình
        Collections.sort(dsSinhVien, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                return Double.compare(sv2.getDiemTB(), sv1.getDiemTB());
            }
        });

        System.out.println("Danh sach sinh vien theo thu tu giam dan diem trung binh :");
        for (SinhVien sv : dsSinhVien) {
            sv.hienThiTT();
        }
    }
}
