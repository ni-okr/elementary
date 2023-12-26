package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SwitchWeekTest {

    @Test
    void name1fDay() {
        int day = 1;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Понедельник";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void name2fDay() {
        int day = 2;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Вторник";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void name3fDay() {
        int day = 3;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Среда";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void name4fDay() {
        int day = 4;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Четверг";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void name5fDay() {
        int day = 5;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Пятница";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void name6fDay() {
        int day = 6;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Суббота";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void name7fDay() {
        int day = 7;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Воскресение";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void name8fDay() {
        int day = 8;
        String result = SwitchWeek.nameOfDay(day);
        String expected = "Дней в неделе всего 7";
        assertThat(result).isEqualTo(expected);
    }
}