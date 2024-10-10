/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabalhojava.Model;

import java.awt.List;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Daniel Dória
 */
public class Usuario {
    private String nome;
    private String email;
    private Date nascimento;
    private String apelido;
    private String senha;

    public Usuario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(String data) throws Exception{
        LocalDateTime dataNasc = converterStringParaLocalDate(data);
        Date nascimento = converterLocalDateParaDate(dataNasc);
        this.nascimento = nascimento;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public boolean validarSenha(String senha, String confirmacao){
        if(senha.length() < 8){
            return false;
        }
        
        return senha.equals(confirmacao);
    }
    public boolean validarEmail (String email, ArrayList<Usuario> usuarios){
        for(Usuario u: usuarios){
            if(email.equals(u.email)){
                return false;
            }
        }
        return validarEmailRegex(email);
    }
    
    public boolean validarApelido (String apelido, ArrayList<Usuario> usuarios){
        for(Usuario u: usuarios){
            if(apelido.equals(u.apelido)){
                return false;
            }
        }
        return true;
    }
    
        private static final String EMAIL_REGEX = "^[_A-Za-z0-9-+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        private boolean validarEmailRegex(String email) {
            Pattern pattern = Pattern.compile(EMAIL_REGEX);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }
    
        public Date converterLocalDateParaDate(LocalDateTime data){
            Date nascimento = Date.from(data.atZone(ZoneId.systemDefault()).toInstant());
            
            return nascimento;
        }  
        
         public int calcularIdade(String nascimento)throws Exception{
            LocalDateTime dataNascimento = converterStringParaLocalDate(nascimento);
            
            LocalDateTime hoje = LocalDateTime.now();

            long idade = dataNascimento.until(hoje, ChronoUnit.YEARS);
            
            return (int) idade;
        }
    
        public LocalDateTime converterStringParaLocalDate(String data)throws Exception{
            String DATE_REGEX = "^\\d{2}/\\d{2}/\\d{4}$";
            Pattern pattern = Pattern.compile(DATE_REGEX);
            Matcher matcher = pattern.matcher(data);
            if (!matcher.matches()) {
                throw new Exception("Formato de data inválido! Utilize DD/MM/AAAA");
            }
            try{
                int dia = Integer.parseInt(data.substring(0,2));
                int mes = Integer.parseInt(data.substring(3,5));
                int ano = Integer.parseInt(data.substring(6,10));
                LocalDateTime dataNascimento = LocalDateTime.of(ano, mes, dia, 0, 0, 0);
                
                return dataNascimento;
            }catch(Exception e){
                throw new Exception("Data inválida! O dia, mês e ano devem existir");
            }       
    }   
        
        public boolean validarIdade(String nascimento) throws Exception{
            int idade = calcularIdade(nascimento);

            return idade >= 18; 
        }
}
