
package Main;

/**
 *
 * @author HP
 */
public class Zombie {
    
    private String nombre;
    private float ataque;
    private float vida;

    public Zombie() {
    }

    public Zombie(String nombre, float ataque, float vida) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
