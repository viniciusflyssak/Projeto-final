package Entidades;

public enum Genero {
   MASCULINO("Masculino"),
   FEMININO("Feminino"), 
   OUTRO("Outro");
   
   private String descricao;

    private Genero(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
   
}
