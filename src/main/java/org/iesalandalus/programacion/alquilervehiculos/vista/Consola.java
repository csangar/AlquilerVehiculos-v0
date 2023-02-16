package org.iesalandalus.programacion.alquilervehiculos.vista;

import java.time.LocalDate;

import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Alquiler;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Cliente;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Turismo;

public class Consola {
	private static final String PATRON_FECHA="";
	private static final String FORMATO_FECHA="";
	
	private Consola() {
		
	}
	public static void mostrarCabecera(String mensaje) {
		String subrayado = "";
		System.out.println(mensaje);
		for(int i = 0; i < mensaje.length();i++) {
			subrayado = subrayado +"-";
		}
		System.out.println(subrayado);
	}
	public static void mostrarMenu() {
		mostrarCabecera("Menu de opciones disponibles");
		for(Opcion opcion : Opcion.values()) {
			System.out.println(opcion);
		}
	}
	private static String leerCadena(String mensaje) {
		System.out.println(mensaje);
		
		return mensaje;
	}
	private static Integer leerEntero(String mensaje) {
		return null;
	}
	private static LocalDate leerFecha(String mensaje) {
		return null;
	}
	public static Opcion elegirOpcion() {
		
		return null;
	}
	public static Cliente leerCliente() {
		return null;
	}
	public static Cliente leerClienteDni() {
		return null;
	}
	public static String leerNombre() {
		return null;
	}
	public static String leerTelefono() {
		return null;
	}
	public static Turismo leerTurismo() {
		return null;
	}
	public static Turismo leerTurismoMatricula() {
		return null;
	}
	public static Alquiler leerAlquiler() {
		return null;
	}
	public static LocalDate leerFechaDevolucion() {
		return null;
	}
}
