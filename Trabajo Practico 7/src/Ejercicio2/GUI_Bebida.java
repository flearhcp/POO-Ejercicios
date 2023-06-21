package Ejercicio2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_Bebida extends JFrame {
    private JPanel panelImagenes,panelBotones;
    private JLabel etiqueta;
    private JButton botonCafe,botonJugo;

    public GUI_Bebida(){
        setLayout(new BorderLayout());
        setSize(400, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        armarPanelBotones();
        armarPanelImagenes();
        getContentPane().add(panelImagenes,BorderLayout.NORTH);
        getContentPane().add(panelBotones,BorderLayout.SOUTH);        
    }
    private void armarPanelBotones(){
        this.panelBotones = new JPanel(new FlowLayout());
        this.botonCafe = new JButton("Cafe"); this.botonJugo = new JButton("Jugo");
        Oyente oyente = new Oyente();
        botonCafe.addActionListener(oyente); botonJugo.addActionListener(oyente);
        this.panelBotones.setBackground(Color.BLACK);
        this.panelBotones.add(botonCafe);
        this.panelBotones.add(botonJugo);
    }
    private void armarPanelImagenes(){
        this.panelImagenes = new JPanel();
        this.etiqueta = new JLabel();
        this.etiqueta.setIcon(new ImageIcon("imagenes/cafe.gif"));
        this.panelImagenes.setBackground(Color.BLACK);
        this.panelImagenes.add(etiqueta);
    }

    private class Oyente implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            String valor = (String)evento.getActionCommand();
            etiqueta.setIcon(new ImageIcon("imagenes/"+valor+".gif"));
            panelImagenes.setBackground(Color.RED);
        }
    }
}
