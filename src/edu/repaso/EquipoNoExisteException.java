package edu.repaso;

public class EquipoNoExisteException extends RuntimeException {

    public EquipoNoExisteException(String message) {
        super(message);
    }

    public EquipoNoExisteException() {
        super("El equipo no existe.");
    }
}
