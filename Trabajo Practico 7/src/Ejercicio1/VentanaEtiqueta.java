package Ejercicio1;
import javax.swing.*;
import java.awt.*;

public class VentanaEtiqueta extends JFrame {
	// atributo de instancia
	JLabel etiqueta;
	ImageIcon icono;

	// Constructor
	public VentanaEtiqueta(String tit) {
		super(tit);
		setSize(400, 400);
		etiqueta = new JLabel();
		this.icono = new ImageIcon("Ejercicio1/cafe.gif");
		etiqueta.setText(tit);
		etiqueta.setIcon(this.icono);
		setLayout(new FlowLayout());
		getContentPane().setBackground(Color.GREEN);
		getContentPane().add(etiqueta);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}