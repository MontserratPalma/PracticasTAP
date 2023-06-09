
package Diferentes_Metodos;

/**
 *
 * @author Monts
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Metodo3 extends JFrame{
    JButton jBtn1;
    public Metodo3(){
        
        this.setSize(320, 200);
        jBtn1 = new JButton("Salir");
        this.add(jBtn1);
        
        jBtn1.addActionListener(
                new ActionListener(){
                    
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
                    
                }
        );
        
    }
    
    public static void main(String[] args) {
        
        Metodo3 frame = new Metodo3();
         
        frame.setVisible(true);
    }
    
}
