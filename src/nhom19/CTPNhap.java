/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nhom19;
public class CTPNhap {
    String sopn, manl, sln, donGiaNhap;

    public CTPNhap() {
    }

    public CTPNhap(String sopn, String manl, String sln, String donGiaNhap) {
        this.sopn = sopn;
        this.manl = manl;
        this.sln = sln;
        this.donGiaNhap = donGiaNhap;
    }

    public String getSopn() {
        return sopn;
    }

    public void setSopn(String sopn) {
        this.sopn = sopn;
    }

    public String getManl() {
        return manl;
    }

    public void setManl(String manl) {
        this.manl = manl;
    }

    public String getSln() {
        return sln;
    }

    public void setSln(String sln) {
        this.sln = sln;
    }

    public String getDonGiaNhap() {
        return donGiaNhap;
    }

    public void setDonGiaNhap(String donGiaNhap) {
        this.donGiaNhap = donGiaNhap;
    }
}
