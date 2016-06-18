package main.java.djview;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;

import gnu.io.CommPortIdentifier; 
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent; 
import gnu.io.SerialPortEventListener; 

import java.util.Enumeration;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class DosifierModel implements DosifierModelInterface, SerialPortEventListener {
	
	DosifierSimulator simulator = new DosifierSimulator(this);
	
	SerialPort serialPort;
	private static final String PORT_NAMES[] = {"COM3"};
	private BufferedReader input;
	private OutputStream output;
	private static final int TIME_OUT=2000;
	private static final int DATA_RATE=9600;
	private String inputLine = new String();
	private byte[] readBuffer = new byte[400];
	
	ArrayList cloroObservers = new ArrayList();
	ArrayList phObservers = new ArrayList();
	ArrayList clarificanteObservers = new ArrayList();
	ArrayList alguicidaObservers = new ArrayList();
	ArrayList beatObservers = new ArrayList();
	ArrayList bpmObservers = new ArrayList();
	
	private int estadoCloro;
	private int estadoPH;
	private int estadoClarificante;
	private int estadoAlguicida;
	
	public int getStateCloro() {
		return estadoCloro;
	}
	
	public int getStatePh() {
		return estadoPH;
	}
	
	public int getStateAlguicida() {
		return estadoAlguicida;
	}
	
	public int getStateClarificante() {
		return estadoClarificante;
	}
	
	public void setQuantity(int cant){
		enviarDatos(cant);
	}
	
	public void abrirConexion(){
		System.setProperty("gnu.io.rxtx.SerialPorts", "COM3");
		CommPortIdentifier portId = null;
		Enumeration portEnum = CommPortIdentifier.getPortIdentifiers();
		
		while(portEnum.hasMoreElements()){
			CommPortIdentifier currPortId = (CommPortIdentifier) portEnum.nextElement();
			for(String portName : PORT_NAMES){
				if(currPortId.getName().equals(portName)){
					portId = currPortId;
					break;
				}
			}
		}
		
		if(portId == null){
			System.out.println("No se ha encontrado el puerto COM");
			return;
		}
		
		try{
			serialPort = (SerialPort) portId.open(this.getClass().getName(),TIME_OUT);
			serialPort.disableReceiveTimeout();
			serialPort.enableReceiveThreshold(1);
			serialPort.setSerialPortParams(DATA_RATE, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
			
			input = new BufferedReader(new InputStreamReader(serialPort.getInputStream()));
			output = serialPort.getOutputStream();
			
			serialPort.addEventListener(this);
			serialPort.notifyOnDataAvailable(true);
			System.out.println("Conectado");
		} catch (Exception e){
			System.err.println(e.toString());
		}
		
	}
	
	public synchronized void cerrarConexion(){
		if(serialPort != null){
			serialPort.removeEventListener();
			serialPort.close();
			System.out.println("Desconectado");
			
		}
	}
	
	public synchronized void enviarDatos(int dato){
		if(serialPort!=null){
			try{
				output.write(dato);
			} catch (Exception e){
				System.out.println("No se puede escribir el puerto");
			}
		}else{
			//System.out.println("Se envió a un simulador");
			//System.out.println(JOptionPane.showInputDialog("Se envio a un simulador"));
		   JOptionPane.showMessageDialog(null, "Se envio a un simulador");
			
			
			Thread thread = new Thread(simulator);
			simulator.recibirDato(dato);
			thread.start();
		}
	}
	

	public void registerObserver(PhObserver o) {
		phObservers.add(o);
	}

	public void removeObserver(PhObserver o) {
		int i = phObservers.indexOf(o);
		if (i >= 0) {
			phObservers.remove(i);
		}
	}

	public void notifyPhObservers() {
		for(int i = 0; i < phObservers.size(); i++) {
			PhObserver observer = (PhObserver)phObservers.get(i);
			observer.updatePH();
		}
	}

	public void registerObserver(CloroObserver o) {
		cloroObservers.add(o);
	}

	public void removeObserver(CloroObserver o) {
		int i = cloroObservers.indexOf(o);
		if (i >= 0) {
			cloroObservers.remove(i);
		}
	}

	public void notifyCloroObservers() {
		for(int i = 0; i < cloroObservers.size(); i++) {
			CloroObserver observer = (CloroObserver)cloroObservers.get(i);
			observer.updateCLORO();
		}
	}
	
	public void registerObserver(ClarificanteObserver o) {
		clarificanteObservers.add(o);
	}

	public void removeObserver(ClarificanteObserver o) {
		int i = clarificanteObservers.indexOf(o);
		if (i >= 0) {
			clarificanteObservers.remove(i);
		}
	}

	public void notifyClarificanteObservers() {
		for(int i = 0; i < clarificanteObservers.size(); i++) {
			ClarificanteObserver observer = (ClarificanteObserver)clarificanteObservers.get(i);
			observer.updateCLARIFICANTE();
		}
	}
	
	public void registerObserver(AlguicidaObserver o) {
		alguicidaObservers.add(o);
	}

	public void removeObserver(AlguicidaObserver o) {
		int i = alguicidaObservers.indexOf(o);
		if (i >= 0) {
			alguicidaObservers.remove(i);
		}
	}

	public void notifyAlguicidaObservers() {
		for(int i = 0; i < alguicidaObservers.size(); i++) {
			AlguicidaObserver observer = (AlguicidaObserver)alguicidaObservers.get(i);
			observer.updateALGUICIDA();
		}
	}
	
	public void registerObserver(BeatObserver o) {
		beatObservers.add(o);
	}

	public void removeObserver(BeatObserver o) {
		int i = beatObservers.indexOf(o);
		if (i >= 0) {
			beatObservers.remove(i);
		}
	}

	public void notifyBeatObservers() {
		for(int i = 0; i < beatObservers.size(); i++) {
			BeatObserver observer = (BeatObserver)beatObservers.get(i);
			observer.updateBeat();
		}
	}

	public void registerObserver(BPMObserver o) {
		bpmObservers.add(o);
	}

	public void removeObserver(BPMObserver o) {
		int i = bpmObservers.indexOf(o);
		if (i >= 0) {
			bpmObservers.remove(i);
		}
	}

	public void notifyBPMObservers() {
		for(int i = 0; i < bpmObservers.size(); i++) {
			BPMObserver observer = (BPMObserver)bpmObservers.get(i);
			observer.updateBPM();
		}
	}

	@Override
	public synchronized void serialEvent(SerialPortEvent oEvent) {
		if(oEvent.getEventType() == SerialPortEvent.DATA_AVAILABLE){
			try{
				if(input.ready()){
					//inputLine = input.readLine();
					inputLine = inputLine.concat(input.readLine());
					if(inputLine.startsWith("c")){
						estadoCloro = Integer.parseInt(inputLine.substring(1));
						notifyCloroObservers();
						notifyBPMObservers();
					}
					
					if(inputLine.startsWith("p")){
						estadoPH = Integer.parseInt(inputLine.substring(1));
						notifyPhObservers();
					}
					
					if(inputLine.startsWith("a")){
						estadoAlguicida = Integer.parseInt(inputLine.substring(1));
						notifyAlguicidaObservers();
					}
					
					if(inputLine.startsWith("t")){
						estadoClarificante = Integer.parseInt(inputLine.substring(1));
						notifyClarificanteObservers();
					}
					System.out.println(inputLine);
					inputLine = "";
				}
				//estado = Integer.parseInt(inputLine);
				
			} catch (Exception e){
				System.err.println(e.toString());
			}
		}
	}
	
	public void recibirDato(String dato){
		JOptionPane.showMessageDialog(null, "recibiendo de un simulador");
		//System.out.println("Recibiendo de Simulador");
		inputLine = inputLine.concat(dato);
		if(inputLine.startsWith("c")){
			estadoCloro = Integer.parseInt(inputLine.substring(1));
			notifyCloroObservers();
			notifyBPMObservers();
		}
		
		if(inputLine.startsWith("p")){
			estadoPH = Integer.parseInt(inputLine.substring(1));
			notifyPhObservers();
		}
		
		if(inputLine.startsWith("a")){
			estadoAlguicida = Integer.parseInt(inputLine.substring(1));
			notifyAlguicidaObservers();
		}
		
		if(inputLine.startsWith("t")){
			estadoClarificante = Integer.parseInt(inputLine.substring(1));
			notifyClarificanteObservers();
		}
		System.out.println(inputLine);
		inputLine = "";
	}

}
