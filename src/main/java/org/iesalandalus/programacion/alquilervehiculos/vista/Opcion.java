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

    private static boolean esOrdinalValido(int ordinal) {  
        return ( ordinal >= 0 && ordinal < Opcion.values().length);
    }
    public static Opcion get(int ordinal) {
    	if(!esOrdinalValido(ordinal)) {
    		throw new IllegalArgumentException("El ordinal no es válido");
    	}
        Opcion opcion = null;
        if(esOrdinalValido(ordinal)) {
            opcion = Opcion.values()[ordinal];
        }
        return opcion;
    }
    private Opcion(String cadena) {
        this.cadena = cadena;
    }
    @Override
    public String toString() {
        return String.format("%d: %s ", ordinal(),cadena);
    }
}
