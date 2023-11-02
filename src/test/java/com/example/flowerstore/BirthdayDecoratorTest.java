package com.example.flowerstore;

import com.example.flowerstore.flowers.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BirthdayDecoratorTest {

    @Test
    public void birthdayDecoratorTest(){
        Flower rose = new Flower(70, FlowerColor.RED, 59, FlowerType.ROSE);
        FlowerPack RosePack = new FlowerPack(rose , 101);
        FlowerBucket bucket = new FlowerBucket(RosePack);
        assertEquals(59*101, bucket.getPrice());
        BirthdayItem birthdaybucket = new BirthdayItem(bucket);
        assertEquals((59*101 - (59*101/10.0)), birthdaybucket.getPrice());
    }
}
