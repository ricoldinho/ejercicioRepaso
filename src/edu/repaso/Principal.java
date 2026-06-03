package edu.repaso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
* Foco: HashMap, Propagación de excepciones (throws) y métodos de clase.
Contexto: Se os ha encargado el backend para un torneo de deportes electrónicos.
* Tenemos jugadores y equipos. Cada equipo tiene un nombre y una plantilla de jugadores.
Requisitos de Arquitectura:
El POJO: Cread una clase Jugador que tenga un nickname (String), puntuacionRanked (int) y rol (String).
Estructuras de Datos: En vuestra clase LigaManager, debéis mantener el registro del torneo. Usad un HashMap donde la clave sea el nombre del equipo y el valor sea una lista (ArrayList) con los jugadores de ese equipo.
Constantes: El tamaño de un equipo es cerrado. Fijad una constante que limite a exactamente 5 los jugadores por equipo.
Excepciones y Propagación: * Cread dos excepciones propias (Unchecked - RuntimeException): EquipoLlenoException y EquipoNoExisteException.
El comportamiento de añadir un jugador a un equipo debe comprobar la constante. Si el equipo ya tiene 5 jugadores, lanza la excepción. ¡Ojo aquí! Este comportamiento NO debe capturar la excepción. Debe propagarla hacia arriba. Será el Main (la clase que hace de interfaz de usuario) quien tenga el bloque try-catch para mostrar el mensaje de error al usuario.
Flujo y Bucles:
Desarrollad una acción que, pasándole el nombre de un equipo, recorra a sus jugadores con un bucle for clásico (usando índices) para sumar sus puntuaciones y devuelva la media del equipo. Si el equipo no existe, debe lanzar la excepción correspondiente.
Desarrollad una acción estática (método de clase) que reciba dos listas de jugadores, calcule la media de ambas y devuelva un String diciendo qué equipo es matemáticamente superior.
*/
public class Principal {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {;
        try {
            Equipo equipo1 = new Equipo("deportivo");
            Equipo equipo3 = new Equipo("sevilla", new ArrayList<>(Arrays.asList(new Jugador("Ramos", 89, "Defensa"))));
            Equipo equipo2 = new Equipo("celta", new ArrayList(Arrays.asList(new Jugador("Aspas", 89, "Delantero"), new Jugador("FerLopez", 78, "Centrocampista"), new Jugador("BorjaIglesias", 98, "Delantero"))));
            System.out.println(LigaManager.compararMediaPuntuaciones(equipo3.getPlantilla(), equipo2.getPlantilla()));
        } catch (EquipoLlenoException ele) {
            System.err.println(ele.getMessage());
        }
        System.out.println(LigaManager.getLiga());

        System.out.println("Solicita el nombre de un equipo para ver la media de su plantilla");
        String nombreEquipo = sc.nextLine();
        try {
            System.out.println("La media de la plantilla del equipo " + nombreEquipo + " es " +LigaManager.obtenerMediaPlantillaEquipoString(nombreEquipo));
        } catch (EquipoNoExisteException ene) {
            System.err.println(ene.getMessage());
        }

    }
}
