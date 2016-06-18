package test.java;

import static org.junit.Assert.*;
import main.java.djview.ControllerInterface;
import main.java.djview.DosifierController;
import main.java.djview.DosifierModel;
import main.java.djview.DosifierSimulator;
import main.java.djview.DosifierView;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DosifierModelTest {
	DosifierModel model;
	DosifierSimulator simulator;
	
	@Before
	public void setUp() throws Exception {
		simulator = new DosifierSimulator();
		model = new DosifierModel(simulator);
		simulator.setModel(model);
	}

	@After
	public void tearDown() throws Exception {
		model=null;
	}

	@Test
	public void testEnvioDato() {
		int dato = 3;
		model.enviarDatos(dato);
		int respuesta = simulator.getIncomingByte();
		assertEquals("Envio de Modelo a Simulador",dato,respuesta,0);
	}
	
	@Test
	public void testEnvioCloro(){
		int dato = 2;						//Valor entre 1 y 63 corresponde a cloro						
		model.enviarDatos(dato);
		try {								//Se Espera que el "hardware" simulado procese la informacion
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String respuesta = simulator.getDataReceivedType();
		assertEquals("c",respuesta);
	}
	
	@Test
	public void testEnvioPh(){
		int dato = 64;						//Valor entre 64 y 127 corresponde a ph
		model.enviarDatos(dato);
		try {								//Se Espera que el "hardware" simulado procese la informacion
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String respuesta = simulator.getDataReceivedType();
		assertEquals("p",respuesta);
	}
	
	@Test
	public void testEnvioDiaria(){
		int dato = 130;						//Valor mayor o igual a 128 corresponde a funcion diaria
		model.enviarDatos(dato);
		try {								//Se Espera que el "hardware" simulado procese la informacion
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String respuesta = simulator.getDataReceivedType();
		assertEquals("d",respuesta);
	}
	
	@Test
	public void testRecepcionCantidadCloro(){
		int dato = 2;												
		model.enviarDatos(dato);
		try {								//Se Espera que el "hardware" simulado procese la informacion
			Thread.sleep(4330);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int respuesta = model.getStateCloro();
		assertEquals("Recepcion Estado Cloro",dato,respuesta,0);
	}
	
	@Test
	public void testRecepcionCantidadPh(){
		int cantidad = 2;
		int dato = 64+cantidad;											
		model.enviarDatos(dato);
		try {								//Se Espera que el "hardware" simulado procese la informacion
			Thread.sleep(4330);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int respuesta = model.getStatePh();
		assertEquals("Recepcion Estado PH",cantidad,respuesta,0);
	}
	
	@Test
	public void testRecepcionCantidadesDiaria(){
		int dato = 130;											
		model.enviarDatos(dato);
		try {								//Se Espera que el "hardware" simulado procese la informacion
			Thread.sleep(28500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int cloro = model.getStateCloro();
		int ph = model.getStatePh();
		int alguicida = model.getStateAlguicida();
		int clarificante = model.getStateClarificante();
		
		assertEquals("Recepcion Estado Cloro",10,cloro,0);
		assertEquals("Recepcion Estado PH",7,ph,0);
		assertEquals("Recepcion Estado Alguicida",5,alguicida,0);
		assertEquals("Recepcion Estado Clarificante",3,clarificante,0);
	}

}
