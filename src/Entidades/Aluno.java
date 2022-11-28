package Entidades;

import java.time.LocalDate;


public class Aluno extends Pessoa{
    private String Serie;

    public Aluno(String Serie, int id, String nome, Genero genero, String email, String cpf, LocalDate dataNasc) {
        super(id, nome, genero, email, cpf, dataNasc);
        this.Serie = Serie;
    }    

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String Serie) {
        this.Serie = Serie;
    }
}
