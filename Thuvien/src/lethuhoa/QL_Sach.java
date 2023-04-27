package lethuhoa;
import java.util.ArrayList;
import java.util.Scanner;

public class QL_Sach {
    private ArrayList<Sach> dsSach = new ArrayList<>();
    public void nhapDanhSach() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong sach: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ ký tự '\n' sau khi nhập số lượng
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sach thu " + (i + 1) + ":");
            Sach sach = new Sach("", "", 0);
            sach.nhapThongTin();
            dsSach.add(sach);
        }
    }
    public void hienThiDanhSach() {
        for (Sach sach : dsSach) {
            sach.hienThiThongTin();
            System.out.println();
        }
    }
    public void timSachTheoTacGia() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten tac gia: ");
        String tenTacGia = scanner.nextLine();
        boolean found = false;
        for (Sach sach : dsSach) {
            if (sach.getTacGia().equals(tenTacGia)) {
                sach.hienThiThongTin();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay cuon sach cua tac gia " + tenTacGia);
        }
    }
}

