package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void LessThanBoundary() {
        CashbackHackService cashbackService = new CashbackHackService();
        int amount = 500;
        int expected = 500;
        int actual = cashbackService.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void GreaterThanBoundary() {
        CashbackHackService cashbackService = new CashbackHackService();
        int amount = 1200;
        int expected = 800;
        int actual = cashbackService.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void EqualsBoundary() {
        CashbackHackService cashbackService = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = cashbackService.remain(amount);
        Assert.assertEquals(expected, actual);
    }
}