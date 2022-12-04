package Entidades;

import java.time.LocalDate;


public class Aluno extends Pessoa{
    private String serie;

    public Aluno(String serie, int id, String nome, Genero genero, String email, String cpf, LocalDate dataNasc) {
        super(id, nome, genero, email, cpf, dataNasc);
        this.serie = serie;
    }    

    public Aluno(){
    }
    
    public String getSerie() {
        return serie;
    }

    public void setSerie(String Serie) {
        this.serie = Serie;
    }
}
