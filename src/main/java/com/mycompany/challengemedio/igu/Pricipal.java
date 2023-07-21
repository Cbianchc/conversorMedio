package com.mycompany.challengemedio.igu;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pricipal extends javax.swing.JFrame {
    
    FondoPanel imgFondo = new FondoPanel();
    
    public Pricipal(){
        this.setContentPane(imgFondo);
        initComponents();
        setIconImage(getIconImage());
        
        //SetImageLabel(imgGarota, "Img/BarrarLimpiar.png");
    }
    
    //Poner Icono en el JFrame
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/LogoConv.png"));
        return retValue;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanel();
        jLabel1 = new javax.swing.JLabel();
        btnMonedas = new javax.swing.JButton();
        imgGarota = new javax.swing.JLabel();
        btnTemperatura = new javax.swing.JButton();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de cosas");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(51, 255, 204));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Conversor Alura");

        btnMonedas.setBackground(new java.awt.Color(255, 153, 0));
        btnMonedas.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnMonedas.setForeground(new java.awt.Color(51, 51, 51));
        btnMonedas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/CamvarIcono2.png"))); // NOI18N
        btnMonedas.setText("Convertir divisas");
        btnMonedas.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnMonedas.setBorderPainted(false);
        btnMonedas.setRequestFocusEnabled(false);
        btnMonedas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMonedasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMonedasMouseExited(evt);
            }
        });
        btnMonedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonedasActionPerformed(evt);
            }
        });

        imgGarota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/header_garota.1686744883.png"))); // NOI18N

        btnTemperatura.setBackground(new java.awt.Color(255, 153, 0));
        btnTemperatura.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnTemperatura.setForeground(new java.awt.Color(51, 51, 51));
        btnTemperatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tempeIcono.png"))); // NOI18N
        btnTemperatura.setText("Convertir temperatura");
        btnTemperatura.setBorder(null);
        btnTemperatura.setBorderPainted(false);
        btnTemperatura.setRequestFocusEnabled(false);
        btnTemperatura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTemperaturaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTemperaturaMouseExited(evt);
            }
        });
        btnTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemperaturaActionPerformed(evt);
            }
        });

        labelFondo.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnMonedas, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(labelFondo)))
                .addGap(20, 20, 20)
                .addComponent(imgGarota, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(btnMonedas, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(labelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(imgGarota, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /*btnTemperatura.setIcon(getIconUrl("/Img/BarrerLimpiar.png"));
    
    private Icon getIconUrl(String url, int w, int h) {
        return new ImageIcon(new ImageIcon(getClass().getResourse(url)).getImage().getScaledInstance(w, h, 0));
    }*/
    
    private void btnMonedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonedasActionPerformed
        ConversorMonedas pantalla = new ConversorMonedas();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnMonedasActionPerformed

    private void btnMonedasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMonedasMouseEntered
        btnMonedas.setBackground(Color.CYAN);
    }//GEN-LAST:event_btnMonedasMouseEntered

    private void btnMonedasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMonedasMouseExited
        btnMonedas.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_btnMonedasMouseExited

    private void btnTemperaturaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTemperaturaMouseEntered
        btnTemperatura.setBackground(Color.CYAN);
    }//GEN-LAST:event_btnTemperaturaMouseEntered

    private void btnTemperaturaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTemperaturaMouseExited
        btnTemperatura.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_btnTemperaturaMouseExited

    private void btnTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemperaturaActionPerformed
        ConversorTempe pantallaTempe = new ConversorTempe();
        pantallaTempe.setVisible(true);
        pantallaTempe.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnTemperaturaActionPerformed

    /*private void SetImageLabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon;
        icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMonedas;
    private javax.swing.JButton btnTemperatura;
    private javax.swing.JLabel imgGarota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelFondo;
    // End of variables declaration//GEN-END:variables

    //Poner imagen de fondo en panel principal
    class FondoPanel extends JPanel {
        private Image fondoImg;
        
        @Override
        public void paint(Graphics g) {
            fondoImg = new ImageIcon(getClass().getResource("/img/wallretro.png")).getImage();
            g.drawImage(fondoImg, 0, 0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            super.paint(g);
                
        }        
    }
}
