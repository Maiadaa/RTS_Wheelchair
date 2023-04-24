/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import events.PowerEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import rts.Config;

/**
 *
 * @author PC
 */
public class WheelChairScreen extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public WheelChairScreen() {
        initComponents();
    }

    public JButton getAccelerateBtn() {
        return accelerateBtn;
    }

    public JButton getOffBtn() {
        return offBtn;
    }

    public void setOffBtn(JButton offBtn) {
        this.offBtn = offBtn;
    }

    public void setAccelerateBtn(JButton accelerateBtn) {
        this.accelerateBtn = accelerateBtn;
    }

    public JButton getBackwardBtn() {
        return backwardBtn;
    }

    public void setBackwardBtn(JButton backwardBtn) {
        this.backwardBtn = backwardBtn;
    }

    public JTextField getBatteryScreen() {
        return batteryScreen;
    }

    public void setBatteryScreen(JTextField batteryScreen) {
        this.batteryScreen = batteryScreen;
    }

    public JButton getBrakeBtn() {
        return brakeBtn;
    }

    public void setBrakeBtn(JButton brakeBtn) {
        this.brakeBtn = brakeBtn;
    }

    public JTextField getCurrentTempTxt2() {
        return currentTempTxt2;
    }

    public void setCurrentTempTxt2(JTextField currentTempTxt2) {
        this.currentTempTxt2 = currentTempTxt2;
    }

    public JTextField getCurrentTempTxt3() {
        return currentTempTxt3;
    }

    public void setCurrentTempTxt3(JTextField currentTempTxt3) {
        this.currentTempTxt3 = currentTempTxt3;
    }

    public JTextField getDirectionScreen() {
        return directionScreen;
    }

    public void setDirectionScreen(JTextField directionScreen) {
        this.directionScreen = directionScreen;
    }

    public JButton getForwardBtn() {
        return forwardBtn;
    }

    public void setForwardBtn(JButton forwardBtn) {
        this.forwardBtn = forwardBtn;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JButton getLeftBtn() {
        return leftBtn;
    }

    public void setLeftBtn(JButton leftBtn) {
        this.leftBtn = leftBtn;
    }

    public JTextField getObstacleScreen() {
        return obstacleScreen;
    }

    public void setObstacleScreen(JTextField obstacleScreen) {
        this.obstacleScreen = obstacleScreen;
    }

    public JButton getOnBtn() {
        return onBtn;
    }

    public void setOnBtn(JButton onBtn) {
        this.onBtn = onBtn;
    }

    public JButton getRightBtn() {
        return rightBtn;
    }

    public void setRightBtn(JButton rightBtn) {
        this.rightBtn = rightBtn;
    }

    public JTextField getSpeedScreen() {
        return speedScreen;
    }

    public void setSpeedScreen(JTextField speedScreen) {
        this.speedScreen = speedScreen;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        currentTempTxt2 = new javax.swing.JTextField();
        currentTempTxt3 = new javax.swing.JTextField();
        offBtn = new javax.swing.JButton();
        brakeBtn = new javax.swing.JButton();
        rightBtn = new javax.swing.JButton();
        accelerateBtn = new javax.swing.JButton();
        forwardBtn = new javax.swing.JButton();
        leftBtn = new javax.swing.JButton();
        backwardBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        obstacleScreen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        directionScreen = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        speedScreen = new javax.swing.JTextField();
        batteryScreen = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        onBtn = new javax.swing.JButton();

        currentTempTxt2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        currentTempTxt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        currentTempTxt2.setText("0");
        currentTempTxt2.setEnabled(false);

        currentTempTxt3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        currentTempTxt3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        currentTempTxt3.setText("0");
        currentTempTxt3.setEnabled(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        offBtn.setText("OFF");
        offBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offBtnActionPerformed(evt);
            }
        });

        brakeBtn.setText("Brake");

        rightBtn.setText(">");
        rightBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        rightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightBtnActionPerformed(evt);
            }
        });

        accelerateBtn.setText("Accelerate");

        forwardBtn.setText("^");
        forwardBtn.setPreferredSize(new java.awt.Dimension(40, 40));

        leftBtn.setText("<");
        leftBtn.setPreferredSize(new java.awt.Dimension(40, 40));

        backwardBtn.setText("v");
        backwardBtn.setPreferredSize(new java.awt.Dimension(40, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Wheelchair System");

        obstacleScreen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        obstacleScreen.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        obstacleScreen.setText("!! Obstacle Detected !!");
        obstacleScreen.setEnabled(false);
        obstacleScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obstacleScreenActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Current Direction");

        directionScreen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        directionScreen.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        directionScreen.setText("Forward");
        directionScreen.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Current Speed");

        speedScreen.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        speedScreen.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        speedScreen.setText("0");
        speedScreen.setEnabled(false);

        batteryScreen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        batteryScreen.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        batteryScreen.setText("100 %");
        batteryScreen.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Battery %");

        onBtn.setText("ON");
        onBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(brakeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(leftBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(backwardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(forwardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(rightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(accelerateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addComponent(obstacleScreen, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(speedScreen)
                                        .addGap(75, 75, 75))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(directionScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(batteryScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(22, 22, 22)))
                            .addComponent(offBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(onBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3)
                        .addGap(58, 58, 58)
                        .addComponent(obstacleScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(speedScreen))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(directionScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(onBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(offBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(batteryScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(forwardBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accelerateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(brakeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(leftBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37))
                    .addComponent(backwardBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rightBtnActionPerformed

    private void obstacleScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obstacleScreenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_obstacleScreenActionPerformed

    private void offBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offBtnActionPerformed
        // TODO add your handling code here:
        Config.sendEvent(new PowerEvent(false));

    }//GEN-LAST:event_offBtnActionPerformed

    private void onBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onBtnActionPerformed
        // TODO add your handling code here:

        Config.sendEvent(new PowerEvent(true));
    }//GEN-LAST:event_onBtnActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accelerateBtn;
    private javax.swing.JButton backwardBtn;
    private javax.swing.JTextField batteryScreen;
    private javax.swing.JButton brakeBtn;
    private javax.swing.JTextField currentTempTxt2;
    private javax.swing.JTextField currentTempTxt3;
    private javax.swing.JTextField directionScreen;
    private javax.swing.JButton forwardBtn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton leftBtn;
    private javax.swing.JTextField obstacleScreen;
    private javax.swing.JButton offBtn;
    private javax.swing.JButton onBtn;
    private javax.swing.JButton rightBtn;
    private javax.swing.JTextField speedScreen;
    // End of variables declaration//GEN-END:variables
}
