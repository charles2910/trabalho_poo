package Classes_Base;


import java.io.Serializable;

/**
 * Classe que descreve um usuário, com password e senha.
 * @author Mateus 9266410
 */
public class Usuário implements Serializable{
    private String ID;
    private String Password;
    private boolean isADM = false;  //configura se o usuário tem privilégios de adminstrador
    
    public Usuário(String UserID, String UserPassword, boolean isADM){
        this.ID = UserID;
        this.Password = UserPassword;
        this.isADM = isADM;
    }
    
    public String getID(){
        return this.ID;
    }
    
    public void setID(String UserID){
        this.ID = UserID;
    }
    
    public boolean isADM(){
        return isADM;
    }
    
    //método pra mudar o estado do usuário pra ADM ou Operador
    public void putADM(boolean b){
        this.isADM = b;
    }
    
    @Override
    //Esse método é usado pela JCombobox (caixa seletora de usuários) para exibir o nome dos usuários. O Tipo de usuário é adicionado depois da ID de login
    public String toString(){
        if(this.isADM) return this.ID + " (ADM)";
        
        return this.ID + " (Operador)";
    }
    
    //método que testa se o password é igual ao setado.
    public boolean PasswordMatch(String password){
        return (this.Password.compareTo(password) == 0);
    }
    
    public void setPassword(String psw){
        this.Password = psw;
    }
    
    
}
