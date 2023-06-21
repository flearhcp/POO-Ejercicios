package Ejercicio6;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_Dos_bebidas extends JFrame {
    private JPanel panelBotones,panelImagenes,panelContadores;
    private JButton botonJugo,botonCafe;
    private JLabel imagenJugo,imagenCafe,contadorCafe,contadorJugo;
    private int contadorC,contadorJ;

    public GUI_Dos_bebidas(){
        setLayout(new BorderLayout());
        setSize(400,320);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        crearPanelBotones();
        crearPanelImagenes();
        crearPanelContadores();
        getContentPane().add(panelImagenes,BorderLayout.NORTH);
        getContentPane().add(panelContadores,BorderLayout.CENTER);
        getContentPane().add(panelBotones,BorderLayout.SOUTH);
    }
    private void crearPanelBotones(){
        this.panelBotones = new JPanel(new FlowLayout());
        this.botonCafe = new JButton("Cafe"); this.botonJugo = new JButton("Jugo");
        OyenteCafe oyenteCafe = new OyenteCafe();
        this.botonCafe.addActionListener(oyenteCafe);
        OyenteJugo oyenteJugo = new OyenteJugo();
        this.botonJugo.addActionListener(oyenteJugo);
        this.panelBotones.add(botonCafe); this.panelBotones.add(botonJugo);
    }
    private void crearPanelImagenes(){
        this.panelImagenes = new JPanel(new GridLayout(1, 2));
        this.imagenCafe = new JLabel();
        this.imagenJugo = new JLabel();
        this.panelImagenes.add(this.imagenCafe);
        this.panelImagenes.add(this.imagenJugo);
    }
    private void crearPanelContadores(){
        this.contadorC = 0; this.contadorJ = 0;
        this.panelContadores = new JPanel();
        this.contadorCafe = new JLabel("Contador cafe : "+this.contadorC);
        this.contadorJugo = new JLabel("Contador Jugo: "+this.contadorJ);
        this.panelContadores.add(this.contadorCafe);
        this.panelContadores.add(this.contadorJugo);
    }

    private class OyenteCafe implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            imagenCafe.setIcon(new ImageIcon("imagenes/cafe.gif"));
            imagenJugo.setIcon(new ImageIcon("imagenes/Circulo.gif"));
            contadorCafe.setText("Contador Cafe: "+(contadorC++));
        }
    }
    private class OyenteJugo implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            imagenJugo.setIcon(new ImageIcon("imagenes/Jugo.gif"));
            imagenCafe.setIcon(new ImageIcon("imagenes/Circulo.gif"));
            contadorJugo.setText("Contador Jugo: "+(contadorJ++));
        }
    }
}
