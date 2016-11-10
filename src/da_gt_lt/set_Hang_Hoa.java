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
public class set_Hang_Hoa {
    public static hangHoa hh;
    public static void sethh(String ma,String ten,String donViTinh,Date ngayNhap,int soluong,int gia){
        hh = new hangHoa();
        hh.setMa(ma);
        hh.setTen(ten);
        hh.setdonViTinh(donViTinh);
        hh.setGia(gia);
        hh.setSo_luong(soluong);
        hh.setNgayNhap(ngayNhap);
        
    }
    public static hangHoa gethh(){
        return hh; 
    }
}
