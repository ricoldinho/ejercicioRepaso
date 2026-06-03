package edu.repaso;

import java.util.ArrayList;

public class Equipo {

    private static final int MAX_JUGADORES = 5;

    private String nombre;
    private ArrayList<Jugador> plantilla;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.plantilla = new ArrayList();
        LigaManager.getLiga().put(nombre, plantilla);
    }

    public Equipo(String nombre, ArrayList<Jugador> plantilla) throws EquipoLlenoException {
        if(plantilla.size() > MAX_JUGADORES){
            throw new EquipoLlenoException();
        }
        this.nombre = nombre;
        this.plantilla = plantilla;
        LigaManager.getLiga().put(nombre, plantilla);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Jugador> getPlantilla() {
        return plantilla;
    }

    public void setPlantilla(ArrayList<Jugador> plantilla) {
        this.plantilla = plantilla;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", plantilla=" + plantilla +
                '}';
    }
}
