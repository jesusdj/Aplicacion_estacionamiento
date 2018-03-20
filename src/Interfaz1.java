import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


// autor: Jesus David Dzul Encalada
public class Interfaz1 extends JFrame {



    // declaracion de todos los paneles
    private JPanel Vista1;
    private JPanel Vista2;
    private JPanel Vista3;
    private JPanel Vista4;

    // Declaracion de los botones
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
    private JButton ingresarButton;
    private JButton salirButton;
    private JButton a37Button;
    private JButton a38Button;
    private JButton a39Button;
    private JButton a40Button;
    private JButton a41Button;
    private JButton a42Button;
    private JButton a43Button;
    private JButton a44Button;
    private JButton a54Button;
    private JButton a53Button;
    private JButton a52Button;
    private JButton a51Button;
    private JButton a50Button;
    private JButton a49Button;
    private JButton a48Button;
    private JButton a47Button;
    private JButton a46Button;
    private JButton a45Button;
    private JButton a55Button;
    private JButton a56Button;
    private JButton a57Button;
    private JButton a58Button;
    private JButton a59Button;
    private JButton a60Button;
    private JButton a61Button;
    private JButton a62Button;
    private JButton a72Button;
    private JButton a71Button;
    private JButton a70Button;
    private JButton a69Button;
    private JButton a68Button;
    private JButton a67Button;
    private JButton a66Button;
    private JButton a65Button;
    private JButton a64Button;
    private JButton a63Button;
    private JButton a73Button;
    private JButton a74Button;
    private JButton a75Button;
    private JButton a76Button;
    private JButton a77Button;
    private JButton a78Button;
    private JButton a79Button;
    private JButton a80Button;
    private JButton a81Button;
    private JButton a82Button;
    private JButton a83Button;
    private JButton a84Button;
    private JButton a85Button;
    private JButton a86Button;
    private JButton a87Button;
    private JButton avanzarButton;
    private JButton opcion1Button;

    //Declaracion de los text field
    private JTextField Text1;
    private JTextField textField1;
    private JTextField textField2;



    public  Interfaz1() {







// etiqueta de panel

  Vista1.setBorder(BorderFactory.createTitledBorder("Parqueadero"));
        Vista2.setBorder(BorderFactory.createTitledBorder("Lugares de estacionamiento"));

  Vista3.setBorder(BorderFactory.createTitledBorder("Hora actual"));
  Vista4.setBorder(BorderFactory.createTitledBorder("Información"));







    }
    public static void main (String [ ] args)
    {

// creacion de objeto
        JFrame I1= new JFrame("Interfaz1");

        // intruccion para poder visualizar el panel Vista1
        I1.setContentPane(new Interfaz1().Vista1);
// intruccion para reducir en lo posible la interfaz
        I1.pack();
        // instruccion para detener el proceso de la aplicacion por completo
        I1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// intruccion para visualizar la interfaz grafica
        I1 .setVisible(true);









        /*Interfaz1  formulario=new Interfaz1 ();
        formulario.setSize(500,205);
        formulario.setVisible(true);
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/



        //Aquí las instrucciones del método



    }



}
