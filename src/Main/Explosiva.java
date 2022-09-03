
package Main;

/**
 *
 * @author HP
 */
public class Explosiva extends Planta{
    private int magnitud;

    public Explosiva() {
        super();
    }

    public Explosiva(int magnitud, String nombre, int ataque, int vida, String rango) {
        super(nombre, ataque, vida, rango);
        this.magnitud = magnitud;
    }

    public int getMagnitud() {
        return magnitud;
    }

    public void setMagnitud(int magnitud) {
        this.magnitud = magnitud;
    }

    @Override
    public String toString() {
        return "Explosiva{" + "magnitud=" + magnitud + super.toString();
    }
    
    

}
