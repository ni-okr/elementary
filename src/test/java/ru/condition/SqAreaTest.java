package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class SqAreaTest {

    @Test
    void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(1.0));
    }

    @Test
    void whenP5K1Square1() {
        int expected = 1;
        int p = 5;
        double k = 1;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(1.0));
    }

    @Test
    void whenP16K12Square4() {
        int expected = 4;
        int p = 16;
        double k = 12;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(1.0));
    }

    @Test
    void whenP26K32Square4() {
        int expected = 4;
        int p = 26;
        double k = 32;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(1.0));
    }

    @Test
    void whenP61K21Square40() {
        int expected = 40;
        int p = 61;
        double k = 21;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(1.0));
    }
}