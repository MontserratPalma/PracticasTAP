
package Diferentes_Metodos;

/**
 *
 * @author Monts
 */
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Metodo4 extends JFrame{
    JButton jBtn1;
    public Metodo4(){
        
        this.setSize(320, 200);
        jBtn1 = new JButton("Salir");
        this.add(jBtn1);
        
        jBtn1.addMouseListener(
                new MouseListener(){
                    
            public void actionPerformed(MouseEvent e) {
                System.exit(0);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                 
            }

            @Override
            public void mousePressed(MouseEvent e) {               
            }

            @Override
            public void mouseReleased(MouseEvent e) {              
            }

            @Override
            public void mouseEntered(MouseEvent e) {               
            }

            @Override
            public void mouseExited(MouseEvent e) {               
            }
           
                }
        );
        
    }
    
    public static void main(String[] args) {
        
        Metodo4 frame = new Metodo4();
         
        frame.setVisible(true);
    }
    
}
