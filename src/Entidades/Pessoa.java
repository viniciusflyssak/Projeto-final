package Entidades;

import java.io.Serializable;
import java.time.LocalDate;

public class Pessoa implements Serializable{
    private int id;
    private String nome;   
    private Genero genero;
    private String email;
    private String cpf;
    private LocalDate dataNasc;

    public Pessoa(int id, String nome, Genero genero, String email, String cpf, LocalDate dataNasc) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.email = email;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }
        

}
