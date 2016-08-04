package com.simple.java.solid.srp;

public class RegraQuinzeOuVinteCincoPorcento implements RegraDeCalculo {
    @Override
    public Double calcular(Funcionario funcionario) {
        if(funcionario.getSalarioBase() > 2000.0) {
            return funcionario.getSalarioBase() * 0.75;
        }
        else {
            return funcionario.getSalarioBase() * 0.85;
        }
    }
}
