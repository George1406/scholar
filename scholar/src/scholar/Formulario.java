

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
        JTextField texto = new JTextField(20);
        cp.add(etiqueta);
        cp.add(texto);
        
        JLabel etiqueta2 = new JLabel ("APELLIDO");
        JTextField text2 = new JTextField(20);
        cp.add(etiqueta2);
        cp.add(text2);
        
        JLabel etiqueta3 = new JLabel ("DIRECCION");
        JTextField text3 = new JTextField(20);
        cp.add (etiqueta3);
        cp.add(text3);
        
        JLabel etiqueta4 = new JLabel ("TIPO DE SANGRE");
        JTextField text4 = new JTextField(20);
        cp.add (etiqueta4);
        cp.add(text4);
        
        JLabel etiqueta5 = new JLabel ("IDENTIFICACION");
        JTextField text5 = new JTextField(20);
        cp.add (etiqueta5);
        cp.add(text5);
        
        JLabel etiqueta6 = new JLabel ("TELEFONO");
        JTextField text6 = new JTextField(20);
        cp.add (etiqueta6);
        cp.add(text6);
        
        JLabel etiqueta7 = new JLabel ("EMAIL");
        JTextField text7 = new JTextField(20);
        cp.add (etiqueta7);
        cp.add(text7);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
