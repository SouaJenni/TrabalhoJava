/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabalhojava.Controller;

import tabalhojava.Model.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Dória
 */
public class Utils {
    public void mostrarErro(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem, "Erro no formulário", JOptionPane.ERROR_MESSAGE);
            return;
    }
    
    public void inicializarLista(ArrayList<Usuario> usuarios){
        try{
            Usuario usuario = new Usuario();
            usuario.setNome("Jennifer");
            usuario.setEmail("jenni@email.com");
            usuario.setSenha("12345678");
            usuario.setApelido("Jenni");
            usuario.setNascimento("15/12/2000");
            
            usuarios.add(usuario);
        }catch(Exception e){
            mostrarErro("Algo quebrou tudo");
        }
      
    }
}
