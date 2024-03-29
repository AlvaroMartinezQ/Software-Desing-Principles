package practica_5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class InterfazFacturas extends javax.swing.JFrame {

    FacturaFactorizada ff;
    /**
     * Creates new form IntefazFacturas
     */
    public InterfazFacturas() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("+-------------------------Calculo de facturas-----------------------------+");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pantalla = new javax.swing.JTextArea();
        fieldDeduccion = new javax.swing.JTextField();
        fieldImporte = new javax.swing.JTextField();
        LabelImporte = new javax.swing.JLabel();
        LabelDeduccion = new javax.swing.JLabel();
        RadioIVA = new javax.swing.JRadioButton();
        ButtonFactura = new javax.swing.JButton();
        RadioDeduccion = new javax.swing.JRadioButton();
        fieldNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 153), null, null));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)), "Pantalla:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setOpaque(false);

        pantalla.setEditable(false);
        pantalla.setBackground(new java.awt.Color(255, 255, 255));
        pantalla.setColumns(20);
        pantalla.setFont(new java.awt.Font("NSimSun", 2, 24)); // NOI18N
        pantalla.setForeground(new java.awt.Color(0, 0, 0));
        pantalla.setRows(5);
        jScrollPane1.setViewportView(pantalla);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
        );

        fieldDeduccion.setBackground(new java.awt.Color(255, 255, 255));
        fieldDeduccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldDeduccion.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));

        fieldImporte.setBackground(new java.awt.Color(255, 255, 255));
        fieldImporte.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldImporte.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));

        LabelImporte.setBackground(new java.awt.Color(255, 255, 255));
        LabelImporte.setFont(new java.awt.Font("Bernard MT Condensed", 0, 14)); // NOI18N
        LabelImporte.setForeground(new java.awt.Color(255, 255, 255));
        LabelImporte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelImporte.setText("Importe (euros):");

        LabelDeduccion.setBackground(new java.awt.Color(255, 255, 255));
        LabelDeduccion.setFont(new java.awt.Font("Bernard MT Condensed", 0, 14)); // NOI18N
        LabelDeduccion.setForeground(new java.awt.Color(255, 255, 255));
        LabelDeduccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelDeduccion.setText("Deducción (%):");

        RadioIVA.setBackground(new java.awt.Color(51, 255, 51));
        RadioIVA.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        RadioIVA.setForeground(new java.awt.Color(255, 255, 255));
        RadioIVA.setText("Activar IVA Reducido");
        RadioIVA.setFocusable(false);
        RadioIVA.setOpaque(false);
        RadioIVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioIVAActionPerformed(evt);
            }
        });

        ButtonFactura.setBackground(new java.awt.Color(255, 255, 255));
        ButtonFactura.setText("Generar FacturaTxT");
        ButtonFactura.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonFactura.setFocusable(false);
        ButtonFactura.setOpaque(false);
        ButtonFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFacturaActionPerformed(evt);
            }
        });

        RadioDeduccion.setBackground(new java.awt.Color(51, 255, 51));
        RadioDeduccion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        RadioDeduccion.setForeground(new java.awt.Color(255, 255, 255));
        RadioDeduccion.setText("Activar +Deduduccion");
        RadioDeduccion.setFocusable(false);
        RadioDeduccion.setOpaque(false);

        fieldNombre.setBackground(new java.awt.Color(255, 255, 255));
        fieldNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldNombre.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Bernard MT Condensed", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nombre Archivo (sin extension):");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fieldImporte)
                            .addComponent(RadioIVA, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(LabelImporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButtonFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RadioDeduccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fieldDeduccion)
                            .addComponent(LabelDeduccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelDeduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelImporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldDeduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RadioIVA, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(ButtonFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RadioDeduccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 51, 51));

        jMenu1.setBackground(new java.awt.Color(51, 0, 51));
        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem1.setBackground(new java.awt.Color(0, 102, 102));
        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RadioIVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioIVAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioIVAActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void ButtonFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFacturaActionPerformed
        if(fieldNombre.getText() != null && fieldNombre.getText() != ""){
            if(Integer.parseInt(fieldImporte.getText()) >= 0){
                if(Integer.parseInt(fieldDeduccion.getText()) >= 0){    
                    if(RadioIVA.isSelected()){
                        if(RadioDeduccion.isSelected()){
                            ff = new FacturaFactorizada(new IvaReducido(), new DeduccionBonificada());
                        }else{
                            ff = new FacturaFactorizada(new IvaReducido(), new DeduccionNormal());
                        }
                    }else{
                        if(RadioDeduccion.isSelected()){
                            ff = new FacturaFactorizada(new IvaNormal(), new DeduccionBonificada());
                        }else{
                            ff = new FacturaFactorizada(new IvaNormal(), new DeduccionNormal());
                        }
                    }
                    ff.setImporteFactura(Integer.parseInt(fieldImporte.getText()));
                    ff.setPorcentajeDeduccion(Integer.parseInt(fieldDeduccion.getText()));
                    ff.CalcularTotal();
                    pantalla.setText(ff.toString());
                    try(BufferedWriter writer = new BufferedWriter(new FileWriter(fieldNombre.getText() + ".txt"))){
                        writer.write(ff.toString());
                    }catch (Exception ex){
                        pantalla.setText(pantalla.getText() + "\n\n[Error] - No se logro escribir en el archivo - [Error]");
                    }
                }else{
                    pantalla.setText("Introduzca una deduccion no negativa.");
                }
            }else{
                pantalla.setText("Introduce un importe no negativo.");
            }
        }else{
            pantalla.setText("Introduze un nombre válido");
        }
    }//GEN-LAST:event_ButtonFacturaActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazFacturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazFacturas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonFactura;
    private javax.swing.JLabel LabelDeduccion;
    private javax.swing.JLabel LabelImporte;
    private javax.swing.JRadioButton RadioDeduccion;
    private javax.swing.JRadioButton RadioIVA;
    private javax.swing.JTextField fieldDeduccion;
    private javax.swing.JTextField fieldImporte;
    private javax.swing.JTextField fieldNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea pantalla;
    // End of variables declaration//GEN-END:variables
}
