package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn100WhenAmount900() {
        ru.netology.service.CashbackHackService service = new ru.netology.service.CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0WhenAmount1000() {
        ru.netology.service.CashbackHackService service = new ru.netology.service.CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn900WhenAmount1100() {
        ru.netology.service.CashbackHackService service = new ru.netology.service.CashbackHackService();
        int amount = 1100;

        int actual = service.remain(amount);
        int expected = 900;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0WhenAmount2000() {
        ru.netology.service.CashbackHackService service = new ru.netology.service.CashbackHackService();
        int amount = 2000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn999WhenAmount1() {
        ru.netology.service.CashbackHackService service = new ru.netology.service.CashbackHackService();
        int amount = 1;

        int actual = service.remain(amount);
        int expected = 999;

        Assert.assertEquals(expected, actual);
    }
}