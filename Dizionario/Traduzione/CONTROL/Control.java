package CONTROL;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import MODEL.Gestione;
import VIEW.Finestra;

public class Control implements ActionListener{
	private Finestra f;
	private Gestione g;
	
	public Control(Finestra f, Gestione g) {
		this.f = f;
		this.g = g;
		f.getComboBox().addActionListener(this);
		f.getComboBox_1().addActionListener(this);
		f.getBtnTraduci().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
