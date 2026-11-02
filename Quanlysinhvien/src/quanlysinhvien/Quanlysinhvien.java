// Sua tren feature
package quanlysinhvien;

import java.util.ArrayList;
import java.util.List;

public class Quanlysinhvien {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("SV001", "Nguyen Thi Minh Tom", "01/01/2004"));
        list.add(new Student("SV002", "Tran Van An", "15/05/2004"));

        System.out.println("DANH SÁCH SINH VIÊN:");
        for (Student s : list) {
            System.out.println(s);
        }
    }
}