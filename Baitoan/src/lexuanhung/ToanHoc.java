package lexuanhung;
import java.util.Scanner;
public class ToanHoc {
    private int m; // số lượng số nguyên tố cần hiển thị
    // Phương thức nhập dữ liệu và xử lý ngoại lệ
    public void nhapDL() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Nhap so luong so nguyen to can hien thi (2-100): ");
                m = Integer.parseInt(scanner.nextLine());
                if (m < 2 || m > 100) {
                    throw new Exception("So luong phai nam trong 2 hoac 100");
                }
                break;
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        }
    }
    // Phương thức kiểm tra số nguyên tố
    public boolean laSoNguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    // Phương thức hiển thị danh sách m số nguyên tố đầu tiên
    public void hienThiDanhSach() {
        int count = 0;
        int i = 2;
        while (count < m) {
            if (laSoNguyenTo(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
        System.out.println();
    }
}

