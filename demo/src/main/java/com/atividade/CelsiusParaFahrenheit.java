package com.atividade;

public class CelsiusParaFahrenheit implements ConversorTemperatura {
    
    @Override
    public double converter(double celsius) {
        return (celsius * 1.8) + 32;
    }
}