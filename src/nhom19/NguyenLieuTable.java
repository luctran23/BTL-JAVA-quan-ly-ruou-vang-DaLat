
package nhom19;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class NguyenLieuTable extends AbstractTableModel {
    private String name[] = {"Mã nguyên liệu", "Tên nguyên liệu", "Xuất xứ", "Đơn giá"};
    private Class classes[] = {String.class, String.class, String.class , String.class};
    ArrayList<NguyenLieu> dsNl = new ArrayList<NguyenLieu>();
    
    public NguyenLieuTable(ArrayList<NguyenLieu> dsNl) {
        this.dsNl = dsNl;
    }
    @Override
    public int getRowCount() {
        return dsNl.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex == 0){
            return dsNl.get(rowIndex).getMaNl();
        }
        if(columnIndex == 1){
            return dsNl.get(rowIndex).getTenNl();
        }
        if(columnIndex == 2){
            return dsNl.get(rowIndex).getXuatXu();
        }
        if(columnIndex == 3){
            return dsNl.get(rowIndex).getDonGia();
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
