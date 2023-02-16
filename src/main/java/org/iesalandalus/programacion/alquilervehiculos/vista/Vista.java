package org.iesalandalus.programacion.alquilervehiculos.vista;

import org.iesalandalus.programacion.alquilervehiculos.controlador.Controlador;

public class Vista {

	private Controlador controlador;

	public void setControlador(Controlador controlador) {
		if (controlador != null) {
			this.controlador = controlador;
		}
	}

	public void comenzar() {
		Consola.mostrarMenu();
		Consola.elegirOpcion();
	}

	public void terminar() {
		System.out.println("FIN");
	}

	private void ejecutar(Opcion opcion) {
	switch (opcion) {
	case "SALIR": {
		
		Consola.elegirOpcion();
		}
	}

	private void insertarCliente() {
		controlador.insertar(null);
	}

	private void insertarTurismo() {
		controlador.insertar(null);
	}

	private void insertarAlquiler() {
		controlador.insertar(null);
	}

	private void buscarCliente() {
		controlador.buscar(null);
	}

	private void buscarTurismo() {
		controlador.buscar(null);
	}

	private void buscarAlquiler() {
		controlador.buscar(null);
	}

	private void modificarCliente() {
		controlador.modificar(null, null, null);
	}

	private void devoverAlquiler() {
		controlador.devolver(null, null);
	}

	private void borrarCliente() {
		controlador.borrar(null);
	}

	private void borrarTurismo() {
		controlador.borrar(null);
	}

	private void borrarAlquiler() {
		controlador.borrar(null);
	}

	private void listarClientes() {
		controlador.getClientes();
	}

	private void listarTurismo() {
		controlador.getTurismos();
	}

	private void listarAlquiler() {
		controlador.getAlquileres();
	}

	private void listarAlquileresCliente() {
		controlador.getAlquileres(null);
	}

	private void listarAlquileresTurismo() {
		controlador.getAlquileres(null);
	}
}
