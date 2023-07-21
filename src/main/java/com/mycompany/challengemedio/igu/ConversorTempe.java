package com.mycompany.challengemedio.igu;

import ConvertirTempes.OpcionesTemperatura;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * FondoPanelTempe
 * @author Ciro
 */
public class ConversorTempe extends javax.swing.JFrame {
    
    FondoPanelTempe imgFondoMoneda = new FondoPanelTempe();
    String tempeDesde;
    String tempeHacia;

    public ConversorTempe() {
        this.setContentPane(imgFondoMoneda);
        initComponents();
        setIconImage(getIconImage());
    }

    private void initCombo() {
        
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/LogoConv.png"));
        return retValue;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanelTempe();
        jLabel2 = new javax.swing.JLabel();
        InputTempe = new javax.swing.JTextField();
        cbTempeDesde = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbTempeHacia = new javax.swing.JComboBox<>();
        btnConvertirTempe = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultadoTempe = new javax.swing.JTextArea();
        btnLimpiarTempe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Conversor de Temperaturas");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Temperatura a convertir:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 27, 177, -1));

        InputTempe.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        InputTempe.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        InputTempe.setText("20.6");
        InputTempe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputTempeActionPerformed(evt);
            }
        });
        jPanel1.add(InputTempe, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 60, 117, -1));

        cbTempeDesde.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cbTempeDesde.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit", "Kelvin", "Rankine" }));
        cbTempeDesde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTempeDesdeActionPerformed(evt);
            }
        });
        jPanel1.add(cbTempeDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 140, 131, 36));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("De");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 105, 45, 29));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("A");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 105, 45, 29));

        cbTempeHacia.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cbTempeHacia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit", "Kelvin", "Rankine" }));
        jPanel1.add(cbTempeHacia, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 140, 131, 36));

        btnConvertirTempe.setBackground(new java.awt.Color(0, 204, 204));
        btnConvertirTempe.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnConvertirTempe.setForeground(new java.awt.Color(0, 0, 0));
        btnConvertirTempe.setText("Convertir");
        btnConvertirTempe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConvertirTempeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConvertirTempeMouseExited(evt);
            }
        });
        btnConvertirTempe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirTempeActionPerformed(evt);
            }
        });
        jPanel1.add(btnConvertirTempe, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 148, 41));

        txtResultadoTempe.setColumns(20);
        txtResultadoTempe.setLineWrap(true);
        txtResultadoTempe.setRows(5);
        txtResultadoTempe.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtResultadoTempe);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 310, -1));

        btnLimpiarTempe.setBackground(new java.awt.Color(255, 51, 51));
        btnLimpiarTempe.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnLimpiarTempe.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiarTempe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BarrerLimpiar.png"))); // NOI18N
        btnLimpiarTempe.setText("Limpiar");
        btnLimpiarTempe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarTempeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarTempeMouseExited(evt);
            }
        });
        btnLimpiarTempe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarTempeActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiarTempe, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 125, 36));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConvertirTempeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirTempeActionPerformed
        txtResultadoTempe.setText("");
        
        String tempeIngresado = InputTempe.getText();
        tempeDesde = (String) cbTempeDesde.getSelectedItem();
        tempeHacia = (String) cbTempeHacia.getSelectedItem();
        
        
        String NumberFormatT = "Numeros pa, numeros, la temperatura en numeros";
        String RespuestaString = "No se puede convertir a la misma tempearatura crack, probá con otra";
        double valorRecibido = 0;
        
        
        try {
            valorRecibido = Double.parseDouble(tempeIngresado);
        } catch (NumberFormatException e) {
            txtResultadoTempe.setText(NumberFormatT);
        }
        
        OpcionesTemperatura convertTempes = new OpcionesTemperatura();
        convertTempes.setValorTempe(valorRecibido);
        //System.out.println("Esto es lo que estoy mandando a OpcionesTempe " + valorRecibido + "tempe desde: " + tempeDesde + " y tempe hacia: "  + tempeHacia);
        convertTempes.setTempeOrgien(tempeDesde);
        convertTempes.setTempeHacia(tempeHacia);
        
        double tempeConvertida = convertTempes.convertirTemperaturas();
            if (tempeConvertida == 1111.1111) {
                txtResultadoTempe.append(RespuestaString);
            } else if (tempeConvertida == 0.0){
                txtResultadoTempe.append("Algo salió mal, probá de nuevo crack");
            } else {
                txtResultadoTempe.append("Son " + tempeConvertida + "° " + tempeHacia);
                //txtResultadoTempe.append("tempe desde es: " + tempeDesde + " | tempe hacia " + tempeHacia + " | tempe ingresado: " + tempeConvertida);
            }
        
        
    }//GEN-LAST:event_btnConvertirTempeActionPerformed

    private void btnLimpiarTempeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarTempeActionPerformed

        txtResultadoTempe.setText("");
        InputTempe.setText("");
        cbTempeDesde.setSelectedIndex(0);
        cbTempeHacia.setSelectedIndex(0);
        
    }//GEN-LAST:event_btnLimpiarTempeActionPerformed

    private void cbTempeDesdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTempeDesdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTempeDesdeActionPerformed

    private void InputTempeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputTempeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputTempeActionPerformed

    private void btnConvertirTempeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConvertirTempeMouseEntered
        btnConvertirTempe.setBackground(Color.CYAN);
    }//GEN-LAST:event_btnConvertirTempeMouseEntered

    private void btnConvertirTempeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConvertirTempeMouseExited
        btnConvertirTempe.setBackground(new Color(0,204,204));
    }//GEN-LAST:event_btnConvertirTempeMouseExited

    private void btnLimpiarTempeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarTempeMouseEntered
        btnLimpiarTempe.setBackground(Color.PINK);
    }//GEN-LAST:event_btnLimpiarTempeMouseEntered

    private void btnLimpiarTempeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarTempeMouseExited
        btnLimpiarTempe.setBackground(new Color(255,51,51));
    }//GEN-LAST:event_btnLimpiarTempeMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InputTempe;
    private javax.swing.JButton btnConvertirTempe;
    private javax.swing.JButton btnLimpiarTempe;
    private javax.swing.JComboBox<String> cbTempeDesde;
    private javax.swing.JComboBox<String> cbTempeHacia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtResultadoTempe;
    // End of variables declaration//GEN-END:variables
    
      //Poner imagen de fondo en panel principal
    class FondoPanelTempe extends JPanel {
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
