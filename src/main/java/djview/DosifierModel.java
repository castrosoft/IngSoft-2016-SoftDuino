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

public class DosifierModel implements DosifierModelInterface, SerialPortEventListener {
	
	SerialPort serialPort;
	private static final String PORT_NAMES[] = {"COM3"};
	private BufferedReader input;
	private OutputStream output;
	private static final int TIME_OUT=2000;
	private static final int DATA_RATE=9600;
	private String inputLine;
	
	ArrayList beatObservers = new ArrayList();
	ArrayList bpmObservers = new ArrayList();
	private int estado;
	
	public int getState() {
		return estado;
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
		} catch (Exception e){
			System.err.println(e.toString());
		}
		
	}
	
	public synchronized void cerrarConexion(){
		if(serialPort != null){
			serialPort.removeEventListener();
			serialPort.close();
		}
	}
	
	public synchronized void enviarDatos(int dato){
		try{
			output.write(dato);
		} catch (Exception e){
			System.out.println("No se puede escribir el puerto");
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
				estado = input.read();
				notifyBPMObservers();
				notifyBeatObservers();
			} catch (Exception e){
				System.err.println(e.toString());
			}
		}
	}

}
