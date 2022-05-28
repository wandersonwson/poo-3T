package dev.wson.poo.exercicio4;

public class Vampiro extends Personagem {
    public Vampiro(String nome, int score) {
        super(nome, 20, score);
    }
    @Override
    void atacar() {
        System.out.println(nome + ": Causei 20 de dano.");
        System.out.println(nome + ": Seu personagem está sangrando!");
    }
    @Override
    void apanhar(int dano, Dano tipoDano) {
        if (statusDeVida){
            if (tipoDano == Dano.PERFURANTE){
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
        System.out.println(nome + ": O que é um homem?");
    }
}