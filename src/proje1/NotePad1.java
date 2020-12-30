
package proje1;
import javax.swing.JFrame;

public class NotePad1 {
    public static void main(String[] args) {
        NotePad obj=new NotePad();
        obj.setBounds(0,0,500,500);
        obj.setTitle("Notepad");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    
}
