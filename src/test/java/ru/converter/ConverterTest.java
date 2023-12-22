package ru.converter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert140RblThen1Dot4Euro() {
        float in = 140;
        float expectedRE = 1.4f;
        float outRE = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        assertThat(outRE).isEqualTo(expectedRE, withPrecision(eps));
    }

    @Test
    void whenConvert140EuroThen14000Rbl() {
        float in = 140;
        float expectedER = 14000.0f;
        float outER = Converter.euroToRuble(in);
        float eps = 0.0001f;
        assertThat(outER).isEqualTo(expectedER, withPrecision(eps));

    }

    @Test
    void whenConvert140RblThen1Dot5Dollar() {
        float in = 140;
        float expectedRD = 1.5555556f;
        float outRD = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        assertThat(outRD).isEqualTo(expectedRD, withPrecision(eps));
    }

    @Test
    void whenConvert140DollarThen12600Rbl() {
        float in = 140;
        float expectedDR = 12600.0f;
        float outDR = Converter.dollarToRuble(in);
        float eps = 0.0001f;
        assertThat(outDR).isEqualTo(expectedDR, withPrecision(eps));
    }
}