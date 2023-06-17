package PerroYGato;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PerroYGato extends JFrame{
    private JLabel etiqueta;
    private JButton botonPerro,botonGato;
    private JPanel panelBotones,panelImagen;
    
    public PerroYGato(){
        setLayout(new BorderLayout());
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        armarPanelImagen();
        armarPanelBotones();
        getContentPane().add(panelImagen,BorderLayout.NORTH);
        getContentPane().add(panelBotones,BorderLayout.SOUTH);
    }

    private void armarPanelImagen(){
        panelImagen = new JPanel();
        etiqueta = new JLabel();
        etiqueta.setIcon(new ImageIcon("imagenes/perro.jpg"));
        panelImagen.add(etiqueta);
    }
    private void armarPanelBotones(){
        panelBotones = new JPanel();
        botonPerro = new JButton("Perro");
        botonGato = new JButton("Gato");
        Oyente oyente = new Oyente();
        botonPerro.addActionListener(oyente);
        botonGato.addActionListener(oyente);
        panelBotones.add(botonPerro);
        panelBotones.add(botonGato);
    }
    private class Oyente implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            String valor = (String)evento.getActionCommand();
            etiqueta.setIcon(new ImageIcon("imagenes/"+valor+".jpg"));
        }
    }

}
