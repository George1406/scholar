

package scholar;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Formulario extends JFrame {
    
    public Formulario(){
        
        this.setSize(500, 500); //tamaño de la ventana de formulario
        setTitle (" FORMULARIO ");
        setBounds(100, 200, 500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        
        JLabel etiqueta = new JLabel ("NOMBRE");
        JTextField text = new JTextField(20);
        JButton boton = new JButton ("ESCRIBIR");
        cp.add(etiqueta);
        cp.add(text);
        cp.add(boton);
        
        Container dc = getContentPane();
        dc.setLayout(new FlowLayout());
        
        
    }
}
