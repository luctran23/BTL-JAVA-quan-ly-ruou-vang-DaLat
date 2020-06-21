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
public class PhieuNhap {
    String sopn, ngayNhap, sodh;

    public PhieuNhap() {
    }

    public PhieuNhap(String sopx, String ngayNhap, String sodh) {
        this.sopn = sopx;
        this.ngayNhap = ngayNhap;
        this.sodh = sodh;
    }

    public String getSopx() {
        return sopn;
    }

    public void setSopx(String sopx) {
        this.sopn = sopx;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getSodh() {
        return sodh;
    }

    public void setSodh(String sodh) {
        this.sodh = sodh;
    }
}
