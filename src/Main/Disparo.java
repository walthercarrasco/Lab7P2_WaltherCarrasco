
package Main;

/**
 *
 * @author HP
 */
public class Disparo extends Planta{
    
    private String proyectil;
    private String color;

    public Disparo() {
        super();
        
    }

    public Disparo(String proyectil, String color, String nombre, int ataque, int vida, String rango) {
        super(nombre, ataque, vida, rango);
        this.proyectil = proyectil;
        this.color = color;
    }

    public String getProyectil() {
        return proyectil;
    }

    public void setProyectil(String proyectil) {
        this.proyectil = proyectil;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Disparo{" + "proyectil=" + proyectil + ", color=" + color +  super.toString();
    }
    
    
    
    
}
