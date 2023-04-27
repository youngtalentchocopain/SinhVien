package lethuhoa;
import java.util.Scanner;

public class Sach {
    private String tenSach;
    private String tacGia;
    private int namXuatBan;
    public Sach(String tenSach, String tacGia, int namXuatBan) {
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
    }
    public String getTenSach() {
        return tenSach;
    }
    public String getTacGia() {
        return tacGia;
    }
    public int getNamXuatBan() {
        return namXuatBan;
    }
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten sach ");
        tenSach = scanner.nextLine();
        System.out.print("Nhap tac gia ");
        tacGia = scanner.nextLine();
        System.out.print("Nhap nam xuat ban ");
        namXuatBan = scanner.nextInt();
    }
    public void hienThiThongTin() {
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
    }
}
