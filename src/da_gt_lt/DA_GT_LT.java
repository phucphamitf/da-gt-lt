/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da_gt_lt;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author pdkpro
 */
public class DA_GT_LT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
       
        /*docFile df =new docFile();
        df.doc_File();
        tim_kiem_theo_chu_de_xoa find = new tim_kiem_theo_chu_de_xoa();
        ghi_xoa_tinhTien gh = new ghi_xoa_tinhTien(find);
        System.out.println("nhap cong viec can lam: (them, tim kiem, xoa,tin tien:)");
        Scanner nhap = new Scanner(System.in);
        while(true){
        switch(nhap.nextLine()){
            case "tim kiem": find.tim_kiem(false); break;
            case "them": gh.add_Hh(); break;
            case "xoa": gh.xoa(); break;
            case "tinh tien": gh.tinhTien();
        }
        }*/
        giaoDien gd = new giaoDien();
        gd.show();
       //new dateTimeDemo();
    }
    
}
