/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author CaoThienHUST
 */
public abstract class CauHoi implements Serializable{
    protected String deBai;
    protected int doKho;
    protected int chuong;

    public CauHoi(String deBai, int doKho, int chuong) {
        this.deBai = deBai;
        this.doKho = doKho;
        this.chuong = chuong;
       
    }

    public CauHoi() {
    }

    public String getDeBai() {
        return deBai;
    }

    public void setDeBai(String deBai) {
        this.deBai = deBai;
    }

    public int getDoKho() {
        return doKho;
    }

    public void setDoKho(int doKho) {
        this.doKho = doKho;
    }

    public int getChuong() {
        return chuong;
    }

    public void setChuong(int chuong) {
        this.chuong = chuong;
    }
    //show giao vien thấy đk đáp án 
    public abstract String inCauHoi();
    //show câu hởi ra file doc ko còn đáp án nữa 
    public abstract String inCauHoi(int x);
}
