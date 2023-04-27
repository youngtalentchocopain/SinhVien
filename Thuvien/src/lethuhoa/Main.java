package lethuhoa;

public class Main {
    public static void main(String[] args) {
        QL_Sach qlSach = new QL_Sach();
        System.out.println("Nhap danh sach sach:");
        qlSach.nhapDanhSach();
        System.out.println("Danh sach sach");
        qlSach.hienThiDanhSach();
        qlSach.timSachTheoTacGia();
}
}