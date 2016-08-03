package com.simple.java.solid.srp;

import java.util.Calendar;

public class Funcionario {

    private String nome;
    private Cargo cargo;
    private Calendar dataDeAdmissao;
    private double salarioBase;

    public Funcionario(String nome, Cargo cargo, double salarioBase) {
        this.nome = nome;
        this.cargo = cargo;
        this.dataDeAdmissao = Calendar.getInstance();
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }
    public Cargo getCargo() {
        return cargo;
    }
    public Calendar getDataDeAdmissao() {
        return dataDeAdmissao;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    public void setDataDeAdmissao(Calendar dataDeAdmissao) {
        this.dataDeAdmissao = dataDeAdmissao;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

}
