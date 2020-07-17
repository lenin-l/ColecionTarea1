/*
 * Diseño e implementación de un algoitmo
 * que nos permita aplicar colección enfocado
* al tema del proyecto
 */
package colecciontarea1;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author LENIN CARRILLO
 */
public class ColeccionTarea1 {
public static void main(String[] args ){
       System.out.println("UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE-L");
   System.out.println("\t    MATERIA DE PROGRAMACIÓN");
   System.out.println("\tCARRERA DE INGENIERÍA AUTOMOTRIZ");
   System.out.println("NOMBRE DEL ESTUDIANTE: LENIN CARRILLO");
    Collection listadoElementosProyecto = new ArrayList<String>();// EL tipo de lista 
    //elementos utilizados en el proyecto0
    listadoElementosProyecto.add("Led");
    listadoElementosProyecto.add("Ventilador");
    listadoElementosProyecto.add("Potenciometro");
    listadoElementosProyecto.add("Transistor");
    listadoElementosProyecto.add("Resistencia 150 ohmios");
    listadoElementosProyecto.add("Resistencia 220 ohmios");
    listadoElementosProyecto.add("Amplificador Operacional");
    listadoElementosProyecto.add("Bateria");
    listadoElementosProyecto.add("Sensor Temperatura");
      listadoElementosProyecto.add("Jumpers Cables Protoboard");
    
System.out.println("Numero de elementos antes de ser eliminados:" + listadoElementosProyecto.size());
System.out.println("\t     LOS ELEMENTOS DEL PROYECTO SON: ");
System.out.println(listadoElementosProyecto.toString());
    listadoElementosProyecto.remove("Led");
    listadoElementosProyecto.remove("Ventilador");
    listadoElementosProyecto.remove("Potenciometro");
    listadoElementosProyecto.remove("Transistor");
    listadoElementosProyecto.remove("Resistencia 150 ohmios");
    listadoElementosProyecto.remove("Amplificador Operacional");
    listadoElementosProyecto.remove("Bateria");
    listadoElementosProyecto.remove("Sensor Temperatura");
    listadoElementosProyecto.remove("Jumpers Cables Protoboard");
System.out.println("Numero de elementos despues de ser eliminados Led, Ventilador, "
        + "\n Potenciometro, Transistor, Resistencia 150 ohmios, Jumpers Cables Protoboard "
        + "\n Amplificador Operacional, Bateria, Sensor Temperatura:"+ listadoElementosProyecto.size());
System.out.println("LOS ELEMENTOS DEL PROYECTO QUE NOS QUEDAN SON: ");
System.out.println(listadoElementosProyecto.toString());
} 
}
