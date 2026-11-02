// Sua dong 1 tren main
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
    }public static Student timKiem(List<Student> list, String maSV) {
        for (Student s : list) {
            if (s.getMaSV().equalsIgnoreCase(maSV)) {
                return s;
            }
        }
        return null;
    }
}
