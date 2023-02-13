package org.iesalandalus.programacion.alquilervehiculos.modelo.negocio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Alquiler;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Cliente;
import org.iesalandalus.programacion.alquilervehiculos.modelo.dominio.Turismo;

public class Alquileres {
	private List<Alquiler> coleccionAlquileres;
	public Alquileres() {
		coleccionAlquileres = new ArrayList<Alquiler>();
	}
	public List<Alquiler> get() {
		return new ArrayList<Alquiler>(coleccionAlquileres);
	}
	public List<Alquiler> get(Cliente cliente){
		return coleccionAlquileres;
	}
	public List<Alquiler> get(Turismo turismo){
		return coleccionAlquileres;
	}
	public int getCantidad() {
		return coleccionAlquileres.size();	
	}
	public void insertar(Alquiler alquiler) throws OperationNotSupportedException {
		if(alquiler == null) {
			throw new NullPointerException("ERROR: No se puede insertar un turismo nulo.");
		}
		if(coleccionAlquileres.contains(alquiler)) {
			throw new OperationNotSupportedException("ERROR: Ya existe un turismo con esa matrícula.");
		}
		if (alquiler != null)
			coleccionAlquileres.add(alquiler);
	}
	private void comprobarAlquiler(Cliente cliente, Turismo turismo, LocalDate fechaAlquiler) {
		
	}
	public void devolver(Cliente cliente, LocalDate fechaAlquiler) {
		
	}
	public void borrar(Alquiler alquiler) throws OperationNotSupportedException {
		if(alquiler == null) {
			throw new NullPointerException("ERROR: No se puede borrar un turismo nulo.");
		}
		if(!coleccionAlquileres.contains(alquiler)) {
			throw new OperationNotSupportedException("ERROR: No existe ningún turismo con esa matrícula.");
		}
		coleccionAlquileres.remove(alquiler);
	}
}
