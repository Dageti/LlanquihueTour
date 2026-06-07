package Util;

/**
 * Mensaje exception personalizado
 */

public class RutInvalidoException extends Exception {
	public RutInvalidoException() {
		super("El RUT ingresado no es válido");
    }
    public RutInvalidoException(String message) {
        super(message);
    }
}
