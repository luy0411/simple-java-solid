package com.simple.java.solid.isp;

public interface AcaoPosGeracao {

    void execute(NotaFiscal notaFiscal);

    // Nao faz sentido todo mundo implementar!!!!
    //void preExecute(NotaFiscal notaFiscal);
}
