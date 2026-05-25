package com.atividade;

public class FahrenheitParaCelsius implements ConversorTemperatura {
    
    @Override
    public double converter(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }
}