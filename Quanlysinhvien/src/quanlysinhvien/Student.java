package quanlysinhvien;

import java.util.List;

public class Student {
    private final String maSV;
    private final String hoTen;
    private final String ngaySinh;

    public Student(String maSV, String hoTen, String ngaySinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
    }

    public String getMaSV() { return maSV; }
    public String getHoTen() { return hoTen; }
    public String getNgaySinh() { return ngaySinh; }

    @Override
    public String toString() {
        return "Mã SV: " + maSV + ", Họ tên: " + hoTen + ", Ngày sinh: " + ngaySinh;
    }
}