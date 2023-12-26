package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DivideBySixTest {
    @Test
    void whenNumberDivideBy6() {
        int in = 24;
        String result = DivideBySix.checkNumber(in);
        String expected = "Число делится на 6.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNumberDivideBy3AndNotEven() {
        int in = 9;
        String result = DivideBySix.checkNumber(in);
        String expected = "Число делится на 3, но не является четным.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNumberNoDivideBy3AndEven() {
        int in = 14;
        String result = DivideBySix.checkNumber(in);
        String expected = "Число не делится на 3, но является четным.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNumberNoDivideBy3AndNotEven() {
        int in = 25;
        String result = DivideBySix.checkNumber(in);
        String expected = "Число не делится на 3 и не является четным.";
        assertThat(result).isEqualTo(expected);
    }
}