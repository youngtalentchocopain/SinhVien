package macvanhuan;
import java.util.Scanner;

public class SinhVien {
    private String hoTen;
    private int namSinh;
    private String lop;
    private double diemTB;
    // Các toán tử tạo lập
    public SinhVien() {}
    public SinhVien(String hoTen, int namSinh, String lop, double diemTB) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.lop = lop;
        this.diemTB = diemTB;
    }
    public String getHoTen() {
    	return hoTen;
    	}
    	public void setHoTen(String hoTen) {
    	this.hoTen = hoTen;
    	}
    	public int getNamSinh() {
    	return namSinh;
    	}
    	public void setNamSinh(int namSinh) {
    	this.namSinh = namSinh;
    	}
    	public String getLop() {
    	return lop;
    	}
    	public void setLop(String lop) {
    	this.lop = lop;
    	}
    	public double getDiemTB() {
    	return diemTB;
    	}
    	public void setDiemTB(double diemTB) {
    	this.diemTB = diemTB;
    	}

    // Phương thức nhập thông tin cho 1 sinh viên
    public void nhapTT() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho ten sinh vien: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhap nam sinh ");
        namSinh = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ ký tự '\n' sau khi nhập năm sinh
        System.out.print("Nhap lop ");
        lop = scanner.nextLine();
        System.out.print("Nhap diem trung binh ");
        diemTB = scanner.nextDouble();
    }
    // Phương thức hiển thị thông tin của 1 sinh viên
    public void hienThiTT() {
        System.out.println("Ho ten " + hoTen);
        System.out.println("Nam sinh " + namSinh);
        System.out.println("Lop " + lop);
        System.out.println("Diem trung binh " + diemTB);
    }
}

