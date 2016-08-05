package com.simple.java.solid.lsp;

public class Main {

    public static void main(String[] args) {
        GeradorNotaFiscal gerador = new GeradorNotaFiscal();
        Fatura fatura = new Fatura();
        fatura.setCliente("Luis");
        fatura.setValorMensal(1000.0);
        gerador.gera(fatura);
    }
}
