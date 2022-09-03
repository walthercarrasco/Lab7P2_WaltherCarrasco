
package Main;

/**
 *
 * @author HP
 */
public class Planta {
    
    private String nombre;
    private float ataque;
    private float vida;
    private String rango;

    public Planta() {
    }

    public Planta(String nombre, int ataque, int vida, String rango) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.vida = vida;
        this.rango = rango;
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

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "Planta{" + "nombre=" + nombre + ", ataque=" + ataque + ", vida=" + vida + ", rango=" + rango + '}';
    }
    
    
}
