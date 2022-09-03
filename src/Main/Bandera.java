
package Main;

/**
 *
 * @author HP
 */
public class Bandera {
    private String color;
    private String direccion;

    public Bandera() {
    }

    public Bandera(String color, String direccion) {
        this.color = color;
        this.direccion = direccion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Bandera{" + "color=" + color + ", direccion=" + direccion + '}';
    }
    
    
}
