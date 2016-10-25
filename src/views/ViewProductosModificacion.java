/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ViewProductosModificacion extends javax.swing.JPanel {

    /**
     * Creates new form View_Productos_Modificacion
     */
    public ViewProductosModificacion() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTidproducto = new javax.swing.JTextField();
        jtproducto = new javax.swing.JTextField();
        jtdescricion = new javax.swing.JTextField();
        jtpreciocompra = new javax.swing.JTextField();
        jtprecioventa = new javax.swing.JTextField();
        jtexistencias = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jbsiguiente = new javax.swing.JButton();
        jbultimo = new javax.swing.JButton();
        jbprimero = new javax.swing.JButton();
        jbanterior = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jbagregar = new javax.swing.JButton();
        jbborrar = new javax.swing.JButton();
        jbguadar = new javax.swing.JButton();
        jbeditar = new javax.swing.JButton();
        jbtn_test = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMaximumSize(new java.awt.Dimension(500, 500));
        setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "PRODUCTO", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("ID_Producto");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Producto");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Descripcion");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Precio_Compra");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Precio_Venta");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Existencias");

        jTidproducto.setBackground(new java.awt.Color(204, 204, 255));
        jTidproducto.setForeground(new java.awt.Color(0, 0, 153));
        jTidproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTidproductoActionPerformed(evt);
            }
        });

        jtproducto.setBackground(new java.awt.Color(204, 204, 255));
        jtproducto.setForeground(new java.awt.Color(0, 0, 153));

        jtdescricion.setBackground(new java.awt.Color(204, 204, 255));
        jtdescricion.setForeground(new java.awt.Color(0, 0, 153));

        jtpreciocompra.setBackground(new java.awt.Color(204, 204, 255));
        jtpreciocompra.setForeground(new java.awt.Color(0, 0, 153));
        jtpreciocompra.setToolTipText("precio en peso");

        jtprecioventa.setBackground(new java.awt.Color(204, 204, 255));
        jtprecioventa.setForeground(new java.awt.Color(0, 0, 153));
        jtprecioventa.setToolTipText("precio en peso ");

        jtexistencias.setBackground(new java.awt.Color(204, 204, 255));
        jtexistencias.setForeground(new java.awt.Color(0, 0, 153));
        jtexistencias.setToolTipText("numero de productos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtdescricion, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtpreciocompra, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtprecioventa, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtexistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTidproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtdescricion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jtpreciocompra, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtprecioventa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtexistencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1);
        jPanel1.setBounds(10, 6, 383, 262);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "OPCION", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(0, 0, 153))); // NOI18N

        jbsiguiente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbsiguiente.setText(">>");
        jbsiguiente.setToolTipText("Siguiente");
        jbsiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsiguienteActionPerformed(evt);
            }
        });

        jbultimo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbultimo.setText(">|");
        jbultimo.setToolTipText("Último");

        jbprimero.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbprimero.setText("|<");
        jbprimero.setToolTipText("Primero");

        jbanterior.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbanterior.setText("<<");
        jbanterior.setToolTipText("Anterior");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jbprimero, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbanterior, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbsiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbprimero)
                    .addComponent(jbanterior)
                    .addComponent(jbsiguiente)
                    .addComponent(jbultimo))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        add(jPanel2);
        jPanel2.setBounds(10, 286, 460, 80);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Botton", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(0, 0, 153)))); // NOI18N

        jbagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/agr2.png"))); // NOI18N
        jbagregar.setText("Agregar");
        jbagregar.setBorder(null);
        jbagregar.setBorderPainted(false);
        jbagregar.setContentAreaFilled(false);
        jbagregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbagregar.setIconTextGap(-3);
        jbagregar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/agr3.png"))); // NOI18N
        jbagregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/agr1.png"))); // NOI18N
        jbagregar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbagregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbagregarActionPerformed(evt);
            }
        });

        jbborrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/del2.png"))); // NOI18N
        jbborrar.setText("Borrar");
        jbborrar.setBorder(null);
        jbborrar.setBorderPainted(false);
        jbborrar.setContentAreaFilled(false);
        jbborrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbborrar.setIconTextGap(-3);
        jbborrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/del3.png"))); // NOI18N
        jbborrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/del1.png"))); // NOI18N
        jbborrar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbborrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jbguadar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sav2.png"))); // NOI18N
        jbguadar.setText("Save");
        jbguadar.setBorder(null);
        jbguadar.setBorderPainted(false);
        jbguadar.setContentAreaFilled(false);
        jbguadar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbguadar.setIconTextGap(-3);
        jbguadar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sav3.png"))); // NOI18N
        jbguadar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sav1.png"))); // NOI18N
        jbguadar.setVerifyInputWhenFocusTarget(false);
        jbguadar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbguadar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jbeditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ed2.png"))); // NOI18N
        jbeditar.setText("Editar");
        jbeditar.setBorder(null);
        jbeditar.setBorderPainted(false);
        jbeditar.setContentAreaFilled(false);
        jbeditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbeditar.setIconTextGap(-3);
        jbeditar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ed3.png"))); // NOI18N
        jbeditar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ed1.png"))); // NOI18N
        jbeditar.setVerifyInputWhenFocusTarget(false);
        jbeditar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbeditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jbtn_test.setText("test");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbagregar)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbborrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbguadar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jbeditar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtn_test, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbagregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbborrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbguadar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbeditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jbtn_test)
                .addGap(24, 24, 24))
        );

        add(jPanel3);
        jPanel3.setBounds(498, 6, 105, 370);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo.png"))); // NOI18N
        add(jLabel7);
        jLabel7.setBounds(0, 0, 610, 390);
    }// </editor-fold>//GEN-END:initComponents

    private void jTidproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTidproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTidproductoActionPerformed

    private void jbsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsiguienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbsiguienteActionPerformed

    private void jbagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbagregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbagregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTextField jTidproducto;
    public javax.swing.JButton jbagregar;
    public javax.swing.JButton jbanterior;
    public javax.swing.JButton jbborrar;
    public javax.swing.JButton jbeditar;
    public javax.swing.JButton jbguadar;
    public javax.swing.JButton jbprimero;
    public javax.swing.JButton jbsiguiente;
    public javax.swing.JButton jbtn_test;
    public javax.swing.JButton jbultimo;
    public javax.swing.JTextField jtdescricion;
    public javax.swing.JTextField jtexistencias;
    public javax.swing.JTextField jtpreciocompra;
    public javax.swing.JTextField jtprecioventa;
    public javax.swing.JTextField jtproducto;
    // End of variables declaration//GEN-END:variables
}
