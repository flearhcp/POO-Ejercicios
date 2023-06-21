package Botonera;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Botonera extends JFrame{
    private JPanel panelBotones;
    private JButton[] Botones;

    public Botonera(){
        setSize(400,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panelBotones = new JPanel();
        Botones = new JButton[5];
        armarBotonera();
        getContentPane().add(panelBotones);
    }

    public void armarBotonera(){
        Oyente oyente = new Oyente();
        for(int i = 0;i<5;i++){
            Botones[i] = new JButton();
            Botones[i].setText(""+i);
            Botones[i].setBackground(Color.WHITE);
            Botones[i].addActionListener(oyente);
            panelBotones.add(Botones[i]);
        }
    }
    private class Oyente implements ActionListener{
        private String valorAnt = "";
        @Override
        public void actionPerformed(ActionEvent evento){
            JButton b=(JButton)evento.getSource();
            switch(b.getText()){
                case "Ok": volerNormal(b, valorAnt);break;
                case "0","1","2","3","4": valorAnt = (String)evento.getActionCommand();colorRojo(b);break;
            }
        }
        public void colorRojo(JButton b){
            b.setBackground(Color.red);
            b.setText("Ok");
        }
        public void volerNormal(JButton b,String nom){
            b.setBackground(Color.white);
            b.setText(nom);
        }
    }
}
