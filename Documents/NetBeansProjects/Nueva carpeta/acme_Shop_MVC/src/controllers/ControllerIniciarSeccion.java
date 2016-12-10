/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controllers;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import models.ModelIniciarSeccion;
import views.ViewIniciarSeccion;
import views.ViewMain;
import views.ViewUsuarios;


/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ControllerIniciarSeccion implements ActionListener{
       ViewIniciarSeccion viewIniciarSeccion;
    ModelIniciarSeccion modelIniciarSeccion;
            ViewMain viewMain;
            ViewUsuarios viewUsuarios;


    public ControllerIniciarSeccion(ViewIniciarSeccion viewIniciarSeccion, ModelIniciarSeccion modelIniciarSeccion, ViewMain viewMain,ViewUsuarios viewUsuarios) {
        this.viewIniciarSeccion = viewIniciarSeccion;
        this.modelIniciarSeccion = modelIniciarSeccion;
        this.viewMain = viewMain;
       this. viewUsuarios=viewUsuarios;
        
        this.viewIniciarSeccion.jBlogin.addActionListener(this);
        initView();
         }
 
      @Override
    public void actionPerformed(ActionEvent g) {
    
         //  if (g.getSource() == viewIniciarSeccion.jBlogin) || g.getSource() == viewIniciarSeccion.jPassword) {
                if (g.getSource() == viewIniciarSeccion.jBlogin || g.getSource() == viewIniciarSeccion.jPassword) {
                    essaie();
                }
                }
public void essaie(){
                    if(viewIniciarSeccion.jBlogin.getText().compareTo("Login")==0){

   viewIniciarSeccion.jBlogin.setText("Logout");

            modelIniciarSeccion.username = viewIniciarSeccion.jTusuario.getText();
            modelIniciarSeccion.password = viewIniciarSeccion.jPassword.getText();
            if (modelIniciarSeccion.validateUser()) {
                JOptionPane.showMessageDialog(null, "Welcome.");
                  if (modelIniciarSeccion.level.equals("gerente")) {    
                     
          //      if (modelIniciarSeccion.connection.getString("tipo").equals("gerente")) { //level = connection.getString("tipo");
                 System.out.print("lolo");
                           //         menuView.jmi_products.setEnabled(true);

                  viewMain.jMreportes.setEnabled(true);
                    viewMain.jMarchivos.setEnabled(true);
                        viewMain.jMoperaciones.setEnabled(true);
                        viewMain.jmusuario.setEnabled(true);
                        viewMain.jMcatalogos.setEnabled(true);
                } 
                  else if (modelIniciarSeccion.level.equals("caja")) {
              //  else if (modelIniciarSeccion.connection.getString("tipo").equals("caja")) {
                    System.out.print("didi");
                    viewMain.jMoperaciones.setEnabled(true);
                }
            }
            else {
                 JOptionPane.showMessageDialog(null, "no esta registrado en la base de datos");
            }
        }
      //  else if (g.getSource() == viewIniciarSeccion.jTusuario) {
        //    viewIniciarSeccion.jPassword.setCursor(null);
          
    else{
   
      viewMain.jMreportes.setEnabled(false);
                    viewMain.jMarchivos.setEnabled(true);
                        viewMain.jMoperaciones.setEnabled(false);
                        viewMain.jmusuario.setEnabled(false);
                        viewMain.jMcatalogos.setEnabled(false);
                         viewIniciarSeccion.jPassword.setText("");
                         viewIniciarSeccion.jTusuario.setText("");
                           viewIniciarSeccion.jBlogin.setText("Login");
                    }

        }

                    
    
    
    private void initView() {
        viewIniciarSeccion.setVisible(true);
        modelIniciarSeccion.initValues();
     
    }
  /*  public void habilitar(){
    viewMain.jmusuario.setEnabled(true);
    }
     public void deshabilitar(){
    viewMain.jMprovedores.setEnabled(false);
    }*/
}

   


