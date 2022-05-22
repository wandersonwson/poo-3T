package dev.wson.poo.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    private String nome;
    private List<Aluno> alunos;
    private List<Turma> turmas;
    private List<Professor> professores;
    private List<Funcionario> funcionarios;

    public Escola(String nome) {
        this.nome = nome;
        alunos = new ArrayList<>();
        turmas = new ArrayList<>();
        professores = new ArrayList<>();
        funcionarios = new ArrayList<>();
    }
    public void adicionarAluno(String nome, String RG, String CPF, int idade, Turma turma){
        Aluno novoAluno = new Aluno(nome, RG, CPF, idade, turma);
        int index = getIndexAluno(novoAluno);
        if (index != -1) {
            atualizarAluno(index, novoAluno);
            System.out.println("--- Atualização ---\nAs alterações do aluno foram salvas");
        } else {
            alunos.add(novoAluno);
            System.out.println("--- Cadastro ---\nNovo aluno cadastrado");
        }
    }
    private void atualizarAluno(int index, Aluno novoAluno) {
        Aluno aluno = alunos.get(index);
        aluno.setNome(novoAluno.getNome());
        aluno.setRG(novoAluno.getRG());
        aluno.setCPF(novoAluno.getCPF());
        aluno.setIdade(novoAluno.getIdade());
        aluno.setTurma(novoAluno.getTurma());
        aluno.setNotas();
    }
    private int getIndexAluno(Aluno novoAluno){
        if (alunos.isEmpty()) {return -1;}
        for (Aluno aluno: alunos) {
            if (aluno.getNome().equals(novoAluno.getNome()) && aluno.getCPF().equals(novoAluno.getCPF())) {
                return alunos.indexOf(aluno);
            }
        }
        return -1;
    }
    public void consultarBoletimAluno (String nome, String CPF) {
        Aluno aluno = buscarAluno(nome, CPF);
        if(aluno != null) {
            aluno.consultarBoletim();
        } else {
            System.out.println("--- Consulta de boletim ---\nErro: aluno não encontrado");
        }
    }
    public Aluno buscarAluno(String nome, String CPF) {
        for (Aluno aluno: alunos) {
            if (aluno.getNome().equals(nome) && aluno.getCPF().equals(CPF)) {
                return aluno;
            }
        }
        return null;
    }
    public void removerAluno(String nome, String CPF) {
        Aluno aluno = buscarAluno(nome, CPF);
        if(aluno != null) {
            alunos.remove(aluno);
            System.out.println("--- Exclusão ---\nO aluno foi excluído");
        } else {
            System.out.println("--- Exclusão ---\nErro: aluno não encontrado");
        }
    }
    public void adicionarProfessor(String nome, String RG, String CPF, double salario) {
        Professor novoProfessor = new Professor(nome, RG, CPF, salario);
        int index = getIndexProfessor(novoProfessor);
        if (index != -1) {
            atualizarProfessor(index, novoProfessor);
            System.out.println("--- Atualização ---\nAs alterações do professor foram salvas");
        } else {
            professores.add(novoProfessor);
            System.out.println("--- Cadastro ---\nNovo professor cadastrado");
        }
    }
    private void atualizarProfessor(int index, Professor novoProfessor) {
        Professor professor = professores.get(index);
        professor.setNome(novoProfessor.getNome());
        professor.setRG(novoProfessor.getRG());
        professor.setCPF(novoProfessor.getCPF());
        professor.setSalario(novoProfessor.getSalario());
    }
    private int getIndexProfessor(Professor novoProfessor) {
        if (professores.isEmpty()) {return -1;}
        for (Professor professor: professores) {
            if (professor.getNome().equals(novoProfessor.getNome()) && professor.getCPF().equals(novoProfessor.getCPF())) {
                return professores.indexOf(professor);
            }
        }
        return -1;
    }
    public Professor buscarProfessor(String nome, String CPF) {
        for (Professor professor: professores) {
            if (professor.getNome().equals(nome) && professor.getCPF().equals(CPF)) {
                return professor;
            }
        }
        return null;
    }
    public void removerProfessor(String nome, String CPF) {
        Professor professor = buscarProfessor(nome, CPF);
        if (professor != null) {
            professores.remove(professor);
            System.out.println("--- Exclusão ---\nO professor foi excluído");
        } else {
            System.out.println("--- Exclusão ---\nErro: professor não encontrado");
        }
    }
    public void adicionarFuncionario(String nome, String RG, String CPF, String cargo, double salario) {
        Funcionario novoFuncionario = new Funcionario(nome, RG, CPF, cargo, salario);
        int index = getIndexFuncionario(novoFuncionario);
        if (index != -1) {
            atualizarFuncionario(index, novoFuncionario);
            System.out.println("--- Atualização ---\nAs alterações do funcionário foram salvas");
        } else {
            funcionarios.add(novoFuncionario);
            System.out.println("--- Cadastro ---\nNovo funcionário cadastrado");
        }
    }
    public void atualizarFuncionario(int index, Funcionario novoFuncionario) {
        Funcionario funcionario = funcionarios.get(index);
        funcionario.setNome(novoFuncionario.getNome());
        funcionario.setRG(novoFuncionario.getRG());
        funcionario.setCPF(novoFuncionario.getCPF());
        funcionario.setCargo(novoFuncionario.getCargo());
        funcionario.setSalario(novoFuncionario.getSalario());
    }
    public int getIndexFuncionario(Funcionario novoFuncionario) {
        if (funcionarios.isEmpty()) {return -1;}
        for (Funcionario funcionario: funcionarios) {
            if (funcionario.getNome().equals(novoFuncionario.getNome()) && funcionario.getCPF().equals(novoFuncionario.getCPF())) {
                return funcionarios.indexOf(funcionario);
            }
        }
        return -1;
    }
    public Funcionario buscarFuncionario(String nome, String CPF) {
        for (Funcionario funcionario: funcionarios) {
            if (funcionario.getNome().equals(nome) && funcionario.getCPF().equals(CPF)) {
                return funcionario;
            }
        }
        return null;
    }
    public void removerFuncionario(String nome, String CPF) {
        Funcionario funcionario = buscarFuncionario(nome, CPF);
        if (funcionario != null) {
            funcionarios.remove(funcionario);
            System.out.println("--- Exclusão ---\nO funcionário foi excluído");
        } else {
            System.out.println("--- Exclusão ---\nErro: funcionário não encontrado");
        }
    }
    public void adicionarTurma(int codigo, String descricao, Turno turno, List<Disciplina> disciplinas) {
        Turma novaTurma = new Turma(codigo, descricao, turno, disciplinas);
        turmas.add(novaTurma);
        System.out.println("--- Cadastro ---\nNova turma cadastrada");
    }
    public Turma buscarTurma(int codigo) {
        for (Turma turma: turmas) {
            if (turma.getCodigo() == codigo) {
                return turma;
            }
        }
        return null;
    }
    public void lancarNotasAluno(String nome, String CPF) {
        Aluno aluno = buscarAluno(nome, CPF);
        if (aluno != null) {
            aluno.registrarNotas();
        } else {
            System.out.println("--- Registro de notas ---\nErro: aluno não encontrado");
        }
    }
    public void definirDisciplinasProfessor(String nome, String CPF, List<Disciplina> disciplinas) {
        Professor professor = buscarProfessor(nome, CPF);
        if (professor != null) {
            professor.setDisciplinas(disciplinas);
        } else {
            System.out.println("--- Alocação de disciplinas ---\nErro: professor não encontrado");
        }
    }
    public void definirTurmasProfessor(String nome, String CPF, List<Turma> turmas) {
        Professor professor = buscarProfessor(nome, CPF);
        if (professor != null) {
            professor.setTurmas(turmas);
        } else {
            System.out.println("--- Alocação de turmas ---\nErro: professor não encontrado");
        }
    }
    public void listarDados() {
        System.out.printf("------ %s ------%n", nome);
        System.out.println("Nº de alunos: " + alunos.size());
        System.out.println("Nº de turmas: " + turmas.size());
        System.out.println("Nº de professores: " + professores.size());
        System.out.println("Nº de funcionários: " + funcionarios.size());
        System.out.println("------");
    }
    public void listarAlunos() {
        System.out.printf("------ %s ------%nAlunos:%n", nome);
        alunos.forEach(System.out::println);
        System.out.println("------");
    }
    public void listarTurmas() {
        System.out.printf("------ %s ------%nTurmas:%n", nome);
        turmas.forEach(System.out::println);
        System.out.println("------");
    }
    public void listarProfessores() {
        System.out.printf("------ %s ------%nProfessores:%n", nome);
        professores.forEach(System.out::println);
        System.out.println("------");
    }
    public void listarFuncionarios() {
        System.out.printf("------ %s ------%nFuncionários:%n", nome);
        funcionarios.forEach(System.out::println);
        System.out.println("------");
    }
}