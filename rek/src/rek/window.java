package rek;

import javax.swing.*;
import java.awt.*;

public class window extends javax.swing.JFrame {
    public window() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        screen = new javax.swing.JPanel();
        buttonPanel = new javax.swing.JPanel();
        SquareButton = new javax.swing.JButton();
        triangleButton = new javax.swing.JButton();
        snowflakeButton = new javax.swing.JButton();
        treeButton = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout screenLayout = new javax.swing.GroupLayout(screen);
        screen.setLayout(screenLayout);
        screenLayout.setHorizontalGroup(
            screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        screenLayout.setVerticalGroup(
            screenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        SquareButton.setText("Square");
        SquareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SquareButtonActionPerformed(evt);
            }
        });

        triangleButton.setText("Triangle");
        triangleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triangleButtonActionPerformed(evt);
            }
        });

        snowflakeButton.setText("snowflake");
        snowflakeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snowflakeButtonActionPerformed(evt);
            }
        });

        treeButton.setText("tree");
        treeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treeButtonActionPerformed(evt);
            }
        });

        treeButton.setBounds(5, 120, 135, 30);
        buttonPanel.add(treeButton);

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(snowflakeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(triangleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SquareButton, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                .addContainerGap())
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SquareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(triangleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(snowflakeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(354, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(screen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(screen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SquareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SquareButtonActionPerformed
        Graphics2D g = (Graphics2D)screen.getGraphics();
        g.clearRect(0, 0, 700, 474);
        g.setColor(Color.black);
        drawSquare(300, 200, 200, g);
        
    }//GEN-LAST:event_SquareButtonActionPerformed

    private void drawSquare(int x, int y, int length, Graphics2D g) {
        if (length > 0.5) {
            int r = length/2;
            g.fillRect(x - r, y - r, length, length);
            drawSquare(x - (r + length/6), y, length/3, g);
            drawSquare(x + (r + length/6), y, length/3, g);
            drawSquare(x, y + (r + length/6), length/3, g);
            drawSquare(x, y - (r + length/6), length/3, g);
        }
    }

    private void triangleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triangleButtonActionPerformed
        Graphics2D g = (Graphics2D)screen.getGraphics();
        g.clearRect(0, 0, 700, 474);
        g.setColor(Color.black);
        drawTriangle(300, 200, 200, g);
    }//GEN-LAST:event_triangleButtonActionPerformed
    
    private void drawTriangle(int x, int y, int r, Graphics2D g) {
        if (r > 0.5) {
            double al=Math.PI/3*2;
            for(int i=0;i<3;i++)
                g.drawLine((int)(x+r*Math.cos(al*i)),(int)(y-r*Math.sin(al*i)),(int)(x+r*Math.cos(al*(i+1))),(int)(y-r*Math.sin(al*(i+1))));
            for(int i=0;i<3;i++){
                drawTriangle((int)(x+r/2*Math.cos(al*i)),(int)(y-r/2*Math.sin(al*i)),r/2, g);
            }
        }
    }

    private void snowflakeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snowflakeButtonActionPerformed
        Graphics2D g = (Graphics2D)screen.getGraphics();
        g.clearRect(0, 0, 700, 474);
        g.setColor(Color.black);
        drawSnowflake(300, 200, 100, 8, g);
    }//GEN-LAST:event_snowflakeButtonActionPerformed

    private void drawSnowflake(int x, int y, int r, int n, Graphics2D g) {
        if (r > 0.5) {
            if (r < 3) {
                g.setColor(Color.white);
            } else {
                g.setColor(Color.black);
            }
            double a = Math.PI/n*2;
            nStar(x, y, r, n, g);
            for (int i = 0; i < n; i++) {
                drawSnowflake((int)(x+r*Math.cos(a*i)), (int)(y-r*Math.sin(a*i)), r/3, n, g);
            }
        }
    }

    private void nStar(int x, int y, int r, int n, Graphics2D g) {
        double a = Math.PI/n*2;
        for (int i = 0; i < n; i++) {
            g.drawLine(x, y, (int)(x+r*Math.cos(a*i)), (int)(y-r*Math.sin(a*i)));
        }
    }

    private void treeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        Graphics2D g = (Graphics2D) screen.getGraphics();
        g.clearRect(0, 0, 700, 474);
        g.setColor(Color.black);
        drawTree(300, 200, 5, 100, g);
    }

    private void drawTree(int x, int y, double a, int r, Graphics2D g) {
        g.setColor(Color.black);
        if (r >= 5) {
            int x2 = x + (int) (Math.cos(a)*r);
            int y2 = y + (int) (Math.sin(a)*r);
            g.drawLine(x, y, x2, y2);
            drawTree(x2, y2, a+Math.PI/6, (int) (r*0.5), g);
            drawTree(x2, y2, a-Math.PI/6, (int) (r*0.5), g);
        }
    }

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
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SquareButton;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel screen;
    private javax.swing.JButton snowflakeButton;
    private javax.swing.JButton triangleButton;
    private javax.swing.JButton treeButton;
    // End of variables declaration//GEN-END:variables
}
