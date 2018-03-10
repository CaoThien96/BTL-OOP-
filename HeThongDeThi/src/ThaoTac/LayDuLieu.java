/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThaoTac;

import Model.CauHoi;
import ModelMonHoc.MonHoc;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CaoThien
 */
public class LayDuLieu {
    ArrayList<MonHoc> dsMonHoc=new ArrayList<>();
    
    MonHoc mh=null;

    public LayDuLieu() {
        layDuLieuMonHoc();
    }
    
    public LayDuLieu(int indexMonHoc) {
        layDuLieuMonHoc();
        mh=dsMonHoc.get(indexMonHoc);
    }

    private void layDuLieuMonHoc() {
        FileInputStream fis;
        try {
            fis = new FileInputStream("MonHoc.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            dsMonHoc=(ArrayList<MonHoc>) ois.readObject();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        } 
    }
    public ArrayList<MonHoc> getDanhSachMonHoc(){
        return dsMonHoc;
    }
    
    public String[] toArrayString(){
        String[] listMonHoc=new String[dsMonHoc.size()];
        for(int i=0;i<dsMonHoc.size();i++){
            listMonHoc[i]=dsMonHoc.get(i).getTenMonHoc();
       
        }
        return listMonHoc;
    }
    public String[] toArrayString(int indexMonHoc){
        MonHoc mh=dsMonHoc.get(indexMonHoc);
        ArrayList<CauHoi> dsCauHoi=mh.getArrCauHoi();
        String[] listCauHoi=new String[dsCauHoi.size()];
        for(int i=0;i<dsCauHoi.size();i++){
            String temp="";
           // if(dsCauHoi.get(i)instanceof CauHoiTN){
                listCauHoi[i]="Cau "+(i+1)+":"+dsCauHoi.get(i).inCauHoi();
            //}else listCauHoi[i]="Cau "+(i+1)+":"+dsCauHoi.get(i).inCauHoi();
        }
        return listCauHoi;
    }
    
    
}
