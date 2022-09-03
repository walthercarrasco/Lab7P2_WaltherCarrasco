
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

    public Zombie(String nombre, int ataque, int vida) {
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

    public float getAtaque() {
        return ataque;
    }

    public void setAtaque(float ataque) {
        this.ataque = ataque;
    }

    public float getVida() {
        return vida;
    }

    public void setVida(float vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Zombie{" + "nombre=" + nombre + ", ataque=" + ataque + ", vida=" + vida + '}';
    }
    
    
    
}
