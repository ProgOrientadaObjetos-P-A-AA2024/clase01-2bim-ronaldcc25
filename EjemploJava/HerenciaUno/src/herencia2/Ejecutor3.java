/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import java.util.Locale;
import java.util.Scanner;
import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;

/**
 *
 * @author reroes
 */
public class Ejecutor3 {
    
    public static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Ingresar por teclado
        // un objeto de tipo Estudiante Distancia si el usuario ingresa 1 como 
        // opción
        // un objeto de tipo Estudiante Presencial si el usuario ingresa 2 como 
        // opción
        System.out.println("| 1 | INGRESAR ESTUDIANTE A DISTANCIA");
        System.out.println("| 2 | INGRESAR ESTUDIANTE A PRESENCIAL");
        int var = leer.nextInt();
        
        leer.nextLine();
        leer.useLocale(Locale.US);
        switch (var) {
            case 1:
                System.out.print("Ingrese nombres: ");
                String nombres = leer.nextLine();

                System.out.print("Ingrese apellidos: ");
                String apellidos = leer.nextLine();

                System.out.print("Ingrese identificación: ");
                String identificacion = leer.nextLine();

                System.out.print("Ingrese edad: ");
                int edad = leer.nextInt();

                System.out.print("Ingrese número de asignaturas: ");
                int asignaturas = leer.nextInt();

                System.out.print("Ingrese costo asignatura: ");
                double costoAsignatura = leer.nextDouble();

                EstudianteDistancia estudiante = new EstudianteDistancia();
                
                estudiante.establecerNombresEstudiante(nombres);
                estudiante.establecerApellidoEstudiante(apellidos);
                estudiante.establecerEdadEstudiante(edad);
                estudiante.establecerIdentificacionEstudiante(identificacion);
                estudiante.establecerNumeroAsginaturas(asignaturas);
                estudiante.establecerCostoAsignatura(costoAsignatura);
                estudiante.calcularMatriculaDistancia();
                
                System.out.printf("%s\n", estudiante);
                break;
            
            case 2:
                System.out.print("Ingrese nombres: ");
                String nombres1 = leer.nextLine();

                System.out.print("Ingrese apellidos: ");
                String apellidos1 = leer.nextLine();

                System.out.print("Ingrese identificación: ");
                String identificacion1 = leer.nextLine();

                System.out.print("Ingrese edad: ");
                edad = leer.nextInt();

                System.out.print("Ingrese número de creditos: ");
                int numCraditos = leer.nextInt();

                System.out.print("Ingrese costo de creditos: ");
                double costoCreditos = leer.nextDouble();

                EstudiantePresencial estudiante1 = new EstudiantePresencial();
                
                estudiante1.establecerNombresEstudiante(nombres1);
                estudiante1.establecerApellidoEstudiante(apellidos1);
                estudiante1.establecerIdentificacionEstudiante(identificacion1);
                estudiante1.establecerEdadEstudiante(edad);                
                estudiante1.establecerNumeroCreditos(var);
                estudiante1.establecerCostoCredito(costoCreditos);
                estudiante1.calcularMatriculaPresencial();
                
                System.out.printf("%s\n", estudiante1);
                break;
                
            default:
                throw new AssertionError();
        }                                              
    }
}
