import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Interfaz1 extends JFrame {
    private JButton a1Button;
    private JButton a2Button1;
    private JButton a3Button1;
    private JButton a4Button1;
    private JButton a5Button1;
    private JButton a6Button1;
    private JButton a7Button1;
    private JButton a8Button1;
    private JButton a9Button1;
    private JButton a10Button1;
    private JButton a11Button1;
    private JButton a12Button;
    private JButton a13Button;
    private JButton a14Button;
    private JButton a15Button;
    private JButton a16Button;
    private JButton a17Button;
    private JButton a18Button;
    private JButton a19Button;
    private JButton a20Button;
    private JButton a21Button;
    private JButton a22Button;
    private JButton a23Button;
    private JButton a24Button;
    private JButton a25Button;
    private JButton a26Button;
    private JButton a27Button;
    private JButton a28Button;
    private JButton a29Button;
    private JButton a30Button;
    private JButton a31Button;
    private JButton a32Button;
    private JButton a34Button;
    private JButton a35Button;
    private JButton a36Button;
    private JButton a33Button;



    public Interfaz1() {
        a1Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                super.mouseClicked(mouseEvent);
            }
        });
    }


    public static void main (String [ ] args) {

        //Interfaz1 I1=new Interfaz1();

        //I1.setVisible(true);
        //I1.setBounds(100,100,100,100);

        Interfaz1  formulario=new Interfaz1 ();
        formulario.setSize(500,205);
        formulario.setVisible(true);
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        //Aquí las instrucciones del método



    }

}
