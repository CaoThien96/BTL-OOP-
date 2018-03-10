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
public class CauHoiTL extends CauHoi implements Serializable{
    private String goiYDapAn;

    public CauHoiTL(String goiYDapAn, String deBai, int doKho, int chuong) {
        super(deBai, doKho, chuong);
        this.goiYDapAn = goiYDapAn;
    }

    public CauHoiTL() {
    }

    public String getGoiYDapAn() {
        return goiYDapAn;
    }

    public void setGoiYDapAn(String goiYDapAn) {
        this.goiYDapAn = goiYDapAn;
    }
    //Ghi đề phương thức in câu hỏi tự luận
    @Override
    public String inCauHoi() {
        return super.deBai+"\n"+"Gợi ý đáp án: "+goiYDapAn;
    }

    @Override
    public String inCauHoi(int x) {
        return super.deBai+"\n";
    }
    
         
    
}
