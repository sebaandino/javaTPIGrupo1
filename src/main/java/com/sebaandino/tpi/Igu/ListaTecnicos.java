
package com.sebaandino.tpi.Igu;

import com.sebaandino.tpi.Models.Controladora;
import com.sebaandino.tpi.Models.Tecnico;
import com.sebaandino.tpi.Utils.JOptionPaneUtil;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class ListaTecnicos extends javax.swing.JFrame {
    
    Controladora control;

    public ListaTecnicos() {
        initComponents();
        control = new Controladora();
        cargarTabla();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTecnicos = new javax.swing.JTable();
        btnAtras = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Listado de Tecnicos:");

        tblTecnicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTecnicos);

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAtras)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar)
                            .addComponent(btnEditar))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)))
                .addGap(18, 18, 18)
                .addComponent(btnAtras)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        //si la tabla esta vacia
        if(tblTecnicos.getRowCount() < 0 ){
            JOptionPaneUtil.mostrarMensaje("La trabla està vacia", JOptionPaneUtil.TipoMensaje.ERROR);
            return;
        }
        //si no hay ninguna fila seleccionada
        if(tblTecnicos.getSelectedRow() == -1){
            JOptionPaneUtil.mostrarMensaje("No selecciono tecnico a eliminar", JOptionPaneUtil.TipoMensaje.ERROR);
            return;
        }
        
                try{
                int idTecnico = (int) tblTecnicos.getValueAt(tblTecnicos.getSelectedRow(), 0);
                control.EliminarTecnico(idTecnico);
                JOptionPaneUtil.mostrarMensaje("Tecnico eliminado", JOptionPaneUtil.TipoMensaje.INFORMATIVO);
                }catch(Exception e){
                JOptionPaneUtil.mostrarMensaje("No se puede eliminar este Tecnico,tiene insidentes pendientes", JOptionPaneUtil.TipoMensaje.ERROR);
                return;
                }
                cargarTabla();
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(tblTecnicos.getRowCount() > 0 ){
            if(tblTecnicos.getSelectedRow() != -1){

                int idTecnico = (int) tblTecnicos.getValueAt(tblTecnicos.getSelectedRow(), 0);
                EditarTecnico editarTecnico = new EditarTecnico(idTecnico);
                editarTecnico.setVisible(true);
                editarTecnico.setLocationRelativeTo(null);
                this.dispose();
            } else {
                JOptionPaneUtil.mostrarMensaje("No selecciono ningun tecnico", JOptionPaneUtil.TipoMensaje.INFORMATIVO);
            }
        } else {
            JOptionPaneUtil.mostrarMensaje("No hay datos", JOptionPaneUtil.TipoMensaje.INFORMATIVO);

        }
    }//GEN-LAST:event_btnEditarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTecnicos;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel(){
            public boolean isCellEditable(int column,int row){
                return false;
            }
        };
        
        
        String titulos[] = {"Id Tecnico","Nombre","Apellido","Especialidad"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        List<Tecnico> listaTecnicos = control.traerTecnicos();
        
        if(listaTecnicos != null){
            for(Tecnico tecnico : listaTecnicos){
                Object[] obj = {tecnico.getIdTecnico(),tecnico.getNombre(),tecnico.getApellido(),tecnico.getCategoria()};
                modeloTabla.addRow(obj);
            }
            
            tblTecnicos.setModel(modeloTabla);
        }
    }
}
