package main.java.djview;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import com.sun.glass.events.MouseEvent;

public class DosifierView implements ActionListener, PhObserver,CloroObserver,ClarificanteObserver,AlguicidaObserver{
	
	DosifierController controller;
	DosifierModelInterface model;
	
	JFrame viewFrame;
	JPanel controlPanel;
	JPanel buttonPanel;
	JPanel infoPanel;
	
	JProgressBar beatBar1;
	JProgressBar beatBar2;
	JProgressBar beatBar3;
	JProgressBar beatBar4;
	
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
	
	
	public DosifierView(DosifierController controller, DosifierModelInterface model){
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
		desconectado = new JRadioButton("Desconectado");
		
		cloroButton = new JButton("Enviar Cloro");
		phButton = new JButton("Enviar PH");
		diariaButton = new JButton("Diaria");
		
		beatBar1 = new JProgressBar();
		beatBar2 = new JProgressBar();
		beatBar3 = new JProgressBar();
		beatBar4 = new JProgressBar();
		
		beatBar1.setMinimum(0);
		beatBar2.setMinimum(0);
		beatBar3.setMinimum(0);
		beatBar4.setMinimum(0);
		
		cloroLabel = new JLabel("Cloro Suministrado: --");
		phLabel = new JLabel("PH Suministrado: --");
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
		
		conectado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                controller.empezar();
            }
        });
		
		desconectado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            	controller.terminar();
            }
        });
		
		cloroButton.addActionListener(this);
		phButton.addActionListener(this);
		diariaButton.addActionListener(this);
		
		desconectado.doClick();
		viewFrame.setVisible(true);
		
	}
	
	public void unselectConectado(){
		conectado.setSelected(false);
	}
	
	public void unselectDesconectado(){
		desconectado.setSelected(false);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == cloroButton) {
			beatBar1.setMaximum(Integer.parseInt(cloroTextField.getText()));
			int bpm = Integer.parseInt(cloroTextField.getText());
        	controller.setBPM(bpm);
		} else if (event.getSource() == phButton) {
			beatBar2.setMaximum(Integer.parseInt(phTextField.getText()));
			controller.increaseBPM();
		} else if (event.getSource() == diariaButton) {
			beatBar1.setMaximum(10);
			beatBar2.setMaximum(7);
			beatBar3.setMaximum(5);
			beatBar4.setMaximum(3);
			controller.decreaseBPM();
		}// TODO Auto-generated method stub
		
	}



	@Override
	public void updateALGUICIDA() {
		if (model != null) {
			int bpm = model.getStateAlguicida();
			if (bpm == 0) {
				if (alguicidaLabel != null) {
					alguicidaLabel.setText("Alguicida Suministrado: --");
				}
			} else {
				if (alguicidaLabel != null) {
					alguicidaLabel.setText("Alguicida Suministrado: " + model.getStateAlguicida());
				}
			}
		}
		if (beatBar3 != null) {
			 beatBar3.setValue(model.getStateAlguicida());
		}
	}



	@Override
	public void updateCLARIFICANTE() {
		if (model != null) {
			int bpm = model.getStateClarificante();
			if (bpm == 0) {
				if (clarificanteLabel != null) {
					clarificanteLabel.setText("Clarificante Suministrado: --");
				}
			} else {
				if (clarificanteLabel != null) {
					clarificanteLabel.setText("Clarificante Suministrado: " + model.getStateClarificante());
				}
			}
		}
		if (beatBar4 != null) {
			 beatBar4.setValue(model.getStateClarificante());
		}
	}



	@Override
	public void updatePH() {
		if (model != null) {
			int bpm = model.getStatePh();
			if (bpm == 0) {
				if (phLabel != null) {
					phLabel.setText("PH Suministrado: --");
				}
			} else {
				if (phLabel != null) {
					phLabel.setText("PH Suministrado: " + model.getStatePh());
				}
			}
		}
		if (beatBar2 != null) {
			 beatBar2.setValue(model.getStatePh());
		}
	}



	@Override
	public void updateCLORO() {
		if (model != null) {
			int bpm = model.getStateCloro();
			if (bpm == 0) {
				if (cloroLabel != null) {
					cloroLabel.setText("Cloro Suministrado: --");
				}
			} else {
				if (cloroLabel != null) {
					cloroLabel.setText("Cloro Suministrado: " + model.getStateCloro());
				}
			}
		}
		if (beatBar1 != null) {
			 beatBar1.setValue(model.getStateCloro());
		}
	}
}
