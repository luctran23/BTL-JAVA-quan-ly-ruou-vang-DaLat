/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom19;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author pc
 */
public class PhieuXuatTable extends AbstractTableModel {
    private String name[] = {"Số phiếu xuất", "Ngày xuất", "Tên khách hàng"};
    private Class classes[] = {String.class, String.class, String.class };
    ArrayList<PhieuXuat> dspx = new ArrayList<PhieuXuat>();
    public PhieuXuatTable(ArrayList<PhieuXuat> dspx){
        this.dspx = dspx;
    }

    @Override
    public int getRowCount() {
        return dspx.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex == 0){
            return dspx.get(rowIndex).getSopx();
        }
        if(columnIndex == 1){
            return dspx.get(rowIndex).getNgayXuat();
        }
        if(columnIndex == 2){
            return dspx.get(rowIndex).getTenKh();
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
