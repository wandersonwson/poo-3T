package dev.wson.poo.exercicio3;

public class Funcionario extends Pessoa{
    private String cargo;
    private double salario;
    
    public Funcionario(String nome, String RG, String CPF, String cargo, double salario) {
        super(nome, RG, CPF);
        this.cargo = cargo;
        this.salario = salario;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    @Override
    public String toString(){
        return String.format("%s [RG: %s, CPF: %s, Cargo: %s, Salário: R$ %.2f]", nome, RG, CPF, cargo, salario);
    }
}