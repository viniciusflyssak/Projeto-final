package Entidades;

import java.time.LocalDate;

public class Professor extends Pessoa{
    
    private String disciplina;

    public Professor(String disciplina, int id, String nome, Genero genero, String email, String cpf, LocalDate dataNasc) {
        super(id, nome, genero, email, cpf, dataNasc);
        this.disciplina = disciplina;
    }    
    
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
