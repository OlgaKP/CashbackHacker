package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldTestRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTestRemainWithoutRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTestRemainWithoutBuy() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);
    }
}