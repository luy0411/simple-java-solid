package com.simple.java.solid.srp;

import sun.plugin.javascript.navig.Array;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        final Funcionario f1 = new Funcionario("Luis",Cargo.DESENVOLVEDOR,1000.0);
        final Funcionario f2 = new Funcionario("Japs",Cargo.DBA,10000.0);
        final Funcionario f3 = new Funcionario("Joe",Cargo.TESTER,5000.0);

        Arrays.asList(f1,f2,f3).stream().forEach(System.out::println);
    }
}
