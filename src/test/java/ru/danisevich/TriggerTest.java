package ru.danisevich;

import org.junit.Assert;
import org.junit.Test;

public class TriggerTest {

    @Test
    public void test() {
        Assert.assertEquals(1, new Trigger().someLogic());
        Assert.assertEquals(2 - 1, new Trigger().someLogic());
    }

}