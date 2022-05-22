package dev.wson.poo.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa{
    private double salario;
    private List<Turma> turmas;
    private List<Disciplina> disciplinas;

    public Professor(String nome, String RG, String CPF, double salario) {
        super(nome, RG, CPF);
        this.salario = salario;
        this.turmas = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public List<Turma> getTurmas() {
        return turmas;
    }
    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }
    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    public void listarTurmas() {
        System.out.printf("Professor(a) %s%nTurmas:%n", nome);
        turmas.forEach(System.out::println);
    }
    public void listarDisciplinas() {
        System.out.printf("Professor(a) %s%nDisciplinas:%n", nome);
        disciplinas.forEach(System.out::println);
    }
    @Override
    public String toString(){
        return String.format("%s [RG: %s, CPF: %s, Turmas: %d, Disciplinas: %d, Salário: R$ %.2f]", nome, RG, CPF, turmas.size(), disciplinas.size(), salario);
    }
}