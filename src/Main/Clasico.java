
package Main;

/**
 *
 * @author HP
 */
public class Clasico extends Zombie{
    
    private int experiencia;
    private Bandera flag;

    public Clasico() {
        super();
    }

    public Clasico(int experiencia, Bandera flag, String nombre, int ataque, int vida) {
        super(nombre, ataque, vida);
        this.experiencia = experiencia;
        this.flag = flag;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public Bandera getFlag() {
        return flag;
    }

    public void setFlag(Bandera flag) {
        this.flag = flag;
    }
    
    
    
}
