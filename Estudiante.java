
package trabajopractico3;


public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    public Estudiante(String nombre, String apellido, String curso, double calificacion ){
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion= calificacion;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }
    
    public void subirCalificacion(double puntos){
        calificacion += puntos;
        System.out.println("Calificación aumentada a: " + calificacion);
    }
    
    public void bajarCalificacion(double puntos){
        calificacion -= puntos;
        System.out.println("Calificación reducida a: " + calificacion);
    
    }
    
    

    
}
