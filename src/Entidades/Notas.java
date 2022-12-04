package Entidades;

import Dao.AlunoDao;
import Dao.ProfessorDao;

public final class Notas {
    
    private int id;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private int ano;
    private Aluno aluno;
    private Professor professor;

    public Notas(int id, double Nota1, double Nota2, double Nota3, double Nota4, int Ano, int idAluno, int idProfessor) {
        this.id = id;
        this.nota1 = Nota1;
        this.nota2 = Nota2;
        this.nota3 = Nota3;
        this.nota4 = Nota4;
        this.ano = Ano;
        this.aluno = new Aluno();
        this.professor = new Professor();
        this.aluno.setId(idAluno);
        this.professor.setId(idProfessor);
        
        buscaAluno();
        buscaProfessor();
    }
    
    public Notas(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    public void buscaProfessor(){
        ProfessorDao professorDao = new ProfessorDao();
        professor = professorDao.findById(professor.getId());
    }
    
    public void buscaAluno(){
        AlunoDao alunoDao = new AlunoDao();
        aluno = alunoDao.findById(aluno.getId());   
    }
}
