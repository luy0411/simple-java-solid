package com.simple.java.solid.lsp;

public class NotaFiscalDAO implements AcaoPosGeracao {

    @Override
    public void execute(NotaFiscal notaFiscal) {
        System.out.println("salva nf no banco");
    }
}
