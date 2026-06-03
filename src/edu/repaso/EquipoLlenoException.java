package edu.repaso;

public class EquipoLlenoException extends RuntimeException{
    public EquipoLlenoException() {
        super("El equipo ya ha alcanzado el límite máximo de jugadores.");
    }
}
