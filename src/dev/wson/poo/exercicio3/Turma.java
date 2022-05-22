package dev.wson.poo.exercicio3;

import java.util.List;

public class Turma {
    private int codigo;
    private String descricao;
    private Turno turno;
    private List<Disciplina> disciplinas;

    public Turma(int codigo, String descricao, Turno turno, List<Disciplina> disciplinas) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.turno = turno;
        this.disciplinas = disciplinas;
    }
    public int getCodigo() {
        return codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    public Turno getTurno() {
        return turno;
    }
    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    @Override
    public String toString() {
        return String.format("%s [#%d]", descricao, codigo);
    }
}