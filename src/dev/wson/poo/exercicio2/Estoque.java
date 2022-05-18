package dev.wson.poo.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private int ID;
    private String nome;
    private List<Produto> produtos;
    private static int contador;

    public Estoque(String nome) {
        contador++;
        ID = contador;
        this.nome = nome;
        this.produtos = new ArrayList<>();
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void atualizarProduto(int index, Produto novoProduto){
        Produto produto = produtos.get(index);
        produto.setNome(novoProduto.getNome());
        produto.setMarca(novoProduto.getMarca());
        produto.setSessao(novoProduto.getSessao());
        produto.setTipo(novoProduto.getTipo());
        produto.setQuantidade(produto.getQuantidade() + novoProduto.getQuantidade());
    }
    public void adicionarProduto(String nome, int sessao, String tipo, int quantidade, String marca) {
        Produto novoProduto = new Produto(nome, sessao, tipo, quantidade, marca);
        int index = getIndexProduto(novoProduto);
        if (index != -1){
            atualizarProduto(index, novoProduto);
            System.out.println("--- Atualização ---\nAs alterações foram salvas.");
        } else {
            produtos.add(novoProduto);
            System.out.println("--- Inclusão ---\nNovo produto adicionado.");
        }
    }
    public String excluirProduto(int id){
        for (Produto produto : produtos) {
            if (produto.getID() == id){
                produtos.remove(produto);
                return String.format("--- Exclusão ---%nO produto #%d foi excluído.", id);
            }
        }
        return String.format("--- Exclusão ---%nErro: o produto #%d não foi encontrado.", id);
    }
    public Produto buscarProdutoPorNome(String nome){
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)){
                return produto;
            }
        }
        return null;
    }
    public Produto buscarProdutoPorID(int id){
        for (Produto produto : produtos) {
            if (produto.getID() == id){
                return produto;
            }
        }
        return null;
    }
    private int getIndexProduto(Produto novoProduto) {
        if (produtos.isEmpty()) {return -1;}
        for (Produto produto : produtos) {
            if (produto.getNome().equals(novoProduto.getNome()) && produto.getMarca().equals(novoProduto.getMarca())){
                return produtos.indexOf(produto);
            }
        }
        return -1;
    }
    public void imprimirRelatorio(){
        System.out.println("------ TomorrowTechTalents LTDA ------");
        System.out.printf("Estoque %s [ID #%d]%n", nome, ID);
        produtos.forEach(System.out::println);
        System.out.println("------");
    }
}