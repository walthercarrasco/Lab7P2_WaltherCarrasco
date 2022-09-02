
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
                for (int i = 0; i < plan.length; i++) {
                    String[] atri1 = plan[i].split("_");
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
