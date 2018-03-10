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
public class MonHoc implements Serializable{
    private String tenMonHoc;
    private ArrayList<CauHoi> arrCauHoi=new ArrayList<>();
    private ArrayList<DeThi> dsDeThi=new ArrayList<>();
    public MonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public ArrayList<CauHoi> getArrCauHoi() {
        return arrCauHoi;
    }

    public void setArrCauHoi(ArrayList<CauHoi> arrCauHoi) {
        this.arrCauHoi = arrCauHoi;
    }

    public ArrayList<DeThi> getDsDeThi() {
        return dsDeThi;
    }

    public void setDsDeThi(ArrayList<DeThi> dsDeThi) {
        this.dsDeThi = dsDeThi;
    }
    public ArrayList<CauHoi> phanLoaiCauHoiTheoDoKho(int doKho) {
        ArrayList<CauHoi> dsCauHoiPhanLoai = new ArrayList<>();
        for (CauHoi item : this.arrCauHoi) {
            if (item.getDoKho() == (doKho + 1)) {
                dsCauHoiPhanLoai.add(item);
            }
        }
        return dsCauHoiPhanLoai;
    }
    public ArrayList<CauHoi> phanLoaiCauHoiTheoDoChuong(int chuong) {
        ArrayList<CauHoi> dsCauHoiPhanLoai = new ArrayList<>();
        for (CauHoi item : this.arrCauHoi) {
            if (item.getDoKho() == (chuong + 1)) {
                dsCauHoiPhanLoai.add(item);
            }
        }
        return dsCauHoiPhanLoai;
    }

    public ArrayList<CauHoi> phanLoaiCauHoiTheoDoKhoVaChuong(int doKho, int chuong) {
        ArrayList<CauHoi> dsCauHoiPhanLoai = new ArrayList<>();
        for (CauHoi item : this.arrCauHoi) {
            if (item.getDoKho() == (doKho + 1) && item.getChuong() == (chuong + 1)) {
                dsCauHoiPhanLoai.add(item);
            }
        }
        return dsCauHoiPhanLoai;
    }

    public ArrayList<CauHoi> phanLoaiDeTheoKieuCauHoi(int kieu) {
        ArrayList<CauHoi> dsPhanLoai = new ArrayList<>();
        if (kieu == 1) {
            for (CauHoi item : this.arrCauHoi) {
                if (item instanceof CauHoiTN) {
                    dsPhanLoai.add(item);
                }
            }
        } else if (kieu == 2) {
            for (CauHoi item : this.arrCauHoi) {
                if (item instanceof CauHoiTL) {
                    dsPhanLoai.add(item);
                }
            }
        }
        return dsPhanLoai;
    }
    
    public String[] toStringDsCauHoi() {
        String[] listCauHoi = new String[this.arrCauHoi.size()];
        for (int i = 0; i < this.arrCauHoi.size(); i++) {
            listCauHoi[i] = "Câu " + (i + 1) + ": " + this.arrCauHoi.get(i).inCauHoi();
        }
        return listCauHoi;
    }
    //Hàm toStringDeThi để lấy tên các đề thì cho vào mảng String để setData cho JList
    public String[] toStringDeThi() {
        String[] listDeThi=new String[this.dsDeThi.size()];
        for(int i=0;i<dsDeThi.size();i++){
            listDeThi[i]=dsDeThi.get(i).getTenDeThi();
        }
        return listDeThi;
    }
    
    
}
