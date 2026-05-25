package com.atividade;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorTemperaturaTest {

    // A margem de erro permitida para cálculos com ponto flutuante
    private static final double DELTA = 0.01;

    @Test
    public void deveConverterFahrenheitParaCelsiusCorretamente() {
        ConversorTemperatura conversor = new FahrenheitParaCelsius();
        double valorEntradaFahrenheit = 32.0;
        double resultadoEsperadoCelsius = 0.0;

        double resultadoObtido = conversor.converter(valorEntradaFahrenheit);

        assertEquals(resultadoEsperadoCelsius, resultadoObtido, DELTA, 
            "A conversão de 32°F deve resultar em 0°C");
    }

    @Test
    public void deveConverterCelsiusParaFahrenheitCorretamente() {
        ConversorTemperatura conversor = new CelsiusParaFahrenheit();
        double valorEntradaCelsius = 100.0;
        double resultadoEsperadoFahrenheit = 212.0;

        double resultadoObtido = conversor.converter(valorEntradaCelsius);

        assertEquals(resultadoEsperadoFahrenheit, resultadoObtido, DELTA, 
            "A conversão de 100°C deve resultar em 212°F");
    }
}