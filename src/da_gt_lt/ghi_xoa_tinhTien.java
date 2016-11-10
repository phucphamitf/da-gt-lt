/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da_gt_lt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author pdkpro
 */
public class ghi_xoa_tinhTien {

    //static tim_kiem_xoa find;

    public ghi_xoa_tinhTien() {
        //this.find = find;
    }

    public static void add_Hh(hangHoa hh,int viTri) {
        try {
/*
            PrintWriter prin = new PrintWriter(new FileOutputStream(constants.data, true));
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("nhap ma: ");
            String ma = br.readLine();
            System.out.println("nhap ten: ");;
            String ten = br.readLine();
            System.out.println("nhap loai: ");;
            String loai = br.readLine();
            System.out.println("nhap ngay sx: ");;
            String ngaysx = br.readLine();
            System.out.println("nhap so luong: ");;
            int soluong = Integer.parseInt(br.readLine());
            System.out.println("nhap gia: ");;
            int gia = Integer.parseInt(br.readLine());

            //String hh = "";
                    
            String hh = ma + " " + ten + " " + loai + " " + ngaysx + " " + soluong + " " + gia;
                    
            prin.println(hh);
            prin.flush();
        */
            if(viTri >= constants.file_data.size()){
                constants.file_data.add(hh);
            }else{
                            constants.file_data.add(viTri, hh);
            }

        } catch (Exception e) {
        }
    }
public void ghiXunFile(){
        try {
            PrintWriter prin = new PrintWriter(constants.data);
            SimpleDateFormat formatSimple = new SimpleDateFormat("dd/MM/yyyy");
            for (int i = 0; i < constants.file_data.size(); i++) {
                hangHoa hh =  constants.file_data.get(i);
                String hhGhi = hh.getMa() + "\t" + hh.getTen() + "\t" + hh.getdonViTinh() + "\t"+
                        formatSimple.format(hh.getNgayNhap())
                        +"\t" + hh.getSo_luong()+ "\t" + hh.getGia();
                //prin.print("")
                prin.println(hhGhi);
                prin.flush();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ghi_xoa_tinhTien.class.getName()).log(Level.SEVERE, null, ex);
        }
}

    public void tinhTien() {
        float tien;
        for (int i = 0; i < constants.file_data.size(); i++) {
          hangHoa hh = constants.file_data.get(i);
          float soluong = hh.getSo_luong();
          if(soluong> 100){
              soluong -= soluong*15/100;
          }else if(soluong<=100&&soluong>50){
              soluong -= soluong*10/100;
          }
          NumberFormat  nf = new DecimalFormat(".##");
          tien = Float.parseFloat(nf.format(Math.round((soluong*hh.getGia()*100.0)/100.0)));
          hh.setTien(tien);
            //System.out.println(hh.getMa()+" ngay sx: "+hh.getNgayNhap()+"  tien la : "+tien);
        }
    }
   /* public static void xoa(){
        find.xoa();
        ghiXun();
        docFile.doc_File();
    }*/
}
