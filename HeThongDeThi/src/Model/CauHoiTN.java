/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author CaoThienHUST
 */
public class CauHoiTN extends CauHoi implements Serializable{
    private ArrayList<DapAnTN> arrCacDapAn;

    public CauHoiTN(ArrayList<DapAnTN> arrCacDapAn, String deBai, int doKho,int chuong) {
        super(deBai, doKho,chuong );
        this.arrCacDapAn = arrCacDapAn;
    }

    public CauHoiTN() {
    }

    public ArrayList<DapAnTN> getArrCacDapAn() {
        return arrCacDapAn;
    }

    public void setArrCacDapAn(ArrayList<DapAnTN> arrCacDapAn) {
        this.arrCacDapAn = arrCacDapAn;
    }
    //Ghi đè phương thức in đáp án trắc nghiệm
    @Override
    public String inCauHoi() {
        int i=1;
        String daDung="";
        String phuongAn = "";
        for (DapAnTN dapAn : arrCacDapAn) {
            phuongAn=phuongAn+dapAn.getNoiDungDA()+"   ";
            if(dapAn.isIsTrue()){
                if(i==1)
                    daDung=daDung+"Đáp án đúng: A";
                if(i==2)
                    daDung=daDung+"Đáp án đúng: B";
                if(i==3)
                    daDung=daDung+"Đáp án đúng: C";
                if(i==4)
                    daDung=daDung+"Đáp án đúng: D";
                if(i==5)
                    daDung=daDung+"Đáp án đúng: E";
            }
            i++;
        }
        return super.deBai+"\n"+phuongAn+"  "+daDung;
                
    }

    @Override
    public String inCauHoi(int x) {
        int i=1;
        String daDung="";
        String phuongAn = "";
        for (DapAnTN dapAn : arrCacDapAn) {
            phuongAn=phuongAn+dapAn.getNoiDungDA()+"   ";
            if(dapAn.isIsTrue()){
                if(i==1)
                    daDung=daDung+"Đáp án đúng: A";
                if(i==2)
                    daDung=daDung+"Đáp án đúng: B";
                if(i==3)
                    daDung=daDung+"Đáp án đúng: C";
                if(i==4)
                    daDung=daDung+"Đáp án đúng: D";
                if(i==5)
                    daDung=daDung+"Đáp án đúng: E";
            }
            i++;
        }
        return super.deBai+"\n"+phuongAn;
    }
    
    
}
