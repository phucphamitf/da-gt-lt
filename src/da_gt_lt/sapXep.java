/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da_gt_lt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author pdkpro
 */
public class sapXep {

    giaoDien gd;

    public sapXep(giaoDien gd) {

        this.gd = gd;
    }

    public void sapXepTheoMa() {
        int[] temp = new int[this.gd.fileData.size()];
        for (int i = 0; i < this.gd.fileData.size(); i++) {
            hangHoa hh = this.gd.fileData.get(i);
            temp[i] = Integer.parseInt(hh.getMa().substring(2));
        }
        Arrays.sort(temp);
        for (int i = 0; i < temp.length; i++) {
            for (int j = i + 1; j < this.gd.fileData.size(); j++) {
                hangHoa hh = this.gd.fileData.get(j);
                if (temp[i] == Integer.parseInt(hh.getMa().substring(2))) {//tim vi tri max so luong trong file data
                    hangHoa hh2 = this.gd.fileData.get(i);
                    this.gd.fileData.set(i, hh);//doi cho 2 vi tri voi nhau
                    this.gd.fileData.set(j, hh2);
                }
            }
        }
    }

    public void sapXepTheoTen() {

    }

    public void sapXepTheoDonViTinh() {

    }

    public void sapXepTheoNgayNhap() {
        long[] temp = new long[this.gd.fileData.size()];
        for (int i = 0; i < this.gd.fileData.size(); i++) {
            hangHoa hh = this.gd.fileData.get(i);
            temp[i] = hh.getNgayNhap().getTime();
        }
        Arrays.sort(temp);
        for (int i = 0; i < temp.length; i++) {
            for (int j = i + 1; j < this.gd.fileData.size(); j++) {
                hangHoa hh = this.gd.fileData.get(j);
                if (temp[i] == hh.getNgayNhap().getTime()) {//tim vi tri max so luong trong file data
                    hangHoa hh2 = this.gd.fileData.get(i);
                    this.gd.fileData.set(i, hh);//doi cho 2 vi tri voi nhau
                    this.gd.fileData.set(j, hh2);
                }
            }
        }
    }

    public void sapXepTheoSoLuong() {
        int[] temp = new int[this.gd.fileData.size()];
        for (int i = 0; i < this.gd.fileData.size(); i++) {
            hangHoa hh = this.gd.fileData.get(i);
            temp[i] = hh.getSo_luong();
        }
        Arrays.sort(temp);
        for (int i = 0; i < temp.length; i++) {
            for (int j = i + 1; j < this.gd.fileData.size(); j++) {
                hangHoa hh = this.gd.fileData.get(j);
                if (temp[i] == hh.getSo_luong()) {//tim vi tri max so luong trong file data
                    hangHoa hh2 = this.gd.fileData.get(i);
                    this.gd.fileData.set(i, hh);//doi cho 2 vi tri voi nhau
                    this.gd.fileData.set(j, hh2);
                }
            }
        }
    }

    public void sapXepTheoGia() {
        int[] temp = new int[this.gd.fileData.size()];
        for (int i = 0; i < this.gd.fileData.size(); i++) {
            hangHoa hh = this.gd.fileData.get(i);
            temp[i] = hh.getGia();
        }
        Arrays.sort(temp);
        for (int i = 0; i < temp.length; i++) {
            for (int j = i + 1; j < this.gd.fileData.size(); j++) {
                hangHoa hh = this.gd.fileData.get(j);
                if (temp[i] == hh.getGia()) {//tim vi tri max so luong trong file data
                    hangHoa hh2 = this.gd.fileData.get(i);
                    this.gd.fileData.set(i, hh);//doi cho 2 vi tri voi nhau
                    this.gd.fileData.set(j, hh2);
                }
            }
        }
    }

    public void sapXepTheoTien() {
        float[] temp = new float[this.gd.fileData.size()];
        for (int i = 0; i < this.gd.fileData.size(); i++) {
            hangHoa hh = this.gd.fileData.get(i);
            temp[i] = hh.getTien();
        }
        Arrays.sort(temp);
        for (int i = 0; i < temp.length; i++) {
            for (int j = i + 1; j < this.gd.fileData.size(); j++) {
                hangHoa hh = this.gd.fileData.get(j);
                if (temp[i] == hh.getTien()) {//tim vi tri max so luong trong file data
                    hangHoa hh2 = this.gd.fileData.get(i);
                    this.gd.fileData.set(i, hh);//doi cho 2 vi tri voi nhau
                    this.gd.fileData.set(j, hh2);
                }
            }
        }
    }
}
