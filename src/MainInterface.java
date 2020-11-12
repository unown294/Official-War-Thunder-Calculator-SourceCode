
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;

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
public class MainInterface extends javax.swing.JFrame {

    /**
     * Creates new form MainInterface
     */
    public MainInterface() {
        
        //Initializes necessary logic or formating for the form
        initComponents();
        setIcon();
        ButtonGroupGrouper();
        
        //Gets the Center of the screen regardless of position and resolutions
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    public void setIcon(){
        //This code is used to override the image on the JFrame
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("warthundericon.png")));
    }
    
    public void ButtonGroupGrouper(){
        RadioButtonGroup = new ButtonGroup();
        RadioButtonGroup.add(ExperienceRadioButton);
        RadioButtonGroup.add(CheapestGoldenEagleRadioButton);
        RadioButtonGroup.add(CheapestSilverLionRadioButton);
        RadioButtonGroup.add(PremiumMembRadioButton);
        RadioButtonGroup.add(AverageBattleRadioButton);
    }
    

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RadioButtonGroup = new javax.swing.ButtonGroup();
        ExperienceRadioButton = new javax.swing.JRadioButton();
        PremiumMembRadioButton = new javax.swing.JRadioButton();
        AverageBattleRadioButton = new javax.swing.JRadioButton();
        CheapestSilverLionRadioButton = new javax.swing.JRadioButton();
        CheapestGoldenEagleRadioButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        ExitButton = new javax.swing.JButton();
        CalculateButton = new javax.swing.JButton();
        WarThunderIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Official War Thunder Calculator");
        setResizable(false);

        ExperienceRadioButton.setText("Experience Calculator (Golden Eagle to RP)");
        ExperienceRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExperienceRadioButtonActionPerformed(evt);
            }
        });

        PremiumMembRadioButton.setText("Premium Membership Calculator");
        PremiumMembRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PremiumMembRadioButtonActionPerformed(evt);
            }
        });

        AverageBattleRadioButton.setText("Average Research Point Calculator");

        CheapestSilverLionRadioButton.setText("Cheapest Golden Eagles to Silver Lion Calculator");

        CheapestGoldenEagleRadioButton.setText("Cheapest Golden Eagle Calculator");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Please select one of the options");

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        CalculateButton.setText("Select");
        CalculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateButtonActionPerformed(evt);
            }
        });

        WarThunderIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/warthunderRain.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(AverageBattleRadioButton)
                    .addComponent(PremiumMembRadioButton)
                    .addComponent(ExperienceRadioButton)
                    .addComponent(CheapestGoldenEagleRadioButton)
                    .addComponent(CheapestSilverLionRadioButton))
                .addGap(18, 18, 18)
                .addComponent(WarThunderIcon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CalculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(WarThunderIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ExperienceRadioButton)
                        .addGap(31, 31, 31)
                        .addComponent(PremiumMembRadioButton)
                        .addGap(31, 31, 31)
                        .addComponent(AverageBattleRadioButton)
                        .addGap(31, 31, 31)
                        .addComponent(CheapestSilverLionRadioButton)
                        .addGap(31, 31, 31)
                        .addComponent(CheapestGoldenEagleRadioButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CalculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateButtonActionPerformed
        if(ExperienceRadioButton.isSelected()){
            ExperienceFrame experienceFrame = new ExperienceFrame();
            experienceFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            experienceFrame.setVisible(true);
        }
        else if(PremiumMembRadioButton.isSelected()){
            MembershipFrame membershipFrame = new MembershipFrame();
            membershipFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            membershipFrame.setVisible(true);
        }
        else if(AverageBattleRadioButton.isSelected()){
            AverageBattleFrame averageBattleFrame = new AverageBattleFrame();
            averageBattleFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            averageBattleFrame.setVisible(true);
        }
        else if(CheapestSilverLionRadioButton.isSelected()){
            CheapestSilverLionFrame cheapestSilverLionFrame = new CheapestSilverLionFrame();
            cheapestSilverLionFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            cheapestSilverLionFrame.setVisible(true);
        }
        else if(CheapestGoldenEagleRadioButton.isSelected()){
            CheapestGoldenEagleFrame cheapestGoldenEagleFrame = new CheapestGoldenEagleFrame();
            cheapestGoldenEagleFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            cheapestGoldenEagleFrame.setVisible(true);
        }
    }//GEN-LAST:event_CalculateButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(1);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void ExperienceRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExperienceRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExperienceRadioButtonActionPerformed

    private void PremiumMembRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PremiumMembRadioButtonActionPerformed
        //Opens Premium Membership calculator fuction
    }//GEN-LAST:event_PremiumMembRadioButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AverageBattleRadioButton;
    private javax.swing.JButton CalculateButton;
    private javax.swing.JRadioButton CheapestGoldenEagleRadioButton;
    private javax.swing.JRadioButton CheapestSilverLionRadioButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JRadioButton ExperienceRadioButton;
    private javax.swing.JRadioButton PremiumMembRadioButton;
    private javax.swing.ButtonGroup RadioButtonGroup;
    private javax.swing.JLabel WarThunderIcon;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
