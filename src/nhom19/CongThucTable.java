
package nhom19;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class CongThucTable extends AbstractTableModel{
    private String name[] = {"Mã công thức", "Tên công thức", " Quả (%)", "Men (%)", "Nước (%)"};
    private Class classes[] = {String.class, String.class, String.class , String.class, String.class};
    ArrayList<CongThuc> dsCt = new ArrayList<CongThuc>();
    
    public CongThucTable(ArrayList<CongThuc> dsCt) {
        this.dsCt = dsCt;
    }
    @Override
    public int getRowCount() {
        return dsCt.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex == 0){
            return dsCt.get(rowIndex).getMaCt();
        }
        if(columnIndex == 1){
            return dsCt.get(rowIndex).getTenCt();
        }
        if(columnIndex == 2){
            return dsCt.get(rowIndex).getPhanTramQua();
        }
        if(columnIndex == 3){
            return dsCt.get(rowIndex).getPhanTramMen();
        }
        if(columnIndex == 4){
            return dsCt.get(rowIndex).getPhanTramNuoc();
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
