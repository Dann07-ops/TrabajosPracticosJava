
package trabajopractico3;


public class NaveEspacial {
    private String nombre;
    private int combustible;
    private final int limiteCombustible = 100;
    
public NaveEspacial(String nombre, int combustibleInicial ){
   this.nombre = nombre;
   this.combustible = Math.min(combustibleInicial,limiteCombustible);
}    

public void despegar(){
    if(combustible >= 10){
        combustible -= 10;
        System.out.println(nombre + "Ha despegado");
    }else {
        System.out.println("No hay suficiente combustible para despegar");
    } 
} 

public void avanzar(int distancia){
    if(combustible >= distancia){
        combustible -= distancia;
        System.out.println(nombre + "Avanzo " + distancia + " Km");
    }else {
        System.out.println("Combustible insuficiente para avanzar " + distancia + " Km");
    }
}

public void recargarCombustible(int cantidad){
    if(combustible + cantidad <= limiteCombustible ){
       combustible += cantidad;
        System.out.println("Se recargaron " + cantidad + " unidades de combustible.");
    }else {
        System.out.println("No se puede superar el límite de " + limiteCombustible + " umidades");    
    }
} 
 
public void mostrarEstado(){
    System.out.println("Nave: " + nombre );
    System.out.println("Combustible restante " + combustible + "unidades ");
    System.out.println("-----------------------------");
}

}
