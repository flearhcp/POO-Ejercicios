package BotonRojoVerde;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class VentanaRojoVerde extends JFrame {
    private JButton BotonRojo,BotonVerde;
    private JPanel panelEste,panelOeste;

    public VentanaRojoVerde(){
        setLayout(new GridLayout());
        setSize(200, 120);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.panelEste = new JPanel(new FlowLayout());
        this.panelOeste = new JPanel(new FlowLayout());
        this.BotonRojo = new JButton("Rojo");
        this.BotonVerde = new JButton("Verde");
        OyenteBotonR ponerRojo = new OyenteBotonR();
        this.BotonRojo.addActionListener(ponerRojo);
        OyenteBotonV ponerVerde = new OyenteBotonV();
        this.BotonVerde.addActionListener(ponerVerde);
        this.panelOeste.add(BotonRojo);
        this.panelOeste.add(BotonVerde);
        getContentPane().add(panelOeste);
        getContentPane().add(panelEste);
    }

    class OyenteBotonR implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            panelEste.setBackground(Color.RED);
        }
    }
    class OyenteBotonV implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            panelEste.setBackground(Color.GREEN);
        }
    }
}
