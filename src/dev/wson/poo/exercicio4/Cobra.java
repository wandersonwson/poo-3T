package dev.wson.poo.exercicio4;

public class Cobra extends Personagem {
    public Cobra(String nome, int score) {
        super(nome, 10, score);
    }
    @Override
    void atacar() {
        System.out.println(nome + ": Causei 10 de dano.");
        System.out.println(nome + ": Seu personagem está envenenado!");
    }
    @Override
    void apanhar(int dano, Dano tipoDano) {
        if (statusDeVida){
            if (tipoDano == Dano.PANCADA){
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
        System.out.println(nome + ": Se você acender a chama a maldição acaba.");
    }
}