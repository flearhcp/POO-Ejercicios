package Ejercicio1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contador extends JFrame {
    private JTextField textoContador;
    private JButton botonMas,botonMenos;
    private JPanel panelBotones,panelTexto;
    private int contador;

    public Contador(){
        setLayout(new BorderLayout());
        setSize(200,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        crearPanelTexto();
        crearPanelBotones();
        getContentPane().add(panelTexto,BorderLayout.NORTH);
        getContentPane().add(panelBotones,BorderLayout.SOUTH);
    }
    private void crearPanelBotones(){
        this.panelBotones = new JPanel(new FlowLayout());
        this.botonMas = new JButton("+");
        this.botonMenos = new JButton("-");
        Oyente oyente = new Oyente();
        this.botonMas.addActionListener(oyente); this.botonMenos.addActionListener(oyente);
        this.panelBotones.add(this.botonMenos);
        this.panelBotones.add(this.botonMas);
    }
    private void crearPanelTexto(){
        this.contador = 0;
        this.panelTexto = new JPanel();
        this.textoContador = new JTextField(5);
        this.textoContador.setText(""+this.contador);
        this.textoContador.setEditable(false);
        this.panelTexto.add(this.textoContador);
    }
    private class Oyente implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            String valor = (String)evento.getActionCommand();
            switch(valor){
                case "+": textoContador.setText(""+contador++);break;
                case "-": textoContador.setText(""+contador--);break;
            }
        }
    }
}
