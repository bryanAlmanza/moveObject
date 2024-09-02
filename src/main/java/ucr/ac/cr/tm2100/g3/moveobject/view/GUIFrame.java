/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.tm2100.g3.moveobject.view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author bombe
 */
public class GUIFrame extends JFrame{
    
   private JButton btnMover;
   //private JPanel canva;
   private PanelCanva panelCanva;
   
   public GUIFrame(int width, int height){
       
       this.setSize(width,height);
       this.setVisible(true);
       
   }//metodo constructor con parametros
   
   public GUIFrame(){
       
       this.btnMover=new JButton("Move object");
       
       this.panelCanva=new PanelCanva();
       this.add(this.panelCanva,BorderLayout.CENTER);
       this.panelCanva.setBackground(Color.pink);        
       //this.canva=new JPanel();
       //this.canva.setBackground(Color.red);
      // this.add(this.canva,BorderLayout.CENTER);
       this.add(this.btnMover,BorderLayout.SOUTH);
       this.setSize(400,400);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setVisible(true);
       
   }//metodo constructor
   
   
   
}//fin de la clase
