package herencia2;
import herencia1.EstudiantePresencial;
import herencia1.EstudianteDistancia;

public class Ejecutor4 {
    
    public static void main(String[] args) {
        // Objeto de tipo Estudiante Presencial
        EstudiantePresencial e1 = new EstudiantePresencial();
        
        e1.establecerNombresEstudiante("Rene Rolando");
        e1.establecerApellidoEstudiante("Elizalde Solano");
        e1.establecerIdentificacionEstudiante("1104111111");
        e1.establecerEdadEstudiante(38);
        e1.establecerNumeroCreditos(30);
        e1.establecerCostoCredito(15);
        e1.calcularMatriculaPresencial();
        
        System.out.printf("%s\n", e1);
        
    }
}
