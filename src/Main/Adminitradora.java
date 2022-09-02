
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
    
    File txtzombie = new File("./Zombies");
    File txtplantas = new File("./Plantas");
    ArrayList<Zombie> zombies = new ArrayList<>();
    ArrayList<Planta> plantas = new ArrayList<>();

    public Adminitradora() {
    }

    public File getTxtzombie() {
        return txtzombie;
    }

    public void setTxtzombie(File txtzombie) {
        this.txtzombie = txtzombie;
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
    
    public void cargar() throws IOException{
        FileReader fr = null;
        BufferedReader br = null;
        try{
            if(txtplantas.exists()){
                fr = new FileReader(txtplantas);
                br = new BufferedReader(fr);
                String[] plan = br.readLine().split("|");
                
                String nombre = "";
                float ataque = 0;
                float vida = 0;
                String rango = "";
                
                
                Planta planta = new Planta();
                
                for (int i = 0; i < plan.length; i++) {
                    String[] atributos = plan[i].split("_");
                    
                    if(atributos[0].contains("Nombre")){
                        String[] atrigenerales = atributos[0].split(",");
                        for(int j = 0; j < atrigenerales.length; j++ ){
                            String[] a = atrigenerales[i].split("=");
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
                        if(n[0].equals("Disparo")){
                            String proyectil = "";
                            String color = "";
                            String at = n[1].substring(1, n[1].length() - 2);
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
                        }
                    }else if(atributos[1].contains("Nombre")){
                        String[] atrigenerales = atributos[1].split(",");
                    }
                }
            }
            if(txtzombie.exists()){
                
            }
        }catch(Exception ex){
            
        }
        br.close();
        fr.close();
    }
}
