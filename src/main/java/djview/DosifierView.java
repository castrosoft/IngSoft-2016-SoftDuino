package main.java.djview;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class DosifierView implements ActionListener, PhObserver,CloroObserver,ClarificanteObserver,AlguicidaObserver{
	
	ControllerInterface controller;
	DosifierModelInterface model;
	
	JFrame viewFrame;
	JPanel controlPanel;
	JPanel buttonPanel;
	JPanel infoPanel;
	BeatBar beatBar1;
	BeatBar beatBar2;
	BeatBar beatBar3;
	BeatBar beatBar4;
	
	JTextField cloroTextField;
	JTextField phTextField;
	
	JButton	cloroButton;
	JButton	phButton;
	JButton	diariaButton;
	
	JRadioButton conectado;
	JRadioButton desconectado;
	
	JLabel cloroLabel;
	JLabel phLabel;
	JLabel clarificanteLabel;
	JLabel alguicidaLabel;
	JLabel enviarCloro;
	JLabel enviarPh;
	
	
	public DosifierView(ControllerInterface controller, DosifierModelInterface model){
		this.controller = controller;
		this.model = model;
		model.registerObserver((AlguicidaObserver)this);
		model.registerObserver((ClarificanteObserver)this);
		model.registerObserver((PhObserver)this);
		model.registerObserver((CloroObserver)this);
	}
	
	public void createDosifierGUI(){
		viewFrame = new JFrame("Dosifier Manager");
		viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		viewFrame.setBounds(100, 100, 700, 150);
		
		controlPanel = new JPanel(new GridLayout(6,1));
		infoPanel = new JPanel(new GridLayout(4,2));
		buttonPanel = new JPanel(new GridLayout(3,1));
		
		cloroTextField = new JTextField(10);
		phTextField = new JTextField(10);
		
		conectado = new JRadioButton("Conectado");
		desconectado = new JRadioButton("Desonectado");
		
		cloroButton = new JButton("Enviar Cloro");
		phButton = new JButton("Enviar PH");
		diariaButton = new JButton("Diaria");
		
		beatBar1 = new BeatBar();
		beatBar2 = new BeatBar();
		beatBar3 = new BeatBar();
		beatBar4 = new BeatBar();
		
		cloroLabel = new JLabel("Cloro Suministrado: --");
		phLabel = new JLabel("PH Suministrado:--");
		alguicidaLabel = new JLabel("Alguicida Suministrado: --");
		clarificanteLabel = new JLabel("Clarificante Suministrado: --");
		enviarCloro = new JLabel("Dosis de Cloro:");
		enviarPh = new JLabel("Dosis de Ph:");
		
		viewFrame.getContentPane().add(controlPanel, BorderLayout.WEST);
		viewFrame.getContentPane().add(buttonPanel, BorderLayout.CENTER);
		viewFrame.getContentPane().add(infoPanel, BorderLayout.EAST);
		
		controlPanel.add(enviarCloro);
		controlPanel.add(cloroTextField);
		controlPanel.add(enviarPh);
		controlPanel.add(phTextField);
		
		controlPanel.add(conectado);
		controlPanel.add(desconectado);
		
		buttonPanel.add(cloroButton);
		buttonPanel.add(phButton);
		buttonPanel.add(diariaButton);
		
		infoPanel.add(beatBar1);
		infoPanel.add(beatBar2);
		infoPanel.add(beatBar3);
		infoPanel.add(beatBar4);
		
		infoPanel.add(cloroLabel);
		infoPanel.add(phLabel);
		infoPanel.add(alguicidaLabel);
		infoPanel.add(clarificanteLabel);
		
		
		viewFrame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void updateALGUICIDA() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void updateCLARIFICANTE() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void updatePH() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void updateCLORO() {
		// TODO Auto-generated method stub
		
	}
}
