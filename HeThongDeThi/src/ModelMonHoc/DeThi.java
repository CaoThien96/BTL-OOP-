/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelMonHoc;

import Model.CauHoi;
import Model.CauHoiTL;
import Model.CauHoiTN;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author CaoThienHUST
 */
public class DeThi implements Serializable{
    private String tenDeThi;
    private String mon;
    private ArrayList<CauHoi> dsCauHoi=new ArrayList<>();

    public DeThi(String tenDeThi, String mon) {
        this.tenDeThi = tenDeThi;
        this.mon = mon;
    }

    public String getTenDeThi() {
        return tenDeThi;
    }

    public void setTenDeThi(String tenDeThi) {
        this.tenDeThi = tenDeThi;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public ArrayList<CauHoi> getDsCauHoi() {
        return dsCauHoi;
    }

    public void setDsCauHoi(ArrayList<CauHoi> dsCauHoi) {
        this.dsCauHoi = dsCauHoi;
    }
    public String inDeThi(){
        String deThi="";
        int i=1;
        for(CauHoi item:dsCauHoi){
            deThi=deThi+"Câu "+i+":"+item.inCauHoi()+"\n";
            i++;
        }
        return deThi;
    }

    public DeThi() {
    }
    
}
