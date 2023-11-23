
package com.sebaandino.tpi.Igu;

import com.sebaandino.tpi.Models.Cliente;
import com.sebaandino.tpi.Models.Controladora;
import com.sebaandino.tpi.Utils.JOptionPaneUtil;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class ListaClientes extends javax.swing.JFrame {
    
    Controladora control;

    public ListaClientes() {
        initComponents();
        control = new Controladora();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        btnAtras = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Listado de Clientes:");

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblClientes);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAtras)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar)
                            .addComponent(btnEditar)))
                    .addComponent(jLabel1))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtras)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        cargarTabla();
        
    }//GEN-LAST:event_formWindowOpened

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        //si la tabla no esta vacia
        if(tblClientes.getRowCount() > 0 ){
            //si no hay ninguna fila seleccionada
            if(tblClientes.getSelectedRow() != -1){
                int idCliente = (int) tblClientes.getValueAt(tblClientes.getSelectedRow(), 0);
                control.eliminarCliente(idCliente);
                cargarTabla();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        if(tblClientes.getRowCount() > 0 ){
            if(tblClientes.getSelectedRow() != -1){

                int idCliente = (int) tblClientes.getValueAt(tblClientes.getSelectedRow(), 0);
                EditarCliente editarCliente = new EditarCliente(idCliente);
                editarCliente.setVisible(true);
                editarCliente.setLocationRelativeTo(null);
                this.dispose();
            } else {
                JOptionPaneUtil.mostrarMensaje("No selecciono niingun cliente", JOptionPaneUtil.TipoMensaje.INFORMATIVO);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClientes;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel(){
            public boolean isCellEditable(int column,int row){
                return false;
            }
        };
        
        
        String titulos[] = {"dni Cliente","Nombre","Apellido"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        List<Cliente> listaClietes = control.traerClientes();
        
        if(listaClietes != null){
            for(Cliente cliente : listaClietes){
                Object[] obj = {cliente.getDni(),cliente.getNombre(),cliente.getApellido()};
                modeloTabla.addRow(obj);
            }
            
            tblClientes.setModel(modeloTabla);
        }
    }
}
