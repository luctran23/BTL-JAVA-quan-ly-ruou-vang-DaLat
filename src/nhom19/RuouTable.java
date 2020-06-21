
package nhom19;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class RuouTable extends AbstractTableModel {
    private String name[] = {"Mã rượu", "Tên rượu", "Đơn giá","Dung tích", "Nồng độ", "Xuất xứ", "Tình trạng", "Kiểu cách", "Mã thể loại", "Mã nguyên liệu", "Mã công thức", "Số lượng còn"};
    private Class classes[] = {String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class };
    ArrayList<Ruou> dsRuou = new ArrayList<Ruou>();
    
    public RuouTable(ArrayList<Ruou> dsRuou) {
        this.dsRuou = dsRuou;
    }

    @Override
    public int getRowCount() {
        return dsRuou.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex == 0){
            return dsRuou.get(rowIndex).getMaRuou();
        }
        if(columnIndex == 1){
            return dsRuou.get(rowIndex).getTenRuou();
        }
        if(columnIndex == 2){
            return dsRuou.get(rowIndex).getDonGia();
        }
        if(columnIndex == 3){
            return dsRuou.get(rowIndex).getDungTich();
        }
        if(columnIndex == 4){
            return dsRuou.get(rowIndex).getNongDo();
        }
        if(columnIndex == 5){
            return dsRuou.get(rowIndex).getXuatXu();
        }
        if(columnIndex == 6){
            return dsRuou.get(rowIndex).getTinhTrang();
        }
        if(columnIndex == 7){
            return dsRuou.get(rowIndex).getKieuCach();
        }
        if(columnIndex == 8){
            return dsRuou.get(rowIndex).getMaTheLoai();
        }
        if(columnIndex == 9){
            return dsRuou.get(rowIndex).getMaNl();
        }
        if(columnIndex == 10){
            return dsRuou.get(rowIndex).getMaCt();
        }
        if(columnIndex == 11){
            return dsRuou.get(rowIndex).getSoLuongCon();
        }
        return null;
    }
    @Override
    public Class getColumnClass(int columnIndex) {
        return classes[columnIndex]; 
    }

    @Override
    public String getColumnName(int column) {
        return name[column];
    }
}
