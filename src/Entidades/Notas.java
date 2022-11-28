package Entidades;


public class Notas {
    
    private int id;
    private double Nota1;
    private double Nota2;
    private double Nota3;
    private double Nota4;
    private int Ano;
    private int idAluno;
    private int idProfessor;

    public Notas(int id, double Nota1, double Nota2, double Nota3, double Nota4, int Ano, int idAluno, int idProfessor) {
        this.id = id;
        this.Nota1 = Nota1;
        this.Nota2 = Nota2;
        this.Nota3 = Nota3;
        this.Nota4 = Nota4;
        this.Ano = Ano;
        this.idAluno = idAluno;
        this.idProfessor = idProfessor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getNota1() {
        return Nota1;
    }

    public void setNota1(double Nota1) {
        this.Nota1 = Nota1;
    }

    public double getNota2() {
        return Nota2;
    }

    public void setNota2(double Nota2) {
        this.Nota2 = Nota2;
    }

    public double getNota3() {
        return Nota3;
    }

    public void setNota3(double Nota3) {
        this.Nota3 = Nota3;
    }

    public double getNota4() {
        return Nota4;
    }

    public void setNota4(double Nota4) {
        this.Nota4 = Nota4;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    
}
