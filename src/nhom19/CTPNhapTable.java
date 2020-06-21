package nhom19;


import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class CTPNhapTable extends AbstractTableModel{
     private String name[] = {"Số phiếu nhập", "Mã nguyên liệu", "Số lượng nhập", "Đơn giá nhập"};
    private Class classes[] = {String.class, String.class, String.class, String.class };
    ArrayList<CTPNhap> dspn = new ArrayList<>();
    public CTPNhapTable(ArrayList<CTPNhap> dspn){
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
            return dspn.get(rowIndex).getSopn();
        }
        if(columnIndex == 1){
            return dspn.get(rowIndex).getManl();
        }
        if(columnIndex == 2){
            return dspn.get(rowIndex).getSln();
        }
        if(columnIndex == 3){
            return dspn.get(rowIndex).getDonGiaNhap();
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
