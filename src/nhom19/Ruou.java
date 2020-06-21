package nhom19;

import java.io.Serializable;
import java.util.Comparator;

public class Ruou implements Serializable {
	private String maRuou, tenRuou, donGia, dungTich, nongDo, xuatXu, tinhTrang, kieuCach, maTheLoai, maNl, maCt, soLuongCon;

    

	public String getXuatXu() {
		return xuatXu;
	}

	public void setXuatXu(String xuatXu) {
		this.xuatXu = xuatXu;
	}

	public String getMaRuou() {
		return maRuou;
	}

	public void setMaRuou(String maRuou) {
		this.maRuou = maRuou;
	}
        
	public String getTenRuou() {
		return tenRuou;
	}

	public void setGroup(String group) {
		this.tenRuou = group;
	}

        public String getDonGia() {
            return donGia;
        }

        public void setDonGia(String donGia) {
            this.donGia = donGia;
        }
        
        
	public String getDungTich() {
		return dungTich;
	}

	public void setDungTich(String dungTich) {
		this.dungTich = dungTich;
	}

	public String getNongDo() {
		return nongDo;
	}

	public void setNongDo(String nongDo) {
		this.nongDo = nongDo;
	}

        public String getTinhTrang() {
            return tinhTrang;
        }

        public void setTinhTrang(String tinhTrang) {
            this.tinhTrang = tinhTrang;
        }

        public String getKieuCach() {
            return kieuCach;
        }

        public void setKieuCach(String kieuCach) {
            this.kieuCach = kieuCach;
        }

        public String getMaTheLoai() {
            return maTheLoai;
        }

        public void setMaTheLoai(String maTheLoai) {
            this.maTheLoai = maTheLoai;
        }

        public String getMaNl() {
            return maNl;
        }

        public void setMaNl(String maNl) {
            this.maNl = maNl;
        }

        public String getMaCt() {
            return maCt;
        }

        public void setMaCt(String maCt) {
            this.maCt = maCt;
        }

        public String getSoLuongCon() {
            return soLuongCon;
        }

        public void setSoLuongCon(String soLuongCon) {
            this.soLuongCon = soLuongCon;
        }
        
	public Ruou() {
	}

	public Ruou(String maRuou, String tenRuou,String donGia, String dungTich,String nongDo, String xuatXu, String tinhTrang, String kieuCach, String matl) {
		super();
		this.maRuou = maRuou;
		this.tenRuou = tenRuou;
                this.donGia = donGia;
                this.maTheLoai = matl;
		this.dungTich = dungTich;
		this.nongDo = nongDo;
		this.xuatXu = xuatXu;
                this.tinhTrang = tinhTrang;
                this.kieuCach = kieuCach;
                this.maTheLoai = matl;
	}

    public Ruou(String maRuou, String tenRuou, String donGia, String dungTich, String nongDo, String xuatXu, String tinhTrang, String kieuCach, String maTheLoai, String maNl, String maCt, String soLuongCon) {
        this.maRuou = maRuou;
        this.tenRuou = tenRuou;
        this.donGia = donGia;
        this.dungTich = dungTich;
        this.nongDo = nongDo;
        this.xuatXu = xuatXu;
        this.tinhTrang = tinhTrang;
        this.kieuCach = kieuCach;
        this.maTheLoai = maTheLoai;
        this.maNl = maNl;
        this.maCt = maCt;
        this.soLuongCon = soLuongCon;
    }
        
	private String getLastNameOfName() {
		String str = getMaRuou();
		int i = str.length() - 1;
		while (i > 0) {
			if (str.charAt(i) == ' ') {
				return str.substring(i + 1);
			}
			i--;
		}
		return str;
	}

	public String toString() {
		return maRuou + ", " + nongDo + ", " + tenRuou + ", " + dungTich;
	}

	public static Comparator<Ruou> PersonNameComparator = new Comparator<Ruou>() {
		public int compare(Ruou p1, Ruou p2) {
			return p1.getXuatXu().compareTo(p2.getXuatXu());
		}
	};
}
