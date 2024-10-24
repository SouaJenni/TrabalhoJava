/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabalhojava.Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Daniel Dória
 */
public class Seguidor {
    private String nome;
    private String sexo;
    private Date nascimento;
    private String apelido;
    private Date dataInscricao;
    private int bits;
    private boolean isSub;

    public Seguidor() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(String data) throws Exception{
        LocalDateTime dataNasc = converterStringParaLocalDate(data);
        Date nascimento = converterLocalDateParaDate(dataNasc);
        this.nascimento = nascimento;
    }
    
    public String dataToString(Date data){
        String pattern = "dd/MM/yyyy";
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        
        return dateFormat.format(data);
    }
    
    public int getIdade() {
        String nascimento = dataToString(this.nascimento);
        
        try {
            return calcularIdade(nascimento);
        } catch (Exception ex) {
            return -1;
        }
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Date getDataInscricao() {
        return dataInscricao;
    }

    public void setDataInscricao(String data) throws Exception {
        LocalDateTime dataInsc = converterStringParaLocalDate(data);
        Date inscricao = converterLocalDateParaDate(dataInsc);
        this.dataInscricao = inscricao;
    }

    public int getBits() {
        return bits;
    }

    public void setBits(int bits) {
        this.bits = bits;
    }

    public boolean isIsSub() {
        return isSub;
    }

    public void setIsSub(boolean isSub) {
        this.isSub = isSub;
    }
    
    private static final String APELIDO_REGEX = "^[A-Za-z]{2,}+[A-Za-z0-9+@-]*$";
    public boolean validarApelido(String apelido, ArrayList<Seguidor> seguidores){
        for(Seguidor seguidor : seguidores){
            if(seguidor.getApelido().equals(apelido)){
                return false;
            }
        }
        Pattern pattern = Pattern.compile(APELIDO_REGEX);
        Matcher matcher = pattern.matcher(apelido);
        
        return matcher.matches();
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
        
        public Date converterLocalDateParaDate(LocalDateTime data){
            Date nascimento = Date.from(data.atZone(ZoneId.systemDefault()).toInstant());
            
            return nascimento;
        } 
}
