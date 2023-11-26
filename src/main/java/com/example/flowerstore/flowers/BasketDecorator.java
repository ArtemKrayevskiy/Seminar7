package com.example.flowerstore.flowers;

public class BasketDecorator extends ItemDecorator{
    public BasketDecorator(Item item){
        super(item);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 4;
    }
}
