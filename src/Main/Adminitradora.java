
package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Adminitradora {
    
    File txtzombies = null;
    File txtplantas = null;
    ArrayList<Zombie> zombies = new ArrayList<>();
    ArrayList<Planta> plantas = new ArrayList<>();

    public Adminitradora() {
        txtplantas = new File("./Plantas.txt");
        txtzombies = new File("./Zombies.txt");
    }

    public File getTxtzombie() {
        return txtzombies;
    }

    public void setTxtzombie(File txtzombie) {
        this.txtzombies = txtzombie;
    }

    public File getTxtplantas() {
        return txtplantas;
    }

    public void setTxtplantas(File txtplantas) {
        this.txtplantas = txtplantas;
    }

    public ArrayList<Zombie> getZombies() {
        return zombies;
    }

    public void setZombies(ArrayList<Zombie> zombies) {
        this.zombies = zombies;
    }

    public ArrayList<Planta> getPlantas() {
        return plantas;
    }

    public void setPlantas(ArrayList<Planta> plantas) {
        this.plantas = plantas;
    }
    
    public void cargarPlanta() throws IOException{
        FileReader fr = null;
        BufferedReader br = null;
        try{
            if(txtplantas.exists()){
                
                fr = new FileReader(txtplantas);
                br = new BufferedReader(fr);
                String[] plan = br.readLine().split("\\|");
                String nombre = "";
                float ataque = 0;
                float vida = 0;
                String rango = "";
                
                for (int i = 0; i < plan.length; i++) {
                    
                    String[] atributos = plan[i].split("_");
                    
                    if(atributos[0].contains("Nombre")){
                        String[] atrigenerales = atributos[0].split(",");
                        for(int j = 0; j < atrigenerales.length; j++ ){
                            String[] a = atrigenerales[j].split("=");
                            if(a[0].equalsIgnoreCase("Nombre")){
                                nombre = a[1];
                            }else if(a[0].equalsIgnoreCase("Vida")){
                                vida = Float.parseFloat(a[1]);
                            }else if(a[0].equalsIgnoreCase("Rango")){
                                rango = a[1];
                            }else if(a[0].equalsIgnoreCase("Ataque")){
                                ataque = Float.parseFloat(a[1]);
                            }
                        }
                        
                        String[] n = atributos[1].split(":");
                        if(n[0].equalsIgnoreCase("Disparo")){
                            String proyectil = "";
                            String color = "";
                            String at = n[1].substring(1, n[1].length() - 1);
                            String[] atri2 = at.split(";");
                            for (String atr : atri2) {
                                String[] a = atr.split("=");
                                if(a[0].equalsIgnoreCase("Proyectil")){
                                    proyectil = a[1];
                                }else if(a[0].equalsIgnoreCase("Color")){
                                    color = a[1];
                                }
                            }
                            Planta p = new Disparo();
                            p.setAtaque(ataque);
                            p.setNombre(nombre);
                            p.setRango(rango);
                            p.setVida(vida);
                            ((Disparo)p).setProyectil(proyectil);
                            ((Disparo)p).setColor(color);
                            plantas.add(p);
                        }else if(n[0].equalsIgnoreCase("Explosiva")){
                            String sub = n[1].substring(1, n[1].length() - 1);
                            String[] m = sub.split("=");
                            int magnitud = Integer.parseInt(m[1]);
                            Planta p = new Explosiva();
                            p.setAtaque(ataque);
                            p.setNombre(nombre);
                            p.setRango(rango);
                            p.setVida(vida);
                            ((Explosiva)p).setMagnitud(magnitud);
                            plantas.add(p);
                        }else if(n[0].equalsIgnoreCase("Defensa")){
                            String sub = n[1].substring(1, n[1].length() - 1);
                            String[] m = sub.split(";");
                            int altura = 0;
                            int dureza = 0;
                            int peso = 0;
                            for (String atr : m) {
                                String[] a = atr.split("=");
                                if(a[0].equalsIgnoreCase("Altura")){
                                    altura = Integer.parseInt(a[1]);
                                }else if(a[0].equalsIgnoreCase("Dureza")){
                                    dureza = Integer.parseInt(a[1]);
                                }else if(a[0].equalsIgnoreCase("Peso")){
                                    peso = Integer.parseInt(a[1]);
                                }
                            } 
                            Planta p = new Defensa();
                            p.setAtaque(ataque);
                            p.setNombre(nombre);
                            p.setRango(rango);
                            p.setVida(vida);
                            ((Defensa)p).setAltura(altura);
                            ((Defensa)p).setDureza(dureza);
                            ((Defensa)p).setPeso(peso);
                            plantas.add(p);
                        }
                        
                    }else if(atributos[1].contains("Nombre")){
                        
                        String[] atrigenerales = atributos[1].split(",");
                        
                        for(int j = 0; j < atrigenerales.length; j++ ){
                            String[] a = atrigenerales[j].split("=");
                            if(a[0].equalsIgnoreCase("Nombre")){
                                nombre = a[1];
                            }else if(a[0].equalsIgnoreCase("Vida")){
                                vida = Float.parseFloat(a[1]);
                            }else if(a[0].equalsIgnoreCase("Rango")){
                                rango = a[1];
                            }else if(a[0].equalsIgnoreCase("Ataque")){
                                ataque = Float.parseFloat(a[1]);
                            }
                        }
                        
                        
                        String[] n = atributos[0].split(":");
                        if(n[0].equalsIgnoreCase("Disparo")){
                            String proyectil = "";
                            String color = "";
                            String at = n[1].substring(1, n[1].length() - 1);
                            String[] atri2 = at.split(";");
                            for (String atr : atri2) {
                                String[] a = atr.split("=");
                                if(a[0].equalsIgnoreCase("Proyectil")){
                                    proyectil = a[1];
                                }else if(a[0].equalsIgnoreCase("Color")){
                                    color = a[1];
                                }
                            }
                            Planta p = new Disparo();
                            p.setAtaque(ataque);
                            p.setNombre(nombre);
                            p.setRango(rango);
                            p.setVida(vida);
                            ((Disparo)p).setProyectil(proyectil);
                            ((Disparo)p).setColor(color);
                            plantas.add(p);
                        }else if(n[0].equalsIgnoreCase("Explosiva")){
                            String sub = n[1].substring(1, n[1].length() - 1);
                            String[] m = sub.split("=");
                            int magnitud = Integer.parseInt(m[1]);
                            Planta p = new Explosiva();
                            p.setAtaque(ataque);
                            p.setNombre(nombre);
                            p.setRango(rango);
                            p.setVida(vida);
                            ((Explosiva)p).setMagnitud(magnitud);
                            plantas.add(p);

                        }else if(n[0].equalsIgnoreCase("Defensa")){
                            String sub = n[1].substring(1, n[1].length() - 1);
                            String[] m = sub.split(";");
                            int altura = 0;
                            int dureza = 0;
                            int peso = 0;
                            for (String atr : m) {
                                String[] a = atr.split("=");
                                if(a[0].equalsIgnoreCase("Altura")){
                                    altura = Integer.parseInt(a[1]);
                                }else if(a[0].equalsIgnoreCase("Dureza")){
                                    dureza = Integer.parseInt(a[1]);
                                }else if(a[0].equalsIgnoreCase("Peso")){
                                    peso = Integer.parseInt(a[1]);
                                }
                            } 
                            Planta p = new Defensa();
                            p.setAtaque(ataque);
                            p.setNombre(nombre);
                            p.setRango(rango);
                            p.setVida(vida);
                            ((Defensa)p).setAltura(altura);
                            ((Defensa)p).setDureza(dureza);
                            ((Defensa)p).setPeso(peso);
                            plantas.add(p);
                        }                        
                    }
                }
                br.close();
                fr.close();                
            }

        }catch(Exception ex){
            
        }

    }
    
    public void cargarZombies(){
        FileReader fr = null;
        BufferedReader br = null;
        try{
            if(txtzombies.exists()){
                
                
                fr = new FileReader(txtzombies);
                br = new BufferedReader(fr);
                
                String[] zom = br.readLine().split("\\|");
                
                String nombre = "";
                float ataque = 0;
                float vida = 0;
                
                for (int i = 0; i < zom.length; i++) {
                    String[] atributos = zom[i].split("_");
                    
                    if(atributos[0].contains("Nombre")){
                        
                        
                        String[] atrigenerales = atributos[0].split(",");
                        for(int j = 0; j < atrigenerales.length; j++ ){
                            String[] a = atrigenerales[j].split("=");
                            if(a[0].equalsIgnoreCase("Nombre")){
                                nombre = a[1];
                            }else if(a[0].equalsIgnoreCase("Vida")){
                                vida = Float.parseFloat(a[1]);
                            }else if(a[0].equalsIgnoreCase("Ataque")){
                                ataque = Float.parseFloat(a[1]);
                            }
                        }
                        String[] n = atributos[1].split(":");
                        
                        if(n[0].equalsIgnoreCase("CLasico")){
                            int experiencia = 0;
                            String color = "";
                            String direccion = "";
                            Bandera bandera = new Bandera();
                            
                            String at = n[1].substring(1, n[1].length() - 1);
                            String[] atri2 = at.split(";");
                            if(atri2[0].contains("Experiencia")){
                                
                                String[] x = atri2[0].split("=");
                                experiencia = Integer.parseInt(x[1]);
                                
                                String b = atri2[1].substring(8, atri2[1].length() - 1);
                                String[] atriban = b.split(",");
                                for (String a : atriban) {
                                    String[] a2 = a.split("/");
                                    if(a.contains("Color")){
                                        color = a2[1];
                                        bandera.setColor(color);
                                    }
                                    if(a.contains("Direccion")){
                                        direccion = a2[1];
                                        bandera.setDireccion(direccion);
                                    }
                                }
                            }else{
                                String[] x = atri2[1].split("=");
                                experiencia = Integer.parseInt(x[1]);
                                
                                String b = atri2[0].substring(8, atri2[0].length() - 1);
                                String[] atriban = b.split(",");
                                for (String a : atriban) {
                                    String[] a2 = a.split("/");
                                    if(a.contains("Color")){
                                        color = a2[1];
                                    }
                                    if(a.contains("Direccion")){
                                        direccion = a2[1];
                                    }
                                }
                                bandera = new Bandera(color, direccion);  
                            }
                            Zombie zombie = new Clasico();
                            zombie.setAtaque(ataque);
                            zombie.setNombre(nombre);
                            zombie.setVida(vida);
                            ((Clasico)zombie).setExperiencia(experiencia);
                            ((Clasico)zombie).setFlag(bandera);
                            zombies.add(zombie);
                        }else if(n[0].equalsIgnoreCase("Cargado")){
                            String sub = n[1].substring(1, n[1].length() - 1);
                            String[] m = sub.split(";");
                            int enojo = 0;
                            int edad = 0;
                            int tamano = 0;
                            ArrayList<String> comidos = new ArrayList<>();
                            for (String m2 : m) {
                                String[] ma = m2.split("=");
                                if(ma[0].equalsIgnoreCase("Enojo")){
                                    enojo = Integer.parseInt(ma[1]);
                                }else if(ma[0].equalsIgnoreCase("Edad")){
                                    edad = Integer.parseInt(ma[1]);
                                }else if (ma[0].equalsIgnoreCase("Comidos")){
                                    String[] comido = ma[1].substring(1, ma[1].length() - 1).split(",");
                                    for (String string : comido) {
                                        comidos.add(string);
                                    }
                                }else if(ma[0].equalsIgnoreCase("Tamano")){
                                    tamano = Integer.parseInt(ma[1]);
                                }
                            }
                            Zombie z = new Cargado();
                            z.setAtaque(ataque);
                            z.setNombre(nombre);
                            z.setVida(vida);
                            
                            ((Cargado)z).setTamano(tamano);
                            ((Cargado)z).setComidos(comidos);
                            ((Cargado)z).setEnojo(enojo);
                            ((Cargado)z).setEdad(edad);
                            zombies.add(z);
                        }
                        
                    }else if(atributos[1].contains("Nombre")){
                        String[] atrigenerales = atributos[1].split(",");
                        
                        for(int j = 0; j < atrigenerales.length; j++ ){
                            String[] a = atrigenerales[j].split("=");
                            if(a[0].equalsIgnoreCase("Nombre")){
                                nombre = a[1];
                            }else if(a[0].equalsIgnoreCase("Vida")){
                                vida = Float.parseFloat(a[1]);
                            }else if(a[0].equalsIgnoreCase("Ataque")){
                                ataque = Float.parseFloat(a[1]);
                            }
                        }
                        String[] n = atributos[0].split(":");
                        
                        if(n[0].equalsIgnoreCase("CLasico")){
                            int experiencia = 0;
                            String color = "";
                            String direccion = "";
                            Bandera bandera = new Bandera();
                            
                            String at = n[1].substring(1, n[1].length() - 1);
                            String[] atri2 = at.split(";");
                            
                            if(atri2[0].contains("Experiencia")){
                                
                                String[] x = atri2[0].split("=");
                                experiencia = Integer.parseInt(x[1]);
                                
                                String b = atri2[1].substring(8, atri2[1].length() - 1);
                                String[] atriban = b.split(",");
                                for (String a : atriban) {
                                    String[] a2 = a.split("/");
                                    if(a.contains("Color")){
                                        color = a2[1];
                                        bandera.setColor(color);
                                    }
                                    if(a.contains("Direccion")){
                                        direccion = a2[1];
                                        bandera.setDireccion(direccion);
                                    }
                                }
                            }else{
                                
                                String[] x = atri2[1].split("=");
                                experiencia = Integer.parseInt(x[1]);
                                
                                String b = atri2[0].substring(8, atri2[0].length() - 1);
                                String[] atriban = b.split(",");
                                for (String a : atriban) {
                                    String[] a2 = a.split("/");
                                    if(a.contains("Color")){
                                        color = a2[1];
                                    }
                                    if(a.contains("Direccion")){
                                        direccion = a2[1];
                                    }
                                }
                                bandera = new Bandera(color, direccion);                               
                            }
                            Zombie zombie = new Clasico();
                            zombie.setAtaque(ataque);
                            zombie.setNombre(nombre);
                            zombie.setVida(vida);
                            ((Clasico)zombie).setExperiencia(experiencia);
                            ((Clasico)zombie).setFlag(bandera);
                            zombies.add(zombie);
                        }else if(n[0].equalsIgnoreCase("Cargado")){
                            String sub = n[1].substring(1, n[1].length() - 1);
                            String[] m = sub.split(";");
                            int enojo = 0;
                            int edad = 0;
                            int tamano = 0;
                            ArrayList<String> comidos = new ArrayList<>();
                            for (String m2 : m) {
                                String[] ma = m2.split("=");
                                if(ma[0].equalsIgnoreCase("Enojo")){
                                    enojo = Integer.parseInt(ma[1]);
                                }else if(ma[0].equalsIgnoreCase("Edad")){
                                    edad = Integer.parseInt(ma[1]);
                                }else if (ma[0].equalsIgnoreCase("Comidos")){
                                    String[] comido = ma[1].substring(1, ma[1].length() - 1).split(",");
                                    for (String string : comido) {
                                        comidos.add(string);
                                    }
                                }else if(ma[0].equalsIgnoreCase("Tamano")){
                                    tamano = Integer.parseInt(ma[1]);
                                }
                            }
                            Zombie z = new Cargado();
                            z.setAtaque(ataque);
                            z.setNombre(nombre);
                            z.setVida(vida);
                            
                            ((Cargado)z).setTamano(tamano);
                            ((Cargado)z).setComidos(comidos);
                            ((Cargado)z).setEnojo(enojo);
                            ((Cargado)z).setEdad(edad);
                            zombies.add(z);
                        }                        
                        
                    }
                }
                br.close();
                fr.close();                
            }

        }catch(Exception ex){
            ex.printStackTrace();
        }        
    }
}
