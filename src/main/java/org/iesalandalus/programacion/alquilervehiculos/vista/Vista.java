package org.iesalandalus.programacion.alquilervehiculos.vista;

import javax.naming.OperationNotSupportedException;

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

	private void ejecutar(Opcion opcion) throws OperationNotSupportedException {
		while(opcion != Opcion.SALIR) {
			switch (opcion) {
				case SALIR:
					terminar();break;
				case INSERTAR_CLIENTE:
					insertarCliente();break;
				case INSERTAR_TURISMO:
					insertarTurismo();break;
				case INSERTAR_ALQUILER:
					insertarAlquiler();break;
				case BUSCAR_CLIENTE:
					buscarCliente();break;
				case BUSCAR_TURISMO:
					buscarTurismo();break;
				case BUSCAR_ALQUILER:
					buscarAlquiler();break;
				case MODIFICAR_CLIENTE:
					modificarCliente();break;
				case DEVOLVER_ALQUILER:
					devoverAlquiler();break;
				case BORRAR_CLIENTE:
					borrarCliente();break;
				case BORRAR_TURISMO:
					borrarTurismo();break;
				case BORRAR_ALQUILER:
					borrarAlquiler();break;
				case LISTAR_CLIENTES:
					listarClientes();break;
				case LISTAR_TURISMOS:
					listarTurismo();break;
				case LISTAR_ALQUILERES:
					listarAlquiler();break;
				case LISTAR_ALQUILERES_CLIENTE:
					listarAlquileresCliente();break;
				case LISTAR_ALQUILERES_TURISMO:
					listarAlquileresTurismo();break;
			}
		}
	}

	private void insertarCliente() throws OperationNotSupportedException {
		controlador.insertar(Consola.leerCliente());
	}

	private void insertarTurismo() throws OperationNotSupportedException {
		controlador.insertar(Consola.leerTurismo());
	}

	private void insertarAlquiler() throws OperationNotSupportedException {
		controlador.insertar(Consola.leerAlquiler());
	}

	private void buscarCliente() {
		controlador.buscar(Consola.leerCliente());
	}

	private void buscarTurismo() {
		controlador.buscar(Consola.leerTurismo());
	}

	private void buscarAlquiler() {
		controlador.buscar(Consola.leerAlquiler());
	}

	private void modificarCliente() throws OperationNotSupportedException {
		controlador.modificar(Consola.leerCliente(), Consola.leerNombre(), Consola.leerTelefono());
	}

	private void devoverAlquiler() throws OperationNotSupportedException {
		controlador.devolver(Consola.leerAlquiler(), Consola.leerFechaDevolucion());
	}

	private void borrarCliente() throws OperationNotSupportedException {
		controlador.borrar(Consola.leerCliente());
	}

	private void borrarTurismo() throws OperationNotSupportedException {
		controlador.borrar(Consola.leerTurismo());
	}

	private void borrarAlquiler() throws OperationNotSupportedException {
		controlador.borrar(Consola.leerAlquiler());
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
		controlador.getAlquileres(Consola.leerCliente());
	}

	private void listarAlquileresTurismo() {
		controlador.getAlquileres(Consola.leerTurismo());
	}
}
