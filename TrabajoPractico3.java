
package trabajopractico3;

public class TrabajoPractico3 {

  
    public static void main(String[] args) {
        
        Estudiante estudiante1 = new Estudiante("Daniel", "Alderete", "Programación I", 8.0);
        
        estudiante1.mostrarInfo();
        
        estudiante1.subirCalificacion(1.5);
        
        estudiante1.bajarCalificacion(0.5);
        
        estudiante1.mostrarInfo(); 
    }
    
}
