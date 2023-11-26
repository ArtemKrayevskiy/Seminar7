package com.example.flowerstore.flowers;

public class RibbonDecorator extends ItemDecorator{
    public RibbonDecorator(Item item){
        super(item);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 40;
    }
}
