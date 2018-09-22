/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import java.util.List;
//import javax.swing.JOptionPane;
import model.Programador;

/**
 *
 * @author crfranco
 */
public class MemoryDataBank implements IDao<Programador>{
    
    private ArrayList<Programador> memoryDataBank = new ArrayList<>(); 

    @Override
    public void save(Programador t) {
        update(t);
        // this.memoryDataBank.add(t);
    }

    @Override
    public List<Programador> getOne(String caracter) {
        ArrayList<Programador> busca = new ArrayList<Programador>();
        for (Programador p : memoryDataBank){
            if(p.getNome().toLowerCase().contains(caracter.toLowerCase())){
              busca.add(p);
            }
        }
        return busca;
    }

    @Override
    public List<Programador> list() {
        //implementar o list com o busca por 3 caracter
        return memoryDataBank;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Programador t) {
       
        if (!memoryDataBank.contains(t)){
             this.memoryDataBank.add(t);
            // delete( memoryDataBank.indexOf(t));
            
            //memoryDataBank.remove(t);
            //memoryDataBank.add(t);
        }
        else{
            this.delete(t.getCodigo());
            this.memoryDataBank.add(t);
        }
       
     /* for(int i = 0; i < memoryDataBank.size(); i++){
        Programador p = memoryDataBank.get(i);

            if(p.getCodigo()== t.getCodigo()){
                memoryDataBank.remove(p);
                memoryDataBank.add(t);
            break;
            }//verificar
        }*/
      
    }
     
    @Override
    public void delete(int id) {
      for(int i = 0; i < memoryDataBank.size(); i++){
        Programador p = memoryDataBank.get(i);

        if(p.getCodigo()==id){

            memoryDataBank.remove(p);
            break;
            }
        }
    }
}
