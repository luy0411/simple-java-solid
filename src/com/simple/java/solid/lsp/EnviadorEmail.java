package com.simple.java.solid.lsp;

public class EnviadorEmail implements AcaoPosGeracao, AcaoPreEnvioEmail {

    @Override
    public void execute(NotaFiscal notaFiscal) {
        preExecute(notaFiscal);
        System.out.println("envia email da nf " + notaFiscal.getId());
    }

    @Override
    public void preExecute(NotaFiscal notaFiscal) {
        System.out.println("acao pre envio email...");
    }
}