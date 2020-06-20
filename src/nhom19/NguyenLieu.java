
package nhom19;


public class NguyenLieu {
    private String maNl, tenNl, xuatXu, donGia;

    public String getMaNl() {
        return maNl;
    }

    public void setMaNl(String maNl) {
        this.maNl = maNl;
    }

    public String getTenNl() {
        return tenNl;
    }

    public void setTenNl(String tenNl) {
        this.tenNl = tenNl;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public String getDonGia() {
        return donGia;
    }

    public void setDonGia(String donGia) {
        this.donGia = donGia;
    }

    public NguyenLieu() {
    }

    public NguyenLieu(String maNl, String tenNl, String xuatXu, String donGia) {
        this.maNl = maNl;
        this.tenNl = tenNl;
        this.xuatXu = xuatXu;
        this.donGia = donGia;
    }
    
    
}
