
package Diferentes_Metodos;

/**
 *
 * @author Monts
 */

import javax.swing.JButton;
import javax.swing.JFrame;

public class Metodo1 extends JFrame{
    
    JButton Button;
    
        Metodo1(){
        
        this.setSize(320, 200);
        Button = new JButton("Salir");
        Listener1 listener = new Listener1();
        Button.addActionListener(listener);
        this.add(Button); 
        
    }
     public static void main(String[] args) {
        Metodo1 frame = new Metodo1();
        
        frame.setVisible(true);
    }
}