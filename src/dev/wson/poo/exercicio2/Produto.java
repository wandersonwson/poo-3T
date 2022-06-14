package dev.wson.poo.exercicio2;

public class Produto {
    private int id;
    private String nome;
    private int sessao;
    private String tipo;
    private int quantidade;
    private String marca;
    private static int contador;

    public Produto(String nome, int sessao, String tipo, int quantidade, String marca) {
        contador++;
        id = contador;
        this.nome = nome;
        this.sessao = sessao;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.marca = marca;
    }
    public int getID() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getSessao() {
        return sessao;
    }
    public void setSessao(int sessao) {
        this.sessao = sessao;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    @Override
    public String toString() {
        return  nome + " [ID: #" + id + ", marca: " + marca + ", quantidade: " + quantidade + ", sessao: "
                + sessao + ", tipo: " + tipo + "]";
    }
}