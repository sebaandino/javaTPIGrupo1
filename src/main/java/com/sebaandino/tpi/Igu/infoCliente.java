
package com.sebaandino.tpi.Igu;

import com.sebaandino.tpi.Models.Cliente;
import com.sebaandino.tpi.Models.Controladora;
import com.sebaandino.tpi.Models.Insidente;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class infoCliente extends javax.swing.JFrame {
    //MATIX: el nombre de la clase me marca error, no entiendo por qué
    Controladora control;
   
    int dniCliente;
    
    public infoCliente(int dniCliente) {
        initComponents();
        this.dniCliente = dniCliente;
        control = new Controladora();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInsidentes = new javax.swing.JTable();
        txtDni = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Informacion del Cliente:");

        jScrollPane1.setViewportView(tblInsidentes);

        txtDni.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDni.setEnabled(false);
        txtDni.setRequestFocusEnabled(false);

        txtApellido.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtApellido.setEnabled(false);

        txtNombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNombre.setEnabled(false);
        txtNombre.setFocusable(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Dni:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Insidentes Vinculados:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText(",");

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
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
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtApellido, txtNombre});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btnAtras)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         
        //Traer al cliente que se busca
        
        Cliente cliente = control.traeCliente(dniCliente);
        
        //Cargar los datos en los txt
        
        txtDni.setText(String.valueOf(cliente.getDni()));
        txtNombre.setText(cliente.getNombre());
        txtApellido.setText(cliente.getApellido());
        
        //Cargar tabla con los insidentes vinculados al cliente buscado por dni
                cargarTabla();
    }//GEN-LAST:event_formWindowOpened

     private void cargarTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel(){
            public boolean isCellEditable(int column,int row){
                return false;
            }
        };
        
        
        String titulos[] = {"Id","Descripcion","Costo","Fecha Alta","Tecnico"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        List<Insidente> listaInsidetesFiltrada = control.traerInsidentes(dniCliente);
        
        if(listaInsidetesFiltrada != null){
            for(Insidente insidente : listaInsidetesFiltrada){
                Object[] obj = 
                {insidente.getId_insidente(),
                    insidente.getDescInsidente(),
                    insidente.getCosto(),
                    insidente.getFechaInsidente(), 
                    insidente.getIdTecnico().getNombre() + " " + insidente.getIdTecnico().getApellido(),
                };
                        
                modeloTabla.addRow(obj);
            }
            
            tblInsidentes.setModel(modeloTabla);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblInsidentes;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
