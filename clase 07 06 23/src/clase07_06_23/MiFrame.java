package clase07_06_23;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class MiFrame extends JFrame implements ActionListener{
    private JButton boton;
    private JLabel etiqueta1;
    private JLabel etiqueta2;
    private JTextField texto1;
    private JTextField texto2;
    private JPanel panel;
    private JPanel panel2;


    public MiFrame(){
        crearPanelGrid();
        crearPanelConBoton();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        getContentPane().add(this.panel,BorderLayout.NORTH);
        getContentPane().add(this.panel2,BorderLayout.CENTER);
        setSize(200, 200);
        boton.addActionListener(this);
    }
    public void crearPanelGrid(){
        this.etiqueta1 = new JLabel("Metros");
        this.etiqueta2 = new JLabel("Kilometros");
        this.texto1 = new JTextField();
        this.texto2 = new JTextField();
        this.panel = new JPanel(new GridLayout(2,2));
        this.panel.add(this.etiqueta1);this.panel.add(this.texto1);
        this.panel.add(this.etiqueta2);this.panel.add(this.texto2);
    }
    public void crearPanelConBoton(){
        this.boton = new JButton("Convertir");
        this.panel2 = new JPanel(new FlowLayout());
        this.panel2.add(this.boton);
    }
    public void calcularMetros(){
        String var1 = this.texto1.getText();
        double v1 = Double.parseDouble(var1);
        double v2 = (v1 /1000);
        this.texto2.setText(Double.toString(v2));
        this.boton.setText("Listo!!");
    }
    public void actionPerformed(ActionEvent arg0){
        calcularMetros();
    }
}
