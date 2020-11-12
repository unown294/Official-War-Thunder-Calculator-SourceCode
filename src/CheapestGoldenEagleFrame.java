
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.table.DefaultTableModel;

/*
 * Copyright (C) 2020 Dalton
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 *
 * @author Dalton
 */
public class CheapestGoldenEagleFrame extends javax.swing.JFrame {

    //Defualt Values (Update if they arent same as game
    int[] ge_ammount = {25000, 10000, 5000, 2500, 1000, 150};
    double[] ge_price = {165, 66, 33, 16.5, 6.6, 1};
    
    DefaultTableModel model;
    /**
     * Creates new form CheapestGoldenEagleFrame
     */
    public CheapestGoldenEagleFrame() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        model = (DefaultTableModel)GoldenEaglePackTable.getModel();
        
        for(int i = 0; i < ge_ammount.length;i++){
            model.setValueAt((Object)ge_ammount[i], i, 0);
        }
    }
    
    private void Lowest_Possible_ge(int Ge){
        int[] tally_ammount = {0,0,0,0,0,0};
        double total_cost = 0;
        int total_eagles = 0;
        for(int i = 0; i < ge_ammount.length; i++){
            if(Ge >= ge_ammount[i]){
                boolean test = true;
                while(test){
                    if(Ge >= ge_ammount[i]){
                        tally_ammount[i]++;
                        Ge = Ge - ge_ammount[i];
                    }
                    else{
                        test = false;
                        if(Ge != 0 && i == 5){
                            tally_ammount[5]++;
                            break;
                        }
                    }
                }
                    
            }
            else if(Ge < 150 && Ge > 0){
                tally_ammount[5]++;
                break;
            }
//            else if(Ge != 0 ){
//                tally_ammount[5]++;
//                break;
//            }
            else{
                //does nothing :D, Really just to catch weird bugs with the counter. Happens with certain number ranges but havent determined cause
            }
        }
        for(int i = 0; i < ge_ammount.length;i++){
            total_cost = total_cost + (ge_price[i] * tally_ammount[i]);
        }
        
        for(int i = 0; i<ge_ammount.length;i++){
            total_eagles = total_eagles + (ge_ammount[i] * tally_ammount[i]);
        }
        
        TotalCostField.setText(String.format("$%,.2f",total_cost));
        TotalEagleField.setText(String.format("%d",total_eagles));
        
        //Updates the tally to match the amount calculated
        for(int i = 0; i < tally_ammount.length;i++){
            model.setValueAt((Object)tally_ammount[i], i, 1);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ExitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        GoldenEaglePackTable = new javax.swing.JTable();
        CalculateButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        EagleAmountField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TotalCostField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TotalEagleField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Golden Eagle Pack Finder");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Golden Eagle Pack Finder");

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        GoldenEaglePackTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Pack amount", "Quantity Required"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(GoldenEaglePackTable);

        CalculateButton.setText("Calculate");
        CalculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter the amount of golden eagles you wish to purchase:");

        EagleAmountField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EagleAmountFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Total cost:");

        TotalCostField.setEditable(false);

        jLabel4.setText("Total eagles being purchased:");

        TotalEagleField.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TotalCostField)
                            .addComponent(TotalEagleField))
                        .addGap(10, 10, 10)
                        .addComponent(CalculateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ExitButton))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EagleAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(EagleAmountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TotalCostField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TotalEagleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CalculateButton)
                            .addComponent(ExitButton))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void CalculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateButtonActionPerformed
        if(EagleAmountField.getText().equals("")||Integer.parseInt(EagleAmountField.getText())<0){
            JOptionPane.showMessageDialog(null, "Please enter a value into the text field", "Error", ERROR_MESSAGE);
        }
        else{
            Lowest_Possible_ge((Integer.parseInt(EagleAmountField.getText())));
        }
    }//GEN-LAST:event_CalculateButtonActionPerformed

    private void EagleAmountFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EagleAmountFieldActionPerformed
        if(EagleAmountField.getText().equals("")||Integer.parseInt(EagleAmountField.getText())<0){
            JOptionPane.showMessageDialog(null, "Please enter a value into the text field", "Error", ERROR_MESSAGE);
        }
        else{
            Lowest_Possible_ge((Integer.parseInt(EagleAmountField.getText())));
        }
    }//GEN-LAST:event_EagleAmountFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MembershipFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MembershipFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MembershipFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MembershipFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheapestGoldenEagleFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalculateButton;
    private javax.swing.JTextField EagleAmountField;
    private javax.swing.JButton ExitButton;
    private javax.swing.JTable GoldenEaglePackTable;
    private javax.swing.JTextField TotalCostField;
    private javax.swing.JTextField TotalEagleField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}