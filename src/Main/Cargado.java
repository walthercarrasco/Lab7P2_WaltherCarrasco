
package Main;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Cargado extends Zombie{
    
    private float tamano;
    private int edad;
    private ArrayList<String> comidos = new ArrayList<>();  
    private int enojo;
    
    public Cargado() {
        super();
    }

    public Cargado(int tamano, int edad, int enojo, String nombre, int ataque, int vida) {
        super(nombre, ataque, vida);
        this.tamano = tamano;
        this.edad = edad;
        this.enojo = enojo;
    }
    

    public double getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
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

    public int getEnojo() {
        return enojo;
    }

    public void setEnojo(int enojo) {
        this.enojo = enojo;
    }
    
    
}
