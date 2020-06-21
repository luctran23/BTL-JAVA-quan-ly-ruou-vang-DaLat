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
public class PhieuXuat {
    String sopx, ngayXuat, tenKh;

    public PhieuXuat() {
    }

    public PhieuXuat(String sopx, String ngayXuat, String tenKh) {
        this.sopx = sopx;
        this.ngayXuat = ngayXuat;
        this.tenKh = tenKh;
    }

    public String getSopx() {
        return sopx;
    }

    public void setSopx(String sopx) {
        this.sopx = sopx;
    }

    public String getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(String ngayXuat) {
        this.ngayXuat = ngayXuat;
    }

    public String getTenKh() {
        return tenKh;
    }

    public void setTenKh(String tenKh) {
        this.tenKh = tenKh;
    }
}
