/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trabajofds2;


import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.*;
/**
 *
 * @author sebss
 */
public class Interfaz extends javax.swing.JFrame {

    
    
    Algoritmos ag;
    Algoritmos agPG;
    Datos[] datosFB;
    Datos[] datosDYV;
    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        this.setLocationRelativeTo(null);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoFrame = new javax.swing.JPanel();
        fondoPantalla = new javax.swing.JPanel();
        scrollPantalla = new javax.swing.JScrollPane();
        pantalla = new javax.swing.JTextArea();
        scrollPantalla1 = new javax.swing.JScrollPane();
        pantalla2 = new javax.swing.JTextArea();
        genAleatorio = new javax.swing.JButton();
        genManual = new javax.swing.JButton();
        ejFB = new javax.swing.JButton();
        ejDYV = new javax.swing.JButton();
        hacerPruebasGenerales = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        generaExcel = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("PruebasAlgoritmosDYV");
        setResizable(false);

        fondoFrame.setBackground(new java.awt.Color(255, 255, 255));
        fondoFrame.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 153)));

        fondoPantalla.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Pantalla", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        fondoPantalla.setOpaque(false);

        scrollPantalla.setBackground(new java.awt.Color(255, 255, 255));

        pantalla.setEditable(false);
        pantalla.setBackground(new java.awt.Color(255, 255, 255));
        pantalla.setColumns(20);
        pantalla.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        pantalla.setRows(5);
        pantalla.setText("Console Log:\n");
        pantalla.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        scrollPantalla.setViewportView(pantalla);

        scrollPantalla1.setBackground(new java.awt.Color(255, 255, 255));

        pantalla2.setEditable(false);
        pantalla2.setBackground(new java.awt.Color(255, 255, 255));
        pantalla2.setColumns(20);
        pantalla2.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        pantalla2.setRows(5);
        pantalla2.setText("Console Log:\n");
        pantalla2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        scrollPantalla1.setViewportView(pantalla2);

        javax.swing.GroupLayout fondoPantallaLayout = new javax.swing.GroupLayout(fondoPantalla);
        fondoPantalla.setLayout(fondoPantallaLayout);
        fondoPantallaLayout.setHorizontalGroup(
            fondoPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoPantallaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPantalla1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondoPantallaLayout.setVerticalGroup(
            fondoPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoPantallaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondoPantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(scrollPantalla1)))
        );

        genAleatorio.setBackground(new java.awt.Color(102, 102, 255));
        genAleatorio.setForeground(new java.awt.Color(255, 255, 255));
        genAleatorio.setText("Generar Aleatorios");
        genAleatorio.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 153), null, null), new javax.swing.border.MatteBorder(null)));
        genAleatorio.setFocusable(false);
        genAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genAleatorioActionPerformed(evt);
            }
        });

        genManual.setBackground(new java.awt.Color(102, 102, 255));
        genManual.setForeground(new java.awt.Color(255, 255, 255));
        genManual.setText("Generar Manual");
        genManual.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 153), null, null), new javax.swing.border.MatteBorder(null)));
        genManual.setFocusable(false);
        genManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genManualActionPerformed(evt);
            }
        });

        ejFB.setBackground(new java.awt.Color(102, 102, 255));
        ejFB.setForeground(new java.awt.Color(255, 255, 255));
        ejFB.setText("Ejecutar FuerzaBruta");
        ejFB.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 153), null, null), new javax.swing.border.MatteBorder(null)));
        ejFB.setEnabled(false);
        ejFB.setFocusable(false);
        ejFB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejFBActionPerformed(evt);
            }
        });

        ejDYV.setBackground(new java.awt.Color(102, 102, 255));
        ejDYV.setForeground(new java.awt.Color(255, 255, 255));
        ejDYV.setText("Ejecutar DivideYVenceras");
        ejDYV.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 153), null, null), new javax.swing.border.MatteBorder(null)));
        ejDYV.setEnabled(false);
        ejDYV.setFocusable(false);
        ejDYV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejDYVActionPerformed(evt);
            }
        });

        hacerPruebasGenerales.setBackground(new java.awt.Color(102, 102, 255));
        hacerPruebasGenerales.setForeground(new java.awt.Color(255, 255, 255));
        hacerPruebasGenerales.setText("Hacer Pruebas Generales");
        hacerPruebasGenerales.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 153), null, null), new javax.swing.border.MatteBorder(null)));
        hacerPruebasGenerales.setFocusable(false);
        hacerPruebasGenerales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hacerPruebasGeneralesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pruebas Algoritmos");

        javax.swing.GroupLayout fondoFrameLayout = new javax.swing.GroupLayout(fondoFrame);
        fondoFrame.setLayout(fondoFrameLayout);
        fondoFrameLayout.setHorizontalGroup(
            fondoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoFrameLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(fondoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(genAleatorio, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(genManual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(fondoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(fondoFrameLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(61, 61, 61)
                        .addComponent(ejDYV, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoFrameLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(hacerPruebasGenerales, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(ejFB, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(fondoFrameLayout.createSequentialGroup()
                .addComponent(fondoPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        fondoFrameLayout.setVerticalGroup(
            fondoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoFrameLayout.createSequentialGroup()
                .addComponent(fondoPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genAleatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hacerPruebasGenerales, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ejFB, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(fondoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(genManual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(fondoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ejDYV, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 255));

        jMenu1.setBackground(new java.awt.Color(0, 0, 255));
        jMenu1.setText("File");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        generaExcel.setText("Generar Excel");
        generaExcel.setEnabled(false);
        generaExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generaExcelActionPerformed(evt);
            }
        });
        jMenu1.add(generaExcel);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoFrame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoFrame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void genManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genManualActionPerformed
        // TODO add your handling code here:
        pantalla.setText("");
        int n = Integer.parseInt(JOptionPane.showInputDialog("Escribe el número de componentes de las arrays:"));
        if(n <= 10){
            Vectores vs = new Vectores(n, false);
            int[] vector1 = new int[n];
            int[] vector2 = new int[n];

            for(int i = 0; i < n; i++){
                do{
                    vector1[i] = Integer.parseInt(JOptionPane.showInputDialog("Elemento del vector1 nº"+(i+1)+":"));
                }while(existeElemento(vector1[i], vector1, i-1)|| !(vector1[i]<= n && vector1[i] >= 1));
            }
            for(int i = 0; i < n; i++){
                do{
                    vector2[i] = Integer.parseInt(JOptionPane.showInputDialog("Elemento del vector2 nº"+(i+1)+":"));
                }while(existeElemento(vector1[i], vector1, i-1)|| !(vector1[i]<= n && vector1[i] >= 1));
            }
            vs.setVector1(vector1);
            vs.setVector2(vector2);
            ag = new Algoritmos(vs);
            pantalla.setText(ag.getVS().toString());
            ejFB.setEnabled(true);
            ejDYV.setEnabled(true);
        }else{
            pantalla.setText("Numero de componentes muy grande para ser introducido manualmente");
        }
    }//GEN-LAST:event_genManualActionPerformed

    private void genAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genAleatorioActionPerformed
        // TODO add your handling code here:
        int n = Integer.parseInt(JOptionPane.showInputDialog("Escribe el número de componentes de las arrays:"));
        ag = new Algoritmos(new Vectores(n, true), true);
        pantalla.setText(ag.getVS().toString());
        ejFB.setEnabled(true);
        ejDYV.setEnabled(true);
    }//GEN-LAST:event_genAleatorioActionPerformed

    private void hacerPruebasGeneralesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hacerPruebasGeneralesActionPerformed
        // TODO add your handling code here:
        pantalla.setText("");
        pantalla2.setText("");
        int n = Integer.parseInt(JOptionPane.showInputDialog("Escribe el número de iteraciones para pruebas:"));
        agPG = new Algoritmos();
        datosFB = new Datos[n];
        datosDYV = new Datos[n];
        for(int i = 1; i <= n; i++){
            agPG.setVectores(new Vectores(i, true));
            datosFB[i-1] = agPG.ejecutarFuerzaBruta();
            pantalla.setText(pantalla.getText() + "\n->FuerzaBruta nº"+i+":\n\n"+ datosFB[i-1].toString());
        }
        for(int i = 1; i <= n; i++){
            agPG.setVectores(new Vectores(i, true));
            datosDYV[i-1] = agPG.ejecutarDivideYVenceras();
            pantalla2.setText(pantalla2.getText() + "\n->DivideYVenceras nº"+i+":\n\n"+ datosDYV[i-1].toString());
        }
        generaExcel.setEnabled(true);
    }//GEN-LAST:event_hacerPruebasGeneralesActionPerformed

    private void ejDYVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejDYVActionPerformed
        // TODO add your handling code here:
        pantalla2.setText("");
        Datos temp = ag.ejecutarDivideYVenceras();
        pantalla2.setText(temp.toString());
    }//GEN-LAST:event_ejDYVActionPerformed

    private void generaExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generaExcelActionPerformed
        // TODO add your handling code here:
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("tiempos.csv"))){
            String cabecera = "TiemposFB;InversionesFB;TiemposDYV;InversionesDYV";
            cabecera += "\n";
            writer.write(cabecera);
                
            String integerFormat = "%8d;";
            for(int idx = 0; idx < datosFB.length; idx++){
                String fila = "";
                fila += String.format(integerFormat, this.datosFB[idx].getTiempo());
                fila += String.format(integerFormat, this.datosFB[idx].getInversiones());
                fila += String.format(integerFormat, this.datosDYV[idx].getTiempo());
                fila += String.format(integerFormat, this.datosDYV[idx].getInversiones());
                fila += "\n";
                writer.write(fila);
            }
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        
    }//GEN-LAST:event_generaExcelActionPerformed

    private void ejFBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejFBActionPerformed
        pantalla2.setText("");
        Datos temp = ag.ejecutarFuerzaBruta();
        pantalla2.setText(temp.toString());
    }//GEN-LAST:event_ejFBActionPerformed
    
    private boolean existeElemento(int elemento, int[] v, int indexMax){
            if(indexMax == -1) return false;
            for(int i = 0; i <= indexMax; i++) 
                if(v[i] == elemento) 
                    return true;
            return false;
        }
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ejDYV;
    private javax.swing.JButton ejFB;
    private javax.swing.JPanel fondoFrame;
    private javax.swing.JPanel fondoPantalla;
    private javax.swing.JButton genAleatorio;
    private javax.swing.JButton genManual;
    private javax.swing.JMenuItem generaExcel;
    private javax.swing.JButton hacerPruebasGenerales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextArea pantalla;
    private javax.swing.JTextArea pantalla2;
    private javax.swing.JScrollPane scrollPantalla;
    private javax.swing.JScrollPane scrollPantalla1;
    // End of variables declaration//GEN-END:variables
}
