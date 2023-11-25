package com.example.flowerstore.flowers;

public class DiscountDecorator extends ItemDecorator{
    public DiscountDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return super.getPrice()*0.08;
    }
}
