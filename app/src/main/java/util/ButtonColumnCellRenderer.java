/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Thamyres
 */
public class ButtonColumnCellRenderer extends DefaultTableCellRenderer{
    
    private String buttonType;
    
    public ButtonColumnCellRenderer(String buttonType){
        this.buttonType = buttonType;
    }

    public String getButton() {
        return buttonType;
    }

    public void setButton(String buttonType) {
        this.buttonType = buttonType;
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col){
        
        JLabel label;
        label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
        
        label.setHorizontalAlignment(CENTER);
        
      
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/" + buttonType +".png")));
        
        return label; 
    }
    
}
