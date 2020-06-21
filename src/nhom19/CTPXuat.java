/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom19;

/**
 *
 * @author pc
 */
public class CTPXuat {
    String sopx, maruou, slXuat, donGia;

    public CTPXuat() {
    }

    public CTPXuat(String sopx, String maruou, String slXuat, String donGia) {
        this.sopx = sopx;
        this.maruou = maruou;
        this.slXuat = slXuat;
        this.donGia = donGia;
    }

    public String getSopx() {
        return sopx;
    }

    public void setSopx(String sopx) {
        this.sopx = sopx;
    }

    public String getMaruou() {
        return maruou;
    }

    public void setMaruou(String maruou) {
        this.maruou = maruou;
    }

    public String getSlXuat() {
        return slXuat;
    }

    public void setSlXuat(String slXuat) {
        this.slXuat = slXuat;
    }

    public String getDonGia() {
        return donGia;
    }

    public void setDonGia(String donGia) {
        this.donGia = donGia;
    }
}
