/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom19;


public class CongThuc {
    String maCt, tenCt, phanTramQua, phanTramMen, phanTramNuoc;

    public String getMaCt() {
        return maCt;
    }

    public void setMaCt(String maCt) {
        this.maCt = maCt;
    }

    public String getTenCt() {
        return tenCt;
    }

    public void setTenCt(String tenCt) {
        this.tenCt = tenCt;
    }

    public String getPhanTramQua() {
        return phanTramQua;
    }

    public void setPhanTramQua(String phanTramQua) {
        this.phanTramQua = phanTramQua;
    }

    public String getPhanTramMen() {
        return phanTramMen;
    }

    public void setPhanTramMen(String phanTramMen) {
        this.phanTramMen = phanTramMen;
    }

    public String getPhanTramNuoc() {
        return phanTramNuoc;
    }

    public void setPhanTramNuoc(String phanTramNuoc) {
        this.phanTramNuoc = phanTramNuoc;
    }

    public CongThuc() {
    }

    public CongThuc(String maCt, String tenCt, String phanTramQua, String phanTramMen, String phanTramNuoc) {
        this.maCt = maCt;
        this.tenCt = tenCt;
        this.phanTramQua = phanTramQua;
        this.phanTramMen = phanTramMen;
        this.phanTramNuoc = phanTramNuoc;
    }
    
    
}
