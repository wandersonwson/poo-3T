package dev.wson.poo.exercicio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Aluno extends Pessoa{
    private int idade;
    private Turma turma;
    private Map<String, Double> notas;
    private double media;

    public Aluno(String nome, String RG, String CPF, int idade, Turma turma) {
        super(nome, RG, CPF);
        this.idade = idade;
        this.turma = turma;
        setNotas();
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Turma getTurma() {
        return turma;
    }
    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    public double getMedia() {
        calcularMedia();
        return media;
    }
    public void setNotas() {
        notas = new HashMap<>();
        for (Disciplina disciplina : turma.getDisciplinas()) {
            notas.put(disciplina.getNome(), disciplina.getNota());            
        }
    }
    public void registrarNotas() {
        Scanner scan = new Scanner(System.in);
        double nota;
        System.out.printf("------ Registro de notas para %s ------%n", nome);
        System.out.println("Digite a nota de cada disciplina:");
        for (String disciplina: notas.keySet()) {
            System.out.printf("%s: ", disciplina);
            nota = scan.nextDouble();
            notas.replace(disciplina, nota);
        }
        System.out.println("------");
    }
    private void calcularMedia() {
        double somatorio = 0;
        for (double nota: notas.values()) {
            somatorio += nota;            
        }
        media = somatorio/notas.size();
    }
    public void consultarBoletim() {
        System.out.println("------ Situação escolar ------");
        System.out.println(nome);
        System.out.println("Idade: " + idade);
        System.out.println("Turma: " + turma.getDescricao());
        System.out.println("Notas:");
        notas.forEach((chave, valor) -> System.out.printf("%s: %.1f%n", chave, valor));
        System.out.printf("Média: %.1f%n", getMedia());
        System.out.printf("Situação: %s%n", (getMedia() >= 7) ? "Aprovado" : "Recuperação");
        System.out.println("------");
    }
    @Override
    public String toString(){
        return String.format("%s [RG: %s, CPF: %s, Idade: %d, Turma: %d, Disciplinas: %d]", nome, RG, CPF, idade, turma.getCodigo(), notas.size());
    }
}