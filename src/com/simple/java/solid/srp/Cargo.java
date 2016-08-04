package com.simple.java.solid.srp;

public enum Cargo {
    DESENVOLVEDOR(new RegraDezOuVintePorcento()),
    DBA(new RegraQuinzeOuVinteCincoPorcento()),
    TESTER(new RegraQuinzeOuVinteCincoPorcento());

    private RegraDeCalculo regra;

    Cargo(RegraDeCalculo regra) {
        this.regra = regra;
    }

    public Double calcular(Funcionario funcionario){
        return regra.calcular(funcionario);
    }
}
