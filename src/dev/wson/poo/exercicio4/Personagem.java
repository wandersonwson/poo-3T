package dev.wson.poo.exercicio4;

public abstract class Personagem {
    protected String nome;
    protected final int DANO;
    protected int score;
    protected boolean statusDeVida;
    
    public Personagem(String nome, int dano, int score) {
        this.nome = nome;
        this.DANO = dano;
        this.score = score;
        this.statusDeVida = true;
    }
    public int getDano() {
        return DANO;
    }
    abstract void atacar();
    abstract void apanhar(int dano, Dano tipoDano);
    abstract void interagir();
    public void setCondicaoDeVida(){
        statusDeVida = (score <= 0) ? false : true;
    }
}