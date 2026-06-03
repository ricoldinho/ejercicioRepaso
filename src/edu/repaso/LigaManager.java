package edu.repaso;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class LigaManager {

    private static HashMap<String, ArrayList<Jugador>> liga = new HashMap();

    public static HashMap<String, ArrayList<Jugador>> getLiga() {
        return liga;
    }

    public static void setLiga(HashMap<String, ArrayList<Jugador>> liga) {
        LigaManager.liga = liga;
    }

    public static double obtenerMediaPlantillaEquipoString(String nombreEquipo) throws EquipoNoExisteException {
        if(liga.get(nombreEquipo) == null){
            throw new EquipoNoExisteException("El equipo no pertenece a la liga");
        }
        ArrayList<Jugador> jugadoresEquipo = liga.get(nombreEquipo);
        double sumaPuntos = 0;
        double media = 0;
        for(int i = 0; i < jugadoresEquipo.size(); i++){
            sumaPuntos += jugadoresEquipo.get(i).getPuntuacionRanked();
        }
        return media = sumaPuntos / jugadoresEquipo.size();
    }

    public static double obtenerMediaPlantillaEquipoArrayList(ArrayList<Jugador> plantilla){
        double sumaPuntos = 0;
        double media = 0;
        for(int i = 0; i < plantilla.size(); i++){
            sumaPuntos += plantilla.get(i).getPuntuacionRanked();
        }
        return media = sumaPuntos / plantilla.size();
    }

    public static String compararMediaPuntuaciones (ArrayList<Jugador> plantilla1, ArrayList<Jugador> plantilla2){
        double mediaPlantilla1 = 0;
        double mediaPlantilla2 = 0;
        mediaPlantilla1 = obtenerMediaPlantillaEquipoArrayList(plantilla1);
        mediaPlantilla2 = obtenerMediaPlantillaEquipoArrayList(plantilla2);
        if(mediaPlantilla1 > mediaPlantilla2){
            return "La media del primer equipo " + mediaPlantilla1+ " es mayor a la media del segundo " + mediaPlantilla2;
        }else{
            return "La media del segundo equipo " + mediaPlantilla2 + " es mayor a la media del primero" + mediaPlantilla1;
        }

    }


}
