
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
}
