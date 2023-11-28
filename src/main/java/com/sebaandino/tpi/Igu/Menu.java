
package com.sebaandino.tpi.Igu;

import com.sebaandino.tpi.Models.Cliente;
import com.sebaandino.tpi.Models.Controladora;
import com.sebaandino.tpi.Utils.JOptionPaneUtil;
import java.util.Date;

public class Menu extends javax.swing.JFrame {
    
    public Menu() {
        initComponents();
    }
    
    Controladora control = new Controladora();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAltaCliente1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAltaTecnico = new javax.swing.JButton();
        btnAltaCliente = new javax.swing.JButton();
        btnListaTecnicos = new javax.swing.JButton();
        txtDni = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnListaClientes = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        btnAltaCategoria = new javax.swing.JButton();
        btnAltaInsidente = new javax.swing.JButton();
        btnListaCategorias = new javax.swing.JButton();
        btnListaIncidencias = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jdcFechaInicio = new com.toedter.calendar.JDateChooser();
        jdcFechaFin = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnBuscarFecha = new javax.swing.JButton();

        btnAltaCliente1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAltaCliente1.setText("Lista Clientes");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.png"))); // NOI18N
        jLabel1.setText("Menu");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnAltaTecnico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAltaTecnico.setText("Alta Tecnico");
        btnAltaTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaTecnicoActionPerformed(evt);
            }
        });

        btnAltaCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAltaCliente.setText("Alta Cliente");
        btnAltaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaClienteActionPerformed(evt);
            }
        });

        btnListaTecnicos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnListaTecnicos.setText("Lista Tecnicos");
        btnListaTecnicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaTecnicosActionPerformed(evt);
            }
        });

        txtDni.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/searchPNG.png"))); // NOI18N
        btnBuscar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/searchmagnifierinterfacesymbol1_79893.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnListaClientes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnListaClientes.setText("Lista Clientes");
        btnListaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaClientesActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Buscar Cliente por dni:");

        btnAltaCategoria.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAltaCategoria.setText("Alta Categoria");
        btnAltaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaCategoriaActionPerformed(evt);
            }
        });

        btnAltaInsidente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAltaInsidente.setText("Alta Incidente");
        btnAltaInsidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaInsidenteActionPerformed(evt);
            }
        });

        btnListaCategorias.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnListaCategorias.setText("Lista Categorias");
        btnListaCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaCategoriasActionPerformed(evt);
            }
        });

        btnListaIncidencias.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnListaIncidencias.setText("Lista Incidencias");
        btnListaIncidencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaIncidenciasActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Buscar insidentes entre fechas:");

        jdcFechaInicio.setDateFormatString("yyyy-MM-dd");

        jdcFechaFin.setDateFormatString("yyyy-MM-dd");

        jLabel4.setText("Fecha Inicio");

        jLabel5.setText("Fecha Fin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnAltaTecnico, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAltaCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAltaCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnListaClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnListaTecnicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnListaCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnAltaInsidente, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnListaIncidencias, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 35, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jdcFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jdcFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnListaClientes, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAltaCliente))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnListaTecnicos)
                    .addComponent(btnAltaTecnico))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAltaCategoria)
                    .addComponent(btnListaCategorias))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAltaInsidente)
                    .addComponent(btnListaIncidencias))
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btnSalir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnBuscarFecha.setText("Buscar");
        btnBuscarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(btnBuscarFecha)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscarFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaClientesActionPerformed

        ListaClientes listaClientes = new ListaClientes();
        listaClientes.setVisible(true);
        listaClientes.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnListaClientesActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void btnListaTecnicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaTecnicosActionPerformed
        ListaTecnicos listaTecnicos = new ListaTecnicos();
        listaTecnicos.setVisible(true);
        listaTecnicos.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnListaTecnicosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAltaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaClienteActionPerformed
        AltaCliente altaCliente = new AltaCliente();
        altaCliente.setVisible(true);
        altaCliente.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAltaClienteActionPerformed

    private void btnAltaTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaTecnicoActionPerformed
        AltaTecnico altaTecnico = new AltaTecnico();
        altaTecnico.setVisible(true);
        altaTecnico.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAltaTecnicoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       
        String dniString = txtDni.getText();
        
        if(dniString.isEmpty()){
            JOptionPaneUtil.mostrarMensaje("Ingrese el dni a buscar!", JOptionPaneUtil.TipoMensaje.ERROR);
            return;
        }
        
        if(!esSoloNumero(dniString)){
            JOptionPaneUtil.mostrarMensaje("Solo se permiten ingresar numeros!", JOptionPaneUtil.TipoMensaje.ERROR);
            return;
        }
        
        int dniCliente = Integer.parseInt(txtDni.getText());
        
        Cliente cliente = control.traeCliente(dniCliente);
        
        if(cliente == null){
            JOptionPaneUtil.mostrarMensaje("El cliente no existe en la base de datos!", JOptionPaneUtil.TipoMensaje.ERROR);
            return;
        }
        
       infoCliente infoCliente = new infoCliente(dniCliente);
       infoCliente.setVisible(true);
       infoCliente.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAltaInsidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaInsidenteActionPerformed
        AltaInsidente altaInsidente = new AltaInsidente();
        altaInsidente.setVisible(true);
        altaInsidente.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAltaInsidenteActionPerformed

    private void btnAltaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaCategoriaActionPerformed
        AltaCategoria altaCategoria = new AltaCategoria();
        altaCategoria.setVisible(true);
        altaCategoria.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAltaCategoriaActionPerformed

    private void btnListaCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaCategoriasActionPerformed
        ListaCategorias listaCategorias = new ListaCategorias();
        listaCategorias.setVisible(true);
        listaCategorias.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnListaCategoriasActionPerformed

    private void btnListaIncidenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaIncidenciasActionPerformed
        ListaInsidencias listaInsidencias = new ListaInsidencias();
        listaInsidencias.setVisible(true);
        listaInsidencias.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnListaIncidenciasActionPerformed

    private void btnBuscarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFechaActionPerformed
        
        
        Date fechaInicio = jdcFechaInicio.getDate();
        Date fechaFin = jdcFechaFin.getDate();
        
        if(fechaInicio == null || fechaFin == null){
            JOptionPaneUtil.mostrarMensaje("Ingrese ambas fechas", JOptionPaneUtil.TipoMensaje.ERROR);
            return;
        }
        
        ListaInsidenciasEntreFechas insidentesEntreFechas = new ListaInsidenciasEntreFechas(fechaInicio,fechaFin);
        insidentesEntreFechas.setVisible(true);
        insidentesEntreFechas.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnBuscarFechaActionPerformed

     //expresion regular para numeros
     private boolean esSoloNumero(String numero) {
        return numero.matches("^[0123456789]+$");
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaCategoria;
    private javax.swing.JButton btnAltaCliente;
    private javax.swing.JButton btnAltaCliente1;
    private javax.swing.JButton btnAltaInsidente;
    private javax.swing.JButton btnAltaTecnico;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarFecha;
    private javax.swing.JButton btnListaCategorias;
    private javax.swing.JButton btnListaClientes;
    private javax.swing.JButton btnListaIncidencias;
    private javax.swing.JButton btnListaTecnicos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private com.toedter.calendar.JDateChooser jdcFechaFin;
    private com.toedter.calendar.JDateChooser jdcFechaInicio;
    private javax.swing.JTextField txtDni;
    // End of variables declaration//GEN-END:variables
}
