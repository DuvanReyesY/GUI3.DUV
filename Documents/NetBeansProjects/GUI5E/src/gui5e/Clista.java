/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui5e;

import javax.swing.DefaultListModel;

/**
 *
 * @author USER
 */
public class Clista extends javax.swing.JFrame {

    /**
     * Creates new form Clista
     */
    public Clista() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        lstNombres = new javax.swing.JList<>();
        etiResultado = new javax.swing.JLabel();
        btnCurso1 = new javax.swing.JButton();
        btnCurso2 = new javax.swing.JButton();
        btnVaciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lstNombres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lstNombres.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lstNombres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Clista.this.mouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstNombres);

        etiResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCurso1.setText("Curso 1");
        btnCurso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurso1ActionPerformed(evt);
            }
        });

        btnCurso2.setText("Curso 2");
        btnCurso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurso2ActionPerformed(evt);
            }
        });

        btnVaciar.setText("Vaciar");
        btnVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarActionPerforme(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCurso1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCurso2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnVaciar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(etiResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(etiResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addComponent(btnCurso1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCurso2)
                    .addComponent(btnVaciar))
                .addContainerGap(192, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCurso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurso2ActionPerformed
        DefaultListModel modelo = new DefaultListModel();
        modelo.addElement("Ana");
        modelo.addElement("Marta");
        modelo.addElement("Jose");
        lstNombres.setModel(modelo);  

    }//GEN-LAST:event_btnCurso2ActionPerformed

    private void btnCurso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurso1ActionPerformed
        DefaultListModel modelo = new DefaultListModel();
        modelo.addElement("Juan");
        modelo.addElement("María");
        modelo.addElement("Luis");
        lstNombres.setModel(modelo);



    }//GEN-LAST:event_btnCurso1ActionPerformed

    private void mouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClicked
        etiResultado.setText(lstNombres.getSelectedValue().toString());
    }//GEN-LAST:event_mouseClicked

    private void btnVaciarActionPerforme(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarActionPerforme
         DefaultListModel modelo = new DefaultListModel();
         modelo.addElement("");
         lstNombres.setModel(modelo);
         etiResultado.setText("");
    }//GEN-LAST:event_btnVaciarActionPerforme

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCurso1;
    private javax.swing.JButton btnCurso2;
    private javax.swing.JButton btnVaciar;
    private javax.swing.JLabel etiResultado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstNombres;
    // End of variables declaration//GEN-END:variables
}
