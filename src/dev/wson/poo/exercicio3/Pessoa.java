package dev.wson.poo.exercicio3;

public class Pessoa {
    protected String nome;
    protected String RG;
    protected String CPF;

    public Pessoa(String nome, String RG, String CPF) {
        this.nome = nome;
        this.RG = RG;
        this.CPF = CPF;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRG() {
        return RG;
    }
    public void setRG(String rG) {
        RG = rG;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
}