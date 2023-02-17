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

	public void comenzar() throws OperationNotSupportedException {
		Opcion opcion;
		do {
			Consola.mostrarMenu();
			opcion = Consola.elegirOpcion();
			ejecutar(opcion);
		} while (opcion != Opcion.SALIR);
	}

	public void terminar() {
		System.out.println("FIN");
	}

	private void ejecutar(Opcion opcion) throws OperationNotSupportedException {
			//while (opcion != Opcion.SALIR) {
				switch (opcion) {
				case SALIR:
					terminar();
					break;
				case INSERTAR_CLIENTE:
					insertarCliente();
					break;
				case INSERTAR_TURISMO:
					insertarTurismo();
					break;
				case INSERTAR_ALQUILER:
					insertarAlquiler();
					break;
				case BUSCAR_CLIENTE:
					buscarCliente();
					break;
				case BUSCAR_TURISMO:
					buscarTurismo();
					break;
				case BUSCAR_ALQUILER:
					buscarAlquiler();
					break;
				case MODIFICAR_CLIENTE:
					modificarCliente();
					break;
				case DEVOLVER_ALQUILER:
					devoverAlquiler();
					break;
				case BORRAR_CLIENTE:
					borrarCliente();
					break;
				case BORRAR_TURISMO:
					borrarTurismo();
					break;
				case BORRAR_ALQUILER:
					borrarAlquiler();
					break;
				case LISTAR_CLIENTES:
					listarClientes();
					break;
				case LISTAR_TURISMOS:
					listarTurismo();
					break;
				case LISTAR_ALQUILERES:
					listarAlquiler();
					break;
				case LISTAR_ALQUILERES_CLIENTE:
					listarAlquileresCliente();
					break;
				case LISTAR_ALQUILERES_TURISMO:
					listarAlquileresTurismo();
					break;
				}
		//	}
	}

	private void insertarCliente() throws OperationNotSupportedException {
		try {
			controlador.insertar(Consola.leerCliente());
			System.out.println("El cliente se ha insertado de forma correcta");
		} catch (OperationNotSupportedException | NullPointerException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	private void insertarTurismo() throws OperationNotSupportedException {
		try {
			controlador.insertar(Consola.leerTurismo());
			System.out.println("El turismo se ha insertado de forma correcta");
		} catch (OperationNotSupportedException | NullPointerException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	private void insertarAlquiler() throws OperationNotSupportedException {
		try {
			controlador.insertar(Consola.leerAlquiler());
			System.out.println("El alquiler se ha insertado de forma correcta");
		} catch (OperationNotSupportedException | NullPointerException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	private void buscarCliente() {
		try {
			controlador.buscar(Consola.leerCliente());
			System.out.println("El cliente se ha encontrado de forma correcta");
		} catch (NullPointerException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	private void buscarTurismo() {
		try {
			controlador.buscar(Consola.leerTurismo());
			System.out.println("El turismo se ha encontrado de forma correcta");
		} catch (NullPointerException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	private void buscarAlquiler() {
		try {
			controlador.buscar(Consola.leerAlquiler());
			System.out.println("El Alquiler se ha encontrado de forma correcta");
		} catch (NullPointerException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	private void modificarCliente() throws OperationNotSupportedException {
		try {
			controlador.modificar(Consola.leerCliente(), Consola.leerNombre(), Consola.leerTelefono());
			System.out.println("El cliente se ha modificado de forma correcta");
		} catch (OperationNotSupportedException | NullPointerException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	private void devoverAlquiler() throws OperationNotSupportedException {
		try {
			controlador.devolver(Consola.leerAlquiler(), Consola.leerFechaDevolucion());
			System.out.println("El alquiler se ha devuelto de forma correcta");
		} catch (OperationNotSupportedException | NullPointerException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	private void borrarCliente() throws OperationNotSupportedException {
		try {
			controlador.borrar(Consola.leerCliente());
			System.out.println("El cliente se ha borrado de forma correcta");
		} catch (OperationNotSupportedException | NullPointerException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	private void borrarTurismo() throws OperationNotSupportedException {
		try {
			controlador.borrar(Consola.leerTurismo());
			System.out.println("El turismo se ha borrado de forma correcta");
		} catch (OperationNotSupportedException | NullPointerException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	private void borrarAlquiler() throws OperationNotSupportedException {
		try {
			controlador.borrar(Consola.leerAlquiler());
			System.out.println("El alquiler se ha borrado de forma correcta");
		} catch (OperationNotSupportedException | NullPointerException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	private void listarClientes() {
		try {
			controlador.getClientes();
			System.out.println("Los clientes se han listado de forma correcta");
		} catch (NullPointerException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	private void listarTurismo() {
		try {
			controlador.getTurismos();
			System.out.println("Los turismos se han listado de forma correcta");
		} catch (NullPointerException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	private void listarAlquiler() {
		try {
			controlador.getAlquileres();
			System.out.println("Los alquileres se han listado de forma correcta");
		} catch (NullPointerException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	private void listarAlquileresCliente() {
		try {
			controlador.getAlquileres(Consola.leerCliente());
			System.out.println("Los alquileres  del cliente se han listado de forma correcta");
		} catch (NullPointerException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	private void listarAlquileresTurismo() {
		try {
			controlador.getAlquileres(Consola.leerTurismo());
			System.out.println("Los alquileres del turismo se han listado de forma correcta");
		} catch (NullPointerException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
