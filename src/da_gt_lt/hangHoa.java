/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da_gt_lt;

import java.util.Date;

/**
 *
 * @author pdkpro
 */
public class hangHoa {
    private  String ma;
    private  String ten,donViTinh;
    private  int so_luong,gia;
    Date ngayNhap;
    private float tien;

    public float getTien() {
        return tien;
    }

    public void setTien(float tien) {
        this.tien = tien;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public  String getMa() {
        return ma;
    }

    public  void setMa(String ma) {
        this.ma = ma;
    }

    public  String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getdonViTinh() {
        return donViTinh;
    }

    public void setdonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public int getSo_luong() {
        return so_luong;
    }

    public void setSo_luong(int so_luong) {
        this.so_luong = so_luong;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
    
}
