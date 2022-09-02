
package Main;

/**
 *
 * @author HP
 */
public class Defensa extends Planta{
    private int altura;
    private int dureza;
    private int peso;

    public Defensa() {
        super();
    }

    public Defensa(int altura, int dureza, int peso, String nombre, int ataque, int vida, String rango) {
        super(nombre, ataque, vida, rango);
        this.altura = altura;
        this.dureza = dureza;
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getDureza() {
        return dureza;
    }

    public void setDureza(int dureza) {
        this.dureza = dureza;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    

}
