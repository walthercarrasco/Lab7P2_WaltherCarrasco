
package Main;

/**
 *
 * @author HP
 */
public class Planta {
    String nombre;
    int ataque;
    int vida;
    String rango;

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

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }
    

}
