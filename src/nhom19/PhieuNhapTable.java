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
public class PhieuNhapTable  extends AbstractTableModel  {
    private String name[] = {"Số phiếu nhập", "Ngày nhập", "Số đơn hàng"};
    private Class classes[] = {String.class, String.class, String.class };
    ArrayList<PhieuNhap> dspn = new ArrayList<PhieuNhap>();
    public PhieuNhapTable(ArrayList<PhieuNhap> dspn){
        this.dspn = dspn;
    }

    @Override
    public int getRowCount() {
        return dspn.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex == 0){
            return dspn.get(rowIndex).getSopx();
        }
        if(columnIndex == 1){
            return dspn.get(rowIndex).getNgayNhap();
        }
        if(columnIndex == 2){
            return dspn.get(rowIndex).getSodh();
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
