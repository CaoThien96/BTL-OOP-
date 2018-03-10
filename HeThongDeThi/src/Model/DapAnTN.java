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
public class DapAnTN implements Serializable {

    private String noiDungDA;
    private boolean isTrue = false;

    public DapAnTN(String noiDungDA) {
        this.noiDungDA = noiDungDA;
    }

    public DapAnTN() {
    }

    public String getNoiDungDA() {
        return noiDungDA;
    }

    public void setNoiDungDA(String noiDungDA) {
        this.noiDungDA = noiDungDA;
    }

    public boolean isIsTrue() {
        return isTrue;
    }

    public void setIsTrue(boolean isTrue) {
        this.isTrue = isTrue;
    }

}
