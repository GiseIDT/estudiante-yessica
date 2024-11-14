package curso;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    public static void main(String[] args) {
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Yessica", "Dieguez", 5, 01));
        estudiantes.add(new Estudiante("Priscila", "Mendez", 6, 02));

        System.out.println("Los estudiantes son:");
        for (Estudiante estudianteactual1 : estudiantes) {
            System.out.println("nombre: " + estudianteactual1.getNombre() + " " + estudianteactual1.getApellido() + " Calificacion:  " + estudianteactual1.getCalificacion() + " ID: " + estudianteactual1.getId());

        }

        int idBuscado = 01;

        boolean encontrado = false;
        int i = 0;
        while (i < estudiantes.size() && encontrado) {
            Estudiante estudianteactual = estudiantes.get(i);

            if (estudianteactual.getId().equalsIgnoreCase(idBuscado)) {
                System.out.println("El alumno es: " + estudianteactual.getNombre() + estudianteactual.getApellido());
                encontrado = true;
            }
            i++;
        }
        if (!encontrado) {
            System.out.println("El alumno no se encontro");
        }

        int idModificar = 02;
        for (Estudiante estudianteactual1 : estudiantes) {
            if (estudianteactual1.getId().equalsIgnoreCase(idModificar)) {
                estudianteactual1.setCalificacion(9);
                System.out.println("La calificacion de " + estudianteactual1.getNombre() + " actualizada es : " + estudianteactual1.getCalificacion());

            }

         estudiantes.remove(01);
         
          Estudiante nuevoEstudiante = new Estudiante("Jeydan", "Mendez", 2, 003);
          if(estudiantes.contains(nuevoEstudiante)){
              System.out.println("El alumno ya esta en la lista");
          }else {
              estudiantes.add(nuevoEstudiante);
          }
          
          
          System.out.println("Los estudiantes son:");
        for (Estudiante estudianteactual1 : estudiantes) {
            System.out.println("nombre: " + estudianteactual1.getNombre() + " " + estudianteactual1.getApellido() + " Calificacion:  " + estudianteactual1.getCalificacion() + " ID: " + estudianteactual1.getId());

        }
        }
        
    
    }


