package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreeServiceTest {
    @Test
    public void test3months() {
        FreeService service = new FreeService();
        int expected = 3;
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int actual = service.calculate( income, expenses, threshold);


    }

    @Test
    public void test2months() {
        FreeService service = new FreeService();
        int expected = 2;
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int actual = service.calculate( income, expenses, threshold);

    }
}
