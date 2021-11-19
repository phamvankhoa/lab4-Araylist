/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;
import java.util.Date;
/**
 *
 * @author phamv
 */
public class Sinhvien implements Comparable<Sinhvien>
{
    
   @Override
   public int compareTo(Sinhvien o) 
   {
        if(Masv.equalsIgnoreCase(o.getMasv()))
        return 0;
        return 1;
   }
    String Masv;
    private String Tensv;
    private String Namsinh;
    private String Diachi;
    private String Lop;
    public Sinhvien(String Masv, String Tensv, String Namsinh, String Diachi, String Lop) 
    {
        this.Masv = Masv;
        this.Tensv = Tensv;
        this.Namsinh = Namsinh;
        this.Diachi = Diachi;
        this.Lop = Lop;
    }
    public Sinhvien ()
    {
        Masv ="234";
        Tensv = "phan van a";
        Namsinh = "17/07/2000";
        Diachi = "nam dinh";
        Lop = "dhti12";
    }

    public String getMasv() {
        return Masv;
    }

    public void setMasv(String Masv) {
        this.Masv = Masv;
    }

    public String getTensv() {
        return Tensv;
    }

    public void setTensv(String Tensv) {
        this.Tensv = Tensv;
    }

    public String getNamsinh() {
        return Namsinh;
    }

    public void setNamsinh(String Namsinh) {
        this.Namsinh = Namsinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }
    @Override
    public String toString() 
    {
        return "\n Sinhvien:\n Masv =" + Masv + " Tensv =" + Tensv + " Namsinh ="
        + Namsinh + "\n Diachi =" + Diachi + "\n Lop =" + Lop + "";
    }
}


