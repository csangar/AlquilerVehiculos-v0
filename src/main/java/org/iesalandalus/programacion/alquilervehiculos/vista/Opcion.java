package org.iesalandalus.programacion.alquilervehiculos.vista;

public enum Opcion {
	
	SALIR("Salir"),
    INSERTAR_CLIENTE("Inserta un cliente"),
    INSERTAR_TURISMO("Inserta un turismo"),
    INSERTAR_ALQUILER("Inserta un alquiler"),
    BUSCAR_CLIENTE("Busca un cliente"),
    BUSCAR_TURISMO("Busca un turismo"),
    BUSCAR_ALQUILER("Busca un alquiler"),
    MODIFICAR_CLIENTE("Modifica un cliente"),
    DEVOLVER_ALQUILER("Devolve un alquiler"),
    BORRAR_CLIENTE("Borra un cliente"),
    BORRAR_TURISMO("Borra un turismo"),
    BORRAR_ALQUILER("Borra un alquiler"),
    LISTAR_CLIENTES("Lista los clientes"),
    LISTAR_TURISMOS("Lista los turismos"),
    LISTAR_ALQUILERES("Lista los alquileres"),
    LISTAR_ALQUILERES_CLIENTE("Lista los alquileres de un cliente"),
    LISTAR_ALQUILERES_TURISMO("Lista los alquileres de un turismo");

    private String cadena;

    private boolean esOrdinalValido(int ordinal) {
        boolean validar = false;
        if( ordinal >= 0 && ordinal < Opcion.values().length) {
            validar = true;
        }
        return validar;
    }
    public Opcion get(int ordinal) {
        Opcion opcion = null;
        if(esOrdinalValido(ordinal)) {
            opcion = Opcion.values()[ordinal];
        }
        return opcion;
    }
    private Opcion(String cadena) {
        this.cadena = cadena;
    }

    public String toString() {
        return cadena;
    }
}
