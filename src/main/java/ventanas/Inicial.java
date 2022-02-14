/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import analizadorLexico.Lexico;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GORDILLO G
 */
public class Inicial extends javax.swing.JFrame {

    /**
     * Creates new form Inicial
     */
    Lexico lexer;
    
    
    public Inicial() {
        initComponents();
        this.setTitle("Detectar cantidad de vocales y posición de números");
        this.setLocationRelativeTo(null);
    }
    
    public void mostar(){
        String matriz[][] = new String[lexer.getArray().size()][1];
        
        for (int i = 0; i < lexer.getArray().size(); i++) {
            matriz[i][0]=  lexer.getArray().get(i);
        }
        
        mitabla.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
            new String [] {
                "(Fila, Columna)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        
        
    }
       
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Contar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        entrada = new javax.swing.JTextArea();
        unaVocal = new javax.swing.JLabel();
        dosVocales = new javax.swing.JLabel();
        tresVocales = new javax.swing.JLabel();
        cuatroVocales = new javax.swing.JLabel();
        cincoVocales = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        mitabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Contador");

        Contar.setText("Contar");
        Contar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContarActionPerformed(evt);
            }
        });

        entrada.setColumns(20);
        entrada.setRows(5);
        jScrollPane1.setViewportView(entrada);

        unaVocal.setText("Cantidad 1 vocal: ");

        dosVocales.setText("Cantidad 2 vocales: ");

        tresVocales.setText("Cantidad 3 vocales: ");

        cuatroVocales.setText("Cantidad 4 vocales: ");

        cincoVocales.setText("Cantidad 5 vocales: ");

        mitabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Numeros detectados"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(mitabla);
        if (mitabla.getColumnModel().getColumnCount() > 0) {
            mitabla.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(Contar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(dosVocales, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(unaVocal, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tresVocales, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cuatroVocales, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cincoVocales, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(245, 245, 245)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Contar)
                .addGap(33, 33, 33)
                .addComponent(unaVocal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dosVocales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tresVocales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cuatroVocales)
                .addGap(12, 12, 12)
                .addComponent(cincoVocales)
                .addGap(52, 52, 52)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

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

    private void ContarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContarActionPerformed
        String input = entrada.getText();
        Reader rd = new StringReader(input);
        lexer = new Lexico(rd);
        try {
            int con = lexer.yylex();
            while (con != Lexico.YYEOF) {
                lexer.yylex();
            }
        } catch (IOException ex) {
            System.out.println("Se encontro error");
        }

        unaVocal.setText("Cantidad 1 vocal: " + lexer.getContadorUna());
        dosVocales.setText("Cantidad 2 vocales: " + lexer.getContadorDos());
        tresVocales.setText("Cantidad 3 vocales: " + lexer.getContadorTres());
        cuatroVocales.setText("Cantidad 4 vocales: " + lexer.getContadorCuatro());
        cincoVocales.setText("Cantidad 5 vocales: " + lexer.getContadorCinco());
        mostar();
        if(lexer.conError()>1){
            JOptionPane.showMessageDialog(null, "Se detecto un caracter no alfanumerico, es decir no es numero ni letra");
            System.out.println("ee");
        }
    }//GEN-LAST:event_ContarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Contar;
    private javax.swing.JLabel cincoVocales;
    private javax.swing.JLabel cuatroVocales;
    private javax.swing.JLabel dosVocales;
    private javax.swing.JTextArea entrada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable mitabla;
    private javax.swing.JLabel tresVocales;
    private javax.swing.JLabel unaVocal;
    // End of variables declaration//GEN-END:variables
}