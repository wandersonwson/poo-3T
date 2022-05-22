package dev.wson.poo.exercicio3;

import java.util.List;

public class Exercicio3 {
    public static void main(String[] args){
        Escola edtech = new Escola("Let's Code");
        List<Disciplina> cursoJava = List.of(
                new Disciplina("Lógica de Programação", 0),
                new Disciplina("Programação Orientada a Objetos", 0),
                new Disciplina("Testes Unitários", 0),
                new Disciplina("Spring", 0)
        );
        List<Disciplina> cursoDevOps = List.of(
                new Disciplina("Fundamentos de DevOps", 0),
                new Disciplina("Infraestrutura como código", 0),
                new Disciplina("Integração e entrega contínuas", 0),
                new Disciplina("Contêineres e orquestração", 0)
        );
        //Cadastro de turmas
        edtech.adicionarTurma(860, "TomorrowTechTalents", Turno.NOTURNO, cursoJava);
        edtech.adicionarTurma(340, "DevOps One", Turno.VESPERTINO, cursoDevOps);
        //Cadastro de professores
        edtech.adicionarProfessor("Ricardo Oliveira Silva", "23456-2", "123.456.789-02", 4500);
        edtech.adicionarProfessor("Marcela Gomes de Sá", "10205-8", "100.200.300-34", 4500);
        edtech.adicionarProfessor("Júlio Mesquita Filho", "87645-9", "112.223.334-55", 4500);
        edtech.adicionarProfessor("Tatiana Castro Nunes", "35689-7", "987.654.321-05", 4500);
        //Alocação dos professores por turma
        List<Turma> listaTurmas = List.of(edtech.buscarTurma(860), edtech.buscarTurma(340));
        edtech.definirTurmasProfessor("Ricardo Oliveira Silva", "123.456.789-02", listaTurmas);
        edtech.definirTurmasProfessor("Marcela Gomes de Sá", "100.200.300-34", listaTurmas);
        edtech.definirTurmasProfessor("Júlio Mesquita Filho", "112.223.334-55", listaTurmas);
        edtech.definirTurmasProfessor("Tatiana Castro Nunes", "987.654.321-05", listaTurmas);
        //Distribuição das disciplinas
        List<Disciplina> disciplinas = List.of(cursoJava.get(0), cursoDevOps.get(0));
        edtech.definirDisciplinasProfessor("Ricardo Oliveira Silva", "123.456.789-02", disciplinas);
        disciplinas = List.of(cursoJava.get(1), cursoDevOps.get(1));
        edtech.definirDisciplinasProfessor("Marcela Gomes de Sá", "100.200.300-34", disciplinas);
        disciplinas = List.of(cursoJava.get(2), cursoDevOps.get(2));
        edtech.definirDisciplinasProfessor("Júlio Mesquita Filho", "112.223.334-55", disciplinas);
        disciplinas = List.of(cursoJava.get(3), cursoDevOps.get(3));
        edtech.definirDisciplinasProfessor("Tatiana Castro Nunes", "987.654.321-05", disciplinas);
        //Cadastro de funcionários
        edtech.adicionarFuncionario("João Carlos Pereira", "78025-6", "251.870.100-20", "Pedagogo", 4500);
        edtech.adicionarFuncionario("Mariana Abreu Lima", "30045-2", "422.565.890-04", "Secretária", 2000);
        edtech.adicionarFuncionario("Pedro Henrique Borges", "34500-3", "222.555.333-11", "Vigilante", 1800);
        edtech.adicionarFuncionario("Thaís Ferreira Santana", "44022-9", "151.621.567-77", "Jardineira", 1500);
        //Cadastro de alunos
        edtech.adicionarAluno("Wanderson Sousa Alves", "40075-8", "025.035.045-88", 28, edtech.buscarTurma(860));
        edtech.adicionarAluno("Maria Rita Castro", "30075-3", "014.024.034-77", 35, edtech.buscarTurma(860));
        edtech.adicionarAluno("Henrique Brito Sousa", "50075-5", "036.046.056-44", 19, edtech.buscarTurma(860));
        edtech.adicionarAluno("Luana Magalhães Rocha", "60075-6", "120.130.140-11", 24, edtech.buscarTurma(860));
        edtech.adicionarAluno("Carlito ALves Brito", "70075-8", "200.300.400-55", 40, edtech.buscarTurma(860));
        edtech.adicionarAluno("Natália Oliveira Gomes", "90075-9", "620.630.000-33", 22, edtech.buscarTurma(340));
        edtech.adicionarAluno("Jonas Marcos Carneiro", "10034-3", "230.500.340-90", 30, edtech.buscarTurma(340));
        edtech.adicionarAluno("Tatiane Mendonça Serra", "20067-6", "222.333.444-10", 42, edtech.buscarTurma(340));
        edtech.adicionarAluno("Frederico Muniz Rodrigues", "10099-2", "205.305.405-25", 38, edtech.buscarTurma(340));
        edtech.adicionarAluno("Karla Bianca Guimarães", "80065-4", "242.353.656-46", 26, edtech.buscarTurma(340));
        //Registro de notas
        edtech.lancarNotasAluno("Wanderson Sousa Alves", "025.035.045-88");
        edtech.lancarNotasAluno("Luana Magalhães Rocha", "120.130.140-11");
        edtech.lancarNotasAluno("Tatiane Mendonça Serra", "222.333.444-10");
        edtech.lancarNotasAluno("Frederico Muniz Rodrigues", "205.305.405-25");
        //Consulta do boletim
        edtech.consultarBoletimAluno("Wanderson Sousa Alves", "025.035.045-88");
        edtech.consultarBoletimAluno("Tatiane Mendonça Serra", "222.333.444-10");
        edtech.consultarBoletimAluno("Luana Magalhães Rocha", "120.130.140-11");
        edtech.consultarBoletimAluno("Frederico Muniz Rodrigues", "205.305.405-25");
        //Remoção de alunos
        edtech.removerAluno("Carlito ALves Brito", "200.300.400-55");
        edtech.removerAluno("Karla Bianca Guimarães", "242.353.656-46");
        //Relatórios
        edtech.listarDados();
        edtech.listarTurmas();
        edtech.listarAlunos();
        edtech.listarProfessores();
        edtech.listarFuncionarios();
    }    
}