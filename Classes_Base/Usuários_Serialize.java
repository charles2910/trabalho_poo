package Classes_Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Classe responsável por salvar em arquivo os usuários
 * @author Mateus Medeiros 9266410
 */
public class Usuários_Serialize {  
    public Usuários_Serialize() {  
        
    }
    
    protected ArrayList<Usuário> getUserList(){
         try{
            FileInputStream userList = new FileInputStream("lista_usuários");
            ObjectInputStream in = new ObjectInputStream(userList);
            System.out.println("Base de usuários lida com sucesso");
            return (ArrayList<Usuário>) in.readObject();
        }
        catch (FileNotFoundException e1){
            System.out.println("Programa sem usuários cadastrados, iniciando uma nova sessão");
        }
        catch(IOException e2){
        }
        catch(ClassNotFoundException e3){
            System.out.println("ERRO: Não foi encontrado a classe ArrayList<Usuário>");
        }
         return null;
    }
    
    protected void saveUserList(ArrayList<Usuário> listaUsuários){
        try{
            FileOutputStream userListOut = new FileOutputStream("lista_usuários");
            ObjectOutputStream out = new ObjectOutputStream(userListOut);
            out.writeObject(listaUsuários);
            out.close();
            userListOut.close();
            System.out.println("Base de usuários salva com sucesso");
        }
        catch(IOException e2){
            System.out.println("ERRO: Não foi possível salvar em arquivo os usuários.");
        }  
    }
}
