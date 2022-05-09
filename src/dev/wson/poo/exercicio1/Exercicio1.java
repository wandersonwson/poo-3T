package dev.wson.poo.exercicio1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Exercicio1 {
    public void iniciar(){
        ArrayList<Jogador> time = new ArrayList<>();
        //Inicialização dos jogadores e inclusão no time
        Jogador neymar = new Jogador(1, "Neymar da Silva Santos Júnior", "Neymar", LocalDate.of(1992, 2, 5), 10, "Atacante", 100);
        time.add(neymar);
        Jogador hulk = new Jogador(2, "Givanildo Vieira de Sousa", "Hulk", LocalDate.of(1986, 7, 25), 7, "Atacante", 90);
        time.add(hulk);
        Jogador gabigol = new Jogador(3, "Gabriel Barbosa Almeida", "Gabigol", LocalDate.of(1996, 8, 30), 9, "Atacante", 95);
        time.add(gabigol);
        Jogador joaoGomes = new Jogador(4, "João Victor Gomes da Silva", "João Gomes", LocalDate.of(2001, 2, 12), 35, "Meia", 90);
        time.add(joaoGomes);
        Jogador fred = new Jogador(5, "Frederico Chaves Guedes", "Fred", LocalDate.of(1983, 10, 3), 9, "Atacante", 85);
        time.add(fred);
        Jogador davidLuis = new Jogador(6, "David Luiz Moreira Marinho", "David Luiz", LocalDate.of(1987, 4, 22), 23, "Zagueiro", 85);
        time.add(davidLuis);
        Jogador weverton = new Jogador(7, "Weverton Pereira da Silva", "Weverton", LocalDate.of(1987, 12, 13), 21, "Goleiro", 90);
        time.add(weverton);
        Jogador quintero = new Jogador(8, "Juan Sebastián Quintero Fletcher", "Juan Quintero", LocalDate.of(1995, 3, 23), 2, "Zagueiro", 85);
        time.add(quintero);
        Jogador cassio = new Jogador(9, "Cássio Roberto Ramos", "Cássio", LocalDate.of(1987, 6, 6), 12, "Goleiro", 90);
        time.add(cassio);
        Jogador nikao = new Jogador(10, "Maycon Vinícius Ferreira da Cruz", "Nikão", LocalDate.of(1992, 7, 29), 10, "Meia", 95);
        time.add(nikao);
        Jogador wagner = new Jogador(10, "Maycon Vinícius Ferreira da Cruz", "Nikão", LocalDate.of(1992, 7, 29), 10, "Meia", 95);
        time.add(wagner);
        //Operações
        weverton.sofrerLesao();
        neymar.aplicarCartoesAmarelos(1);
        hulk.aplicarCartoesAmarelos(1);
        davidLuis.sofrerLesao();
        cassio.aplicarCartaoVermelho();
        nikao.sofrerLesao();
        quintero.aplicarCartoesAmarelos(3);
        wagner.sofrerLesao();
        fred.aplicarCartoesAmarelos(2);
        gabigol.aplicarCartaoVermelho();
        joaoGomes.aplicarCartoesAmarelos(1);
        //Dados do time
        System.out.println("Situação da equipe:");
        time.forEach(System.out::println);
    }
}
