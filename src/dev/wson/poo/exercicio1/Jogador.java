package dev.wson.poo.exercicio1;

import java.time.LocalDate;

public class Jogador {
    int id;
    String nome;
    String apelido;
    LocalDate dataNascimento;
    int numero;
    String posicao;
    int qualidade;
    int cartoesAmarelos;
    int cartaoVermelho;
    boolean suspenso;
    int numeroTreinos;

    Jogador(){}
    Jogador(int id, String nome, String apelido, LocalDate dataNascimento, int numero, String posicao,
            int qualidade) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = qualidade;
    }
    boolean definirCondicaoDeJogo(){
        if(cartoesAmarelos >= 3 || cartaoVermelho >= 1){
            suspenso = true;
        }
        return suspenso;
    }
    void aplicarCartoesAmarelos(int quantidade){
        cartoesAmarelos += quantidade;
        definirCondicaoDeJogo();
    }
    void aplicarCartaoVermelho(){
        cartaoVermelho++;
        definirCondicaoDeJogo();
    }
    void cumprirSuspensao(){
        cartoesAmarelos = 0;
        cartaoVermelho = 0;
        definirCondicaoDeJogo();
    }
    void sofrerLesao(){
        int dano = (int)(Math.random()*100+1);
        if (dano >= 1 && dano <= 5) {
            qualidade = (int) (qualidade-(qualidade*0.15));
        } else if (dano >= 6 && dano <= 15) {
            qualidade = (int) (qualidade-(qualidade*0.1));
        } else if (dano >= 16 && dano <= 30) {
            qualidade = (int) (qualidade-(qualidade*0.05));
        } else if (dano >= 31 && dano <= 60) {
            qualidade -= 2;
        } else if (dano >= 61 && dano <= 100) {
            qualidade -= 1;
        }
        if (qualidade < 0) {
            qualidade = 0;
        }
    }
    void treinar(){
        if (numeroTreinos == 0){
            qualidade = (int)(Math.random()*3+1);
            numeroTreinos++;
        }
    }
    @Override
    public String toString(){
        return String.format(
            "%s: %d - %s (%s) - %s CONDIÇÃO: %s",
            posicao, numero, nome, apelido, dataNascimento.toString(), (suspenso ? "SUSPENSO" : "PODE JOGAR"));
    }
}