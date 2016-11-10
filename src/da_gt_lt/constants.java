/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da_gt_lt;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pdkpro
 */
public class constants {
    private static String path = "C:\\Users\\pdkpro\\Desktop\\da\\properties.properties";
    public static String data = "C:\\Users\\pdkpro\\Desktop\\da\\DATA.txt";
    public static int SlEEP  =  Integer.parseInt(setFind("SlEEP"));
    public static int i = 0;
    public static ArrayList<hangHoa> file_data = new ArrayList<hangHoa>();
    public static ArrayList<Float> Tien =  new ArrayList<Float>();
    public static String setFind(String name){
        try {
            Properties p = new Properties();
            p.load(new FileInputStream(path));
            return p.getProperty(name);
        } catch (IOException ex) {
            Logger.getLogger(constants.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "file not found";
    }
}
