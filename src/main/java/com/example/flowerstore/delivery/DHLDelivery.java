package com.example.flowerstore.delivery;

import com.example.flowerstore.flowers.Item;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.LinkedList;

public class DHLDelivery implements Delivery{
    @GetMapping("/api/delivery/DHL")
    public String deliver(LinkedList<Item> items){
        return "You have chosen DHL delivery";
    }
}
