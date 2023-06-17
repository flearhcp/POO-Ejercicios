package BosquejoCalculadora;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BosquejoCalculadora extends JFrame {
    private JButton suma,resta,mult,div;
    private JLabel opcA,opcB,resultado;
    private JTextField a,b,res;
    private JPanel panelArriba,panelAbajo;

    public BosquejoCalculadora(){
        setLayout(new BorderLayout());
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.panelArriba = new JPanel(new GridLayout(3,2));
        this.panelAbajo = new JPanel(new FlowLayout());
        display();//Agrega el Display.
        botones();//Agrega los botones abajo.
        getContentPane().add(this.panelArriba,BorderLayout.NORTH);
        getContentPane().add(this.panelAbajo,BorderLayout.SOUTH);
    }

    private void display(){//Hace el Display.
        this.opcA = new JLabel("Opcion A");
        this.opcB = new JLabel("Opcion B");
        this.resultado = new JLabel("Resultado");
        this.a = new JTextField();
        this.b = new JTextField();
        this.res = new JTextField();
        this.res.setEnabled(false);
        this.panelArriba.add(this.opcA);this.panelArriba.add(this.a);
        this.panelArriba.add(this.opcB);this.panelArriba.add(this.b);
        this.panelArriba.add(this.resultado);this.panelArriba.add(this.res);
    }
    private void botones(){//Hace los botones.
        this.suma = new JButton("+");
        this.resta = new JButton("-");
        this.mult = new JButton("*");
        this.div = new JButton("/");
        OyenteSuma hacerSuma = new OyenteSuma();
        this.suma.addActionListener(hacerSuma);
        OyenteResta hacerResta = new OyenteResta();
        this.resta.addActionListener(hacerResta);
        OyenteMult hacerMult = new OyenteMult();
        this.mult.addActionListener(hacerMult);
        OyenteDiv hacerDiv = new OyenteDiv();
        this.div.addActionListener(hacerDiv);
        this.panelAbajo.add(this.suma);
        this.panelAbajo.add(this.resta);
        this.panelAbajo.add(this.mult);
        this.panelAbajo.add(this.div);
    }
    class OyenteSuma implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            String opc1 = a.getText();
            String opc2 = b.getText();
            double o1 = Double.parseDouble(opc1);
            double o2 = Double.parseDouble(opc2);
            double r = (o1 + o2);//r: Resultado.
            res.setText(Double.toString(r));
        }
    }
    class OyenteResta implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            String opc1 = a.getText();
            String opc2 = b.getText();
            double o1 = Double.parseDouble(opc1);
            double o2 = Double.parseDouble(opc2);
            double r = (o1 - o2);//r: Resultado.
            res.setText(Double.toString(r));
        }
    }
    class OyenteMult implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            String opc1 = a.getText();
            String opc2 = b.getText();
            double o1 = Double.parseDouble(opc1);
            double o2 = Double.parseDouble(opc2);
            double r = (o1 * o2);
            res.setText(Double.toString(r));
        }
    }
    class OyenteDiv implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            String opc1 = a.getText();
            String opc2 = b.getText();
            double o1 = Double.parseDouble(opc1);
            double o2 = Double.parseDouble(opc2);
            double r = (o1 / o2);
            res.setText(Double.toString(r));
        }
    }
}
