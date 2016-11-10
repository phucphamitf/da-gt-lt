/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da_gt_lt;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author pdkpro
 */
public class tim_kiem {

    public static ArrayList<Integer> phanTu;
    public String find;
    public static ArrayList<hangHoa> fileTimKiem;
    //public static int phanTu;
    //public static boolean xoa = false;

    public tim_kiem() {

    }

    public static void timKiemAll(String tk) {
        //xoa = fxoa;
       /* Scanner nhap = new Scanner(System.in);
         System.out.println("loai phan tu: ");
         String loai = nhap.nextLine();
         System.out.println("nhap noi dung: ");
         find = nhap.nextLine();
         switch (loai.toString()) {
         case "ma":
         find_ma(xoa);
         break;
         case "ten":
         find_Ten(xoa);
         break;
         case "don vi tinh":
         findDonViTinh(xoa);
         break;
         case "so luong":
         find_so_luong(xoa);
         break;
         case "gia":
         find_gia(xoa);
         break;
         }
         */
        find_ma(tk);
        find_Ten(tk);
        find_gia(tk);
        findDonViTinh(tk);
        find_so_luong(tk);
        find_date(tk);
        findTien(tk);
    }

    public static void find_ma(String find) {
        int i = 0;
        try {
            while (i < constants.file_data.size()) {
                hangHoa hh = constants.file_data.get(i);
                String ma = hh.getMa();
                if ((find.equals(ma.substring(0, find.length()))) && ma.length() >= find.length()) {
                    // prin(hh, i);
                    if (!checkIn(i)) {
                        fileTimKiem.add(hh);
                        phanTu.add(i);
                    }
                }
                i++;
            }
        } catch (Exception e) {
        }
    }

    public static void find_Ten(String find) {
        int i = 0;
        try {
            while (i < constants.file_data.size()) {
                hangHoa hh = constants.file_data.get(i);
                String ten = hh.getTen();
                if ((ten.length() >= find.length()) && (find.equals(ten.substring(0, find.length())))) {
                //prin(hh, i);
                    //System.out.println("ten: "+ten);
                    //System.out.println("sub: "+ten.substring(0,find.length()));
                    if (!checkIn(i)) {
                        fileTimKiem.add(hh);
                        phanTu.add(i);
                    }
                }
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void findDonViTinh(String find) {
        int i = 0;
        try {
            while (i < constants.file_data.size()) {
                hangHoa hh = constants.file_data.get(i);
                String dvTinh = hh.getdonViTinh();
                if ((dvTinh.length() >= find.length()) && (find.equals(dvTinh.substring(0, find.length())))) {
                    //prin(hh, i);
                    if (!checkIn(i)) {
                        fileTimKiem.add(hh);
                        phanTu.add(i);
                    }
                }
                i++;
            }
        } catch (Exception e) {
        }
    }

    public static void find_so_luong(String find) {
        int i = 0;
        try {
            while (i < constants.file_data.size()) {
                hangHoa hh = constants.file_data.get(i);
                int soluong = hh.getSo_luong();
                if (Integer.parseInt(String.valueOf(soluong).substring(0, find.length() )) == Integer.parseInt(find)) {
                    //prin(hh, i);
                    if (!checkIn(i)) {
                        fileTimKiem.add(hh);
                        phanTu.add(i);
                    }
                }
                i++;
            }
        } catch (Exception e) {
        }
    }

    public static void find_gia(String find) {
        int i = 0;
        try {
            while (i < constants.file_data.size()) {
                hangHoa hh = constants.file_data.get(i);
                int gia = hh.getGia();
                if (Integer.parseInt(String.valueOf(gia).substring(0, find.length())) == Integer.parseInt(find)) {
                    // prin(hh, i);
                    if (!checkIn(i)) {//neu pt chua dc add vao thi ....
                        fileTimKiem.add(hh);
                        phanTu.add(i);
                    }
                }
                i++;
            }
        } catch (Exception e) {
        }
    }

    public static void find_date(String find) {
        int i = 0;
        try {
            while (i < constants.file_data.size()) {
                hangHoa hh = constants.file_data.get(i);
                Date date = hh.getNgayNhap();
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                String dateString = format.format(date);
                if ((dateString.length() >= find.length()) && find.equals(dateString.substring(0, find.length()))) {
                    //prin(hh, i);
                    if (!checkIn(i)) {
                        fileTimKiem.add(hh);
                        phanTu.add(i);
                    }
                }
                i++;
            }
        } catch (Exception e) {
        }
    }

    public static void findTien(String find) {
        int i = 0;
        try {
            while (i < constants.file_data.size()) {
                hangHoa hh = constants.file_data.get(i);
                float tien = hh.getTien();
                if (Float.parseFloat(String.valueOf(tien).substring(0, find.length())) == Float.parseFloat(find)) {
                    // prin(hh, i);
                    if (!checkIn(i)) {//neu pt chua dc add vao thi ....
                        fileTimKiem.add(hh);
                        phanTu.add(i);
                    }
                }
                i++;
            }
        } catch (Exception e) {
        }
    }
    /* public static void prin(hangHoa hh, int phantu) {
     phanTu = phantu;
     String xoapt;
     if (xoa) {
     xoapt = " ==>>da duoc xoa";
     constants.file_data.remove(phantu);
     } else {
     xoapt = "";
     }
     System.out.println("ma: " + hh.getMa() + " ten: " + hh.getTen() + " loai: " + hh.getdonViTinh() + " ngaysx : " + hh.getNgay() + "/"
     + hh.getThang() + "/" + hh.getNam() + " so luong: " + hh.getSo_luong() + " gia: " + hh.getGia() + xoapt);;
     }
     */
    /*  public static int getPhanTu() {
     return phanTu;
     }
     */
    /*
     public static void xoa() {
     System.out.println("ban muon xoa phan tu nao?");
     tim_kiem(true,"");
     }*/

    public static ArrayList<hangHoa> getFileTimKiem() {
        return fileTimKiem;
    }

    //kiem tra xem hanghoa da dc  add vo chua, neu add vao roi thi  tra ve true

    public static boolean checkIn(int i) {
        for (int j = 0; j < phanTu.size(); j++) {
            if (i == phanTu.get(j)) {
                return true;
            }
        }
        return false;

    }
}
