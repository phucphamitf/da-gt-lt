/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da_gt_lt;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author pdkpro
 */
public class docFile {
    public static hangHoa hh;
    public static void doc_File(){
        try {
            RandomAccessFile raf = new RandomAccessFile(constants.data, "r");
            String line = null;
            while (((line = raf.readLine())!=null)&&!line.equals("")) {                
                String[] data = line.split("\t");
                for(String s : data){
                    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                    Date ngayNhap = format.parse(data[3]);
                    set_Hang_Hoa.sethh(data[0],data[1],data[2],ngayNhap,Integer.parseInt(data[4]),Integer.parseInt(data[5]));
                    System.out.print(s + " ");
                }
                hangHoa hh = set_Hang_Hoa.gethh();
                constants.file_data.add(hh);
                System.out.println("");
            }
                            System.out.println("data size: "+constants.file_data.size());
        } catch (Exception e) {
             System.out.println("k thanh cong");
             e.printStackTrace();
             e.getMessage();
        }
        
    }
}
