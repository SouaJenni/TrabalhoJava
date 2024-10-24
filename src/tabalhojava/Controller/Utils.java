/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabalhojava.Controller;

import tabalhojava.Model.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import tabalhojava.Model.Seguidor;

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
    
    public void inicializarSeguidores(ArrayList<Seguidor> seguidores){
        try{
            Seguidor seguidor = new Seguidor ();
            seguidor.setNome("Rodrigo");
            seguidor.setApelido("Rodrizoka");
            seguidor.setNascimento("01/01/2001");
            seguidor.setSexo("M");
            seguidor.setIsSub(false);
            seguidor.setBits(10);
            seguidor.setDataInscricao("25/02/2024");
            
            seguidores.add(seguidor);
            
            seguidor = new Seguidor ();
            seguidor.setNome("Prado");
            seguidor.setApelido("prad0");
            seguidor.setNascimento("01/01/1997");
            seguidor.setSexo("M");
            seguidor.setIsSub(true);
            seguidor.setBits(100);
            seguidor.setDataInscricao("25/02/2023");
            
            seguidores.add(seguidor);
            
            seguidor = new Seguidor ();
            seguidor.setNome("Tai");
            seguidor.setApelido("GlitterTai");
            seguidor.setNascimento("10/04/1999");
            seguidor.setSexo("F");
            seguidor.setIsSub(true);
            seguidor.setBits(120);
            seguidor.setDataInscricao("29/07/2022");
            
            seguidores.add(seguidor);
            
        }catch(Exception e){
            mostrarErro("Algo deu muuito errado!");
        }
    }
}
