/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

/**
 *
 * @author phamv
 */
public class TestSinhvien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DanhSachSinhvien qlsv=new DanhSachSinhvien();
        Sinhvien teo=new Sinhvien();
        teo.setMasv("114\n");
        teo.setTensv("Nguyễn Văn Tèo\n");
        qlsv.addSinhvien(teo);
        Sinhvien ty=new Sinhvien();
        ty.setMasv("113\n");
        ty.setTensv("Nguyễn Thị tý\n");
        qlsv.addSinhvien(ty);
        qlsv.updateSinhvien(0,ty);
        qlsv.sort();
        System.out.println(qlsv);
    }  
}
