package proyectofuturo;

/**
 *
 * @author James Lomax
 */
public class ProyectoFuturo {

    public static void main(String[] args) {
        
        String nombre="James Lomax";
        int modulos=7;
        int horas=30;
        
        System.out.println("Estudiante " + args[0] + " : ");

    }
    
    private static String veredicto(String valor1, String valor2) {
            
            if (valor1.equals(valor2)) {
            return "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
            }
            if (Integer.valueOf(valor1) < Integer.valueOf(valor2)){
             return "Poco tiempo de estudio. Debes dedicar más tiempo.";
            }
            return "Ideal. Trabajas los contenidos en casa.";
           
        }
    
}
