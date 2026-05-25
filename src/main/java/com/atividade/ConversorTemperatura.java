package com.atividade;

public interface ConversorTemperatura {
    /**
     * Converte uma temperatura baseada na estratégia implementada.
     * * @param valor O valor da temperatura a ser convertida.
     * @return O valor convertido.
     */
    double converter(double valor);
}