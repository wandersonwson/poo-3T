package dev.wson.poo.exercicio2;

public class Exercicio2 {
    public static void main(String[] args){
        //Inicialização dos estoques
        Estoque estoque = new Estoque("3T Eletrônicos");
        Estoque estoque2 = new Estoque("WSA TechStore");
        //Cadastro de novos produtos e atualização
        estoque.adicionarProduto("Xiaomi 11 Lite 5G", 2, "Smartphone", 20, "Xiaomi");
        estoque.adicionarProduto("Galaxy Tab S8", 3, "Tablet", 5, "Samsung");
        estoque.adicionarProduto("iPad Air", 3, "Tablet", 8, "Apple");     
        estoque2.adicionarProduto("iPhone 13", 2, "Smartphone", 10, "Apple");
        estoque2.adicionarProduto("Dell G15", 4, "Notebook", 15, "Dell");
        estoque2.adicionarProduto("Smart TV TCL P715", 1, "TV", 50, "TCL");
        //Listagem de produtos
        estoque.imprimirRelatorio();
        estoque2.imprimirRelatorio();
        //Consulta de produto pelo nome
        Produto produto;
        produto = estoque.buscarProdutoPorNome("Xiaomi 12");
        System.out.println(String.format("--- Consulta por nome ---%n%s", produto != null ? produto : "Produto não encontrado"));
        produto = estoque2.buscarProdutoPorNome("Dell G15");
        System.out.println(String.format("--- Consulta por nome ---%n%s", produto != null ? produto : "Produto não encontrado"));
        //Consulta de produto pelo ID
        produto = estoque.buscarProdutoPorID(4);
        System.out.println(String.format("--- Consulta por ID ---%n%s", produto != null ? produto : "Produto não encontrado"));
        produto = estoque2.buscarProdutoPorID(6);
        System.out.println(String.format("--- Consulta por ID ---%n%s", produto != null ? produto : "Produto não encontrado"));
        //Exclusão de produtos
        System.out.println(estoque.excluirProduto(2));
        System.out.println(estoque2.excluirProduto(7));
    }
}