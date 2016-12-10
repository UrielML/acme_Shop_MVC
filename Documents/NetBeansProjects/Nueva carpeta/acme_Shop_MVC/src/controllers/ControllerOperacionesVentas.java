/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import models.ModelOperacionesVentas;
import views.ViewAcercaDe;
import views.ViewOperacionesVentas;
import models.ModelIniciarSeccion;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ControllerOperacionesVentas  implements ActionListener {
ViewOperacionesVentas viewOperacionesVentas;
   ModelOperacionesVentas modelOperacionesVentas;
   ModelIniciarSeccion modelIniciarSeccion;

    public ControllerOperacionesVentas(ViewOperacionesVentas viewOperacionesVentas, ModelOperacionesVentas modelOperacionesVentas,ModelIniciarSeccion modelIniciarSeccion) {
        this.viewOperacionesVentas = viewOperacionesVentas;
        this.modelOperacionesVentas = modelOperacionesVentas;
        this.modelIniciarSeccion=modelIniciarSeccion;
        
        this.viewOperacionesVentas.jBuscarrfc.addActionListener(this);
                this.viewOperacionesVentas.jBidbuscar.addActionListener(this);
                this.viewOperacionesVentas.jBguardarventa.addActionListener(this);
              this.viewOperacionesVentas.jbagregar.addActionListener(this);
                            this.viewOperacionesVentas.jbborrar.addActionListener(this);


   leerdatos();
        initView();
    
    }
    
     private void initView() {
        viewOperacionesVentas.setVisible(true);
            modelOperacionesVentas.initValues();
   modelOperacionesVentas.setValues();
           modelOperacionesVentas.initValues1();
   modelOperacionesVentas.setValues1();
                     this.viewOperacionesVentas.jTnofact.setText(modelOperacionesVentas.GenerarNumeroFactura());

      this.viewOperacionesVentas.jTfecha.setText(""+this.modelOperacionesVentas.FechaActual());
    }
     
      private void showValues() {
        
     viewOperacionesVentas.jTid.setText("" + modelOperacionesVentas.getIdcliente());
        viewOperacionesVentas.jTcliente.setText(modelOperacionesVentas.getCliente());
        viewOperacionesVentas.jTrfc.setText(modelOperacionesVentas.getRfc());
        viewOperacionesVentas.jTdireccion.setText(modelOperacionesVentas.getEstado());    
         viewOperacionesVentas.jTtelefono.setText(""+modelOperacionesVentas.getTelefono());  
      }
      
      private void show(){
       viewOperacionesVentas.jTproductos.setText(modelOperacionesVentas.getProducto());  
        viewOperacionesVentas.jTprecio.setText(""+modelOperacionesVentas.getPrecio());  
        viewOperacionesVentas.jTidproductos.setText(""+modelOperacionesVentas.getIdproducto());  
                viewOperacionesVentas.jTstock.setText(""+modelOperacionesVentas.getStock());  


      
    }

     public void actionPerformed(ActionEvent g) {
        if (g.getSource() == viewOperacionesVentas.jBuscarrfc){  
        buscarRFC();
             viewOperacionesVentas.jTvendedor.setText(modelIniciarSeccion.getUsername());
        } else if (g.getSource() == viewOperacionesVentas.jBidbuscar){
               if(viewOperacionesVentas.jTcantidad.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "La cantidad no es valida");
        }
        else{
                   buscarid();
                   subtotal();           
        }
               
        }else if (g.getSource() == viewOperacionesVentas.jBguardarventa){
                               stock();
                
            if(viewOperacionesVentas.jTcliente.getText().isEmpty() ){
                              JOptionPane.showMessageDialog(null, "intrega el nombre del cliente");

            }else {
                                  modelOperacionesVentas.begin();
                          guardardetalleVentas();     
            }
        }else if (g.getSource() == viewOperacionesVentas.jbagregar){
                 modelOperacionesVentas.commit();  
                ventas();
                   aggregar();
                     initView();
                  
                    System.out.println(modelOperacionesVentas.cantidad);
                  
                   
        }else if (g.getSource() == viewOperacionesVentas.jbborrar){
                     
     System.out.println(modelIniciarSeccion.getPassword());

     String test1= JOptionPane.showInputDialog("por favor ingresa su contrasena ");
                if(modelIniciarSeccion.getPassword().equals(test1)){
                    
                if(viewOperacionesVentas.jT.getText()=="junior") {
                            modelOperacionesVentas.roll();
                                                             JOptionPane.showMessageDialog(null, " esta permitido");
          eliminar();
                                                             JOptionPane.showMessageDialog(null, "ya esta");

                                        aggregar();
                                   leerdatos();
                       }else{
                                        JOptionPane.showMessageDialog(null, "no esta permitido");
                        }
                    
        }
     }
     }
      public void buscarRFC(){    
    modelOperacionesVentas.buscar(Integer.parseInt(viewOperacionesVentas.jTrfcbuscar.getText()));
    showValues();   

}
    
      public void buscarid(){
          
    modelOperacionesVentas.busqueda(Integer.parseInt(viewOperacionesVentas.jTidproductos.getText()));
    show();   
}
      
      public void  subtotal(){
      
    this.modelOperacionesVentas.setCantidad(Integer.parseInt(viewOperacionesVentas.jTcantidad.getText()));
      this.modelOperacionesVentas.setPrecio(Double.parseDouble(viewOperacionesVentas.jTprecio.getText()));
        
         this.viewOperacionesVentas.jTtotal.setText(""+this.modelOperacionesVentas.subtotal()); 
        
}

 private void showRecords() {
        viewOperacionesVentas.jtbledetalle.setModel(modelOperacionesVentas.tableModel);
        modelOperacionesVentas.populateTable();
    }
   private void aggregar() {       
        viewOperacionesVentas.jTproductos.setText("");
        viewOperacionesVentas.jTprecio.setText("");
        viewOperacionesVentas.jTcantidad.setText("");
        viewOperacionesVentas.jTtotal.setText("");
          viewOperacionesVentas.jTidproductos.setText("");
          viewOperacionesVentas.jTid.setText("");
        viewOperacionesVentas.jTcliente.setText("");
        viewOperacionesVentas.jTrfc.setText("");
        viewOperacionesVentas.jTdireccion.setText("");
          viewOperacionesVentas.jTtelefono.setText("");
             viewOperacionesVentas.jTrfcbuscar.setText("");
                 viewOperacionesVentas.jTsubtotal.setText("");
          viewOperacionesVentas.jTiva.setText("");
             viewOperacionesVentas.jTdesc.setText("");
                          viewOperacionesVentas.jTttotalfinal.setText("");
                          viewOperacionesVentas.jTstock.setText("");
                       //  viewOperacionesVentas.jtbledetalle.setModel(null);
                          modelOperacionesVentas.act();
    }
   private double redondear(double num){
    return Math.rint(num*100)/100;
   
   } 
         
   private void tot(){
   double s =0,ivg,tot,tott;
           if (viewOperacionesVentas.jTdesc.getText().isEmpty()){

   for (int i=0;i<viewOperacionesVentas.jtbledetalle.getRowCount(); i++){
   s=s+Double.parseDouble(modelOperacionesVentas.tableModel.getValueAt(i,4).toString());
   }
   s=redondear(s);
   viewOperacionesVentas.jTsubtotal.setText(String.valueOf(s));
   ivg=0.03*s;
   ivg=redondear(ivg);
   tot=s+ivg;
   tot=redondear(tot);
  viewOperacionesVentas. jTiva.setText(String.valueOf(ivg));
   viewOperacionesVentas. jTttotalfinal.setText(String.valueOf(tot));
   
   }else{
            double desc = Double.parseDouble(viewOperacionesVentas.jTdesc.getText());

   for (int i=0;i<viewOperacionesVentas.jtbledetalle.getRowCount(); i++){
   s=s+Double.parseDouble(modelOperacionesVentas.tableModel.getValueAt(i,4).toString());
   }
   s=redondear(s);
   viewOperacionesVentas.jTsubtotal.setText(String.valueOf(s));
   ivg=0.03*s;
   ivg=redondear(ivg);
   tot=(s+ivg)-((s+ivg)*(desc/100));
   //tott=tot*desc/100;
   tot=redondear(tot);
  viewOperacionesVentas. jTiva.setText(String.valueOf(ivg));
   viewOperacionesVentas. jTttotalfinal.setText(String.valueOf(tot));
           }
   }

   public void  leerdatos(){
     viewOperacionesVentas.jtbledetalle.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

         @Override
         
         public void valueChanged(ListSelectionEvent g) {
             
             if(viewOperacionesVentas.jtbledetalle.getSelectedRow() != -1){ 
                 
             int fila=viewOperacionesVentas.jtbledetalle.getSelectedRow() ;
             
             viewOperacionesVentas.jTproductos.setText( viewOperacionesVentas.jtbledetalle.getValueAt(fila, 1).toString());
              viewOperacionesVentas.jTprecio.setText(viewOperacionesVentas.jtbledetalle.getValueAt(fila, 2).toString());
               viewOperacionesVentas.jTcantidad.setText(viewOperacionesVentas.jtbledetalle.getValueAt(fila, 3).toString());
               viewOperacionesVentas.jTtotal.setText(viewOperacionesVentas.jtbledetalle.getValueAt(fila, 4).toString());
              viewOperacionesVentas.jTidproductos.setText(viewOperacionesVentas.jtbledetalle.getValueAt(fila, 0).toString());
               
             }
         }
     });
    }
   
   private void stock() {                                             
        Double c = Double.parseDouble(viewOperacionesVentas.jTstock.getText());
        int b = Integer.parseInt(viewOperacionesVentas.jTcantidad.getText());
                int s=0;
        if(!viewOperacionesVentas.jTcantidad.getText().equals("0") )
        {
            if (c >= b)
            {            
              showRecords();
                   tot();
                     for (int i=0;i<viewOperacionesVentas.jtbledetalle.getRowCount(); i++){
   s=s+Integer.parseInt(modelOperacionesVentas.tableModel.getValueAt(i,3).toString());
                      System.out.println(s);
                      if(s<c){
                   int d=(int) (c-b);
                modelOperacionesVentas.connection.executeUpdate("update productos set existencias=' " +d+" ' where id_producto=' "+viewOperacionesVentas.jTidproductos.getText()+ " ' ;");
           
                      }else{
                                      JOptionPane.showMessageDialog(null, "no se puede");

                      }
             }
            
            }
            else
            {
                JOptionPane.showMessageDialog(null, "El stock del articulo no soporta la venta por favor actualize en stock");
            }
        }
            else
            {
            JOptionPane.showMessageDialog(null, "La cantidad no es valida");
            }
   }

     public void ventas() {
    String add = "INSERT INTO ventas (`usuario`,`no_factura`,`id_cliente`,`fecha`,`iva`,`total`)"+ " VALUES ( '"+viewOperacionesVentas.jTvendedor.getText()+"' ,  '"+viewOperacionesVentas.jTnofact.getText()+"','"+viewOperacionesVentas.jTid.getText()+"','"+viewOperacionesVentas.jTfecha.getText()+"' , '"+viewOperacionesVentas.jTiva.getText()+"', '"+viewOperacionesVentas.jTttotalfinal.getText()+"');";
    modelOperacionesVentas.connection.executeUpdate(add);
     
    }
       public void guardardetalleVentas() {
           
    String add = "INSERT INTO detalle_venta (`no_factura`,`id_producto`,`cantidad`,`precio`,`total`)"+ " VALUES ( '"+viewOperacionesVentas.jTnofact.getText()+"' ,  '"+viewOperacionesVentas.jTidproductos.getText()+"','"+viewOperacionesVentas.jTcantidad.getText()+"' ,'"+viewOperacionesVentas.jTprecio.getText()+"' ,  '"+viewOperacionesVentas.jTtotal.getText()+"');";
    modelOperacionesVentas.connection.executeUpdate(add);

           
    }
        public void eliminar(){
          DefaultTableModel modelo = (DefaultTableModel) viewOperacionesVentas.jtbledetalle.getModel();
    int fila = viewOperacionesVentas.jtbledetalle.getSelectedRow();
    if(fila>=0)
    {
          double s =0,ivg,tot;
      s=Double.parseDouble(viewOperacionesVentas.jTtotal.getText());

    //       }
  double  sub=(Double.parseDouble(viewOperacionesVentas.jTsubtotal.getText()))-s;
   viewOperacionesVentas.jTsubtotal.setText(String.valueOf(sub));

   ivg=(Double.parseDouble(viewOperacionesVentas.jTiva.getText())) - (0.03*s) ;   
   ivg=redondear(ivg);
   tot=sub+ivg;
   tot=redondear(tot);
  viewOperacionesVentas. jTiva.setText(String.valueOf(ivg));
   viewOperacionesVentas. jTttotalfinal.setText(String.valueOf(tot));
                         modelo.removeRow(fila);

    }
    else
    {
        JOptionPane.showMessageDialog(null, "No Selecciono ninguna fila");
    }
       
        }
      
 
       }

