/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.tm2100.g3.moveobject.view;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author bombe
 */
public class PanelCanva extends JPanel{
    
    private int x;
    private int y;

    public PanelCanva() {
        this.x=20;
        this.y=20;
        
    }//fin del metodo constructor
    
    @Override
    protected void paintComponent(Graphics g)/* indica al panel ue el metodo se sobreescribe*/{
    super.paintComponent(g);//implementa paint component
    g.setColor(Color.lightGray);
    g.fillOval(x, y, 25, 25);
    g.fillRect(50, 100, 50, 30);
    
    }//metodo protejido por herencia. Metodo abstracto.
    
}//fin de la clase
