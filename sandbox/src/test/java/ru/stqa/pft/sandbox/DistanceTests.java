package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistanceTests {
    @Test
    public void testDistance(){
        Point p1 = new Point(2, 3);
        Point p2 = new Point(5, 3);
        Assert.assertEquals(p1.distance(p2), 3.0);
        Assert.assertEquals(p2.distance(p1), 3.0);

        p1.x = 3;
        p1.y = 5;
        p2.x = 3;
        p2.y = 10;

        Assert.assertEquals(p1.distance(p2), 5.0);
    }
}
