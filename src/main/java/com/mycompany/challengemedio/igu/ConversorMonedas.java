package com.mycompany.challengemedio.igu;

//import javax.swing.ImageIcon;

import ConvertirMonedas.OpcionesConvertMonedas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class ConversorMonedas extends javax.swing.JFrame {
    
    FondoPanelMoneda imgFondoMoneda = new FondoPanelMoneda();
    String divisaDesde;
    String divisaHacia;
    
    
    
    public ConversorMonedas() {
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

        jPanel1 = new FondoPanelMoneda();
        jLabel2 = new javax.swing.JLabel();
        InputMonto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnGenerarCambio = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        cboxDe = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cboxA = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Conversor de Divisas");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("De");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 137, 65, -1));

        InputMonto.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        InputMonto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        InputMonto.setText("100.99");
        InputMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputMontoActionPerformed(evt);
            }
        });
        jPanel1.add(InputMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 49, 120, 38));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Escribí el monto a convertir:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 57, 200, -1));

        btnGenerarCambio.setBackground(new java.awt.Color(0, 204, 204));
        btnGenerarCambio.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnGenerarCambio.setForeground(new java.awt.Color(0, 0, 0));
        btnGenerarCambio.setText("Convertir");
        btnGenerarCambio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGenerarCambioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGenerarCambioMouseExited(evt);
            }
        });
        btnGenerarCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarCambioActionPerformed(evt);
            }
        });
        jPanel1.add(btnGenerarCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 225, -1, 42));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BarrerLimpiar.png"))); // NOI18N
        jButton1.setText("Limpiar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 382, -1, 40));

        cboxDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pesos ARG", "Dolar USA", "Euro EU", "Pesos MEX", "Reales BRA", "Libra ENG", "Won SUR-COREA", "Yen JAPON" }));
        cboxDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxDeActionPerformed(evt);
            }
        });
        jPanel1.add(cboxDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 164, 112, 49));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Elegí el tipo de cambio:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 104, 175, -1));

        cboxA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pesos ARG", "Dolar USA", "Euro EU", "Pesos MEX", "Reales BRA", "Libra ENG", "Won SUR-COREA", "Yen JAPON" }));
        jPanel1.add(cboxA, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 164, 112, 49));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("A");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 137, 47, -1));

        txtResultado.setColumns(20);
        txtResultado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtResultado.setLineWrap(true);
        txtResultado.setRows(5);
        txtResultado.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtResultado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 285, 328, 79));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtResultado.setText("");
        InputMonto.setText("");
        cboxDe.setSelectedIndex(0);
        cboxA.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnGenerarCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarCambioActionPerformed
        txtResultado.setText("");
        
        String valorIngresado = InputMonto.getText();
        divisaDesde = (String) cboxDe.getSelectedItem();
        divisaHacia = (String) cboxA.getSelectedItem();
        
        String NumberFormatE = "Numeros pa, cuanto queres cambiar en numeros";
        String RespuestaString = "No se puede convertir a la misma moneda crack, probá con otra";
        double valorRecibido = 0;
        try {
           valorRecibido = Double.parseDouble(valorIngresado);
           //recibo bien aca
           
        //----Termina el try para que ande     
        } catch (NumberFormatException e) {
            txtResultado.setText(NumberFormatE);
        }
        //Puente a la clase que convierte.
        OpcionesConvertMonedas ConvertirMoneda = new OpcionesConvertMonedas();
        ConvertirMoneda.setValor(valorRecibido);
        ConvertirMoneda.setMonedaOrgien(divisaDesde);
        ConvertirMoneda.setMonedaHacia(divisaHacia);
        //Listo, los datos captados aca se mandan a OpcionesConvertirMoneda.

        //Traemos el resultado de esa clase
        double montoConvertido = ConvertirMoneda.convertir();
        if (montoConvertido == 1111.1111) {
                txtResultado.append(RespuestaString);
            } else if (montoConvertido == 0.0){
                txtResultado.append("Algo salió mal, probá de nuevo crack");
            } else {
                //aca recien lo convierto en formato moneda.
                DecimalFormat formaMoneda = new DecimalFormat("#,##0.00");
                String numeroListo = formaMoneda.format(montoConvertido);
                //System.out.println(numeroListo);
                
                txtResultado.append(" Tenes $ " + numeroListo + " en " + divisaHacia);
            }
        
    }//GEN-LAST:event_btnGenerarCambioActionPerformed

    private void InputMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputMontoActionPerformed

    private void cboxDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxDeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxDeActionPerformed

    private void btnGenerarCambioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarCambioMouseEntered
        btnGenerarCambio.setBackground(Color.CYAN);
    }//GEN-LAST:event_btnGenerarCambioMouseEntered

    private void btnGenerarCambioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarCambioMouseExited
        btnGenerarCambio.setBackground(new Color(0,204,204));
    }//GEN-LAST:event_btnGenerarCambioMouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(Color.PINK);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setBackground(new Color(255,51,51));
    }//GEN-LAST:event_jButton1MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InputMonto;
    private javax.swing.JButton btnGenerarCambio;
    private javax.swing.JComboBox<String> cboxA;
    private javax.swing.JComboBox<String> cboxDe;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables

     //Poner imagen de fondo en panel principal
    class FondoPanelMoneda extends JPanel {
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
