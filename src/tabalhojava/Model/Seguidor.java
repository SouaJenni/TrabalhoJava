/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabalhojava.Model;

import java.util.Date;
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

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
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

    public void setDataInscricao(Date dataInscricao) {
        this.dataInscricao = dataInscricao;
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
    public boolean validarApelido(String apelido){
        Pattern pattern = Pattern.compile(APELIDO_REGEX);
        Matcher matcher = pattern.matcher(apelido);
        
        return matcher.matches();
    }
}
