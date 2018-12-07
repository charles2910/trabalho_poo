package Classes_Base;

import java.util.ArrayList;

/**
 *
 * @author Mateus
 */
public class Usuários {
    private ArrayList<Usuário> listaUsuários;
    
    private int ADMcount = 0;
    
    
    //Sempre que a base de usuários for mexida (ex: alterar senha, ID, inclusão 
    //de novo usuário, alterar status de ADM, etc) esse método deverar ser chamado.
    //Esse método atualiza os parâmetros e serializa.
    public void atualiza(){
        this.ADMcount = 0;
        for(Usuário u : listaUsuários){
            if(u.isADM()) ADMcount++;
        }
        
    }
    
    public int getADMcount(){
        return this.ADMcount;
    }
    
    Usuários(){
        listaUsuários = new ArrayList<>();
        
    }
    
    public void addUsuário(Usuário u){
        listaUsuários.add(u);
    }
    
    public ArrayList<Usuário> getUserList(){
        return listaUsuários;
    }
    
    public void recuperaListaDoArquivo(){
        
    }
    
    public void removerUsuário(Usuário r){
        listaUsuários.remove(r);
    }
    
    public Usuário BuscaUsuário(String userID){ //método que recupera um usuário da lista caso ele exista, busca por ID
        for(Usuário u : listaUsuários){
            if(u.getID().compareTo(userID) == 0) return u;
        }
        return null;
    }
}
