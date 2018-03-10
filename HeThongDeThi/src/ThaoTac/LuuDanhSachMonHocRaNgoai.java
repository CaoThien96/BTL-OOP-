/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThaoTac;

import ModelMonHoc.MonHoc;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CaoThienHUST
 */
public class LuuDanhSachMonHocRaNgoai {
    private ArrayList<MonHoc> dsMonHoc;

    public LuuDanhSachMonHocRaNgoai() {
    }

    public LuuDanhSachMonHocRaNgoai(ArrayList<MonHoc> dsMonHoc) {
        this.dsMonHoc = dsMonHoc;
        try {
            FileOutputStream fos=new FileOutputStream("MonHoc.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(dsMonHoc);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LuuDanhSachMonHocRaNgoai.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LuuDanhSachMonHocRaNgoai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
