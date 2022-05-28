package dev.wson.poo.exercicio4;

public class Gigante extends Personagem {
    public Gigante(String nome, int score) {
        super(nome, 25, score);
    }
    @Override
    void atacar() {
        System.out.println(nome + ": Causei 25 de dano.");
        System.out.println(nome + ": Seu personagem está atordoado");
    }
    @Override
    void apanhar(int dano, Dano tipoDano) {
        if (statusDeVida){
            if (tipoDano == Dano.FOGO){
                score -= dano*2;
                System.out.println(nome + ": Recebi " + (dano*2) + " de dano.");
            } else {
                score -= dano;
                System.out.println(nome + ": Recebi " + dano + " de dano.");
            }
        } else {
            System.out.println(nome + ": Que pena, não resisti aos ataques dos meus inimigos.");
        }
        setCondicaoDeVida();    
    }
    @Override
    void interagir() {
        System.out.println(nome + ": Me desculpe.");
    }
}