
package Main;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Cargado extends Zombie{
    
    private double tamano;
    private int edad;
    private ArrayList<String> comidos = new ArrayList<>();  
    private int enojo;
    
    public Cargado() {
        super();
    }

    public Cargado(double tamano, int edad, int enojo, String nombre, float ataque, float vida) {
        super(nombre, ataque, vida);
        this.tamano = tamano;
        this.edad = edad;
        this.enojo = enojo;
    }
    

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<String> getComidos() {
        return comidos;
    }

    public void setComidos(ArrayList<String> comidos) {
        this.comidos = comidos;
    }
    
    
}
