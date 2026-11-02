// Day la thay doi gay conflict
package quanlysinhvien;

public class Student {
    private String maSV;
    private String hoTen;
    private String ngaySinh;

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