package com.simple.java.solid.lsp;

import java.util.Arrays;
import java.util.List;

public class GeradorNotaFiscal {

    private List<AcaoPosGeracao> acoes = Arrays.asList(new EnviadorEmail(), new NotaFiscalDAO());

    public NotaFiscal gera(Fatura fatura) {
        double valor = fatura.getValorMensal();
        NotaFiscal nf = new NotaFiscal(123, valor, impostoSimplesSobreO(valor));

        for (AcaoPosGeracao acao : acoes) {
            acao.execute(nf);
        }

        return nf;
    }

    private double impostoSimplesSobreO(double valor) {
        return valor * 0.06;
    }
}
