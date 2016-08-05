package com.simple.java.solid.isp;

public class NotaFiscalDAO implements AcaoPosGeracao {

    @Override
    public void execute(NotaFiscal notaFiscal) {
        System.out.println("salva nf no banco");
    }
}
